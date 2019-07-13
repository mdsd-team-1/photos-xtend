/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technologies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Technologies#getTechspring <em>Techspring</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Technologies#getTechreact <em>Techreact</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Technologies#getTechpostgresql <em>Techpostgresql</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.Technologies#getTechamazon <em>Techamazon</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getTechnologies()
 * @model
 * @generated
 */
public interface Technologies extends EObject
{
  /**
   * Returns the value of the '<em><b>Techspring</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.Spring}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Techspring</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getTechnologies_Techspring()
   * @model containment="true"
   * @generated
   */
  EList<Spring> getTechspring();

  /**
   * Returns the value of the '<em><b>Techreact</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.React}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Techreact</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getTechnologies_Techreact()
   * @model containment="true"
   * @generated
   */
  EList<React> getTechreact();

  /**
   * Returns the value of the '<em><b>Techpostgresql</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.PostgreSQL}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Techpostgresql</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getTechnologies_Techpostgresql()
   * @model containment="true"
   * @generated
   */
  EList<PostgreSQL> getTechpostgresql();

  /**
   * Returns the value of the '<em><b>Techamazon</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.AmazonWebServices}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Techamazon</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getTechnologies_Techamazon()
   * @model containment="true"
   * @generated
   */
  EList<AmazonWebServices> getTechamazon();

} // Technologies