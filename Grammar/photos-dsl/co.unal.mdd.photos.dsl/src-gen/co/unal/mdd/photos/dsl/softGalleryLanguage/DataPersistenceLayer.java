/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Persistence Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.DataPersistenceLayer#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getDataPersistenceLayer()
 * @model
 * @generated
 */
public interface DataPersistenceLayer extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.DataPersistenceContent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getDataPersistenceLayer_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DataPersistenceContent> getElements();

} // DataPersistenceLayer
