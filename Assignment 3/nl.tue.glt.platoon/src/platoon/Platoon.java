/**
 */
package platoon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platoon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.Platoon#getLV <em>LV</em>}</li>
 *   <li>{@link platoon.Platoon#getFV <em>FV</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getPlatoon()
 * @model
 * @generated
 */
public interface Platoon extends EObject {
	/**
	 * Returns the value of the '<em><b>LV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LV</em>' containment reference.
	 * @see #setLV(LeadingVehicle)
	 * @see platoon.PlatoonPackage#getPlatoon_LV()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeadingVehicle getLV();

	/**
	 * Sets the value of the '{@link platoon.Platoon#getLV <em>LV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LV</em>' containment reference.
	 * @see #getLV()
	 * @generated
	 */
	void setLV(LeadingVehicle value);

	/**
	 * Returns the value of the '<em><b>FV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FV</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FV</em>' containment reference.
	 * @see #setFV(FollowVehicle)
	 * @see platoon.PlatoonPackage#getPlatoon_FV()
	 * @model containment="true"
	 * @generated
	 */
	FollowVehicle getFV();

	/**
	 * Sets the value of the '{@link platoon.Platoon#getFV <em>FV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FV</em>' containment reference.
	 * @see #getFV()
	 * @generated
	 */
	void setFV(FollowVehicle value);

} // Platoon
