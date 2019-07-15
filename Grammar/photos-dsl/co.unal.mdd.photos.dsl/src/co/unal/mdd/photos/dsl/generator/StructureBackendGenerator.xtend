package co.unal.mdd.photos.dsl.generator

import co.unal.mdd.photos.dsl.generator.templates.TemplateClassController
import co.unal.mdd.photos.dsl.generator.templates.TemplateGenericClass
import co.unal.mdd.photos.dsl.generator.templates.TemplateProperties
import co.unal.mdd.photos.dsl.generator.templates.TemplateYml
import co.unal.mdd.photos.dsl.softGalleryLanguage.AlbumException
import co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments
import co.unal.mdd.photos.dsl.softGalleryLanguage.ControllerSegmentElement
import co.unal.mdd.photos.dsl.softGalleryLanguage.DirectoryContent
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities
import co.unal.mdd.photos.dsl.softGalleryLanguage.MultipleFile
import co.unal.mdd.photos.dsl.softGalleryLanguage.PhotoException
import co.unal.mdd.photos.dsl.softGalleryLanguage.RestController
import co.unal.mdd.photos.dsl.softGalleryLanguage.SegmentStructureContent
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpecificationSegmentElement
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositories
import co.unal.mdd.photos.dsl.softGalleryLanguage.UserException
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import co.unal.mdd.photos.dsl.generator.templates.TemplateClassModel
import co.unal.mdd.photos.dsl.softGalleryLanguage.AtributePhoto
import co.unal.mdd.photos.dsl.softGalleryLanguage.AtributeAlbum
import co.unal.mdd.photos.dsl.softGalleryLanguage.AtributeUserDomain
import co.unal.mdd.photos.dsl.generator.templates.TemplateRepositoryInterface
import co.unal.mdd.photos.dsl.generator.templates.TemplateClassException

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class StructureBackendGenerator{
		
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
		
				
		// RestController
		for (rsc : proyectTree.allContents.toIterable.filter(RestController)) {
			println("RestController: " + rsc.name)
			
			// Mappings
			//var mappings = rsc.getContents().filter()  
			
			
			var classVars = proyectTree.allContents.filter(SpringRepositories).toList
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name
			className = ent.name + bls.name.toFirstUpper
			
			if(ent.name.equals("Photo") && rsc.name.equals("PhotoController")){
				createControllerClassFile(className, packageName, rsc, ent, classVars)
				
			} else if (ent.name.equals("Album") && rsc.name.equals("AlbumController")) {
				createControllerClassFile(className, packageName, rsc, ent, classVars)
				
			} else if (ent.name.equals("User") && rsc.name.equals("UserController")) {
				createControllerClassFile(className, packageName, rsc, ent, classVars)
			}
		}			

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
			
			createExceptionClassFile(className, packageName)
		}
	}


	// Path: /.controller.exception.photo
	def generateControllerExceptionPhoto(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		// PhotoException
		for (pe : proyectTree.allContents.toIterable.filter(PhotoException)) {
			println("PhotoException: " + pe.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+ent.name
			className = pe.name
			
			createExceptionClassFile(className, packageName)
		}
	}
	
	
	// Path: /.controller.exception.user
	def generateControllerExceptionUser(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls, ControllerSegmentElement cse) {
		
		// UserException
		for (ue : proyectTree.allContents.toIterable.filter(UserException)) {
			println("UserException: " + ue.name)
			
			packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name+"."+cse.name+"."+ent.name
			className = ue.name
			
			createExceptionClassFile(className, packageName)
		}
	}
	
	
	// Path: /.model
	def generateModel(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
		className = ent.name	
		
		createModelClassFile(className, packageName, ent)
	}


	// Path: /.repository
	def generateRepository(Entities ent, SegmentStructureContent ssc, DirectoryContent dir, BusinessLogicSegments bls) {
		
		packageName = basePackageName +"."+ ssc.name +"."+ dir.name +"."+ bls.name	
		className = ent.name + bls.name.toFirstUpper
		
		createInterfaceFile(className, packageName, ent)
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
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", TemplateGenericClass.generate(className, packageName))
	}
	
	def createExceptionClassFile(String className, String packageName) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", TemplateClassException.generate(className, packageName))
	}
	
	def createControllerClassFile(String className, String packageName, RestController rsc, Entities ent, List<SpringRepositories> classVars) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", TemplateClassController.generate(className, packageName, rsc, ent, classVars))
	}
	
	def createModelClassFile(String className, String packageName, Entities ent) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", TemplateClassModel.generate(className, packageName, ent))
	}
	
	def createInterfaceFile(String className, String packageName, Entities ent) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".java", TemplateRepositoryInterface.generate(className, packageName, ent))
	}
	
	def createPropertiesFile(String className, String packageName) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".properties", TemplateProperties.generate(className, packageName))
	}	

	def createYmlFile(String className, String packageName) {
		fileWriter.generateFile(packageName.replace('.', '/') +"/"+ className + ".yml", TemplateYml.generate(className, packageName))
	}

}