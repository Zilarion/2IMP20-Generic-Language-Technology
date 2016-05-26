/**
 */
package platoon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Follow Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.FollowVehicle#getFrontRunner <em>Front Runner</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getFollowVehicle()
 * @model
 * @generated
 */
public interface FollowVehicle extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Front Runner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Runner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Runner</em>' reference.
	 * @see #setFrontRunner(Vehicle)
	 * @see platoon.PlatoonPackage#getFollowVehicle_FrontRunner()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getFrontRunner();

	/**
	 * Sets the value of the '{@link platoon.FollowVehicle#getFrontRunner <em>Front Runner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Runner</em>' reference.
	 * @see #getFrontRunner()
	 * @generated
	 */
	void setFrontRunner(Vehicle value);

} // FollowVehicle
