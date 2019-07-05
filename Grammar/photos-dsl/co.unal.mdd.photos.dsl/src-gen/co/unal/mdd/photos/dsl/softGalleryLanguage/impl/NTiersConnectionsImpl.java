/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.NTierSource;
import co.unal.mdd.photos.dsl.softGalleryLanguage.NTierTarget;
import co.unal.mdd.photos.dsl.softGalleryLanguage.NTiersConnections;
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
 * An implementation of the model object '<em><b>NTiers Connections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTiersConnectionsImpl#getNtierconnection <em>Ntierconnection</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTiersConnectionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTiersConnectionsImpl#getNtierorigin <em>Ntierorigin</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTiersConnectionsImpl#getNtiertarget <em>Ntiertarget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTiersConnectionsImpl extends MinimalEObjectImpl.Container implements NTiersConnections
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
  protected NTiersConnectionsImpl()
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
    return SoftGalleryLanguagePackage.Literals.NTIERS_CONNECTIONS;
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
      ntierconnection = new EDataTypeEList<String>(String.class, this, SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTION);
    }
    return ntierconnection;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NAME, oldName, name));
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
      ntierorigin = new EObjectContainmentEList<NTierSource>(NTierSource.class, this, SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERORIGIN);
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
      ntiertarget = new EObjectContainmentEList<NTierTarget>(NTierTarget.class, this, SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERTARGET);
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERORIGIN:
        return ((InternalEList<?>)getNtierorigin()).basicRemove(otherEnd, msgs);
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERTARGET:
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTION:
        return getNtierconnection();
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NAME:
        return getName();
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERORIGIN:
        return getNtierorigin();
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERTARGET:
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTION:
        getNtierconnection().clear();
        getNtierconnection().addAll((Collection<? extends String>)newValue);
        return;
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NAME:
        setName((String)newValue);
        return;
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERORIGIN:
        getNtierorigin().clear();
        getNtierorigin().addAll((Collection<? extends NTierSource>)newValue);
        return;
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERTARGET:
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTION:
        getNtierconnection().clear();
        return;
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERORIGIN:
        getNtierorigin().clear();
        return;
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERTARGET:
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTION:
        return ntierconnection != null && !ntierconnection.isEmpty();
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERORIGIN:
        return ntierorigin != null && !ntierorigin.isEmpty();
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERTARGET:
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NTiersConnectionsImpl
