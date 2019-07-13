/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.AtributeAlbum;
import co.unal.mdd.photos.dsl.softGalleryLanguage.AtributePhoto;
import co.unal.mdd.photos.dsl.softGalleryLanguage.AtributeUserDomain;
import co.unal.mdd.photos.dsl.softGalleryLanguage.Entities;
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
 * An implementation of the model object '<em><b>Entities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.EntitiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.EntitiesImpl#getAtributePhoto <em>Atribute Photo</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.EntitiesImpl#getAtributeAlbum <em>Atribute Album</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.EntitiesImpl#getAtributeUserDomain <em>Atribute User Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitiesImpl extends MinimalEObjectImpl.Container implements Entities
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAtributePhoto() <em>Atribute Photo</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributePhoto()
   * @generated
   * @ordered
   */
  protected EList<AtributePhoto> atributePhoto;

  /**
   * The cached value of the '{@link #getAtributeAlbum() <em>Atribute Album</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributeAlbum()
   * @generated
   * @ordered
   */
  protected EList<AtributeAlbum> atributeAlbum;

  /**
   * The cached value of the '{@link #getAtributeUserDomain() <em>Atribute User Domain</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributeUserDomain()
   * @generated
   * @ordered
   */
  protected EList<AtributeUserDomain> atributeUserDomain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntitiesImpl()
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
    return SoftGalleryLanguagePackage.Literals.ENTITIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.ENTITIES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AtributePhoto> getAtributePhoto()
  {
    if (atributePhoto == null)
    {
      atributePhoto = new EObjectContainmentEList<AtributePhoto>(AtributePhoto.class, this, SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_PHOTO);
    }
    return atributePhoto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AtributeAlbum> getAtributeAlbum()
  {
    if (atributeAlbum == null)
    {
      atributeAlbum = new EObjectContainmentEList<AtributeAlbum>(AtributeAlbum.class, this, SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_ALBUM);
    }
    return atributeAlbum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<AtributeUserDomain> getAtributeUserDomain()
  {
    if (atributeUserDomain == null)
    {
      atributeUserDomain = new EObjectContainmentEList<AtributeUserDomain>(AtributeUserDomain.class, this, SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_USER_DOMAIN);
    }
    return atributeUserDomain;
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
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_PHOTO:
        return ((InternalEList<?>)getAtributePhoto()).basicRemove(otherEnd, msgs);
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_ALBUM:
        return ((InternalEList<?>)getAtributeAlbum()).basicRemove(otherEnd, msgs);
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_USER_DOMAIN:
        return ((InternalEList<?>)getAtributeUserDomain()).basicRemove(otherEnd, msgs);
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
      case SoftGalleryLanguagePackage.ENTITIES__NAME:
        return getName();
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_PHOTO:
        return getAtributePhoto();
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_ALBUM:
        return getAtributeAlbum();
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_USER_DOMAIN:
        return getAtributeUserDomain();
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
      case SoftGalleryLanguagePackage.ENTITIES__NAME:
        setName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_PHOTO:
        getAtributePhoto().clear();
        getAtributePhoto().addAll((Collection<? extends AtributePhoto>)newValue);
        return;
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_ALBUM:
        getAtributeAlbum().clear();
        getAtributeAlbum().addAll((Collection<? extends AtributeAlbum>)newValue);
        return;
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_USER_DOMAIN:
        getAtributeUserDomain().clear();
        getAtributeUserDomain().addAll((Collection<? extends AtributeUserDomain>)newValue);
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
      case SoftGalleryLanguagePackage.ENTITIES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_PHOTO:
        getAtributePhoto().clear();
        return;
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_ALBUM:
        getAtributeAlbum().clear();
        return;
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_USER_DOMAIN:
        getAtributeUserDomain().clear();
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
      case SoftGalleryLanguagePackage.ENTITIES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_PHOTO:
        return atributePhoto != null && !atributePhoto.isEmpty();
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_ALBUM:
        return atributeAlbum != null && !atributeAlbum.isEmpty();
      case SoftGalleryLanguagePackage.ENTITIES__ATRIBUTE_USER_DOMAIN:
        return atributeUserDomain != null && !atributeUserDomain.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntitiesImpl