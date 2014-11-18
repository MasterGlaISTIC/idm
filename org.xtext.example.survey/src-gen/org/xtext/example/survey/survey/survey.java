/**
 */
package org.xtext.example.survey.survey;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.survey.survey.survey#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.survey.survey.SurveyPackage#getsurvey()
 * @model
 * @generated
 */
public interface survey extends EObject
{
  /**
   * Returns the value of the '<em><b>Polls</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.survey.survey.Poll}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Polls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polls</em>' containment reference list.
   * @see org.xtext.example.survey.survey.SurveyPackage#getsurvey_Polls()
   * @model containment="true"
   * @generated
   */
  EList<Poll> getPolls();

} // survey
