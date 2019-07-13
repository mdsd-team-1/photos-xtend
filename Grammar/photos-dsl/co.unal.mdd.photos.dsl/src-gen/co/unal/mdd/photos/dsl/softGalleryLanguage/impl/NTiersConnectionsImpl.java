/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.NTierConnectionContent;
import co.unal.mdd.photos.dsl.softGalleryLanguage.NTiersConnections;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.NTiersConnectionsImpl#getNtierconnections <em>Ntierconnections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTiersConnectionsImpl extends MinimalEObjectImpl.Container implements NTiersConnections
{
  /**
   * The cached value of the '{@link #getNtierconnections() <em>Ntierconnections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNtierconnections()
   * @generated
   * @ordered
   */
  protected EList<NTierConnectionContent> ntierconnections;

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
  public EList<NTierConnectionContent> getNtierconnections()
  {
    if (ntierconnections == null)
    {
      ntierconnections = new EObjectContainmentEList<NTierConnectionContent>(NTierConnectionContent.class, this, SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTIONS);
    }
    return ntierconnections;
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTIONS:
        return ((InternalEList<?>)getNtierconnections()).basicRemove(otherEnd, msgs);
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTIONS:
        return getNtierconnections();
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTIONS:
        getNtierconnections().clear();
        getNtierconnections().addAll((Collection<? extends NTierConnectionContent>)newValue);
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTIONS:
        getNtierconnections().clear();
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
      case SoftGalleryLanguagePackage.NTIERS_CONNECTIONS__NTIERCONNECTIONS:
        return ntierconnections != null && !ntierconnections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NTiersConnectionsImpl