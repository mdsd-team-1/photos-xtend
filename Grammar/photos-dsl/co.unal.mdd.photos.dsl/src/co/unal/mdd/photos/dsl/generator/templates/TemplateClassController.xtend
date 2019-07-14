package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositories
import java.util.List
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities
import co.unal.mdd.photos.dsl.softGalleryLanguage.Autowired
import co.unal.mdd.photos.dsl.softGalleryLanguage.AutowiredType
import co.unal.mdd.photos.dsl.softGalleryLanguage.RestController

class TemplateClassController {
	
	static def generate(String className, String packageName, RestController rsc, Entities entity, List<SpringRepositories> classVars)
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
				
		«FOR autowiredItem: rsc.getElements().filter(Autowired)»
		@Autowired
		«autowiredItem.getElements().filter(AutowiredType).get(0).name» «autowiredItem.getElements().filter(AutowiredType).get(0).name.toFirstLower»;
		
		«ENDFOR»
		



		
		
		
		
		
		
		
	}
	'''
}