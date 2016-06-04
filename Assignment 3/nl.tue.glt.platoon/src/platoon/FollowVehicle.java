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
 *   <li>{@link platoon.FollowVehicle#getFollows <em>Follows</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getFollowVehicle()
 * @model
 * @generated
 */
public interface FollowVehicle extends Vehicle {
	/**
	 * Returns the value of the '<em><b>Follows</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Follows</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows</em>' reference.
	 * @see #setFollows(Vehicle)
	 * @see platoon.PlatoonPackage#getFollowVehicle_Follows()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getFollows();

	/**
	 * Sets the value of the '{@link platoon.FollowVehicle#getFollows <em>Follows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follows</em>' reference.
	 * @see #getFollows()
	 * @generated
	 */
	void setFollows(Vehicle value);

} // FollowVehicle
