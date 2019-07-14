package co.unal.mdd.photos.dsl.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SoftGalleryLanguageGenerator extends AbstractGenerator {
	
    @Inject extension IQualifiedNameProvider
    
	StructureBackendGenerator structurebackendGenerator = new StructureBackendGenerator();
	StructureFrontendGenerator structurefrontendGenerator = new StructureFrontendGenerator();
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		println("*** Generator v8 ***")
		println(">>> doGenerate() Started <<<")
		println("")

		structurebackendGenerator.directoryGeneration(resource, fsa, context)
        structurefrontendGenerator.directoryGeneration(resource, fsa, context)
        
        println("")
        println(">>> doGenerate() Finished <<<")
	}
}