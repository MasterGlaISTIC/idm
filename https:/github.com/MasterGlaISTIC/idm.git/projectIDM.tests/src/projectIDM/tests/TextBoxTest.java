/**
 */
package projectIDM.tests;

import junit.textui.TestRunner;

import projectIDM.ProjectIDMFactory;
import projectIDM.TextBox;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Box</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextBoxTest extends OptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextBoxTest.class);
	}

	/**
	 * Constructs a new Text Box test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextBoxTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Box test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextBox getFixture() {
		return (TextBox)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProjectIDMFactory.eINSTANCE.createTextBox());
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

} //TextBoxTest
