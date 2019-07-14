package co.unal.mdd.photos.dsl.generator;

import co.unal.mdd.photos.dsl.generator.StructureBackendGenerator;
import co.unal.mdd.photos.dsl.generator.StructureFrontendGenerator;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SoftGalleryLanguageGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private StructureBackendGenerator structurebackendGenerator = new StructureBackendGenerator();
  
  private StructureFrontendGenerator structurefrontendGenerator = new StructureFrontendGenerator();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    InputOutput.<String>println("*** Generator v8 ***");
    InputOutput.<String>println(">>> doGenerate() Started <<<");
    InputOutput.<String>println("");
    this.structurebackendGenerator.directoryGeneration(resource, fsa, context);
    this.structurefrontendGenerator.directoryGeneration(resource, fsa, context);
    InputOutput.<String>println("");
    InputOutput.<String>println(">>> doGenerate() Finished <<<");
  }
}
