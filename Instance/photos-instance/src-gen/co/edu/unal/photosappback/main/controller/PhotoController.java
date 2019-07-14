package co.edu.unal.photosappback.main.controller;	

import co.edu.unal.photosappback.main.controller.AlbumRepository;
import co.edu.unal.photosappback.main.controller.PhotoRepository;
import co.edu.unal.photosappback.main.controller.UserRepository;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/photo")
public class PhotoController {
			
	@Autowired
	PhotoRepository photoRepository;
	
	@Autowired
	AmazonClient amazonClient;
	
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> uploadPhoto(@PathVariable Long id) throws Exception {
	


	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> deleteFile(@PathVariable Long id) throws Exception {
	


	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getPhoto(@PathVariable Long id) throws Exception {
	


	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> findAll(@PathVariable Long id) throws Exception {
	


	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception) {
		
		if(exception instanceof PhotoNotFoundException) {
			return new ResponseEntity<>("PhotoNotFoundException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof PhotoUploadErrorException) {
			return new ResponseEntity<>("PhotoUploadErrorException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof PhotoNotCreatedException) {
			return new ResponseEntity<>("PhotoNotCreatedException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof PhotoNotDeletedException) {
			return new ResponseEntity<>("PhotoNotDeletedException", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
	}
}
