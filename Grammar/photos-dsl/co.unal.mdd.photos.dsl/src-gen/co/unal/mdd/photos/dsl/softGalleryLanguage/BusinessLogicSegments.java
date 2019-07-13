/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Logic Segments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments#getName <em>Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments#getControllerSegmentElement <em>Controller Segment Element</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments#getSpecificationSegmentElement <em>Specification Segment Element</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getBusinessLogicSegments()
 * @model
 * @generated
 */
public interface BusinessLogicSegments extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getBusinessLogicSegments_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controller Segment Element</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.ControllerSegmentElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller Segment Element</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getBusinessLogicSegments_ControllerSegmentElement()
   * @model containment="true"
   * @generated
   */
  EList<ControllerSegmentElement> getControllerSegmentElement();

  /**
   * Returns the value of the '<em><b>Specification Segment Element</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.SpecificationSegmentElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification Segment Element</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getBusinessLogicSegments_SpecificationSegmentElement()
   * @model containment="true"
   * @generated
   */
  EList<SpecificationSegmentElement> getSpecificationSegmentElement();

} // BusinessLogicSegments