package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositories
import java.util.List
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities
import co.unal.mdd.photos.dsl.softGalleryLanguage.Autowired
import co.unal.mdd.photos.dsl.softGalleryLanguage.AutowiredType
import co.unal.mdd.photos.dsl.softGalleryLanguage.RestController
//import co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMapping
//import co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMappingType
import co.unal.mdd.photos.dsl.softGalleryLanguage.ExceptionHandler
import co.unal.mdd.photos.dsl.softGalleryLanguage.ExceptionProcess

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
		«autowiredItem.getElements().filter(AutowiredType).get(0).name» «autowiredItem.getElements().filter(AutowiredType).get(0).name.toFirstLower»;
		
		«ENDFOR»
		


		@ExceptionHandler(Exception.class)
		public ResponseEntity<?> «rsc.getElements().filter(ExceptionHandler).get(0).name»(Exception exception) {
			
			«FOR exceptionHandleItem: rsc.getElements().filter(ExceptionHandler).get(0).getElements().filter(ExceptionProcess).toList»
			if(exception instanceof «exceptionHandleItem.name») {
				return new ResponseEntity<>("«exceptionHandleItem.name»", HttpStatus.INTERNAL_SERVER_ERROR);
			}
			«ENDFOR»
	
			return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
		}
	}
	'''
}