/**
 */
package sensorproject.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>sensorproject</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorprojectTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SensorprojectTests("sensorproject Tests");
		suite.addTestSuite(SensorTest.class);
		suite.addTestSuite(FilterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorprojectTests(String name) {
		super(name);
	}

} //SensorprojectTests
