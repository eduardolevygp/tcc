/**
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.acedsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departamento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.Departamento#getNome <em>Nome</em>}</li>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.Departamento#getOrganizacaoDepartamento <em>Organizacao Departamento</em>}</li>
 * </ul>
 *
 * @see org.xtext.ace.acedsl.acedsl.AcedslPackage#getDepartamento()
 * @model
 * @generated
 */
public interface Departamento extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see org.xtext.ace.acedsl.acedsl.AcedslPackage#getDepartamento_Nome()
   * @model
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link org.xtext.ace.acedsl.acedsl.Departamento#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Organizacao Departamento</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organizacao Departamento</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organizacao Departamento</em>' containment reference.
   * @see #setOrganizacaoDepartamento(OrganizacaoDepartamento)
   * @see org.xtext.ace.acedsl.acedsl.AcedslPackage#getDepartamento_OrganizacaoDepartamento()
   * @model containment="true"
   * @generated
   */
  OrganizacaoDepartamento getOrganizacaoDepartamento();

  /**
   * Sets the value of the '{@link org.xtext.ace.acedsl.acedsl.Departamento#getOrganizacaoDepartamento <em>Organizacao Departamento</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organizacao Departamento</em>' containment reference.
   * @see #getOrganizacaoDepartamento()
   * @generated
   */
  void setOrganizacaoDepartamento(OrganizacaoDepartamento value);

} // Departamento
