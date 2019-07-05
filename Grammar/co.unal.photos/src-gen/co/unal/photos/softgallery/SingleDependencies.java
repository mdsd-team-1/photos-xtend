/**
 * generated by Xtext 2.17.1
 */
package co.unal.photos.softgallery;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.photos.softgallery.SingleDependencies#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see co.unal.photos.softgallery.SoftgalleryPackage#getSingleDependencies()
 * @model
 * @generated
 */
public interface SingleDependencies extends EObject
{
  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see co.unal.photos.softgallery.SoftgalleryPackage#getSingleDependencies_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getDependencies();

} // SingleDependencies
