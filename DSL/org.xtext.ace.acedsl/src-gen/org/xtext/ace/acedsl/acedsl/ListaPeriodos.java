/**
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.acedsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lista Periodos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.ListaPeriodos#getPeriodo <em>Periodo</em>}</li>
 * </ul>
 *
 * @see org.xtext.ace.acedsl.acedsl.AcedslPackage#getListaPeriodos()
 * @model
 * @generated
 */
public interface ListaPeriodos extends SeparacaoDisciplinas, OrganizacaoCurso, OrganizacaoDepartamento
{
  /**
   * Returns the value of the '<em><b>Periodo</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ace.acedsl.acedsl.Periodo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Periodo</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Periodo</em>' containment reference list.
   * @see org.xtext.ace.acedsl.acedsl.AcedslPackage#getListaPeriodos_Periodo()
   * @model containment="true"
   * @generated
   */
  EList<Periodo> getPeriodo();

} // ListaPeriodos
