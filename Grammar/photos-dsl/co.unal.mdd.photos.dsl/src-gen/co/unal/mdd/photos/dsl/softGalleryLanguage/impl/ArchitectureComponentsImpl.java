/**
 * generated by Xtext 2.17.1
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.ArchitectureComponents;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ArchitectureComponentsImpl#getArchcomponent <em>Archcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureComponentsImpl extends MinimalEObjectImpl.Container implements ArchitectureComponents
{
  /**
   * The cached value of the '{@link #getArchcomponent() <em>Archcomponent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchcomponent()
   * @generated
   * @ordered
   */
  protected EList<EObject> archcomponent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchitectureComponentsImpl()
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
    return SoftGalleryLanguagePackage.Literals.ARCHITECTURE_COMPONENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getArchcomponent()
  {
    if (archcomponent == null)
    {
      archcomponent = new EObjectContainmentEList<EObject>(EObject.class, this, SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCHCOMPONENT);
    }
    return archcomponent;
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCHCOMPONENT:
        return ((InternalEList<?>)getArchcomponent()).basicRemove(otherEnd, msgs);
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCHCOMPONENT:
        return getArchcomponent();
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCHCOMPONENT:
        getArchcomponent().clear();
        getArchcomponent().addAll((Collection<? extends EObject>)newValue);
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCHCOMPONENT:
        getArchcomponent().clear();
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCHCOMPONENT:
        return archcomponent != null && !archcomponent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArchitectureComponentsImpl
