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
@RequestMapping("/user")
public class UserController {
			
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	PhotoRepository photoRepository;
	
	


	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleException(Exception exception) {
		
		if(exception instanceof UserNotFoundException) {
			return new ResponseEntity<>("UserNotFoundException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof AlbumsFromUserNotFoundException) {
			return new ResponseEntity<>("AlbumsFromUserNotFoundException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof UserHasNoAlbumsException) {
			return new ResponseEntity<>("UserHasNoAlbumsException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof UserHasNoPhotosException) {
			return new ResponseEntity<>("UserHasNoPhotosException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof MissingParametersForNewUserException) {
			return new ResponseEntity<>("MissingParametersForNewUserException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof UserNotCreatedException) {
			return new ResponseEntity<>("UserNotCreatedException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof AlbumNotCreatedForNewUserException) {
			return new ResponseEntity<>("AlbumNotCreatedForNewUserException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof MissingParametersForEditUserException) {
			return new ResponseEntity<>("MissingParametersForEditUserException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof WrongLoginInfoException) {
			return new ResponseEntity<>("WrongLoginInfoException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof MissingParametersForLoginException) {
			return new ResponseEntity<>("MissingParametersForLoginException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof UserIdIsNotNumberException) {
			return new ResponseEntity<>("UserIdIsNotNumberException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof UserToEditDoesNotExistException) {
			return new ResponseEntity<>("UserToEditDoesNotExistException", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(exception instanceof UserNotEditedException) {
			return new ResponseEntity<>("UserNotEditedException", HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
	}
}
