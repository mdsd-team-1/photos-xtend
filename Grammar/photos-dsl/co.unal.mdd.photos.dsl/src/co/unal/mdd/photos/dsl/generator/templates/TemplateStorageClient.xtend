package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageClient
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageMember
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageMemberType
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageMemberAnnotation
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageAction
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageActionMember
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageActionReturn
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageActionMemberType
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageActionMemberName

class TemplateStorageClient {
	
	static def generate(String className, String packageName, StorageClient stc)
	''' 
	// ----------------------------------------
	// Template for StorageClient
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	package «packageName»;
	
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
	public class «className» {
		
		«FOR storageItem: stc.getElements().filter(StorageMember)»
		«IF storageItem.getElements().filter(StorageMemberAnnotation).size() > 0»
		@Value("${amazonProperties.«storageItem.getElements().filter(StorageMemberAnnotation).get(0).name»}")
		«ENDIF»
		private «storageItem.getElements().filter(StorageMemberType).get(0).name» «storageItem.name»;
		
		«ENDFOR»
				
		«FOR actionItem: stc.getElements().filter(StorageAction)»
		private «actionItem.getElements().filter(StorageActionReturn).get(0).name» «actionItem.name»(«FOR memberItem: actionItem.getElements().filter(StorageActionMember)»«memberItem.getElements().filter(StorageActionMemberType).get(0).name» «memberItem.getElements().filter(StorageActionMemberName).get(0).name», «ENDFOR») {
			
			«IF actionItem.name.equals("initializeAmazon")»
			AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
			this.s3client = new AmazonS3Client(credentials);			
			«ELSEIF actionItem.name.equals("convertMultiPartToFile")»
			File convFile = new File(file.getOriginalFilename());
			FileOutputStream fos = new FileOutputStream(convFile);
			fos.write(file.getBytes());
			fos.close();
			return convFile;
			«ELSEIF actionItem.name.equals("generateFileName")»
			return new Date().getTime() + "-" + multiPart.getOriginalFilename().replace(" ", "_");
			«ELSEIF actionItem.name.equals("uploadFileTos3bucket")»
			s3client.putObject(new PutObjectRequest(bucketName, fileName, file)
					.withCannedAcl(CannedAccessControlList.PublicRead));
			«ELSEIF actionItem.name.equals("uploadFile")»
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
			«ELSEIF actionItem.name.equals("deleteFileFromS3Bucket")»
			String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
			s3client.deleteObject(new DeleteObjectRequest(bucketName + "/", fileName));
			return "Successfully deleted";
			«ENDIF»
		}
		«ENDFOR»
	}
	''' 
}