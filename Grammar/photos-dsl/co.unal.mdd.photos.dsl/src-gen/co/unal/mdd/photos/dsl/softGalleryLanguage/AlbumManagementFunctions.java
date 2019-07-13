/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album Management Functions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.AlbumManagementFunctions#getCreatedAlbName <em>Created Alb Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.AlbumManagementFunctions#getSelectAlbName <em>Select Alb Name</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getAlbumManagementFunctions()
 * @model
 * @generated
 */
public interface AlbumManagementFunctions extends EObject
{
  /**
   * Returns the value of the '<em><b>Created Alb Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Created Alb Name</em>' attribute.
   * @see #setCreatedAlbName(String)
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getAlbumManagementFunctions_CreatedAlbName()
   * @model
   * @generated
   */
  String getCreatedAlbName();

  /**
   * Sets the value of the '{@link co.unal.mdd.photos.dsl.softGalleryLanguage.AlbumManagementFunctions#getCreatedAlbName <em>Created Alb Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Created Alb Name</em>' attribute.
   * @see #getCreatedAlbName()
   * @generated
   */
  void setCreatedAlbName(String value);

  /**
   * Returns the value of the '<em><b>Select Alb Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Alb Name</em>' attribute.
   * @see #setSelectAlbName(String)
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getAlbumManagementFunctions_SelectAlbName()
   * @model
   * @generated
   */
  String getSelectAlbName();

  /**
   * Sets the value of the '{@link co.unal.mdd.photos.dsl.softGalleryLanguage.AlbumManagementFunctions#getSelectAlbName <em>Select Alb Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Alb Name</em>' attribute.
   * @see #getSelectAlbName()
   * @generated
   */
  void setSelectAlbName(String value);

} // AlbumManagementFunctions
