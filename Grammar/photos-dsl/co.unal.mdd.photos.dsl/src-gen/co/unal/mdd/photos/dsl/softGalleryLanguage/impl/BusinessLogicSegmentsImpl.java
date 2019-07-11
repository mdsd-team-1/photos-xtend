/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.BusinessLogicSegments;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Logic Segments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.BusinessLogicSegmentsImpl#getBussinessName <em>Bussiness Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.BusinessLogicSegmentsImpl#getModelSegmentName <em>Model Segment Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.BusinessLogicSegmentsImpl#getRepositoryName <em>Repository Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.BusinessLogicSegmentsImpl#getSecuritySName <em>Security SName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessLogicSegmentsImpl extends MinimalEObjectImpl.Container implements BusinessLogicSegments
{
  /**
   * The default value of the '{@link #getBussinessName() <em>Bussiness Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBussinessName()
   * @generated
   * @ordered
   */
  protected static final String BUSSINESS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBussinessName() <em>Bussiness Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBussinessName()
   * @generated
   * @ordered
   */
  protected String bussinessName = BUSSINESS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getModelSegmentName() <em>Model Segment Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelSegmentName()
   * @generated
   * @ordered
   */
  protected static final String MODEL_SEGMENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelSegmentName() <em>Model Segment Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelSegmentName()
   * @generated
   * @ordered
   */
  protected String modelSegmentName = MODEL_SEGMENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRepositoryName() <em>Repository Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositoryName()
   * @generated
   * @ordered
   */
  protected static final String REPOSITORY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepositoryName() <em>Repository Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepositoryName()
   * @generated
   * @ordered
   */
  protected String repositoryName = REPOSITORY_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSecuritySName() <em>Security SName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecuritySName()
   * @generated
   * @ordered
   */
  protected static final String SECURITY_SNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecuritySName() <em>Security SName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecuritySName()
   * @generated
   * @ordered
   */
  protected String securitySName = SECURITY_SNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessLogicSegmentsImpl()
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
    return SoftGalleryLanguagePackage.Literals.BUSINESS_LOGIC_SEGMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBussinessName()
  {
    return bussinessName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBussinessName(String newBussinessName)
  {
    String oldBussinessName = bussinessName;
    bussinessName = newBussinessName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__BUSSINESS_NAME, oldBussinessName, bussinessName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getModelSegmentName()
  {
    return modelSegmentName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setModelSegmentName(String newModelSegmentName)
  {
    String oldModelSegmentName = modelSegmentName;
    modelSegmentName = newModelSegmentName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__MODEL_SEGMENT_NAME, oldModelSegmentName, modelSegmentName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRepositoryName()
  {
    return repositoryName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRepositoryName(String newRepositoryName)
  {
    String oldRepositoryName = repositoryName;
    repositoryName = newRepositoryName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__REPOSITORY_NAME, oldRepositoryName, repositoryName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecuritySName()
  {
    return securitySName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecuritySName(String newSecuritySName)
  {
    String oldSecuritySName = securitySName;
    securitySName = newSecuritySName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__SECURITY_SNAME, oldSecuritySName, securitySName));
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
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__BUSSINESS_NAME:
        return getBussinessName();
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__MODEL_SEGMENT_NAME:
        return getModelSegmentName();
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__REPOSITORY_NAME:
        return getRepositoryName();
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__SECURITY_SNAME:
        return getSecuritySName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__BUSSINESS_NAME:
        setBussinessName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__MODEL_SEGMENT_NAME:
        setModelSegmentName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__REPOSITORY_NAME:
        setRepositoryName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__SECURITY_SNAME:
        setSecuritySName((String)newValue);
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
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__BUSSINESS_NAME:
        setBussinessName(BUSSINESS_NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__MODEL_SEGMENT_NAME:
        setModelSegmentName(MODEL_SEGMENT_NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__REPOSITORY_NAME:
        setRepositoryName(REPOSITORY_NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__SECURITY_SNAME:
        setSecuritySName(SECURITY_SNAME_EDEFAULT);
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
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__BUSSINESS_NAME:
        return BUSSINESS_NAME_EDEFAULT == null ? bussinessName != null : !BUSSINESS_NAME_EDEFAULT.equals(bussinessName);
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__MODEL_SEGMENT_NAME:
        return MODEL_SEGMENT_NAME_EDEFAULT == null ? modelSegmentName != null : !MODEL_SEGMENT_NAME_EDEFAULT.equals(modelSegmentName);
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__REPOSITORY_NAME:
        return REPOSITORY_NAME_EDEFAULT == null ? repositoryName != null : !REPOSITORY_NAME_EDEFAULT.equals(repositoryName);
      case SoftGalleryLanguagePackage.BUSINESS_LOGIC_SEGMENTS__SECURITY_SNAME:
        return SECURITY_SNAME_EDEFAULT == null ? securitySName != null : !SECURITY_SNAME_EDEFAULT.equals(securitySName);
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
    result.append(" (bussinessName: ");
    result.append(bussinessName);
    result.append(", modelSegmentName: ");
    result.append(modelSegmentName);
    result.append(", repositoryName: ");
    result.append(repositoryName);
    result.append(", securitySName: ");
    result.append(securitySName);
    result.append(')');
    return result.toString();
  }

} //BusinessLogicSegmentsImpl
