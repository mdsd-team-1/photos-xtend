package co.unal.mdd.photos.dsl.generator

import co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments
import co.unal.mdd.photos.dsl.softGalleryLanguage.DirectoryContent
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities
import co.unal.mdd.photos.dsl.softGalleryLanguage.MultipleFile
import co.unal.mdd.photos.dsl.softGalleryLanguage.SegmentStructureContent
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import co.unal.mdd.photos.dsl.softGalleryLanguage.ControllerSegmentElement
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpecificationSegmentElement

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class StructureBackendGenerator{
	
    @Inject extension IQualifiedNameProvider
    
    var basePackageName = "co.edu.unal"
    var className = ""
	var packageName = ""
	
	def directoryGeneration(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context){
		
		println(">>> Back-End")
		
		// Entities
		for (domainItem : resource.allContents.toIterable.filter(Entities)) {
			println("Entities Item: " + domainItem.name)
			
			// SegmentStructureContent
			for (ssc : resource.allContents.toIterable.filter(SegmentStructureContent)) {
				println("SegmentStructureContent Item: " + ssc.name)	
					
				if(ssc.name.equals("photosappback")){
				
					// DirectoryContent
					for (dir : resource.allContents.toIterable.filter(DirectoryContent)) {
						println("DirectoryContent Item: " + dir.name)	
						
						if(dir.name.equals("main")){
							generateExecutables(resource, fsa, context, domainItem, ssc, dir)
							
						} else if(dir.name.equals("resources")){
							generateResources(resource, fsa, context, ssc, dir)
						}
					}
				}
			}
		}
	}

	def generateExecutables(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir) {
		
		// BusinessLogicSegments
		for (bls : resource.allContents.toIterable.filter(BusinessLogicSegments)) {
			println("BusinessLogicSegments Item: " + bls.name)
		
			switch bls.name {
				
				case "controller":{
					
					for (cse : resource.allContents.toIterable.filter(ControllerSegmentElement)) {
						
						if(cse.name.equals("amazon")){
							packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name
							className = cse.name.toFirstUpper + "Client"
							fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", generateClass(className, packageName))
							
						} else if(cse.name.equals("exception")){
							packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+domainItem.name
							className = domainItem.name + cse.name.toFirstUpper	
							fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", generateClass(className, packageName))
						}
					}
					
					packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name
					className = domainItem.name + bls.name.toFirstUpper	
					fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", generateClass(className, packageName))
				}
					
				case "model":{
					packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
					className = domainItem.name
					fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", generateClass(className, packageName))
				}
					
				case "config":{
					packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
					className = domainItem.name
					fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", generateClass(className, packageName))
				}
					
				case "specification":{
					
					for (sse : resource.allContents.toIterable.filter(SpecificationSegmentElement)) {
						packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name +"."+ sse.name	
						className = "Search"+sse.name.toFirstUpper
						fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", generateClass(className, packageName))
					}
					
					packageName = basePackageName +"."+ ssc.name +"."+ dir.name+"."+ bls.name	
					className = domainItem.name  + bls.name.toFirstUpper
					fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", generateClass(className, packageName))
				}
					
				case "repository":{
					packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
					className = domainItem.name + bls.name.toFirstUpper
					fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", generateInterface(className, packageName))
				}
			}
		}
	}
	
	
	def generateResources(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, SegmentStructureContent ssc, DirectoryContent dir) {
		
		// MultipleFile               
		for (mf : resource.allContents.toIterable.filter(MultipleFile)) {
			
			if(mf.name.equals("application")) {
			
				println("Architecture Iteration 2" + mf.name)
				
				packageName = basePackageName +"."+ ssc.name +"."+ dir.name 	        	
				className = mf.name
				
				fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".properties", generateProperties(className, packageName))
				fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".yml", generateYml(className, packageName))
			}
		}
	}


// ----------------	
// Templates
// ----------------	
		
	
	def generateClass(String className, String packageName)
''' 
	// ----------------------------------------
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	
	package «packageName»;
	
	public class «className» {
		
		
	}
''' 

	def generateInterface(String className, String packageName)
''' 
	// ----------------------------------------
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	
	package «packageName»;
	
	public interface «className» extends JpaRepository<Album, Integer>, JpaSpecificationExecutor<Album>{
		
		
	}
''' 

	def generateProperties(String className, String packageName)
''' 
	// ----------------------------------------
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	
	package «packageName»;
	
	public class «className» {
		
		
	}
''' 

	def generateYml(String className, String packageName)
''' 
	// ----------------------------------------
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	
	package «packageName»;
	
	public class «className» {
		
		
	}
''' 

}