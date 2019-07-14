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
@RequestMapping("/album")
public class AlbumController {
			
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	PhotoRepository photoRepository;
	
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getAlbum(@PathVariable Long id) throws Exception {
	


	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getPhotosFromAlbum(@PathVariable Long id) throws Exception {
	


	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> createAlbum(@PathVariable Long id) throws Exception {
	


	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception) {
		
		if(exception instanceof AlbumNotFoundException) {
			return new ResponseEntity<>("AlbumNotFoundException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof PhotosFromAlbumNotFoundException) {
			return new ResponseEntity<>("PhotosFromAlbumNotFoundException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof AlbumHasNoPhotosException) {
			return new ResponseEntity<>("AlbumHasNoPhotosException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof MissingParametersForNewAlbumException) {
			return new ResponseEntity<>("MissingParametersForNewAlbumException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof UserIdIsNotNumberException) {
			return new ResponseEntity<>("UserIdIsNotNumberException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof AlbumNotCreatedException) {
			return new ResponseEntity<>("AlbumNotCreatedException", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
	}
}
