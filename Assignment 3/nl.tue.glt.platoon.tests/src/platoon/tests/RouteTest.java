/**
 */
package platoon.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import platoon.PlatoonFactory;
import platoon.Route;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RouteTest extends TestCase {

	/**
	 * The fixture for this Route test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Route fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RouteTest.class);
	}

	/**
	 * Constructs a new Route test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Route test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Route fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Route test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Route getFixture() {
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
		setFixture(PlatoonFactory.eINSTANCE.createRoute());
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

} //RouteTest
