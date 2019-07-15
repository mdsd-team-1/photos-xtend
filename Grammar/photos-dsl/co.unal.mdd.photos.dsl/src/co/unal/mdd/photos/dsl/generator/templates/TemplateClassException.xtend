package co.unal.mdd.photos.dsl.generator.templates


class TemplateClassException {
		
	static def generate(String className, String packageName)
	''' 
	package «packageName»;
	
	
	public class «className» extends Exception {
	
	}
	''' 
}