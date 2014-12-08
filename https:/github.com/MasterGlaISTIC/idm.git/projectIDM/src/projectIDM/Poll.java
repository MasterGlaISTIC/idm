/**
 */
package projectIDM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projectIDM.Poll#getName <em>Name</em>}</li>
 *   <li>{@link projectIDM.Poll#getQuestions <em>Questions</em>}</li>
 * </ul>
 * </p>
 *
 * @see projectIDM.ProjectIDMPackage#getPoll()
 * @model
 * @generated
 */
public interface Poll extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Name)
	 * @see projectIDM.ProjectIDMPackage#getPoll_Name()
	 * @model
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link projectIDM.Poll#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' reference.
	 * @see #setQuestions(Question)
	 * @see projectIDM.ProjectIDMPackage#getPoll_Questions()
	 * @model
	 * @generated
	 */
	Question getQuestions();

	/**
	 * Sets the value of the '{@link projectIDM.Poll#getQuestions <em>Questions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questions</em>' reference.
	 * @see #getQuestions()
	 * @generated
	 */
	void setQuestions(Question value);

} // Poll
