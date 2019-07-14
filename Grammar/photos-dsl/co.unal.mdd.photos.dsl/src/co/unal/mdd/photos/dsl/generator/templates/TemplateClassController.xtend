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
		public ResponseEntity<?> «responseItem.name»(@RequestBody String body) throws Exception {
			
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