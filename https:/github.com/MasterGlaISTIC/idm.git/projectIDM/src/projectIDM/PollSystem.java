/**
 */
package projectIDM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link projectIDM.PollSystem#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @see projectIDM.ProjectIDMPackage#getPollSystem()
 * @model
 * @generated
 */
public interface PollSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Polls</b></em>' reference list.
	 * The list contents are of type {@link projectIDM.Poll}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polls</em>' reference list.
	 * @see projectIDM.ProjectIDMPackage#getPollSystem_Polls()
	 * @model
	 * @generated
	 */
	EList<Poll> getPolls();

} // PollSystem
