/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.generator;

import co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments;
import co.unal.mdd.photos.dsl.softGalleryLanguage.ControllerSegmentElement;
import co.unal.mdd.photos.dsl.softGalleryLanguage.DirectoryContent;
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities;
import co.unal.mdd.photos.dsl.softGalleryLanguage.MultipleFile;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SegmentStructureContent;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SpecificationSegmentElement;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
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
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  private String basePackageName = "co.edu.unal";
  
  private String className = "";
  
  private String packageName = "";
  
  public void directoryGeneration(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entities> _filter = Iterables.<Entities>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entities.class);
    for (final Entities domainItem : _filter) {
      {
        String _name = domainItem.getName();
        String _plus = ("Domain Iteration: " + _name);
        InputOutput.<String>println(_plus);
        Iterable<SegmentStructureContent> _filter_1 = Iterables.<SegmentStructureContent>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), SegmentStructureContent.class);
        for (final SegmentStructureContent ssc : _filter_1) {
          {
            InputOutput.<String>println("Architecture Iteration");
            boolean _equals = ssc.getName().equals("photosappback");
            if (_equals) {
              Iterable<DirectoryContent> _filter_2 = Iterables.<DirectoryContent>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), DirectoryContent.class);
              for (final DirectoryContent dir : _filter_2) {
                {
                  InputOutput.<String>println("Architecture Iteration");
                  boolean _equals_1 = dir.getName().equals("main");
                  if (_equals_1) {
                    Iterable<BusinessLogicSegments> _filter_3 = Iterables.<BusinessLogicSegments>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), BusinessLogicSegments.class);
                    for (final BusinessLogicSegments bls : _filter_3) {
                      String _name_1 = bls.getName();
                      if (_name_1 != null) {
                        switch (_name_1) {
                          case "controller":
                            Iterable<ControllerSegmentElement> _filter_4 = Iterables.<ControllerSegmentElement>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), ControllerSegmentElement.class);
                            for (final ControllerSegmentElement cse : _filter_4) {
                              boolean _equals_2 = cse.getName().equals("amazon");
                              if (_equals_2) {
                                String _name_2 = ssc.getName();
                                String _plus_1 = ((this.basePackageName + ".") + _name_2);
                                String _plus_2 = (_plus_1 + ".");
                                String _name_3 = dir.getName();
                                String _plus_3 = (_plus_2 + _name_3);
                                String _plus_4 = (_plus_3 + ".");
                                String _name_4 = bls.getName();
                                String _plus_5 = (_plus_4 + _name_4);
                                String _plus_6 = (_plus_5 + ".");
                                String _name_5 = cse.getName();
                                String _plus_7 = (_plus_6 + _name_5);
                                this.packageName = _plus_7;
                                String _firstUpper = StringExtensions.toFirstUpper(cse.getName());
                                String _plus_8 = (_firstUpper + "Client");
                                this.className = _plus_8;
                                String _replace = this.packageName.replace(".", "/");
                                String _plus_9 = (_replace + "/");
                                String _plus_10 = (_plus_9 + this.className);
                                String _plus_11 = (_plus_10 + ".java");
                                fsa.generateFile(_plus_11, this.generateClass(this.className, this.packageName));
                              } else {
                                boolean _equals_3 = cse.getName().equals("exception");
                                if (_equals_3) {
                                  String _name_6 = ssc.getName();
                                  String _plus_12 = ((this.basePackageName + ".") + _name_6);
                                  String _plus_13 = (_plus_12 + ".");
                                  String _name_7 = dir.getName();
                                  String _plus_14 = (_plus_13 + _name_7);
                                  String _plus_15 = (_plus_14 + ".");
                                  String _name_8 = bls.getName();
                                  String _plus_16 = (_plus_15 + _name_8);
                                  String _plus_17 = (_plus_16 + ".");
                                  String _name_9 = cse.getName();
                                  String _plus_18 = (_plus_17 + _name_9);
                                  String _plus_19 = (_plus_18 + ".");
                                  String _name_10 = domainItem.getName();
                                  String _plus_20 = (_plus_19 + _name_10);
                                  this.packageName = _plus_20;
                                  String _name_11 = domainItem.getName();
                                  String _firstUpper_1 = StringExtensions.toFirstUpper(cse.getName());
                                  String _plus_21 = (_name_11 + _firstUpper_1);
                                  this.className = _plus_21;
                                  String _replace_1 = this.packageName.replace(".", "/");
                                  String _plus_22 = (_replace_1 + "/");
                                  String _plus_23 = (_plus_22 + this.className);
                                  String _plus_24 = (_plus_23 + ".java");
                                  fsa.generateFile(_plus_24, this.generateClass(this.className, this.packageName));
                                }
                              }
                            }
                            String _name_12 = ssc.getName();
                            String _plus_25 = ((this.basePackageName + ".") + _name_12);
                            String _plus_26 = (_plus_25 + ".");
                            String _name_13 = dir.getName();
                            String _plus_27 = (_plus_26 + _name_13);
                            String _plus_28 = (_plus_27 + ".");
                            String _name_14 = bls.getName();
                            String _plus_29 = (_plus_28 + _name_14);
                            this.packageName = _plus_29;
                            String _name_15 = domainItem.getName();
                            String _firstUpper_2 = StringExtensions.toFirstUpper(bls.getName());
                            String _plus_30 = (_name_15 + _firstUpper_2);
                            this.className = _plus_30;
                            String _replace_2 = this.packageName.replace(".", "/");
                            String _plus_31 = (_replace_2 + "/");
                            String _plus_32 = (_plus_31 + this.className);
                            String _plus_33 = (_plus_32 + ".java");
                            fsa.generateFile(_plus_33, this.generateClass(this.className, this.packageName));
                            break;
                          case "model":
                            String _name_16 = ssc.getName();
                            String _plus_34 = ((this.basePackageName + ".") + _name_16);
                            String _plus_35 = (_plus_34 + ".");
                            String _name_17 = dir.getName();
                            String _plus_36 = (_plus_35 + _name_17);
                            String _plus_37 = (_plus_36 + ".");
                            String _name_18 = bls.getName();
                            String _plus_38 = (_plus_37 + _name_18);
                            this.packageName = _plus_38;
                            this.className = domainItem.getName();
                            String _replace_3 = this.packageName.replace(".", "/");
                            String _plus_39 = (_replace_3 + "/");
                            String _plus_40 = (_plus_39 + this.className);
                            String _plus_41 = (_plus_40 + ".java");
                            fsa.generateFile(_plus_41, this.generateClass(this.className, this.packageName));
                            break;
                          case "config":
                            String _name_19 = ssc.getName();
                            String _plus_42 = ((this.basePackageName + ".") + _name_19);
                            String _plus_43 = (_plus_42 + ".");
                            String _name_20 = dir.getName();
                            String _plus_44 = (_plus_43 + _name_20);
                            String _plus_45 = (_plus_44 + ".");
                            String _name_21 = bls.getName();
                            String _plus_46 = (_plus_45 + _name_21);
                            this.packageName = _plus_46;
                            this.className = domainItem.getName();
                            String _replace_4 = this.packageName.replace(".", "/");
                            String _plus_47 = (_replace_4 + "/");
                            String _plus_48 = (_plus_47 + this.className);
                            String _plus_49 = (_plus_48 + ".java");
                            fsa.generateFile(_plus_49, this.generateClass(this.className, this.packageName));
                            break;
                          case "specification":
                            Iterable<SpecificationSegmentElement> _filter_5 = Iterables.<SpecificationSegmentElement>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), SpecificationSegmentElement.class);
                            for (final SpecificationSegmentElement sse : _filter_5) {
                              {
                                String _name_22 = ssc.getName();
                                String _plus_50 = ((this.basePackageName + ".") + _name_22);
                                String _plus_51 = (_plus_50 + ".");
                                String _name_23 = dir.getName();
                                String _plus_52 = (_plus_51 + _name_23);
                                String _plus_53 = (_plus_52 + ".");
                                String _name_24 = bls.getName();
                                String _plus_54 = (_plus_53 + _name_24);
                                String _plus_55 = (_plus_54 + ".");
                                String _name_25 = sse.getName();
                                String _plus_56 = (_plus_55 + _name_25);
                                this.packageName = _plus_56;
                                String _firstUpper_3 = StringExtensions.toFirstUpper(sse.getName());
                                String _plus_57 = ("Search" + _firstUpper_3);
                                this.className = _plus_57;
                                String _replace_5 = this.packageName.replace(".", "/");
                                String _plus_58 = (_replace_5 + "/");
                                String _plus_59 = (_plus_58 + this.className);
                                String _plus_60 = (_plus_59 + ".java");
                                fsa.generateFile(_plus_60, this.generateClass(this.className, this.packageName));
                              }
                            }
                            String _name_22 = ssc.getName();
                            String _plus_50 = ((this.basePackageName + ".") + _name_22);
                            String _plus_51 = (_plus_50 + ".");
                            String _name_23 = dir.getName();
                            String _plus_52 = (_plus_51 + _name_23);
                            String _plus_53 = (_plus_52 + ".");
                            String _name_24 = bls.getName();
                            String _plus_54 = (_plus_53 + _name_24);
                            this.packageName = _plus_54;
                            String _name_25 = domainItem.getName();
                            String _firstUpper_3 = StringExtensions.toFirstUpper(bls.getName());
                            String _plus_55 = (_name_25 + _firstUpper_3);
                            this.className = _plus_55;
                            String _replace_5 = this.packageName.replace(".", "/");
                            String _plus_56 = (_replace_5 + "/");
                            String _plus_57 = (_plus_56 + this.className);
                            String _plus_58 = (_plus_57 + ".java");
                            fsa.generateFile(_plus_58, this.generateClass(this.className, this.packageName));
                            break;
                          case "repository":
                            String _name_26 = ssc.getName();
                            String _plus_59 = ((this.basePackageName + ".") + _name_26);
                            String _plus_60 = (_plus_59 + ".");
                            String _name_27 = dir.getName();
                            String _plus_61 = (_plus_60 + _name_27);
                            String _plus_62 = (_plus_61 + ".");
                            String _name_28 = bls.getName();
                            String _plus_63 = (_plus_62 + _name_28);
                            this.packageName = _plus_63;
                            String _name_29 = domainItem.getName();
                            String _firstUpper_4 = StringExtensions.toFirstUpper(bls.getName());
                            String _plus_64 = (_name_29 + _firstUpper_4);
                            this.className = _plus_64;
                            String _replace_6 = this.packageName.replace(".", "/");
                            String _plus_65 = (_replace_6 + "/");
                            String _plus_66 = (_plus_65 + this.className);
                            String _plus_67 = (_plus_66 + ".java");
                            fsa.generateFile(_plus_67, this.generateInterface(this.className, this.packageName));
                            break;
                        }
                      }
                    }
                  } else {
                    boolean _equals_4 = dir.getName().equals("resources");
                    if (_equals_4) {
                      Iterable<MultipleFile> _filter_6 = Iterables.<MultipleFile>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), MultipleFile.class);
                      for (final MultipleFile mf : _filter_6) {
                        boolean _equals_5 = mf.getName().equals("application");
                        if (_equals_5) {
                          String _name_30 = mf.getName();
                          String _plus_68 = ("Architecture Iteration 2" + _name_30);
                          InputOutput.<String>println(_plus_68);
                          String _name_31 = ssc.getName();
                          String _plus_69 = ((this.basePackageName + ".") + _name_31);
                          String _plus_70 = (_plus_69 + ".");
                          String _name_32 = dir.getName();
                          String _plus_71 = (_plus_70 + _name_32);
                          this.packageName = _plus_71;
                          this.className = mf.getName();
                          String _replace_7 = this.packageName.replace(".", "/");
                          String _plus_72 = (_replace_7 + "/");
                          String _plus_73 = (_plus_72 + this.className);
                          String _plus_74 = (_plus_73 + ".properties");
                          fsa.generateFile(_plus_74, this.generateProperties(this.className, this.packageName));
                          String _replace_8 = this.packageName.replace(".", "/");
                          String _plus_75 = (_replace_8 + "/");
                          String _plus_76 = (_plus_75 + this.className);
                          String _plus_77 = (_plus_76 + ".yml");
                          fsa.generateFile(_plus_77, this.generateYml(this.className, this.packageName));
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public CharSequence generateClass(final String className, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ----------------------------------------");
    _builder.newLine();
    _builder.append("// PackageName: ");
    _builder.append(packageName);
    _builder.newLineIfNotEmpty();
    _builder.append("// ClassName: ");
    _builder.append(className);
    _builder.newLineIfNotEmpty();
    _builder.append("// ----------------------------------------\t");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateInterface(final String className, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ----------------------------------------");
    _builder.newLine();
    _builder.append("// PackageName: ");
    _builder.append(packageName);
    _builder.newLineIfNotEmpty();
    _builder.append("// ClassName: ");
    _builder.append(className);
    _builder.newLineIfNotEmpty();
    _builder.append("// ----------------------------------------\t");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    _builder.append(className);
    _builder.append(" extends JpaRepository<Album, Integer>, JpaSpecificationExecutor<Album>{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateProperties(final String className, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ----------------------------------------");
    _builder.newLine();
    _builder.append("// PackageName: ");
    _builder.append(packageName);
    _builder.newLineIfNotEmpty();
    _builder.append("// ClassName: ");
    _builder.append(className);
    _builder.newLineIfNotEmpty();
    _builder.append("// ----------------------------------------\t");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateYml(final String className, final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// ----------------------------------------");
    _builder.newLine();
    _builder.append("// PackageName: ");
    _builder.append(packageName);
    _builder.newLineIfNotEmpty();
    _builder.append("// ClassName: ");
    _builder.append(className);
    _builder.newLineIfNotEmpty();
    _builder.append("// ----------------------------------------\t");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
