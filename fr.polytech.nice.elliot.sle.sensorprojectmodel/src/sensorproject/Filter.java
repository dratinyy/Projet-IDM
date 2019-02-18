/**
 */
package sensorproject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sensorproject.Filter#getPreviousNodes <em>Previous Nodes</em>}</li>
 * </ul>
 *
 * @see sensorproject.SensorprojectPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends Node {
	/**
	 * Returns the value of the '<em><b>Previous Nodes</b></em>' reference list.
	 * The list contents are of type {@link sensorproject.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Nodes</em>' reference list.
	 * @see sensorproject.SensorprojectPackage#getFilter_PreviousNodes()
	 * @model required="true"
	 * @generated
	 */
	EList<Node> getPreviousNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getValue();

} // Filter
