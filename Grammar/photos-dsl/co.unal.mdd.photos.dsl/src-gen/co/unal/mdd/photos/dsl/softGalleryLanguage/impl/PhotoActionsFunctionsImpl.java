/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.PhotoActionsFunctions;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo Actions Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.PhotoActionsFunctionsImpl#getNameGenerico <em>Name Generico</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.PhotoActionsFunctionsImpl#getNamePhoto <em>Name Photo</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.PhotoActionsFunctionsImpl#getNameLoad <em>Name Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhotoActionsFunctionsImpl extends MinimalEObjectImpl.Container implements PhotoActionsFunctions
{
  /**
   * The default value of the '{@link #getNameGenerico() <em>Name Generico</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameGenerico()
   * @generated
   * @ordered
   */
  protected static final String NAME_GENERICO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameGenerico() <em>Name Generico</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameGenerico()
   * @generated
   * @ordered
   */
  protected String nameGenerico = NAME_GENERICO_EDEFAULT;

  /**
   * The default value of the '{@link #getNamePhoto() <em>Name Photo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamePhoto()
   * @generated
   * @ordered
   */
  protected static final String NAME_PHOTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamePhoto() <em>Name Photo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamePhoto()
   * @generated
   * @ordered
   */
  protected String namePhoto = NAME_PHOTO_EDEFAULT;

  /**
   * The default value of the '{@link #getNameLoad() <em>Name Load</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameLoad()
   * @generated
   * @ordered
   */
  protected static final String NAME_LOAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameLoad() <em>Name Load</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameLoad()
   * @generated
   * @ordered
   */
  protected String nameLoad = NAME_LOAD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhotoActionsFunctionsImpl()
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
    return SoftGalleryLanguagePackage.Literals.PHOTO_ACTIONS_FUNCTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameGenerico()
  {
    return nameGenerico;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameGenerico(String newNameGenerico)
  {
    String oldNameGenerico = nameGenerico;
    nameGenerico = newNameGenerico;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_GENERICO, oldNameGenerico, nameGenerico));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNamePhoto()
  {
    return namePhoto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNamePhoto(String newNamePhoto)
  {
    String oldNamePhoto = namePhoto;
    namePhoto = newNamePhoto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_PHOTO, oldNamePhoto, namePhoto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNameLoad()
  {
    return nameLoad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNameLoad(String newNameLoad)
  {
    String oldNameLoad = nameLoad;
    nameLoad = newNameLoad;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_LOAD, oldNameLoad, nameLoad));
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
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_GENERICO:
        return getNameGenerico();
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_PHOTO:
        return getNamePhoto();
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_LOAD:
        return getNameLoad();
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
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_GENERICO:
        setNameGenerico((String)newValue);
        return;
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_PHOTO:
        setNamePhoto((String)newValue);
        return;
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_LOAD:
        setNameLoad((String)newValue);
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
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_GENERICO:
        setNameGenerico(NAME_GENERICO_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_PHOTO:
        setNamePhoto(NAME_PHOTO_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_LOAD:
        setNameLoad(NAME_LOAD_EDEFAULT);
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
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_GENERICO:
        return NAME_GENERICO_EDEFAULT == null ? nameGenerico != null : !NAME_GENERICO_EDEFAULT.equals(nameGenerico);
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_PHOTO:
        return NAME_PHOTO_EDEFAULT == null ? namePhoto != null : !NAME_PHOTO_EDEFAULT.equals(namePhoto);
      case SoftGalleryLanguagePackage.PHOTO_ACTIONS_FUNCTIONS__NAME_LOAD:
        return NAME_LOAD_EDEFAULT == null ? nameLoad != null : !NAME_LOAD_EDEFAULT.equals(nameLoad);
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
    result.append(" (nameGenerico: ");
    result.append(nameGenerico);
    result.append(", namePhoto: ");
    result.append(namePhoto);
    result.append(", nameLoad: ");
    result.append(nameLoad);
    result.append(')');
    return result.toString();
  }

} //PhotoActionsFunctionsImpl
