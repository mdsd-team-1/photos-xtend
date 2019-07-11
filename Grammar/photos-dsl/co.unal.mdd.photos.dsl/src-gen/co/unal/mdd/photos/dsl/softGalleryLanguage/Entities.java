/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Entities#getPhotoelements <em>Photoelements</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Entities#getAlbumelements <em>Albumelements</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Entities#getUserdomainelements <em>Userdomainelements</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities()
 * @model
 * @generated
 */
public interface Entities extends EObject
{
  /**
   * Returns the value of the '<em><b>Photoelements</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.Photo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Photoelements</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities_Photoelements()
   * @model containment="true"
   * @generated
   */
  EList<Photo> getPhotoelements();

  /**
   * Returns the value of the '<em><b>Albumelements</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.Album}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Albumelements</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities_Albumelements()
   * @model containment="true"
   * @generated
   */
  EList<Album> getAlbumelements();

  /**
   * Returns the value of the '<em><b>Userdomainelements</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.UserDomain}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Userdomainelements</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities_Userdomainelements()
   * @model containment="true"
   * @generated
   */
  EList<UserDomain> getUserdomainelements();

} // Entities
