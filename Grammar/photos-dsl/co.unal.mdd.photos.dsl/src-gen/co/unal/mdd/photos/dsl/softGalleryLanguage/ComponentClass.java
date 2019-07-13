/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentClass#getComponentclassimp <em>Componentclassimp</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentClass#getComponentclassfunc <em>Componentclassfunc</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentClass#getComponentclassprop <em>Componentclassprop</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getComponentClass()
 * @model
 * @generated
 */
public interface ComponentClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Componentclassimp</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactImports}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentclassimp</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getComponentClass_Componentclassimp()
   * @model containment="true"
   * @generated
   */
  EList<ReactImports> getComponentclassimp();

  /**
   * Returns the value of the '<em><b>Componentclassfunc</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactFunctions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentclassfunc</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getComponentClass_Componentclassfunc()
   * @model containment="true"
   * @generated
   */
  EList<ReactFunctions> getComponentclassfunc();

  /**
   * Returns the value of the '<em><b>Componentclassprop</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.Props}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentclassprop</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getComponentClass_Componentclassprop()
   * @model containment="true"
   * @generated
   */
  EList<Props> getComponentclassprop();

} // ComponentClass
