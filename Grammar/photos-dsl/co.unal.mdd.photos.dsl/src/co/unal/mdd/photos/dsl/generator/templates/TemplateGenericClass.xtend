package co.unal.mdd.photos.dsl.generator.templates

class TemplateGenericClass {
	
	static def generate(String className, String packageName)
	''' 
	// ----------------------------------------
	// Template for ControllerClass
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	package «packageName»;
	
	
	public class «className» {
		
		
	}
	''' 
}