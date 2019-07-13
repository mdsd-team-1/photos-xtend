/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.PropsType;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Props Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.PropsTypeImpl#getNameProps <em>Name Props</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.PropsTypeImpl#getPropsdatas <em>Propsdatas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropsTypeImpl extends MinimalEObjectImpl.Container implements PropsType
{
  /**
   * The default value of the '{@link #getNameProps() <em>Name Props</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameProps()
   * @generated
   * @ordered
   */
  protected static final String NAME_PROPS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameProps() <em>Name Props</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameProps()
   * @generated
   * @ordered
   */
  protected String nameProps = NAME_PROPS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropsdatas() <em>Propsdatas</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropsdatas()
   * @generated
   * @ordered
   */
  protected EList<String> propsdatas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropsTypeImpl()
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
    return SoftGalleryLanguagePackage.Literals.PROPS_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameProps()
  {
    return nameProps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameProps(String newNameProps)
  {
    String oldNameProps = nameProps;
    nameProps = newNameProps;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PROPS_TYPE__NAME_PROPS, oldNameProps, nameProps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getPropsdatas()
  {
    if (propsdatas == null)
    {
      propsdatas = new EDataTypeEList<String>(String.class, this, SoftGalleryLanguagePackage.PROPS_TYPE__PROPSDATAS);
    }
    return propsdatas;
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
      case SoftGalleryLanguagePackage.PROPS_TYPE__NAME_PROPS:
        return getNameProps();
      case SoftGalleryLanguagePackage.PROPS_TYPE__PROPSDATAS:
        return getPropsdatas();
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
      case SoftGalleryLanguagePackage.PROPS_TYPE__NAME_PROPS:
        setNameProps((String)newValue);
        return;
      case SoftGalleryLanguagePackage.PROPS_TYPE__PROPSDATAS:
        getPropsdatas().clear();
        getPropsdatas().addAll((Collection<? extends String>)newValue);
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
      case SoftGalleryLanguagePackage.PROPS_TYPE__NAME_PROPS:
        setNameProps(NAME_PROPS_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.PROPS_TYPE__PROPSDATAS:
        getPropsdatas().clear();
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
      case SoftGalleryLanguagePackage.PROPS_TYPE__NAME_PROPS:
        return NAME_PROPS_EDEFAULT == null ? nameProps != null : !NAME_PROPS_EDEFAULT.equals(nameProps);
      case SoftGalleryLanguagePackage.PROPS_TYPE__PROPSDATAS:
        return propsdatas != null && !propsdatas.isEmpty();
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
    result.append(" (nameProps: ");
    result.append(nameProps);
    result.append(", propsdatas: ");
    result.append(propsdatas);
    result.append(')');
    return result.toString();
  }

} //PropsTypeImpl
