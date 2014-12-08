/**
 */
package projectIDM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projectIDM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectIDMFactoryImpl extends EFactoryImpl implements ProjectIDMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectIDMFactory init() {
		try {
			ProjectIDMFactory theProjectIDMFactory = (ProjectIDMFactory)EPackage.Registry.INSTANCE.getEFactory(ProjectIDMPackage.eNS_URI);
			if (theProjectIDMFactory != null) {
				return theProjectIDMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjectIDMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectIDMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProjectIDMPackage.POLL_SYSTEM: return createPollSystem();
			case ProjectIDMPackage.POLL: return createPoll();
			case ProjectIDMPackage.QUESTION: return createQuestion();
			case ProjectIDMPackage.NAME: return createName();
			case ProjectIDMPackage.OPTION: return createOption();
			case ProjectIDMPackage.TEXT_BOX: return createTextBox();
			case ProjectIDMPackage.CHECK_BOX: return createCheckBox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSystem createPollSystem() {
		PollSystemImpl pollSystem = new PollSystemImpl();
		return pollSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poll createPoll() {
		PollImpl poll = new PollImpl();
		return poll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBox createTextBox() {
		TextBoxImpl textBox = new TextBoxImpl();
		return textBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectIDMPackage getProjectIDMPackage() {
		return (ProjectIDMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjectIDMPackage getPackage() {
		return ProjectIDMPackage.eINSTANCE;
	}

} //ProjectIDMFactoryImpl
