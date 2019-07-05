/**
 * generated by Xtext 2.17.1
 */
package co.unal.photos.softgallery;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.photos.softgallery.Specification#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see co.unal.photos.softgallery.SoftgalleryPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see co.unal.photos.softgallery.SoftgalleryPackage#getSpecification_Elements()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElements();

} // Specification
