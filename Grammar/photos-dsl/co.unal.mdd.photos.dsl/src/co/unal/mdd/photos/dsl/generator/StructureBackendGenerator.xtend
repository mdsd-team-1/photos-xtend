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
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositories
import java.util.List

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
		
	Resource proyectTree
	IFileSystemAccess2 fileWriter
	
	def directoryGeneration(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context){
		
		println(">>> Back-End Started")
		
		proyectTree = resource
		fileWriter = fsa
		
		// Entities
		for (ent : proyectTree.allContents.toIterable.filter(Entities)) {
			println("Entities: " + ent.name)
			
			// SegmentStructureContent
			for (ssc : proyectTree.allContents.toIterable.filter(SegmentStructureContent)) {
				println("SegmentStructureContent: " + ssc.name)	
					
				if(ssc.name.equals("photosappback")){
				
					// DirectoryContent
					for (dir : proyectTree.allContents.toIterable.filter(DirectoryContent)) {
						println("DirectoryContent: " + dir.name)	
						
						if(dir.name.equals("main")){
							generateMain(ent, ssc, dir)
							
						} else if(dir.name.equals("resources")){
							generateResources(ssc, dir)
						}
					}
				}
			}
			
			println("")
		}
		
		println(">>> Back-End Finished")
	}
	
	
	// Path: /
	def generateMain(Entities ent, SegmentStructureContent ssc, DirectoryContent dir) {
		
		
		// TODO: Falta PhotosAppBackApplication.java
				
		
		// BusinessLogicSegments
		for (bls : proyectTree.allContents.toIterable.filter(BusinessLogicSegments)) {
			println("BusinessLogicSegments: " + bls.name)
		
			switch bls.name {
				
				case "config":{
					generateConfig(ent, ssc, dir, bls)
				}
				
				case "controller":{
					generateController(ent, ssc, dir, bls)
				}
					
				case "model":{
					generateModel(ent, ssc, dir, bls)
				}
					
				case "repository":{
					generateRepository(ent, ssc, dir, bls)
				}
					
				case "specification":{
					generateSpecification(ent, ssc, dir, bls)
				}
			}
		}
	}
	
	
	// Path: /.config
	def generateConfig(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		
		// TODO: Falta AuthorizationServerConfig.java
		// TODO: Falta CORSFilter.java
		// TODO: Falta ResourceServerConfig.java
		// TODO: Falta SecurityConfig.java
		
		
		//packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
		//className = ent.name
		
		//createClassFile(className, packageName)
	}


	// Path: /.controller	
	def generateController(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {


		// TODO: Falta HomeController
		
		
		
		var classVars = proyectTree.allContents.filter(SpringRepositories).toList
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name
		className = ent.name + bls.name.toFirstUpper
				
		createControllerClassFile(className, packageName, classVars)
		

		// ControllerSegmentElement
		for (cse : proyectTree.allContents.toIterable.filter(ControllerSegmentElement)) {
			println("ControllerSegmentElement: " + bls.name)
			
			// Path: /.controller.amazon
			if(cse.name.equals("amazon")){
				generateControllerAmazon(ent, ssc, dir, bls, cse)

			// Path: /.controller.exception
			} else if(cse.name.equals("exception")){
				generateControllerException(ent, ssc, dir, bls, cse)
			}
		}
	}
	
	
	// Path: /.controller.amazon
	def generateControllerAmazon(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name
		className = cse.name.toFirstUpper + "Client"
		
		createClassFile(className, packageName)
	}
	
	
	// Path: /.controller.exception	
	def generateControllerException(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		switch ent.name {
			
			case "Photo":{
				generateControllerExceptionPhoto(ent, ssc, dir, bls, cse)
			}
			case "Album":{
				generateControllerExceptionAlbum(ent, ssc, dir, bls, cse)
			}
			case "User":{
				generateControllerExceptionUser(ent, ssc, dir, bls, cse)
			}
		}
	}
	
	
	// Path: /.controller.exception.album
	def generateControllerExceptionAlbum(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		// AlbumException
		for (ae : proyectTree.allContents.toIterable.filter(AlbumException)) {
			println("AlbumException: " + ae.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+ent.name
			className = ae.name
			
			createClassFile(className, packageName)
		}
	}


	// Path: /.controller.exception.photo
	def generateControllerExceptionPhoto(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		// PhotoException
		for (pe : proyectTree.allContents.toIterable.filter(PhotoException)) {
			println("PhotoException: " + pe.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+ent.name
			className = pe.name
			
			createClassFile(className, packageName)
		}
	}
	
	
	// Path: /.controller.exception.user
	def generateControllerExceptionUser(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		// UserException
		for (ue : proyectTree.allContents.toIterable.filter(UserException)) {
			println("UserException: " + ue.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+ent.name
			className = ue.name
			
			createClassFile(className, packageName)
		}
	}
	
	
	// Path: /.model
	def generateModel(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
		className = ent.name
		
		createClassFile(className, packageName)
	}


	// Path: /.repository
	def generateRepository(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
		className = ent.name + bls.name.toFirstUpper
		
		createInterfaceFile(className, packageName)
	}
	
	
	// Path: /.specification
	def generateSpecification(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {

		packageName = basePackageName +"."+ ssc.name +"."+ dir.name+"."+ bls.name	
		className = ent.name  + bls.name.toFirstUpper
		
		createClassFile(className, packageName)
		
		
		// Path: /.specification.criteria
		generateSpecificationCriteria(ent, ssc, dir, bls)
	}
	
	
	// Path: /.specification.criteria
	def generateSpecificationCriteria(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		// SpecificationSegmentElement
		for (sse : proyectTree.allContents.toIterable.filter(SpecificationSegmentElement)) {
			println("SpecificationSegmentElement: " + sse.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name +"."+ sse.name	
			className = "Search"+sse.name.toFirstUpper
			
			createClassFile(className, packageName)
		}
	}	
	
	
	// Path: /.scr/main/resources
	def generateResources(SegmentStructureContent ssc, DirectoryContent dir) {
		
		// MultipleFile               
		for (mf : proyectTree.allContents.toIterable.filter(MultipleFile)) {
			println("MultipleFile: " + mf.name)
			
			if(mf.name.equals("application")) {
			
				packageName = basePackageName +"."+ ssc.name +"."+ dir.name 	        	
				className = mf.name
				
				createPropertiesFile(className, packageName)
				createYmlFile(className, packageName)
			}
		}
	}



	// ----------------
	// File Writers
	// ----------------
	
	def createClassFile(String className, String packageName) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", templateClass(className, packageName))
	}
	
	def createControllerClassFile(String className, String packageName, List<SpringRepositories> classVars) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", templateControllerClass(className, packageName, classVars))
	}
	
	def createInterfaceFile(String className, String packageName) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", templateInterface(className, packageName))
	}
	
	def createPropertiesFile(String className, String packageName) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".properties", templateProperties(className, packageName))
	}	

	def createYmlFile(String className, String packageName) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".yml", templateYml(className, packageName))
	}
	
	

	// ----------------
	// File Templates
	// ----------------			
	
	def templateClass(String className, String packageName)
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
	
	def templateControllerClass(String className, String packageName, List<SpringRepositories> classVars)
	''' 
	// ----------------------------------------
	// Template for Class
	// PackageName: «packageName»
	// ClassName: «className»
	// ----------------------------------------	
	
	package «packageName»;
	
	«FOR item: classVars»
	import «packageName».«item.name»;
	«ENDFOR»
	
	
	public class «className» {
		
		«FOR item: classVars»
		«item.templateSpringRepositories»	
		«ENDFOR»
		
	}
	''' 
	
	def templateSpringRepositories(SpringRepositories item)
	'''
	@Autowired
	«item.name» «item.name.toFirstLower»

	'''
	
	

	def templateInterface(String interfaceName, String packageName)
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

	def templateProperties(String fileName, String packageName)
	''' 
	// ----------------------------------------
	// Template for Properties
	// PackageName: «packageName»
	// ClassName: «fileName»
	// ----------------------------------------	
	
	''' 

	def templateYml(String fileName, String packageName)
	''' 
	// ----------------------------------------
	// Template for Yml
	// PackageName: «packageName»
	// ClassName: «fileName»
	// ----------------------------------------	

	''' 

}