package co.unal.mdd.photos.dsl.generator.templates

class TemplateGenericInterface {
	
	static def generate(String interfaceName, String packageName)
	''' 
	// ----------------------------------------
	// Template for Interface
	// PackageName: «packageName»
	// ClassName: «interfaceName»
	// ----------------------------------------	
	
	package «packageName»;
	
	
	public interface «interfaceName» extends JpaRepository<Album, Integer>, JpaSpecificationExecutor<Album>{
		
		
	}
	''' 
}