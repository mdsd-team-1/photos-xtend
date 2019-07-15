package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.Autowired
import co.unal.mdd.photos.dsl.softGalleryLanguage.DeleteMapping
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities
import co.unal.mdd.photos.dsl.softGalleryLanguage.ExceptionHandler
import co.unal.mdd.photos.dsl.softGalleryLanguage.ExceptionProcess
import co.unal.mdd.photos.dsl.softGalleryLanguage.GetMapping
import co.unal.mdd.photos.dsl.softGalleryLanguage.PostMapping
import co.unal.mdd.photos.dsl.softGalleryLanguage.PutMapping
import co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMapping
import co.unal.mdd.photos.dsl.softGalleryLanguage.ResponseEntity
import co.unal.mdd.photos.dsl.softGalleryLanguage.RestController
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositories
import java.util.List
import co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMappingValue
import co.unal.mdd.photos.dsl.softGalleryLanguage.ResponseParameter
import co.unal.mdd.photos.dsl.softGalleryLanguage.ResponseParameterAnnotation
import co.unal.mdd.photos.dsl.softGalleryLanguage.ResponseParameterType
import co.unal.mdd.photos.dsl.softGalleryLanguage.ResponseParameterName

class TemplateClassController {
	
	static def generate(String className, String packageName, RestController rsc, Entities entity, List<SpringRepositories> classVars)
	'''
	package «packageName»;	
	
	«FOR item: classVars»
	import «packageName».«item.name»;
	«ENDFOR»
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
	@RequestMapping("/«entity.name.toFirstLower»")
	public class «className» {
				
		«FOR autowiredItem: rsc.getElements().filter(Autowired)»
		@Autowired
		«autowiredItem.name» «autowiredItem.name.toFirstLower»;
		
		«ENDFOR»
		
		«FOR responseItem: rsc.getElements().filter(ResponseEntity)»
		
		«IF responseItem.getType().filter(RequestMapping).size() > 0»
		@RequestMapping(value = "«responseItem.getType().filter(RequestMapping).get(0).getValue().filter(RequestMappingValue).get(0).name»", method = RequestMethod.GET, produces = "application/json")
		«ENDIF»
		«IF responseItem.getType().filter(PostMapping).size() > 0»
		@PostMapping("/«responseItem.getType().filter(PostMapping).get(0).name»")
		«ENDIF»
		«IF responseItem.getType().filter(GetMapping).size() > 0»
		@GetMapping("/«responseItem.getType().filter(GetMapping).get(0).name»")
		«ENDIF»
		«IF responseItem.getType().filter(PutMapping).size() > 0»
		@PutMapping("/«responseItem.getType().filter(PutMapping).get(0).name»")
		«ENDIF»
		«IF responseItem.getType().filter(DeleteMapping).size() > 0»
		@DeleteMapping("/«responseItem.getType().filter(DeleteMapping).get(0).name»")
		«ENDIF»
		public ResponseEntity<?> «responseItem.name»(«FOR parameterItem: responseItem.getElements().filter(ResponseParameter)»@«parameterItem.getElements().filter(ResponseParameterAnnotation).get(0).name» «parameterItem.getElements().filter(ResponseParameterType).get(0).name» «parameterItem.getElements().filter(ResponseParameterName).get(0).name», «ENDFOR») throws Exception {
			
			«IF responseItem.name.equals("getUser") || responseItem.name.equals("getPhoto") || responseItem.name.equals("getAlbum")»
			«entity.name» «entity.name.toFirstLower» = null;

			try {
				«entity.name.toFirstLower» = «entity.name.toFirstLower»Repository.getOne(id.intValue());

			} catch(Exception e) {
				throw new «entity.name»NotFoundException();
			}

			if(«entity.name.toFirstLower» == null){
				throw new «entity.name»NotFoundException();
			}

			return new ResponseEntity<>(«entity.name.toFirstLower», HttpStatus.OK);
			«ELSEIF responseItem.name.equals("getAlbumsFromUser")»
			AlbumSpecification albumsFrom«entity.name»Query = new AlbumSpecification(
					new SearchCriteria("«entity.name.toFirstLower»Id", ":", id));

			List<Album> albums = albumRepository.findAll(albumsFrom«entity.name»Query);

			if(albums == null){
				throw new AlbumsFrom«entity.name»NotFoundException();
			}

			if(albums.size() == 0){
				throw new «entity.name»HasNoAlbumsException();
			}

			return new ResponseEntity<>(albums, HttpStatus.OK);
			«ELSEIF responseItem.name.equals("getPhotosFromUser")»
			AlbumSpecification albumsFrom«entity.name»Query = new AlbumSpecification(
					new SearchCriteria("«entity.name.toFirstLower»Id", ":", id));

			List<Album> albums = albumRepository.findAll(albumsFrom«entity.name»Query);

			if(albums == null){
				throw new AlbumsFrom«entity.name»NotFoundException();
			}

			if(albums.size() == 0){
				throw new «entity.name»HasNoAlbumsException();
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
				throw new «entity.name»HasNoPhotosException();
			}

			return new ResponseEntity<>(allPhotos, HttpStatus.OK);
			«ELSEIF responseItem.name.equals("loginUser")»
			«entity.name» existing«entity.name» = null;

			String email = body.get("email");
			String password = body.get("password");

			if(password == null || email == null) {
				throw new MissingParametersForLoginException();
			}

			try {
				existing«entity.name» = «entity.name.toFirstLower»Repository.findByEmailAndPassword(email,password);

			} catch(Exception e) {
				throw new WrongLoginInfoException();
			}

			if(existing«entity.name» == null){
				throw new WrongLoginInfoException();
			}

			Map<String,Object> response = new HashMap<String,Object>();
			response.put("Login Status","Successfully logged in");
			response.put("«entity.name» Id",existing«entity.name».getId());

			return new ResponseEntity<>(response, HttpStatus.CREATED);
			«ELSEIF responseItem.name.equals("createUser")»
			String firstName = body.get("first_name");
			String lastName = body.get("last_name");
			String profileDescription = body.get("profile_description");
			String «entity.name.toFirstLower»Name = body.get("«entity.name.toFirstLower»_name");
			String password = body.get("password");
			String email = body.get("email");

			if(firstName == null || lastName == null || profileDescription == null ||
					«entity.name.toFirstLower»Name == null || password == null || email == null) {

				throw new MissingParametersForNew«entity.name»Exception();
			}

			«entity.name» new«entity.name» = «entity.name.toFirstLower»Repository.save(
					new «entity.name»(«entity.name.toFirstLower»Name, firstName, lastName, profileDescription, password, email));

			if(new«entity.name» == null){
				throw new «entity.name»NotCreatedException();
			}

			String defaultAlbumName = firstName + " " + lastName + " Album";

			Album newAlbum = albumRepository.save(
					new Album(defaultAlbumName, new«entity.name».getId()));

			if(newAlbum == null) {
				throw new AlbumNotCreatedForNew«entity.name»Exception();
			}

			return new ResponseEntity<>(new«entity.name», HttpStatus.CREATED);
			«ELSEIF responseItem.name.equals("editUser")»
			«entity.name» existing«entity.name» = null;

			try {
				existing«entity.name» = «entity.name.toFirstLower»Repository.getOne(id.intValue());

			} catch(Exception e) {
				throw new «entity.name»ToEditDoesNotExist();
			}

			if(existing«entity.name» == null){
				throw new «entity.name»ToEditDoesNotExist();
			}

			String firstName = body.get("first_name");
			String lastName = body.get("last_name");
			String profileDescription = body.get("profile_description");
			String «entity.name.toFirstLower»Name = body.get("«entity.name.toFirstLower»_name");

			if(firstName == null || lastName == null || profileDescription == null ||
					«entity.name.toFirstLower»Name == null) {

				throw new MissingParametersForEdit«entity.name»Exception();
			}

			existing«entity.name».setFirstName(firstName);
			existing«entity.name».setLastName(lastName);
			existing«entity.name».setProfileDescription(profileDescription);
			existing«entity.name».set«entity.name»Name(«entity.name.toFirstLower»Name);

			try {
				«entity.name.toFirstLower»Repository.save(existing«entity.name»);

			} catch(Exception e) {
				throw new «entity.name»NotEditedException();
			}

			return new ResponseEntity<>("«entity.name» edited", HttpStatus.ACCEPTED);
			«ELSEIF responseItem.name.equals("END")»
			
			«ELSEIF responseItem.name.equals("ABC")»
			
			«ELSEIF responseItem.name.equals("ABC")»
			
			«ELSEIF responseItem.name.equals("ABC")»
			
			
			«ENDIF»
		}
		«ENDFOR»
				
		«FOR handlerItem: rsc.getElements().filter(ExceptionHandler)»
		@ExceptionHandler(Exception.class)
		public ResponseEntity<?> «handlerItem.name»(Exception exception) {
		
			«FOR exceptionItem: handlerItem.getElements().filter(ExceptionProcess)»
			if(exception instanceof «exceptionItem.name») {
				return new ResponseEntity<>("«exceptionItem.name»", HttpStatus.INTERNAL_SERVER_ERROR);
			}
			«ENDFOR»
		
			return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
		}
		«ENDFOR»
	}
	'''
}