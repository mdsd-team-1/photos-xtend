/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.ProfileManagementFunctions;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Management Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ProfileManagementFunctionsImpl#getViewprofileName <em>Viewprofile Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ProfileManagementFunctionsImpl#getEditProfileName <em>Edit Profile Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileManagementFunctionsImpl extends MinimalEObjectImpl.Container implements ProfileManagementFunctions
{
  /**
   * The default value of the '{@link #getViewprofileName() <em>Viewprofile Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewprofileName()
   * @generated
   * @ordered
   */
  protected static final String VIEWPROFILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewprofileName() <em>Viewprofile Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewprofileName()
   * @generated
   * @ordered
   */
  protected String viewprofileName = VIEWPROFILE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getEditProfileName() <em>Edit Profile Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditProfileName()
   * @generated
   * @ordered
   */
  protected static final String EDIT_PROFILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEditProfileName() <em>Edit Profile Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditProfileName()
   * @generated
   * @ordered
   */
  protected String editProfileName = EDIT_PROFILE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProfileManagementFunctionsImpl()
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
    return SoftGalleryLanguagePackage.Literals.PROFILE_MANAGEMENT_FUNCTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getViewprofileName()
  {
    return viewprofileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setViewprofileName(String newViewprofileName)
  {
    String oldViewprofileName = viewprofileName;
    viewprofileName = newViewprofileName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__VIEWPROFILE_NAME, oldViewprofileName, viewprofileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEditProfileName()
  {
    return editProfileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEditProfileName(String newEditProfileName)
  {
    String oldEditProfileName = editProfileName;
    editProfileName = newEditProfileName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__EDIT_PROFILE_NAME, oldEditProfileName, editProfileName));
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
      case SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__VIEWPROFILE_NAME:
        return getViewprofileName();
      case SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__EDIT_PROFILE_NAME:
        return getEditProfileName();
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
      case SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__VIEWPROFILE_NAME:
        setViewprofileName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__EDIT_PROFILE_NAME:
        setEditProfileName((String)newValue);
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
      case SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__VIEWPROFILE_NAME:
        setViewprofileName(VIEWPROFILE_NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__EDIT_PROFILE_NAME:
        setEditProfileName(EDIT_PROFILE_NAME_EDEFAULT);
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
      case SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__VIEWPROFILE_NAME:
        return VIEWPROFILE_NAME_EDEFAULT == null ? viewprofileName != null : !VIEWPROFILE_NAME_EDEFAULT.equals(viewprofileName);
      case SoftGalleryLanguagePackage.PROFILE_MANAGEMENT_FUNCTIONS__EDIT_PROFILE_NAME:
        return EDIT_PROFILE_NAME_EDEFAULT == null ? editProfileName != null : !EDIT_PROFILE_NAME_EDEFAULT.equals(editProfileName);
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
    result.append(" (viewprofileName: ");
    result.append(viewprofileName);
    result.append(", editProfileName: ");
    result.append(editProfileName);
    result.append(')');
    return result.toString();
  }

} //ProfileManagementFunctionsImpl