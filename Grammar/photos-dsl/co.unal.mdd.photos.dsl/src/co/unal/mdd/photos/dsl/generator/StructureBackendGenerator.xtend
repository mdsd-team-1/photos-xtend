package co.unal.mdd.photos.dsl.generator

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
import co.unal.mdd.photos.dsl.softGalleryLanguage.PhotoException
import co.unal.mdd.photos.dsl.softGalleryLanguage.AlbumException
import co.unal.mdd.photos.dsl.softGalleryLanguage.UserException
import co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class StructureBackendGenerator{
	
    var basePackageName = "co.edu.unal"
    var className = ""
	var packageName = ""
	
	def directoryGeneration(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context){
		
		println(">>> Back-End Started")
		
		// Entities
		for (domainItem : resource.allContents.toIterable.filter(Entities)) {
			println("Entities: " + domainItem.name)
			
			// SegmentStructureContent
			for (ssc : resource.allContents.toIterable.filter(SegmentStructureContent)) {
				println("SegmentStructureContent: " + ssc.name)	
					
				if(ssc.name.equals("photosappback")){
				
					// DirectoryContent
					for (dir : resource.allContents.toIterable.filter(DirectoryContent)) {
						println("DirectoryContent: " + dir.name)	
						
						if(dir.name.equals("main")){
							generateExecutables(resource, fsa, context, domainItem, ssc, dir)
							
						} else if(dir.name.equals("resources")){
							generateResources(resource, fsa, context, ssc, dir)
						}
					}
				}
			}
			
			println("")
		}
		
		println(">>> Back-End Finished")
	}

	def generateExecutables(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir) {
		
		// BusinessLogicSegments
		for (bls : resource.allContents.toIterable.filter(BusinessLogicSegments)) {
			println("BusinessLogicSegments: " + bls.name)
		
			switch bls.name {
				
				case "controller":{
					generateController(resource, fsa, context, domainItem, ssc, dir, bls)
				}
					
				case "model":{
					generateModel(resource, fsa, context, domainItem, ssc, dir, bls)
				}
					
				case "config":{
					generateConfig(resource, fsa, context, domainItem, ssc, dir, bls)
				}
					
				case "specification":{
					generateSpecification(resource, fsa, context, domainItem, ssc, dir, bls)
				}
					
				case "repository":{
					generateRepository(resource, fsa, context, domainItem, ssc, dir, bls)
				}
			}
		}
	}
	
	
	// Path: /
	def generateMain(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
	}
	
	
	// Path: /.config
	def generateConfig(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
		className = domainItem.name
		createClassFile(className, packageName, fsa)
	}


	// Path: /.controller	
	def generateController(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		// ControllerSegmentElement
		for (cse : resource.allContents.toIterable.filter(ControllerSegmentElement)) {
			println("ControllerSegmentElement: " + bls.name)
		
			if(cse.name.equals("amazon")){
				generateControllerAmazon(resource, fsa, context, domainItem, ssc, dir, bls, cse)
			
			} else if(cse.name.equals("exception")){
				generateControllerException(resource, fsa, context, domainItem, ssc, dir, bls, cse)
			}
		}
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name
		className = domainItem.name + bls.name.toFirstUpper	
		createClassFile(className, packageName, fsa)
	}
	
	
	// Path: /.controller.amazon
	def generateControllerAmazon(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name
		className = cse.name.toFirstUpper + "Client"
		createClassFile(className, packageName, fsa)
	}
	
	
	// Path: /.controller.exception	
	def generateControllerException(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		switch domainItem.name {
			
			case "Photo":{
				generateControllerExceptionPhoto(resource, fsa, context, domainItem, ssc, dir, bls, cse)
			}
			case "Album":{
				generateControllerExceptionAlbum(resource, fsa, context, domainItem, ssc, dir, bls, cse)
			}
			case "User":{
				generateControllerExceptionUser(resource, fsa, context, domainItem, ssc, dir, bls, cse)
			}
		}
	}
	
	
	// Path: /.controller.exception.album
	def generateControllerExceptionAlbum(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		// AlbumException
		for (ae : resource.allContents.toIterable.filter(AlbumException)) {
			println("AlbumException: " + ae.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+domainItem.name
			className = ae.name
			createClassFile(className, packageName, fsa)
		}
	}


	// Path: /.controller.exception.photo
	def generateControllerExceptionPhoto(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		// PhotoException
		for (pe : resource.allContents.toIterable.filter(PhotoException)) {
			println("PhotoException: " + pe.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+domainItem.name
			className = pe.name
			createClassFile(className, packageName, fsa)
		}
	}
	
	
	// Path: /.controller.exception.user
	def generateControllerExceptionUser(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		// UserException
		for (ue : resource.allContents.toIterable.filter(UserException)) {
			println("UserException: " + ue.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+domainItem.name
			className = ue.name
			createClassFile(className, packageName, fsa)
		}
	}
	
	
	// Path: /.model
	def generateModel(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
		className = domainItem.name
		createClassFile(className, packageName, fsa)
	}


	// Path: /.repository
	def generateRepository(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
		className = domainItem.name + bls.name.toFirstUpper
		createInterfaceFile(className, packageName, fsa)
	}
	
	
	// Path: /.specification
	def generateSpecification(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {

		generateSpecificationCriteria(resource, fsa, context, domainItem, ssc, dir, bls)
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name+"."+ bls.name	
		className = domainItem.name  + bls.name.toFirstUpper
		createClassFile(className, packageName, fsa)
	}
	
	
	// Path: /.specification.criteria
	def generateSpecificationCriteria(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Entities domainItem, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		// SpecificationSegmentElement
		for (sse : resource.allContents.toIterable.filter(SpecificationSegmentElement)) {
			println("SpecificationSegmentElement: " + sse.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name +"."+ sse.name	
			className = "Search"+sse.name.toFirstUpper
			createClassFile(className, packageName, fsa)
		}
	}	
	
	
	def generateResources(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, SegmentStructureContent ssc, DirectoryContent dir) {
		
		// MultipleFile               
		for (mf : resource.allContents.toIterable.filter(MultipleFile)) {
			println("MultipleFile: " + mf.name)
			
			if(mf.name.equals("application")) {
			
				packageName = basePackageName +"."+ ssc.name +"."+ dir.name 	        	
				className = mf.name
				
				fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".properties", templateProperties(className, packageName))
				fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".yml", templateYml(className, packageName))
			}
		}
	}



	// ----------------
	// File Writers
	// ----------------
	
	def createClassFile(String className, String packageName, IFileSystemAccess2 fsa) {
		fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", templateClass(className, packageName))
	}
	
	def createInterfaceFile(String className, String packageName, IFileSystemAccess2 fsa) {
		fsa.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", templateInterface(className, packageName))
	}



	// ----------------
	// Templates
	// ----------------			
	
	def templateClass(String className, String packageName)
''' 
	// ----------------------------------------
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	
	package «packageName»;
	
	public class «className» {
		
		
	}
''' 

	def templateInterface(String className, String packageName)
''' 
	// ----------------------------------------
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	
	package «packageName»;
	
	public interface «className» extends JpaRepository<Album, Integer>, JpaSpecificationExecutor<Album>{
		
		
	}
''' 

	def templateProperties(String className, String packageName)
''' 
	// ----------------------------------------
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	
	package «packageName»;
	
	public class «className» {
		
		
	}
''' 

	def templateYml(String className, String packageName)
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