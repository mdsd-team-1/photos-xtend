/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.LayerRelations#getLayerelations <em>Layerelations</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.LayerRelations#getName <em>Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.LayerRelations#getLayerorigin <em>Layerorigin</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.LayerRelations#getLayertarget <em>Layertarget</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getLayerRelations()
 * @model
 * @generated
 */
public interface LayerRelations extends EObject
{
  /**
   * Returns the value of the '<em><b>Layerelations</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layerelations</em>' attribute list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getLayerRelations_Layerelations()
   * @model unique="false"
   * @generated
   */
  EList<String> getLayerelations();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getLayerRelations_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.unal.mdd.photos.dsl.softGalleryLanguage.LayerRelations#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Layerorigin</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.LayerSource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layerorigin</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getLayerRelations_Layerorigin()
   * @model containment="true"
   * @generated
   */
  EList<LayerSource> getLayerorigin();

  /**
   * Returns the value of the '<em><b>Layertarget</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.LayerTarget}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layertarget</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getLayerRelations_Layertarget()
   * @model containment="true"
   * @generated
   */
  EList<LayerTarget> getLayertarget();

} // LayerRelations