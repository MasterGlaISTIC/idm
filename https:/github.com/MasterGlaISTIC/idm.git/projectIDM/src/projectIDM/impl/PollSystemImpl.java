/**
 */
package projectIDM.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projectIDM.Poll;
import projectIDM.PollSystem;
import projectIDM.ProjectIDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link projectIDM.impl.PollSystemImpl#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollSystemImpl extends MinimalEObjectImpl.Container implements PollSystem {
	/**
	 * The cached value of the '{@link #getPolls() <em>Polls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolls()
	 * @generated
	 * @ordered
	 */
	protected EList<Poll> polls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectIDMPackage.Literals.POLL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Poll> getPolls() {
		if (polls == null) {
			polls = new EObjectResolvingEList<Poll>(Poll.class, this, ProjectIDMPackage.POLL_SYSTEM__POLLS);
		}
		return polls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectIDMPackage.POLL_SYSTEM__POLLS:
				return getPolls();
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
			case ProjectIDMPackage.POLL_SYSTEM__POLLS:
				getPolls().clear();
				getPolls().addAll((Collection<? extends Poll>)newValue);
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
			case ProjectIDMPackage.POLL_SYSTEM__POLLS:
				getPolls().clear();
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
			case ProjectIDMPackage.POLL_SYSTEM__POLLS:
				return polls != null && !polls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PollSystemImpl
