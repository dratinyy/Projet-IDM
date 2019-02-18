/**
 */
package sensorproject.tests;

import junit.textui.TestRunner;

import sensorproject.Filter;
import sensorproject.SensorprojectFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link sensorproject.Filter#getValue() <em>Get Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FilterTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FilterTest.class);
	}

	/**
	 * Constructs a new Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Filter getFixture() {
		return (Filter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SensorprojectFactory.eINSTANCE.createFilter());
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

	/**
	 * Tests the '{@link sensorproject.Filter#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sensorproject.Filter#getValue()
	 * @generated
	 */
	public void testGetValue_2() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //FilterTest
