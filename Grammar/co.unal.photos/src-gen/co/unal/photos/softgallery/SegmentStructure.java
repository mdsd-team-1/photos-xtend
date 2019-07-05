/**
 * generated by Xtext 2.17.1
 */
package co.unal.photos.softgallery;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.photos.softgallery.SegmentStructure#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see co.unal.photos.softgallery.SoftgalleryPackage#getSegmentStructure()
 * @model
 * @generated
 */
public interface SegmentStructure extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.photos.softgallery.SegmentStructureContent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see co.unal.photos.softgallery.SoftgalleryPackage#getSegmentStructure_Elements()
   * @model containment="true"
   * @generated
   */
  EList<SegmentStructureContent> getElements();

} // SegmentStructure
