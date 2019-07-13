/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactConstructor#getComponentstateclass <em>Componentstateclass</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactConstructor#getComponentfuncclass <em>Componentfuncclass</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactConstructor()
 * @model
 * @generated
 */
public interface ReactConstructor extends EObject
{
  /**
   * Returns the value of the '<em><b>Componentstateclass</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentstateclass</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactConstructor_Componentstateclass()
   * @model containment="true"
   * @generated
   */
  EList<State> getComponentstateclass();

  /**
   * Returns the value of the '<em><b>Componentfuncclass</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.CoreFunctionsDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentfuncclass</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactConstructor_Componentfuncclass()
   * @model containment="true"
   * @generated
   */
  EList<CoreFunctionsDeclaration> getComponentfuncclass();

} // ReactConstructor
