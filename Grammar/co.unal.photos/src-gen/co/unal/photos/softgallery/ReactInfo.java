/**
 * generated by Xtext 2.17.1
 */
package co.unal.photos.softgallery;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.photos.softgallery.ReactInfo#getReactinformation <em>Reactinformation</em>}</li>
 * </ul>
 *
 * @see co.unal.photos.softgallery.SoftgalleryPackage#getReactInfo()
 * @model
 * @generated
 */
public interface ReactInfo extends EObject
{
  /**
   * Returns the value of the '<em><b>Reactinformation</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.photos.softgallery.ReactInformation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reactinformation</em>' containment reference list.
   * @see co.unal.photos.softgallery.SoftgalleryPackage#getReactInfo_Reactinformation()
   * @model containment="true"
   * @generated
   */
  EList<ReactInformation> getReactinformation();

} // ReactInfo