/**
 * generated by Xtext 2.17.1
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
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Entities#getName <em>Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Entities#getAtributePhoto <em>Atribute Photo</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Entities#getAtributeAlbum <em>Atribute Album</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Entities#getAtributeUserDomain <em>Atribute User Domain</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities()
 * @model
 * @generated
 */
public interface Entities extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Entities#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Atribute Photo</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.AtributePhoto}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atribute Photo</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities_AtributePhoto()
   * @model containment="true"
   * @generated
   */
  EList<AtributePhoto> getAtributePhoto();

  /**
   * Returns the value of the '<em><b>Atribute Album</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.AtributeAlbum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atribute Album</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities_AtributeAlbum()
   * @model containment="true"
   * @generated
   */
  EList<AtributeAlbum> getAtributeAlbum();

  /**
   * Returns the value of the '<em><b>Atribute User Domain</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.AtributeUserDomain}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atribute User Domain</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getEntities_AtributeUserDomain()
   * @model containment="true"
   * @generated
   */
  EList<AtributeUserDomain> getAtributeUserDomain();

} // Entities
