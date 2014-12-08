/**
 */
package projectIDM.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import projectIDM.Poll;
import projectIDM.ProjectIDMFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PollTest extends TestCase {

	/**
	 * The fixture for this Poll test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Poll fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PollTest.class);
	}

	/**
	 * Constructs a new Poll test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Poll test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Poll fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Poll test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Poll getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProjectIDMFactory.eINSTANCE.createPoll());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PollTest
