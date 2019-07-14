package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositories
import java.util.List
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities

class TemplateClassController {
	
	static def generate(String className, String packageName, List<SpringRepositories> classVars, Entities entity)
	''' 
	// ----------------------------------------
	// Controller
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	package «packageName»;
	
	«FOR item: classVars»
	import «packageName».«item.name»;
	«ENDFOR»
	
	
	@RestController
	@RequestMapping("/«entity.name.toFirstLower»")
	
	public class «className» {
		
		«FOR item: classVars»
		@Autowired
		«item.name» «item.name.toFirstLower»;
		
		«ENDFOR»
				
		@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
		public ResponseEntity<?> get«entity.name»(@PathVariable Long id) throws Exception {
	
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
		}






		
		
		
		
		
		
		
	}
	'''
}