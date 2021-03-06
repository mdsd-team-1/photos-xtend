/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.SpringEntity#getSpringEntityAnnotationTypes <em>Spring Entity Annotation Types</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getSpringEntity()
 * @model
 * @generated
 */
public interface SpringEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Spring Entity Annotation Types</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.SpringEntityAnnotationTypes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spring Entity Annotation Types</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getSpringEntity_SpringEntityAnnotationTypes()
   * @model containment="true"
   * @generated
   */
  EList<SpringEntityAnnotationTypes> getSpringEntityAnnotationTypes();

} // SpringEntity
