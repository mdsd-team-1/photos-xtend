/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.PresentationSegments;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Segments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.PresentationSegmentsImpl#getPresentationSName <em>Presentation SName</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.PresentationSegmentsImpl#getPresentationCName <em>Presentation CName</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.PresentationSegmentsImpl#getPresentationAName <em>Presentation AName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationSegmentsImpl extends MinimalEObjectImpl.Container implements PresentationSegments
{
  /**
   * The default value of the '{@link #getPresentationSName() <em>Presentation SName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationSName()
   * @generated
   * @ordered
   */
  protected static final String PRESENTATION_SNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPresentationSName() <em>Presentation SName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationSName()
   * @generated
   * @ordered
   */
  protected String presentationSName = PRESENTATION_SNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPresentationCName() <em>Presentation CName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationCName()
   * @generated
   * @ordered
   */
  protected static final String PRESENTATION_CNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPresentationCName() <em>Presentation CName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationCName()
   * @generated
   * @ordered
   */
  protected String presentationCName = PRESENTATION_CNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPresentationAName() <em>Presentation AName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationAName()
   * @generated
   * @ordered
   */
  protected static final String PRESENTATION_ANAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPresentationAName() <em>Presentation AName</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPresentationAName()
   * @generated
   * @ordered
   */
  protected String presentationAName = PRESENTATION_ANAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PresentationSegmentsImpl()
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
    return SoftGalleryLanguagePackage.Literals.PRESENTATION_SEGMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPresentationSName()
  {
    return presentationSName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPresentationSName(String newPresentationSName)
  {
    String oldPresentationSName = presentationSName;
    presentationSName = newPresentationSName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_SNAME, oldPresentationSName, presentationSName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPresentationCName()
  {
    return presentationCName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPresentationCName(String newPresentationCName)
  {
    String oldPresentationCName = presentationCName;
    presentationCName = newPresentationCName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_CNAME, oldPresentationCName, presentationCName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPresentationAName()
  {
    return presentationAName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPresentationAName(String newPresentationAName)
  {
    String oldPresentationAName = presentationAName;
    presentationAName = newPresentationAName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_ANAME, oldPresentationAName, presentationAName));
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
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_SNAME:
        return getPresentationSName();
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_CNAME:
        return getPresentationCName();
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_ANAME:
        return getPresentationAName();
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
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_SNAME:
        setPresentationSName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_CNAME:
        setPresentationCName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_ANAME:
        setPresentationAName((String)newValue);
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
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_SNAME:
        setPresentationSName(PRESENTATION_SNAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_CNAME:
        setPresentationCName(PRESENTATION_CNAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_ANAME:
        setPresentationAName(PRESENTATION_ANAME_EDEFAULT);
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
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_SNAME:
        return PRESENTATION_SNAME_EDEFAULT == null ? presentationSName != null : !PRESENTATION_SNAME_EDEFAULT.equals(presentationSName);
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_CNAME:
        return PRESENTATION_CNAME_EDEFAULT == null ? presentationCName != null : !PRESENTATION_CNAME_EDEFAULT.equals(presentationCName);
      case SoftGalleryLanguagePackage.PRESENTATION_SEGMENTS__PRESENTATION_ANAME:
        return PRESENTATION_ANAME_EDEFAULT == null ? presentationAName != null : !PRESENTATION_ANAME_EDEFAULT.equals(presentationAName);
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
    result.append(" (presentationSName: ");
    result.append(presentationSName);
    result.append(", presentationCName: ");
    result.append(presentationCName);
    result.append(", presentationAName: ");
    result.append(presentationAName);
    result.append(')');
    return result.toString();
  }

} //PresentationSegmentsImpl
