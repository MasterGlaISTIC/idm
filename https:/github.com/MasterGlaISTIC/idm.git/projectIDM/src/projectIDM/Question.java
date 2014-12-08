/**
 */
package projectIDM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projectIDM.Question#isMultipleChoice <em>Multiple Choice</em>}</li>
 *   <li>{@link projectIDM.Question#getName <em>Name</em>}</li>
 *   <li>{@link projectIDM.Question#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see projectIDM.ProjectIDMPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiple Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Choice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Choice</em>' attribute.
	 * @see #setMultipleChoice(boolean)
	 * @see projectIDM.ProjectIDMPackage#getQuestion_MultipleChoice()
	 * @model
	 * @generated
	 */
	boolean isMultipleChoice();

	/**
	 * Sets the value of the '{@link projectIDM.Question#isMultipleChoice <em>Multiple Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Choice</em>' attribute.
	 * @see #isMultipleChoice()
	 * @generated
	 */
	void setMultipleChoice(boolean value);

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
	 * @see projectIDM.ProjectIDMPackage#getQuestion_Name()
	 * @model
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link projectIDM.Question#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference list.
	 * The list contents are of type {@link projectIDM.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference list.
	 * @see projectIDM.ProjectIDMPackage#getQuestion_Options()
	 * @model required="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // Question
