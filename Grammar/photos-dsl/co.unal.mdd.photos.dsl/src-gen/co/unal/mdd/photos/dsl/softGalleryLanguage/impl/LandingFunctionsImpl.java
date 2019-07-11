/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.LandingFunctions;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.LandingFunctionsImpl#getNameCarouselName <em>Name Carousel Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.LandingFunctionsImpl#getPassPhotoName <em>Pass Photo Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingFunctionsImpl extends MinimalEObjectImpl.Container implements LandingFunctions
{
  /**
   * The default value of the '{@link #getNameCarouselName() <em>Name Carousel Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameCarouselName()
   * @generated
   * @ordered
   */
  protected static final String NAME_CAROUSEL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameCarouselName() <em>Name Carousel Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameCarouselName()
   * @generated
   * @ordered
   */
  protected String nameCarouselName = NAME_CAROUSEL_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPassPhotoName() <em>Pass Photo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassPhotoName()
   * @generated
   * @ordered
   */
  protected static final String PASS_PHOTO_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassPhotoName() <em>Pass Photo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassPhotoName()
   * @generated
   * @ordered
   */
  protected String passPhotoName = PASS_PHOTO_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LandingFunctionsImpl()
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
    return SoftGalleryLanguagePackage.Literals.LANDING_FUNCTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameCarouselName()
  {
    return nameCarouselName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameCarouselName(String newNameCarouselName)
  {
    String oldNameCarouselName = nameCarouselName;
    nameCarouselName = newNameCarouselName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.LANDING_FUNCTIONS__NAME_CAROUSEL_NAME, oldNameCarouselName, nameCarouselName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPassPhotoName()
  {
    return passPhotoName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPassPhotoName(String newPassPhotoName)
  {
    String oldPassPhotoName = passPhotoName;
    passPhotoName = newPassPhotoName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.LANDING_FUNCTIONS__PASS_PHOTO_NAME, oldPassPhotoName, passPhotoName));
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
      case SoftGalleryLanguagePackage.LANDING_FUNCTIONS__NAME_CAROUSEL_NAME:
        return getNameCarouselName();
      case SoftGalleryLanguagePackage.LANDING_FUNCTIONS__PASS_PHOTO_NAME:
        return getPassPhotoName();
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
      case SoftGalleryLanguagePackage.LANDING_FUNCTIONS__NAME_CAROUSEL_NAME:
        setNameCarouselName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.LANDING_FUNCTIONS__PASS_PHOTO_NAME:
        setPassPhotoName((String)newValue);
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
      case SoftGalleryLanguagePackage.LANDING_FUNCTIONS__NAME_CAROUSEL_NAME:
        setNameCarouselName(NAME_CAROUSEL_NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.LANDING_FUNCTIONS__PASS_PHOTO_NAME:
        setPassPhotoName(PASS_PHOTO_NAME_EDEFAULT);
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
      case SoftGalleryLanguagePackage.LANDING_FUNCTIONS__NAME_CAROUSEL_NAME:
        return NAME_CAROUSEL_NAME_EDEFAULT == null ? nameCarouselName != null : !NAME_CAROUSEL_NAME_EDEFAULT.equals(nameCarouselName);
      case SoftGalleryLanguagePackage.LANDING_FUNCTIONS__PASS_PHOTO_NAME:
        return PASS_PHOTO_NAME_EDEFAULT == null ? passPhotoName != null : !PASS_PHOTO_NAME_EDEFAULT.equals(passPhotoName);
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
    result.append(" (nameCarouselName: ");
    result.append(nameCarouselName);
    result.append(", passPhotoName: ");
    result.append(passPhotoName);
    result.append(')');
    return result.toString();
  }

} //LandingFunctionsImpl
