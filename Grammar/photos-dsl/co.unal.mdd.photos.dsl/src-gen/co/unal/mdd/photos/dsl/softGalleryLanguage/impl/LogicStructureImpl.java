/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.ComponentClass;
import co.unal.mdd.photos.dsl.softGalleryLanguage.LogicStructure;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

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
 * An implementation of the model object '<em><b>Logic Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.LogicStructureImpl#getAppComName <em>App Com Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.LogicStructureImpl#getLogiccomponents <em>Logiccomponents</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.LogicStructureImpl#getIndexCompName <em>Index Comp Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicStructureImpl extends MinimalEObjectImpl.Container implements LogicStructure
{
  /**
   * The default value of the '{@link #getAppComName() <em>App Com Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppComName()
   * @generated
   * @ordered
   */
  protected static final String APP_COM_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppComName() <em>App Com Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppComName()
   * @generated
   * @ordered
   */
  protected String appComName = APP_COM_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLogiccomponents() <em>Logiccomponents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogiccomponents()
   * @generated
   * @ordered
   */
  protected EList<ComponentClass> logiccomponents;

  /**
   * The default value of the '{@link #getIndexCompName() <em>Index Comp Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexCompName()
   * @generated
   * @ordered
   */
  protected static final String INDEX_COMP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIndexCompName() <em>Index Comp Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexCompName()
   * @generated
   * @ordered
   */
  protected String indexCompName = INDEX_COMP_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicStructureImpl()
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
    return SoftGalleryLanguagePackage.Literals.LOGIC_STRUCTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAppComName()
  {
    return appComName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAppComName(String newAppComName)
  {
    String oldAppComName = appComName;
    appComName = newAppComName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.LOGIC_STRUCTURE__APP_COM_NAME, oldAppComName, appComName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ComponentClass> getLogiccomponents()
  {
    if (logiccomponents == null)
    {
      logiccomponents = new EObjectContainmentEList<ComponentClass>(ComponentClass.class, this, SoftGalleryLanguagePackage.LOGIC_STRUCTURE__LOGICCOMPONENTS);
    }
    return logiccomponents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIndexCompName()
  {
    return indexCompName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIndexCompName(String newIndexCompName)
  {
    String oldIndexCompName = indexCompName;
    indexCompName = newIndexCompName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.LOGIC_STRUCTURE__INDEX_COMP_NAME, oldIndexCompName, indexCompName));
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
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__LOGICCOMPONENTS:
        return ((InternalEList<?>)getLogiccomponents()).basicRemove(otherEnd, msgs);
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
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__APP_COM_NAME:
        return getAppComName();
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__LOGICCOMPONENTS:
        return getLogiccomponents();
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__INDEX_COMP_NAME:
        return getIndexCompName();
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
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__APP_COM_NAME:
        setAppComName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__LOGICCOMPONENTS:
        getLogiccomponents().clear();
        getLogiccomponents().addAll((Collection<? extends ComponentClass>)newValue);
        return;
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__INDEX_COMP_NAME:
        setIndexCompName((String)newValue);
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
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__APP_COM_NAME:
        setAppComName(APP_COM_NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__LOGICCOMPONENTS:
        getLogiccomponents().clear();
        return;
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__INDEX_COMP_NAME:
        setIndexCompName(INDEX_COMP_NAME_EDEFAULT);
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
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__APP_COM_NAME:
        return APP_COM_NAME_EDEFAULT == null ? appComName != null : !APP_COM_NAME_EDEFAULT.equals(appComName);
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__LOGICCOMPONENTS:
        return logiccomponents != null && !logiccomponents.isEmpty();
      case SoftGalleryLanguagePackage.LOGIC_STRUCTURE__INDEX_COMP_NAME:
        return INDEX_COMP_NAME_EDEFAULT == null ? indexCompName != null : !INDEX_COMP_NAME_EDEFAULT.equals(indexCompName);
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
    result.append(" (appComName: ");
    result.append(appComName);
    result.append(", indexCompName: ");
    result.append(indexCompName);
    result.append(')');
    return result.toString();
  }

} //LogicStructureImpl
