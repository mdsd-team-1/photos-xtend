/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component Cont</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ViewComponentCont#getNameView <em>Name View</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ViewComponentCont#getUicontent <em>Uicontent</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getViewComponentCont()
 * @model
 * @generated
 */
public interface ViewComponentCont extends EObject
{
  /**
   * Returns the value of the '<em><b>Name View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name View</em>' attribute.
   * @see #setNameView(String)
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getViewComponentCont_NameView()
   * @model
   * @generated
   */
  String getNameView();

  /**
   * Sets the value of the '{@link co.unal.mdd.photos.dsl.softGalleryLanguage.ViewComponentCont#getNameView <em>Name View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name View</em>' attribute.
   * @see #getNameView()
   * @generated
   */
  void setNameView(String value);

  /**
   * Returns the value of the '<em><b>Uicontent</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uicontent</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getViewComponentCont_Uicontent()
   * @model containment="true"
   * @generated
   */
  EList<ComponentClass> getUicontent();

} // ViewComponentCont