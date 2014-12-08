/**
 */
package projectIDM;

import org.eclipse.emf.ecore.EAttribute;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projectIDM.ProjectIDMFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectIDMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projectIDM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projectIDM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projectIDM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectIDMPackage eINSTANCE = projectIDM.impl.ProjectIDMPackageImpl.init();

	/**
	 * The meta object id for the '{@link projectIDM.impl.PollSystemImpl <em>Poll System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectIDM.impl.PollSystemImpl
	 * @see projectIDM.impl.ProjectIDMPackageImpl#getPollSystem()
	 * @generated
	 */
	int POLL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Polls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SYSTEM__POLLS = 0;

	/**
	 * The number of structural features of the '<em>Poll System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Poll System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectIDM.impl.PollImpl <em>Poll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectIDM.impl.PollImpl
	 * @see projectIDM.impl.ProjectIDMPackageImpl#getPoll()
	 * @generated
	 */
	int POLL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL__QUESTIONS = 1;

	/**
	 * The number of structural features of the '<em>Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Poll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectIDM.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectIDM.impl.QuestionImpl
	 * @see projectIDM.impl.ProjectIDMPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Multiple Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__MULTIPLE_CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectIDM.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectIDM.impl.NameImpl
	 * @see projectIDM.impl.ProjectIDMPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 3;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectIDM.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectIDM.impl.OptionImpl
	 * @see projectIDM.impl.ProjectIDMPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectIDM.impl.TextBoxImpl <em>Text Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectIDM.impl.TextBoxImpl
	 * @see projectIDM.impl.ProjectIDMPackageImpl#getTextBox()
	 * @generated
	 */
	int TEXT_BOX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX__NAME = OPTION__NAME;

	/**
	 * The number of structural features of the '<em>Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_BOX_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectIDM.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectIDM.impl.CheckBoxImpl
	 * @see projectIDM.impl.ProjectIDMPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = OPTION__NAME;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link projectIDM.PollSystem <em>Poll System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll System</em>'.
	 * @see projectIDM.PollSystem
	 * @generated
	 */
	EClass getPollSystem();

	/**
	 * Returns the meta object for the reference list '{@link projectIDM.PollSystem#getPolls <em>Polls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Polls</em>'.
	 * @see projectIDM.PollSystem#getPolls()
	 * @see #getPollSystem()
	 * @generated
	 */
	EReference getPollSystem_Polls();

	/**
	 * Returns the meta object for class '{@link projectIDM.Poll <em>Poll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll</em>'.
	 * @see projectIDM.Poll
	 * @generated
	 */
	EClass getPoll();

	/**
	 * Returns the meta object for the reference '{@link projectIDM.Poll#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see projectIDM.Poll#getName()
	 * @see #getPoll()
	 * @generated
	 */
	EReference getPoll_Name();

	/**
	 * Returns the meta object for the reference '{@link projectIDM.Poll#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Questions</em>'.
	 * @see projectIDM.Poll#getQuestions()
	 * @see #getPoll()
	 * @generated
	 */
	EReference getPoll_Questions();

	/**
	 * Returns the meta object for class '{@link projectIDM.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see projectIDM.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link projectIDM.Question#isMultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Choice</em>'.
	 * @see projectIDM.Question#isMultipleChoice()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_MultipleChoice();

	/**
	 * Returns the meta object for the reference '{@link projectIDM.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see projectIDM.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Name();

	/**
	 * Returns the meta object for the reference list '{@link projectIDM.Question#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see projectIDM.Question#getOptions()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Options();

	/**
	 * Returns the meta object for class '{@link projectIDM.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see projectIDM.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for class '{@link projectIDM.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see projectIDM.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the reference '{@link projectIDM.Option#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name</em>'.
	 * @see projectIDM.Option#getName()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Name();

	/**
	 * Returns the meta object for class '{@link projectIDM.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Box</em>'.
	 * @see projectIDM.TextBox
	 * @generated
	 */
	EClass getTextBox();

	/**
	 * Returns the meta object for class '{@link projectIDM.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see projectIDM.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectIDMFactory getProjectIDMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projectIDM.impl.PollSystemImpl <em>Poll System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectIDM.impl.PollSystemImpl
		 * @see projectIDM.impl.ProjectIDMPackageImpl#getPollSystem()
		 * @generated
		 */
		EClass POLL_SYSTEM = eINSTANCE.getPollSystem();

		/**
		 * The meta object literal for the '<em><b>Polls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_SYSTEM__POLLS = eINSTANCE.getPollSystem_Polls();

		/**
		 * The meta object literal for the '{@link projectIDM.impl.PollImpl <em>Poll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectIDM.impl.PollImpl
		 * @see projectIDM.impl.ProjectIDMPackageImpl#getPoll()
		 * @generated
		 */
		EClass POLL = eINSTANCE.getPoll();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL__NAME = eINSTANCE.getPoll_Name();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL__QUESTIONS = eINSTANCE.getPoll_Questions();

		/**
		 * The meta object literal for the '{@link projectIDM.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectIDM.impl.QuestionImpl
		 * @see projectIDM.impl.ProjectIDMPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Multiple Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__MULTIPLE_CHOICE = eINSTANCE.getQuestion_MultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__NAME = eINSTANCE.getQuestion_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__OPTIONS = eINSTANCE.getQuestion_Options();

		/**
		 * The meta object literal for the '{@link projectIDM.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectIDM.impl.NameImpl
		 * @see projectIDM.impl.ProjectIDMPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '{@link projectIDM.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectIDM.impl.OptionImpl
		 * @see projectIDM.impl.ProjectIDMPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__NAME = eINSTANCE.getOption_Name();

		/**
		 * The meta object literal for the '{@link projectIDM.impl.TextBoxImpl <em>Text Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectIDM.impl.TextBoxImpl
		 * @see projectIDM.impl.ProjectIDMPackageImpl#getTextBox()
		 * @generated
		 */
		EClass TEXT_BOX = eINSTANCE.getTextBox();

		/**
		 * The meta object literal for the '{@link projectIDM.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectIDM.impl.CheckBoxImpl
		 * @see projectIDM.impl.ProjectIDMPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

	}

} //ProjectIDMPackage
