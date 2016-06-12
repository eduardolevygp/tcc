/**
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.acedsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lista Cursos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ace.acedsl.acedsl.ListaCursos#getCurso <em>Curso</em>}</li>
 * </ul>
 *
 * @see org.xtext.ace.acedsl.acedsl.AcedslPackage#getListaCursos()
 * @model
 * @generated
 */
public interface ListaCursos extends SeparacaoDisciplinas, OrganizacaoDepartamento
{
  /**
   * Returns the value of the '<em><b>Curso</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ace.acedsl.acedsl.Curso}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Curso</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Curso</em>' containment reference list.
   * @see org.xtext.ace.acedsl.acedsl.AcedslPackage#getListaCursos_Curso()
   * @model containment="true"
   * @generated
   */
  EList<Curso> getCurso();

} // ListaCursos
