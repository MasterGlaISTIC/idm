/**
 */
package projectIDM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projectIDM.Name;
import projectIDM.Poll;
import projectIDM.ProjectIDMPackage;
import projectIDM.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projectIDM.impl.PollImpl#getName <em>Name</em>}</li>
 *   <li>{@link projectIDM.impl.PollImpl#getQuestions <em>Questions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollImpl extends MinimalEObjectImpl.Container implements Poll {
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
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected Question questions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectIDMPackage.Literals.POLL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectIDMPackage.POLL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectIDMPackage.POLL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQuestions() {
		if (questions != null && questions.eIsProxy()) {
			InternalEObject oldQuestions = (InternalEObject)questions;
			questions = (Question)eResolveProxy(oldQuestions);
			if (questions != oldQuestions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProjectIDMPackage.POLL__QUESTIONS, oldQuestions, questions));
			}
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetQuestions() {
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestions(Question newQuestions) {
		Question oldQuestions = questions;
		questions = newQuestions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectIDMPackage.POLL__QUESTIONS, oldQuestions, questions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectIDMPackage.POLL__NAME:
				if (resolve) return getName();
				return basicGetName();
			case ProjectIDMPackage.POLL__QUESTIONS:
				if (resolve) return getQuestions();
				return basicGetQuestions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjectIDMPackage.POLL__NAME:
				setName((Name)newValue);
				return;
			case ProjectIDMPackage.POLL__QUESTIONS:
				setQuestions((Question)newValue);
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
			case ProjectIDMPackage.POLL__NAME:
				setName((Name)null);
				return;
			case ProjectIDMPackage.POLL__QUESTIONS:
				setQuestions((Question)null);
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
			case ProjectIDMPackage.POLL__NAME:
				return name != null;
			case ProjectIDMPackage.POLL__QUESTIONS:
				return questions != null;
		}
		return super.eIsSet(featureID);
	}

} //PollImpl
