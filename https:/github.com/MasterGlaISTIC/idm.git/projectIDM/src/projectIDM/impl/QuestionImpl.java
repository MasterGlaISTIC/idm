/**
 */
package projectIDM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projectIDM.Name;
import projectIDM.Option;
import projectIDM.ProjectIDMPackage;
import projectIDM.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projectIDM.impl.QuestionImpl#isMultipleChoice <em>Multiple Choice</em>}</li>
 *   <li>{@link projectIDM.impl.QuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link projectIDM.impl.QuestionImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The default value of the '{@link #isMultipleChoice() <em>Multiple Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleChoice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_CHOICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleChoice() <em>Multiple Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleChoice()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleChoice = MULTIPLE_CHOICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectIDMPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleChoice() {
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleChoice(boolean newMultipleChoice) {
		boolean oldMultipleChoice = multipleChoice;
		multipleChoice = newMultipleChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectIDMPackage.QUESTION__MULTIPLE_CHOICE, oldMultipleChoice, multipleChoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Name)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectIDMPackage.QUESTION__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectIDMPackage.QUESTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOptions() {
		if (options == null) {
			options = new EObjectResolvingEList<Option>(Option.class, this, ProjectIDMPackage.QUESTION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectIDMPackage.QUESTION__MULTIPLE_CHOICE:
				return isMultipleChoice();
			case ProjectIDMPackage.QUESTION__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ProjectIDMPackage.QUESTION__OPTIONS:
				return getOptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjectIDMPackage.QUESTION__MULTIPLE_CHOICE:
				setMultipleChoice((Boolean)newValue);
				return;
			case ProjectIDMPackage.QUESTION__NAME:
				setName((Name)newValue);
				return;
			case ProjectIDMPackage.QUESTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Option>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjectIDMPackage.QUESTION__MULTIPLE_CHOICE:
				setMultipleChoice(MULTIPLE_CHOICE_EDEFAULT);
				return;
			case ProjectIDMPackage.QUESTION__NAME:
				setName((Name)null);
				return;
			case ProjectIDMPackage.QUESTION__OPTIONS:
				getOptions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjectIDMPackage.QUESTION__MULTIPLE_CHOICE:
				return multipleChoice != MULTIPLE_CHOICE_EDEFAULT;
			case ProjectIDMPackage.QUESTION__NAME:
				return name != null;
			case ProjectIDMPackage.QUESTION__OPTIONS:
				return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (multipleChoice: ");
		result.append(multipleChoice);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
