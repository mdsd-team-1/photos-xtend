/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.ReactServicesRelation;
import co.unal.mdd.photos.dsl.softGalleryLanguage.ReactsRelationServ;
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
 * An implementation of the model object '<em><b>React Services Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ReactServicesRelationImpl#getServicesrels <em>Servicesrels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactServicesRelationImpl extends MinimalEObjectImpl.Container implements ReactServicesRelation
{
  /**
   * The cached value of the '{@link #getServicesrels() <em>Servicesrels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServicesrels()
   * @generated
   * @ordered
   */
  protected EList<ReactsRelationServ> servicesrels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactServicesRelationImpl()
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
    return SoftGalleryLanguagePackage.Literals.REACT_SERVICES_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ReactsRelationServ> getServicesrels()
  {
    if (servicesrels == null)
    {
      servicesrels = new EObjectContainmentEList<ReactsRelationServ>(ReactsRelationServ.class, this, SoftGalleryLanguagePackage.REACT_SERVICES_RELATION__SERVICESRELS);
    }
    return servicesrels;
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
      case SoftGalleryLanguagePackage.REACT_SERVICES_RELATION__SERVICESRELS:
        return ((InternalEList<?>)getServicesrels()).basicRemove(otherEnd, msgs);
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
      case SoftGalleryLanguagePackage.REACT_SERVICES_RELATION__SERVICESRELS:
        return getServicesrels();
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
      case SoftGalleryLanguagePackage.REACT_SERVICES_RELATION__SERVICESRELS:
        getServicesrels().clear();
        getServicesrels().addAll((Collection<? extends ReactsRelationServ>)newValue);
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
      case SoftGalleryLanguagePackage.REACT_SERVICES_RELATION__SERVICESRELS:
        getServicesrels().clear();
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
      case SoftGalleryLanguagePackage.REACT_SERVICES_RELATION__SERVICESRELS:
        return servicesrels != null && !servicesrels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReactServicesRelationImpl
