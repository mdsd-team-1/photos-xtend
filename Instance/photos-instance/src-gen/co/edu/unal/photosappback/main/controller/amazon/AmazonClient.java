// ----------------------------------------
// Template for StorageClient
// PackageName: co.edu.unal.photosappback.main.controller.amazon
// ClassName: AmazonClient
// ----------------------------------------	

package co.edu.unal.photosappback.main.controller.amazon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class AmazonClient {
	
	private StringClass s3client;
	
	@Value("${amazonProperties.endpointUrl}")
	private StringClass endpointUrl;
	
	@Value("${amazonProperties.bucketName}")
	private StringClass bucketName;
	
	@Value("${amazonProperties.accessKey}")
	private StringClass accessKey;
	
	@Value("${amazonProperties.secretKey}")
	private StringClass secretKey;
	
			
	private void initializeAmazon() {
		
		AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
		this.s3client = new AmazonS3Client(credentials);			
	}
	
	private File convertMultiPartToFile(MultipartFile file, ) {
		
		File convFile = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}
	
	private StringClass generateFileName(MultipartFile multiPart, ) {
		
		return new Date().getTime() + "-" + multiPart.getOriginalFilename().replace(" ", "_");
	}
	
	private void uploadFileTos3bucket(StringClass fileName, File file, ) {
		
		s3client.putObject(new PutObjectRequest(bucketName, fileName, file)
				.withCannedAcl(CannedAccessControlList.PublicRead));
	}
	
	private StringClass uploadFile(MultipartFile multiPart, ) {
		
		String fileUrl = "";
		try {
			File file = convertMultiPartToFile(multipartFile);
			String fileName = generateFileName(multipartFile);
			fileUrl = endpointUrl + "/" + bucketName + "/" + fileName;
			uploadFileTos3bucket(fileName, file);
			file.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileUrl;
	}
	
	private StringClass deleteFileFromS3Bucket(StringClass fileUrl, ) {
		
		String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
		s3client.deleteObject(new DeleteObjectRequest(bucketName + "/", fileName));
		return "Successfully deleted";
	}
	
