/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.NTierConnectionContent;
import co.unal.mdd.photos.dsl.softGalleryLanguage.NTierSource;
import co.unal.mdd.photos.dsl.softGalleryLanguage.NTierTarget;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NTier Connection Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTierConnectionContentImpl#getNtierconnection <em>Ntierconnection</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTierConnectionContentImpl#getNTierName <em>NTier Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTierConnectionContentImpl#getNtierorigin <em>Ntierorigin</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTierConnectionContentImpl#getNtiertarget <em>Ntiertarget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTierConnectionContentImpl extends MinimalEObjectImpl.Container implements NTierConnectionContent
{
  /**
   * The cached value of the '{@link #getNtierconnection() <em>Ntierconnection</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNtierconnection()
   * @generated
   * @ordered
   */
  protected EList<String> ntierconnection;

  /**
   * The default value of the '{@link #getNTierName() <em>NTier Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNTierName()
   * @generated
   * @ordered
   */
  protected static final String NTIER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNTierName() <em>NTier Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNTierName()
   * @generated
   * @ordered
   */
  protected String nTierName = NTIER_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getNtierorigin() <em>Ntierorigin</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNtierorigin()
   * @generated
   * @ordered
   */
  protected EList<NTierSource> ntierorigin;

  /**
   * The cached value of the '{@link #getNtiertarget() <em>Ntiertarget</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNtiertarget()
   * @generated
   * @ordered
   */
  protected EList<NTierTarget> ntiertarget;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NTierConnectionContentImpl()
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
    return SoftGalleryLanguagePackage.Literals.NTIER_CONNECTION_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getNtierconnection()
  {
    if (ntierconnection == null)
    {
      ntierconnection = new EDataTypeEList<String>(String.class, this, SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERCONNECTION);
    }
    return ntierconnection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNTierName()
  {
    return nTierName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNTierName(String newNTierName)
  {
    String oldNTierName = nTierName;
    nTierName = newNTierName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIER_NAME, oldNTierName, nTierName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NTierSource> getNtierorigin()
  {
    if (ntierorigin == null)
    {
      ntierorigin = new EObjectContainmentEList<NTierSource>(NTierSource.class, this, SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERORIGIN);
    }
    return ntierorigin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NTierTarget> getNtiertarget()
  {
    if (ntiertarget == null)
    {
      ntiertarget = new EObjectContainmentEList<NTierTarget>(NTierTarget.class, this, SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERTARGET);
    }
    return ntiertarget;
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
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERORIGIN:
        return ((InternalEList<?>)getNtierorigin()).basicRemove(otherEnd, msgs);
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERTARGET:
        return ((InternalEList<?>)getNtiertarget()).basicRemove(otherEnd, msgs);
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
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERCONNECTION:
        return getNtierconnection();
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIER_NAME:
        return getNTierName();
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERORIGIN:
        return getNtierorigin();
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERTARGET:
        return getNtiertarget();
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
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERCONNECTION:
        getNtierconnection().clear();
        getNtierconnection().addAll((Collection<? extends String>)newValue);
        return;
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIER_NAME:
        setNTierName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERORIGIN:
        getNtierorigin().clear();
        getNtierorigin().addAll((Collection<? extends NTierSource>)newValue);
        return;
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERTARGET:
        getNtiertarget().clear();
        getNtiertarget().addAll((Collection<? extends NTierTarget>)newValue);
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
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERCONNECTION:
        getNtierconnection().clear();
        return;
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIER_NAME:
        setNTierName(NTIER_NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERORIGIN:
        getNtierorigin().clear();
        return;
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERTARGET:
        getNtiertarget().clear();
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
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERCONNECTION:
        return ntierconnection != null && !ntierconnection.isEmpty();
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIER_NAME:
        return NTIER_NAME_EDEFAULT == null ? nTierName != null : !NTIER_NAME_EDEFAULT.equals(nTierName);
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERORIGIN:
        return ntierorigin != null && !ntierorigin.isEmpty();
      case SoftGalleryLanguagePackage.NTIER_CONNECTION_CONTENT__NTIERTARGET:
        return ntiertarget != null && !ntiertarget.isEmpty();
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
    result.append(" (ntierconnection: ");
    result.append(ntierconnection);
    result.append(", nTierName: ");
    result.append(nTierName);
    result.append(')');
    return result.toString();
  }

} //NTierConnectionContentImpl
