/**
 */
package org.xtext.example.survey.survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.survey.survey.Poll#getQuestions <em>Questions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.survey.survey.SurveyPackage#getPoll()
 * @model
 * @generated
 */
public interface Poll extends EObject
{
  /**
   * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.survey.survey.Question}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questions</em>' containment reference list.
   * @see org.xtext.example.survey.survey.SurveyPackage#getPoll_Questions()
   * @model containment="true"
   * @generated
   */
  EList<Question> getQuestions();

} // Poll
