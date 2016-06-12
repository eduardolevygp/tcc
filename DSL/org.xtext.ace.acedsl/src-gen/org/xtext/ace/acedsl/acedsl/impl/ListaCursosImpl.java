/**
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.acedsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ace.acedsl.acedsl.AcedslPackage;
import org.xtext.ace.acedsl.acedsl.Curso;
import org.xtext.ace.acedsl.acedsl.ListaCursos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lista Cursos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.impl.ListaCursosImpl#getCurso <em>Curso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListaCursosImpl extends SeparacaoDisciplinasImpl implements ListaCursos
{
  /**
   * The cached value of the '{@link #getCurso() <em>Curso</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurso()
   * @generated
   * @ordered
   */
  protected EList<Curso> curso;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListaCursosImpl()
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
    return AcedslPackage.Literals.LISTA_CURSOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Curso> getCurso()
  {
    if (curso == null)
    {
      curso = new EObjectContainmentEList<Curso>(Curso.class, this, AcedslPackage.LISTA_CURSOS__CURSO);
    }
    return curso;
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
      case AcedslPackage.LISTA_CURSOS__CURSO:
        return ((InternalEList<?>)getCurso()).basicRemove(otherEnd, msgs);
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
      case AcedslPackage.LISTA_CURSOS__CURSO:
        return getCurso();
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
      case AcedslPackage.LISTA_CURSOS__CURSO:
        getCurso().clear();
        getCurso().addAll((Collection<? extends Curso>)newValue);
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
      case AcedslPackage.LISTA_CURSOS__CURSO:
        getCurso().clear();
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
      case AcedslPackage.LISTA_CURSOS__CURSO:
        return curso != null && !curso.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ListaCursosImpl
