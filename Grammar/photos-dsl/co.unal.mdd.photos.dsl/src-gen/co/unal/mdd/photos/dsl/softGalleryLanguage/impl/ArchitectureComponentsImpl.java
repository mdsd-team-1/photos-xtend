/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.ArchitectureComponents;
import co.unal.mdd.photos.dsl.softGalleryLanguage.BackEnd;
import co.unal.mdd.photos.dsl.softGalleryLanguage.FrontEnd;
import co.unal.mdd.photos.dsl.softGalleryLanguage.PersistenceDataComponent;
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
 * An implementation of the model object '<em><b>Architecture Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ArchitectureComponentsImpl#getArchFeComponent <em>Arch Fe Component</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ArchitectureComponentsImpl#getArchBeComponent <em>Arch Be Component</em>}</li>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ArchitectureComponentsImpl#getArchPdComponent <em>Arch Pd Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureComponentsImpl extends MinimalEObjectImpl.Container implements ArchitectureComponents
{
  /**
   * The cached value of the '{@link #getArchFeComponent() <em>Arch Fe Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchFeComponent()
   * @generated
   * @ordered
   */
  protected EList<FrontEnd> archFeComponent;

  /**
   * The cached value of the '{@link #getArchBeComponent() <em>Arch Be Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchBeComponent()
   * @generated
   * @ordered
   */
  protected EList<BackEnd> archBeComponent;

  /**
   * The cached value of the '{@link #getArchPdComponent() <em>Arch Pd Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchPdComponent()
   * @generated
   * @ordered
   */
  protected EList<PersistenceDataComponent> archPdComponent;

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
  public EList<FrontEnd> getArchFeComponent()
  {
    if (archFeComponent == null)
    {
      archFeComponent = new EObjectContainmentEList<FrontEnd>(FrontEnd.class, this, SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_FE_COMPONENT);
    }
    return archFeComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<BackEnd> getArchBeComponent()
  {
    if (archBeComponent == null)
    {
      archBeComponent = new EObjectContainmentEList<BackEnd>(BackEnd.class, this, SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_BE_COMPONENT);
    }
    return archBeComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PersistenceDataComponent> getArchPdComponent()
  {
    if (archPdComponent == null)
    {
      archPdComponent = new EObjectContainmentEList<PersistenceDataComponent>(PersistenceDataComponent.class, this, SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_PD_COMPONENT);
    }
    return archPdComponent;
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_FE_COMPONENT:
        return ((InternalEList<?>)getArchFeComponent()).basicRemove(otherEnd, msgs);
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_BE_COMPONENT:
        return ((InternalEList<?>)getArchBeComponent()).basicRemove(otherEnd, msgs);
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_PD_COMPONENT:
        return ((InternalEList<?>)getArchPdComponent()).basicRemove(otherEnd, msgs);
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_FE_COMPONENT:
        return getArchFeComponent();
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_BE_COMPONENT:
        return getArchBeComponent();
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_PD_COMPONENT:
        return getArchPdComponent();
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_FE_COMPONENT:
        getArchFeComponent().clear();
        getArchFeComponent().addAll((Collection<? extends FrontEnd>)newValue);
        return;
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_BE_COMPONENT:
        getArchBeComponent().clear();
        getArchBeComponent().addAll((Collection<? extends BackEnd>)newValue);
        return;
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_PD_COMPONENT:
        getArchPdComponent().clear();
        getArchPdComponent().addAll((Collection<? extends PersistenceDataComponent>)newValue);
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_FE_COMPONENT:
        getArchFeComponent().clear();
        return;
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_BE_COMPONENT:
        getArchBeComponent().clear();
        return;
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_PD_COMPONENT:
        getArchPdComponent().clear();
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
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_FE_COMPONENT:
        return archFeComponent != null && !archFeComponent.isEmpty();
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_BE_COMPONENT:
        return archBeComponent != null && !archBeComponent.isEmpty();
      case SoftGalleryLanguagePackage.ARCHITECTURE_COMPONENTS__ARCH_PD_COMPONENT:
        return archPdComponent != null && !archPdComponent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArchitectureComponentsImpl