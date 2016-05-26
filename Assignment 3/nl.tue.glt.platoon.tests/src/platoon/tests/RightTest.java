/**
 */
package platoon.tests;

import junit.textui.TestRunner;

import platoon.PlatoonFactory;
import platoon.Right;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RightTest extends DirectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RightTest.class);
	}

	/**
	 * Constructs a new Right test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Right test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Right getFixture() {
		return (Right)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlatoonFactory.eINSTANCE.createRight());
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

} //RightTest
