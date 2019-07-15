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
	
	
	
	@RequestMapping(value = "id_id", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getUser(@PathVariable Long id, ) throws Exception {
		
		User user = null;

		try {
			user = userRepository.getOne(id.intValue());

		} catch(Exception e) {
			throw new UserNotFoundException();
		}

		if(user == null){
			throw new UserNotFoundException();
		}

		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@RequestMapping(value = "id_albums", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getAlbumsFromUser(@PathVariable Long id, ) throws Exception {
		
		AlbumSpecification albumsFromUserQuery = new AlbumSpecification(
				new SearchCriteria("userId", ":", id));

		List<Album> albums = albumRepository.findAll(albumsFromUserQuery);

		if(albums == null){
			throw new AlbumsFromUserNotFoundException();
		}

		if(albums.size() == 0){
			throw new UserHasNoAlbumsException();
		}

		return new ResponseEntity<>(albums, HttpStatus.OK);
	}
	
	@RequestMapping(value = "id_photos", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getPhotosFromUser(@PathVariable Long id, ) throws Exception {
		
		AlbumSpecification albumsFromUserQuery = new AlbumSpecification(
				new SearchCriteria("userId", ":", id));

		List<Album> albums = albumRepository.findAll(albumsFromUserQuery);

		if(albums == null){
			throw new AlbumsFromUserNotFoundException();
		}

		if(albums.size() == 0){
			throw new UserHasNoAlbumsException();
		}

		ArrayList<Photo> allPhotos = new ArrayList<Photo>();

		for (Album album : albums) {

			PhotoSpecification photosFromAlbumQuery = new PhotoSpecification(
					new SearchCriteria("albumId", ":", album.getId()));

			List<Photo> photosFromAlbum = photoRepository.findAll(photosFromAlbumQuery);

			if(photosFromAlbum != null && photosFromAlbum.size() > 0){
				allPhotos.addAll(photosFromAlbum);
			}
		}

		if(allPhotos.size() == 0){
			throw new UserHasNoPhotosException();
		}

		return new ResponseEntity<>(allPhotos, HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody Map_String_String body, ) throws Exception {
		
		User existingUser = null;

		String email = body.get("email");
		String password = body.get("password");

		if(password == null || email == null) {
			throw new MissingParametersForLoginException();
		}

		try {
			existingUser = userRepository.findByEmailAndPassword(email,password);

		} catch(Exception e) {
			throw new WrongLoginInfoException();
		}

		if(existingUser == null){
			throw new WrongLoginInfoException();
		}

		Map<String,Object> response = new HashMap<String,Object>();
		response.put("Login Status","Successfully logged in");
		response.put("User Id",existingUser.getId());

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody Map_String_String body, ) throws Exception {
		
		String firstName = body.get("first_name");
		String lastName = body.get("last_name");
		String profileDescription = body.get("profile_description");
		String userName = body.get("user_name");
		String password = body.get("password");
		String email = body.get("email");

		if(firstName == null || lastName == null || profileDescription == null ||
				userName == null || password == null || email == null) {

			throw new MissingParametersForNewUserException();
		}

		User newUser = userRepository.save(
				new User(userName, firstName, lastName, profileDescription, password, email));

		if(newUser == null){
			throw new UserNotCreatedException();
		}

		String defaultAlbumName = firstName + " " + lastName + " Album";

		Album newAlbum = albumRepository.save(
				new Album(defaultAlbumName, newUser.getId()));

		if(newAlbum == null) {
			throw new AlbumNotCreatedForNewUserException();
		}

		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	
	@PutMapping("/id_edit")
	public ResponseEntity<?> editUser(@PathVariable Long id, @RequestBody Map_String_String body, ) throws Exception {
		
		User existingUser = null;

		try {
			existingUser = userRepository.getOne(id.intValue());

		} catch(Exception e) {
			throw new UserToEditDoesNotExist();
		}

		if(existingUser == null){
			throw new UserToEditDoesNotExist();
		}

		String firstName = body.get("first_name");
		String lastName = body.get("last_name");
		String profileDescription = body.get("profile_description");
		String userName = body.get("user_name");

		if(firstName == null || lastName == null || profileDescription == null ||
				userName == null) {

			throw new MissingParametersForEditUserException();
		}

		existingUser.setFirstName(firstName);
		existingUser.setLastName(lastName);
		existingUser.setProfileDescription(profileDescription);
		existingUser.setUserName(userName);

		try {
			userRepository.save(existingUser);

		} catch(Exception e) {
			throw new UserNotEditedException();
		}

		return new ResponseEntity<>("User edited", HttpStatus.ACCEPTED);
	}
			
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
