/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Logic Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicContent#getBusinessLogicSegments <em>Business Logic Segments</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getBusinessLogicContent()
 * @model
 * @generated
 */
public interface BusinessLogicContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Business Logic Segments</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Logic Segments</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getBusinessLogicContent_BusinessLogicSegments()
   * @model containment="true"
   * @generated
   */
  EList<BusinessLogicSegments> getBusinessLogicSegments();

} // BusinessLogicContent
