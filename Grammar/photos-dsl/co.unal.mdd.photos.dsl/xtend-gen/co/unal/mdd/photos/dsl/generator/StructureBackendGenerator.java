package co.unal.mdd.photos.dsl.generator;

import co.unal.mdd.photos.dsl.generator.templates.TemplateClassController;
import co.unal.mdd.photos.dsl.generator.templates.TemplateClassException;
import co.unal.mdd.photos.dsl.generator.templates.TemplateClassModel;
import co.unal.mdd.photos.dsl.generator.templates.TemplateClassSearchCriteria;
import co.unal.mdd.photos.dsl.generator.templates.TemplateClassSpecification;
import co.unal.mdd.photos.dsl.generator.templates.TemplateProperties;
import co.unal.mdd.photos.dsl.generator.templates.TemplateRepositoryInterface;
import co.unal.mdd.photos.dsl.generator.templates.TemplateStorageClient;
import co.unal.mdd.photos.dsl.generator.templates.TemplateYml;
import co.unal.mdd.photos.dsl.softGalleryLanguage.AlbumException;
import co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments;
import co.unal.mdd.photos.dsl.softGalleryLanguage.ControllerSegmentElement;
import co.unal.mdd.photos.dsl.softGalleryLanguage.CriteriaAttributeType;
import co.unal.mdd.photos.dsl.softGalleryLanguage.DirectoryContent;
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities;
import co.unal.mdd.photos.dsl.softGalleryLanguage.MultipleFile;
import co.unal.mdd.photos.dsl.softGalleryLanguage.PhotoException;
import co.unal.mdd.photos.dsl.softGalleryLanguage.RestController;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SegmentStructureContent;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpecificationSegmentElement;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringEntityAnnotationTypes;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositories;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpringRepositoryAnnotation;
import co.unal.mdd.photos.dsl.softGalleryLanguage.StorageClient;
import co.unal.mdd.photos.dsl.softGalleryLanguage.UserException;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class StructureBackendGenerator {
  private String basePackageName = "co.edu.unal";
  
  private String className = "";
  
  private String packageName = "";
  
  private Resource proyectTree;
  
  private IFileSystemAccess2 fileWriter;
  
  public String directoryGeneration(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println(">>> Back-End Started");
      this.proyectTree = resource;
      this.fileWriter = fsa;
      Iterable<Entities> _filter = Iterables.<Entities>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), Entities.class);
      for (final Entities ent : _filter) {
        {
          String _name = ent.getName();
          String _plus = ("Entities: " + _name);
          InputOutput.<String>println(_plus);
          Iterable<SegmentStructureContent> _filter_1 = Iterables.<SegmentStructureContent>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), SegmentStructureContent.class);
          for (final SegmentStructureContent ssc : _filter_1) {
            {
              String _name_1 = ssc.getName();
              String _plus_1 = ("SegmentStructureContent: " + _name_1);
              InputOutput.<String>println(_plus_1);
              boolean _equals = ssc.getName().equals("photosappback");
              if (_equals) {
                Iterable<DirectoryContent> _filter_2 = Iterables.<DirectoryContent>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), DirectoryContent.class);
                for (final DirectoryContent dir : _filter_2) {
                  {
                    String _name_2 = dir.getName();
                    String _plus_2 = ("DirectoryContent: " + _name_2);
                    InputOutput.<String>println(_plus_2);
                    boolean _equals_1 = dir.getName().equals("main");
                    if (_equals_1) {
                      this.generateMain(ent, ssc, dir);
                    } else {
                      boolean _equals_2 = dir.getName().equals("resources");
                      if (_equals_2) {
                        this.generateResources(ssc, dir);
                      }
                    }
                  }
                }
              }
            }
          }
          InputOutput.<String>println("");
        }
      }
      _xblockexpression = InputOutput.<String>println(">>> Back-End Finished");
    }
    return _xblockexpression;
  }
  
  public void generateMain(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir) {
    Iterable<BusinessLogicSegments> _filter = Iterables.<BusinessLogicSegments>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), BusinessLogicSegments.class);
    for (final BusinessLogicSegments bls : _filter) {
      {
        String _name = bls.getName();
        String _plus = ("BusinessLogicSegments: " + _name);
        InputOutput.<String>println(_plus);
        String _name_1 = bls.getName();
        if (_name_1 != null) {
          switch (_name_1) {
            case "controller":
              this.generateController(ent, ssc, dir, bls);
              break;
            case "model":
              this.generateModel(ent, ssc, dir, bls);
              break;
            case "repository":
              this.generateRepository(ent, ssc, dir, bls);
              break;
            case "specification":
              this.generateSpecification(ent, ssc, dir, bls);
              break;
          }
        }
      }
    }
  }
  
  public void generateController(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls) {
    Iterable<RestController> _filter = Iterables.<RestController>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), RestController.class);
    for (final RestController rsc : _filter) {
      {
        String _name = rsc.getName();
        String _plus = ("RestController: " + _name);
        InputOutput.<String>println(_plus);
        List<SpringRepositories> classVars = IteratorExtensions.<SpringRepositories>toList(Iterators.<SpringRepositories>filter(this.proyectTree.getAllContents(), SpringRepositories.class));
        String _name_1 = ssc.getName();
        String _plus_1 = ((this.basePackageName + ".") + _name_1);
        String _plus_2 = (_plus_1 + ".");
        String _name_2 = dir.getName();
        String _plus_3 = (_plus_2 + _name_2);
        String _plus_4 = (_plus_3 + ".");
        String _name_3 = bls.getName();
        String _plus_5 = (_plus_4 + _name_3);
        this.packageName = _plus_5;
        String _name_4 = ent.getName();
        String _firstUpper = StringExtensions.toFirstUpper(bls.getName());
        String _plus_6 = (_name_4 + _firstUpper);
        this.className = _plus_6;
        if ((ent.getName().equals("Photo") && rsc.getName().equals("PhotoController"))) {
          this.createControllerClassFile(this.className, this.packageName, rsc, ent, classVars);
        } else {
          if ((ent.getName().equals("Album") && rsc.getName().equals("AlbumController"))) {
            this.createControllerClassFile(this.className, this.packageName, rsc, ent, classVars);
          } else {
            if ((ent.getName().equals("User") && rsc.getName().equals("UserController"))) {
              this.createControllerClassFile(this.className, this.packageName, rsc, ent, classVars);
            }
          }
        }
      }
    }
    Iterable<ControllerSegmentElement> _filter_1 = Iterables.<ControllerSegmentElement>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), ControllerSegmentElement.class);
    for (final ControllerSegmentElement cse : _filter_1) {
      {
        String _name = bls.getName();
        String _plus = ("ControllerSegmentElement: " + _name);
        InputOutput.<String>println(_plus);
        boolean _equals = cse.getName().equals("amazon");
        if (_equals) {
          this.generateControllerAmazon(ent, ssc, dir, bls, cse);
        } else {
          boolean _equals_1 = cse.getName().equals("exception");
          if (_equals_1) {
            this.generateControllerException(ent, ssc, dir, bls, cse);
          }
        }
      }
    }
  }
  
  public void generateControllerAmazon(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls, final ControllerSegmentElement cse) {
    StorageClient client = IteratorExtensions.<StorageClient>toList(Iterators.<StorageClient>filter(this.proyectTree.getAllContents(), StorageClient.class)).get(0);
    String _name = ssc.getName();
    String _plus = ((this.basePackageName + ".") + _name);
    String _plus_1 = (_plus + ".");
    String _name_1 = dir.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String _plus_3 = (_plus_2 + ".");
    String _name_2 = bls.getName();
    String _plus_4 = (_plus_3 + _name_2);
    String _plus_5 = (_plus_4 + ".");
    String _name_3 = cse.getName();
    String _plus_6 = (_plus_5 + _name_3);
    this.packageName = _plus_6;
    String _firstUpper = StringExtensions.toFirstUpper(cse.getName());
    String _plus_7 = (_firstUpper + "Client");
    this.className = _plus_7;
    this.createStorageClient(this.className, this.packageName, client);
  }
  
  public void generateControllerException(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls, final ControllerSegmentElement cse) {
    String _name = ent.getName();
    if (_name != null) {
      switch (_name) {
        case "Photo":
          this.generateControllerExceptionPhoto(ent, ssc, dir, bls, cse);
          break;
        case "Album":
          this.generateControllerExceptionAlbum(ent, ssc, dir, bls, cse);
          break;
        case "User":
          this.generateControllerExceptionUser(ent, ssc, dir, bls, cse);
          break;
      }
    }
  }
  
  public void generateControllerExceptionAlbum(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls, final ControllerSegmentElement cse) {
    Iterable<AlbumException> _filter = Iterables.<AlbumException>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), AlbumException.class);
    for (final AlbumException ae : _filter) {
      {
        String _name = ae.getName();
        String _plus = ("AlbumException: " + _name);
        InputOutput.<String>println(_plus);
        String _name_1 = ssc.getName();
        String _plus_1 = ((this.basePackageName + ".") + _name_1);
        String _plus_2 = (_plus_1 + ".");
        String _name_2 = dir.getName();
        String _plus_3 = (_plus_2 + _name_2);
        String _plus_4 = (_plus_3 + ".");
        String _name_3 = bls.getName();
        String _plus_5 = (_plus_4 + _name_3);
        String _plus_6 = (_plus_5 + ".");
        String _name_4 = cse.getName();
        String _plus_7 = (_plus_6 + _name_4);
        String _plus_8 = (_plus_7 + ".");
        String _name_5 = ent.getName();
        String _plus_9 = (_plus_8 + _name_5);
        this.packageName = _plus_9;
        this.className = ae.getName();
        this.createExceptionClassFile(this.className, this.packageName);
      }
    }
  }
  
  public void generateControllerExceptionPhoto(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls, final ControllerSegmentElement cse) {
    Iterable<PhotoException> _filter = Iterables.<PhotoException>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), PhotoException.class);
    for (final PhotoException pe : _filter) {
      {
        String _name = pe.getName();
        String _plus = ("PhotoException: " + _name);
        InputOutput.<String>println(_plus);
        String _name_1 = ssc.getName();
        String _plus_1 = ((this.basePackageName + ".") + _name_1);
        String _plus_2 = (_plus_1 + ".");
        String _name_2 = dir.getName();
        String _plus_3 = (_plus_2 + _name_2);
        String _plus_4 = (_plus_3 + ".");
        String _name_3 = bls.getName();
        String _plus_5 = (_plus_4 + _name_3);
        String _plus_6 = (_plus_5 + ".");
        String _name_4 = cse.getName();
        String _plus_7 = (_plus_6 + _name_4);
        String _plus_8 = (_plus_7 + ".");
        String _name_5 = ent.getName();
        String _plus_9 = (_plus_8 + _name_5);
        this.packageName = _plus_9;
        this.className = pe.getName();
        this.createExceptionClassFile(this.className, this.packageName);
      }
    }
  }
  
  public void generateControllerExceptionUser(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls, final ControllerSegmentElement cse) {
    Iterable<UserException> _filter = Iterables.<UserException>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), UserException.class);
    for (final UserException ue : _filter) {
      {
        String _name = ue.getName();
        String _plus = ("UserException: " + _name);
        InputOutput.<String>println(_plus);
        String _name_1 = ssc.getName();
        String _plus_1 = ((this.basePackageName + ".") + _name_1);
        String _plus_2 = (_plus_1 + ".");
        String _name_2 = dir.getName();
        String _plus_3 = (_plus_2 + _name_2);
        String _plus_4 = (_plus_3 + ".");
        String _name_3 = bls.getName();
        String _plus_5 = (_plus_4 + _name_3);
        String _plus_6 = (_plus_5 + ".");
        String _name_4 = cse.getName();
        String _plus_7 = (_plus_6 + _name_4);
        String _plus_8 = (_plus_7 + ".");
        String _name_5 = ent.getName();
        String _plus_9 = (_plus_8 + _name_5);
        this.packageName = _plus_9;
        this.className = ue.getName();
        this.createExceptionClassFile(this.className, this.packageName);
      }
    }
  }
  
  public void generateModel(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls) {
    String StestSpring = "";
    String _name = ssc.getName();
    String _plus = ((this.basePackageName + ".") + _name);
    String _plus_1 = (_plus + ".");
    String _name_1 = dir.getName();
    String _plus_2 = (_plus_1 + _name_1);
    String _plus_3 = (_plus_2 + ".");
    String _name_2 = bls.getName();
    String _plus_4 = (_plus_3 + _name_2);
    this.packageName = _plus_4;
    this.className = ent.getName();
    List<SpringEntityAnnotationTypes> classVars = IteratorExtensions.<SpringEntityAnnotationTypes>toList(Iterators.<SpringEntityAnnotationTypes>filter(this.proyectTree.getAllContents(), SpringEntityAnnotationTypes.class));
    this.createModelClassFile(this.className, this.packageName, ent, classVars);
  }
  
  public void generateRepository(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls) {
    Iterable<SpringRepositoryAnnotation> _filter = Iterables.<SpringRepositoryAnnotation>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), SpringRepositoryAnnotation.class);
    for (final SpringRepositoryAnnotation sra : _filter) {
      {
        String _name = ssc.getName();
        String _plus = ((this.basePackageName + ".") + _name);
        String _plus_1 = (_plus + ".");
        String _name_1 = dir.getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + ".");
        String _name_2 = bls.getName();
        String _plus_4 = (_plus_3 + _name_2);
        this.packageName = _plus_4;
        String _name_3 = ent.getName();
        String _firstUpper = StringExtensions.toFirstUpper(bls.getName());
        String _plus_5 = (_name_3 + _firstUpper);
        this.className = _plus_5;
        this.createInterfaceFile(this.className, this.packageName, ent, sra);
      }
    }
  }
  
  public void generateSpecification(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls) {
    Iterable<SpecificationSegmentElement> _filter = Iterables.<SpecificationSegmentElement>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), SpecificationSegmentElement.class);
    for (final SpecificationSegmentElement sse : _filter) {
      {
        String _name = ssc.getName();
        String _plus = ((this.basePackageName + ".") + _name);
        String _plus_1 = (_plus + ".");
        String _name_1 = dir.getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + ".");
        String _name_2 = bls.getName();
        String _plus_4 = (_plus_3 + _name_2);
        this.packageName = _plus_4;
        String _name_3 = ent.getName();
        String _firstUpper = StringExtensions.toFirstUpper(bls.getName());
        String _plus_5 = (_name_3 + _firstUpper);
        this.className = _plus_5;
        List<CriteriaAttributeType> classVars = IteratorExtensions.<CriteriaAttributeType>toList(Iterators.<CriteriaAttributeType>filter(this.proyectTree.getAllContents(), CriteriaAttributeType.class));
        this.createSpecificationClassFile(this.className, this.packageName, ent, sse, classVars);
      }
    }
    this.generateSpecificationCriteria(ent, ssc, dir, bls);
  }
  
  public void generateSpecificationCriteria(final Entities ent, final SegmentStructureContent ssc, final DirectoryContent dir, final BusinessLogicSegments bls) {
    Iterable<SpecificationSegmentElement> _filter = Iterables.<SpecificationSegmentElement>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), SpecificationSegmentElement.class);
    for (final SpecificationSegmentElement sse : _filter) {
      {
        String _name = sse.getName();
        String _plus = ("SpecificationSegmentElement: " + _name);
        InputOutput.<String>println(_plus);
        String _name_1 = ssc.getName();
        String _plus_1 = ((this.basePackageName + ".") + _name_1);
        String _plus_2 = (_plus_1 + ".");
        String _name_2 = dir.getName();
        String _plus_3 = (_plus_2 + _name_2);
        String _plus_4 = (_plus_3 + ".");
        String _name_3 = bls.getName();
        String _plus_5 = (_plus_4 + _name_3);
        String _plus_6 = (_plus_5 + ".");
        String _name_4 = sse.getName();
        String _plus_7 = (_plus_6 + _name_4);
        this.packageName = _plus_7;
        String _firstUpper = StringExtensions.toFirstUpper(sse.getName());
        String _plus_8 = ("Search" + _firstUpper);
        this.className = _plus_8;
        List<CriteriaAttributeType> classVars = IteratorExtensions.<CriteriaAttributeType>toList(Iterators.<CriteriaAttributeType>filter(this.proyectTree.getAllContents(), CriteriaAttributeType.class));
        this.createSearchCriteriaClassFile(this.className, this.packageName, classVars);
      }
    }
  }
  
  public void generateResources(final SegmentStructureContent ssc, final DirectoryContent dir) {
    Iterable<MultipleFile> _filter = Iterables.<MultipleFile>filter(IteratorExtensions.<EObject>toIterable(this.proyectTree.getAllContents()), MultipleFile.class);
    for (final MultipleFile mf : _filter) {
      {
        String _name = mf.getName();
        String _plus = ("MultipleFile: " + _name);
        InputOutput.<String>println(_plus);
        boolean _equals = mf.getName().equals("application");
        if (_equals) {
          String _name_1 = ssc.getName();
          String _plus_1 = ((this.basePackageName + ".") + _name_1);
          String _plus_2 = (_plus_1 + ".");
          String _name_2 = dir.getName();
          String _plus_3 = (_plus_2 + _name_2);
          this.packageName = _plus_3;
          this.className = mf.getName();
          this.createPropertiesFile(this.className, this.packageName);
          this.createYmlFile(this.className, this.packageName);
        }
      }
    }
  }
  
  public void createSpecificationClassFile(final String className, final String packageName, final Entities ent, final SpecificationSegmentElement sse, final List<CriteriaAttributeType> classVars) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".java");
    this.fileWriter.generateFile(_plus_2, TemplateClassSpecification.generate(className, packageName, ent, sse, classVars));
  }
  
  public void createSearchCriteriaClassFile(final String className, final String packageName, final List<CriteriaAttributeType> classVars) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".java");
    this.fileWriter.generateFile(_plus_2, TemplateClassSearchCriteria.generate(className, packageName, classVars));
  }
  
  public void createExceptionClassFile(final String className, final String packageName) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".java");
    this.fileWriter.generateFile(_plus_2, TemplateClassException.generate(className, packageName));
  }
  
  public void createControllerClassFile(final String className, final String packageName, final RestController rsc, final Entities ent, final List<SpringRepositories> classVars) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".java");
    this.fileWriter.generateFile(_plus_2, TemplateClassController.generate(className, packageName, rsc, ent, classVars));
  }
  
  public void createStorageClient(final String className, final String packageName, final StorageClient stc) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".java");
    this.fileWriter.generateFile(_plus_2, TemplateStorageClient.generate(className, packageName, stc));
  }
  
  public void createModelClassFile(final String className, final String packageName, final Entities ent, final List<SpringEntityAnnotationTypes> classVars) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".java");
    this.fileWriter.generateFile(_plus_2, TemplateClassModel.generate(className, packageName, ent, classVars));
  }
  
  public void createInterfaceFile(final String className, final String packageName, final Entities ent, final SpringRepositoryAnnotation sra) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".java");
    this.fileWriter.generateFile(_plus_2, TemplateRepositoryInterface.generate(className, packageName, ent, sra));
  }
  
  public void createPropertiesFile(final String className, final String packageName) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".properties");
    this.fileWriter.generateFile(_plus_2, TemplateProperties.generate(className, packageName));
  }
  
  public void createYmlFile(final String className, final String packageName) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + className);
    String _plus_2 = (_plus_1 + ".yml");
    this.fileWriter.generateFile(_plus_2, TemplateYml.generate(className, packageName));
  }
}
