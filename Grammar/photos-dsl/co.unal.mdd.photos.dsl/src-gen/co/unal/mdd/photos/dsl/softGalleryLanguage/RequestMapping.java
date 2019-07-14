/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMapping#getValue <em>Value</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMapping#getMethod <em>Method</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMapping#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getRequestMapping()
 * @model
 * @generated
 */
public interface RequestMapping extends MappingType
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMappingValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getRequestMapping_Value()
   * @model containment="true"
   * @generated
   */
  EList<RequestMappingValue> getValue();

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMappingMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getRequestMapping_Method()
   * @model containment="true"
   * @generated
   */
  EList<RequestMappingMethod> getMethod();

  /**
   * Returns the value of the '<em><b>Produces</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.RequestMappingProduces}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Produces</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getRequestMapping_Produces()
   * @model containment="true"
   * @generated
   */
  EList<RequestMappingProduces> getProduces();

} // RequestMapping
