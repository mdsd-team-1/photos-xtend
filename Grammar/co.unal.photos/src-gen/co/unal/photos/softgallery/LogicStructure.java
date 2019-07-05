/**
 * generated by Xtext 2.17.1
 */
package co.unal.photos.softgallery;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.photos.softgallery.LogicStructure#getName <em>Name</em>}</li>
 *   <li>{@link co.unal.photos.softgallery.LogicStructure#getLogiccomponents <em>Logiccomponents</em>}</li>
 * </ul>
 *
 * @see co.unal.photos.softgallery.SoftgalleryPackage#getLogicStructure()
 * @model
 * @generated
 */
public interface LogicStructure extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.unal.photos.softgallery.SoftgalleryPackage#getLogicStructure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.unal.photos.softgallery.LogicStructure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Logiccomponents</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.photos.softgallery.ComponentClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logiccomponents</em>' containment reference list.
   * @see co.unal.photos.softgallery.SoftgalleryPackage#getLogicStructure_Logiccomponents()
   * @model containment="true"
   * @generated
   */
  EList<ComponentClass> getLogiccomponents();

} // LogicStructure
