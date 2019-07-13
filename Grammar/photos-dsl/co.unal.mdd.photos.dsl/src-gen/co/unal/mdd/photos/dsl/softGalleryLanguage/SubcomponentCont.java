/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcomponent Cont</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.SubcomponentCont#getNameSubComp <em>Name Sub Comp</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.SubcomponentCont#getUicontent <em>Uicontent</em>}</li>
 * </ul>
 *
 * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getSubcomponentCont()
 * @model
 * @generated
 */
public interface SubcomponentCont extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Sub Comp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Sub Comp</em>' attribute.
   * @see #setNameSubComp(String)
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getSubcomponentCont_NameSubComp()
   * @model
   * @generated
   */
  String getNameSubComp();

  /**
   * Sets the value of the '{@link co.unal.mdd.photos.dsl.softGalleryLanguage.SubcomponentCont#getNameSubComp <em>Name Sub Comp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Sub Comp</em>' attribute.
   * @see #getNameSubComp()
   * @generated
   */
  void setNameSubComp(String value);

  /**
   * Returns the value of the '<em><b>Uicontent</b></em>' containment reference list.
   * The list contents are of type {@link co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uicontent</em>' containment reference list.
   * @see co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage#getSubcomponentCont_Uicontent()
   * @model containment="true"
   * @generated
   */
  EList<ComponentClass> getUicontent();

} // SubcomponentCont
