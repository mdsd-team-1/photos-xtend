/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentsStylesContent;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;
import co.unal.mdd.photos.dsl.softGalleryLanguage.StyleProperties;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components Styles Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ComponentsStylesContentImpl#getNameStyle <em>Name Style</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ComponentsStylesContentImpl#getStylecontent <em>Stylecontent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentsStylesContentImpl extends MinimalEObjectImpl.Container implements ComponentsStylesContent
{
  /**
   * The default value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameStyle()
   * @generated
   * @ordered
   */
  protected static final String NAME_STYLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameStyle() <em>Name Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameStyle()
   * @generated
   * @ordered
   */
  protected String nameStyle = NAME_STYLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStylecontent() <em>Stylecontent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStylecontent()
   * @generated
   * @ordered
   */
  protected EList<StyleProperties> stylecontent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentsStylesContentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SoftGalleryLanguagePackage.Literals.COMPONENTS_STYLES_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameStyle()
  {
    return nameStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameStyle(String newNameStyle)
  {
    String oldNameStyle = nameStyle;
    nameStyle = newNameStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__NAME_STYLE, oldNameStyle, nameStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StyleProperties> getStylecontent()
  {
    if (stylecontent == null)
    {
      stylecontent = new EObjectContainmentEList<StyleProperties>(StyleProperties.class, this, SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__STYLECONTENT);
    }
    return stylecontent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__STYLECONTENT:
        return ((InternalEList<?>)getStylecontent()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__NAME_STYLE:
        return getNameStyle();
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__STYLECONTENT:
        return getStylecontent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__NAME_STYLE:
        setNameStyle((String)newValue);
        return;
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__STYLECONTENT:
        getStylecontent().clear();
        getStylecontent().addAll((Collection<? extends StyleProperties>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__NAME_STYLE:
        setNameStyle(NAME_STYLE_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__STYLECONTENT:
        getStylecontent().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__NAME_STYLE:
        return NAME_STYLE_EDEFAULT == null ? nameStyle != null : !NAME_STYLE_EDEFAULT.equals(nameStyle);
      case SoftGalleryLanguagePackage.COMPONENTS_STYLES_CONTENT__STYLECONTENT:
        return stylecontent != null && !stylecontent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (nameStyle: ");
    result.append(nameStyle);
    result.append(')');
    return result.toString();
  }

} //ComponentsStylesContentImpl
