/**
 */
package projectIDM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see projectIDM.ProjectIDMPackage
 * @generated
 */
public interface ProjectIDMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectIDMFactory eINSTANCE = projectIDM.impl.ProjectIDMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Poll System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll System</em>'.
	 * @generated
	 */
	PollSystem createPollSystem();

	/**
	 * Returns a new object of class '<em>Poll</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poll</em>'.
	 * @generated
	 */
	Poll createPoll();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name</em>'.
	 * @generated
	 */
	Name createName();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Text Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Box</em>'.
	 * @generated
	 */
	TextBox createTextBox();

	/**
	 * Returns a new object of class '<em>Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Box</em>'.
	 * @generated
	 */
	CheckBox createCheckBox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProjectIDMPackage getProjectIDMPackage();

} //ProjectIDMFactory
