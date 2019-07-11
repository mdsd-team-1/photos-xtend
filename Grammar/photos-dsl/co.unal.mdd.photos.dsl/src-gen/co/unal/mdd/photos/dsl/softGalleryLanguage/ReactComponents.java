/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactComponents#getComponentslogic <em>Componentslogic</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactComponents#getComponentsui <em>Componentsui</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactComponents()
 * @model
 * @generated
 */
public interface ReactComponents extends EObject
{
  /**
   * Returns the value of the '<em><b>Componentslogic</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentsLogic}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentslogic</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactComponents_Componentslogic()
   * @model containment="true"
   * @generated
   */
  EList<ComponentsLogic> getComponentslogic();

  /**
   * Returns the value of the '<em><b>Componentsui</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentsUI}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentsui</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactComponents_Componentsui()
   * @model containment="true"
   * @generated
   */
  EList<ComponentsUI> getComponentsui();

} // ReactComponents
