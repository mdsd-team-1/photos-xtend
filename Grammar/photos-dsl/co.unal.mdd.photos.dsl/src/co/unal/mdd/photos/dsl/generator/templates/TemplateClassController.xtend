package co.unal.mdd.photos.dsl.generator.templates

import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositories
import java.util.List

class TemplateClassController {
	
	static def generate(String className, String packageName, List<SpringRepositories> classVars)
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
	
	
	public class «className» {
		
		«FOR item: classVars»
		@Autowired
		«item.name» «item.name.toFirstLower»;
		
		«ENDFOR»
		
	}
	'''
}