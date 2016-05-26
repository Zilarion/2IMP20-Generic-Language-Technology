/**
 */
package platoon.tests;

import junit.textui.TestRunner;

import platoon.PlatoonFactory;
import platoon.TurnCommand;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Turn Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurnCommandTest extends CommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TurnCommandTest.class);
	}

	/**
	 * Constructs a new Turn Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnCommandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Turn Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TurnCommand getFixture() {
		return (TurnCommand)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createTurnCommand());
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

} //TurnCommandTest
