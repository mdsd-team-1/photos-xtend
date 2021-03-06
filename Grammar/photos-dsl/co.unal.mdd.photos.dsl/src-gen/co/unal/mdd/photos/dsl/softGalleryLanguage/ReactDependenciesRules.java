/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Dependencies Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactDependenciesRules#getName <em>Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactDependenciesRules#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactDependenciesRules()
 * @model
 * @generated
 */
public interface ReactDependenciesRules extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactDependenciesRules_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactDependenciesRules#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.ReactDependenciesSubRules}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getReactDependenciesRules_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<ReactDependenciesSubRules> getDependencies();

} // ReactDependenciesRules
