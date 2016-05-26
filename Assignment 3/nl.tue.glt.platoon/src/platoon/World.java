/**
 */
package platoon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.World#getPlatoon <em>Platoon</em>}</li>
 *   <li>{@link platoon.World#getRoute <em>Route</em>}</li>
 *   <li>{@link platoon.World#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getWorld()
 * @model
 * @generated
 */
public interface World extends EObject {
	/**
	 * Returns the value of the '<em><b>Platoon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platoon</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platoon</em>' reference.
	 * @see #setPlatoon(Platoon)
	 * @see platoon.PlatoonPackage#getWorld_Platoon()
	 * @model required="true"
	 * @generated
	 */
	Platoon getPlatoon();

	/**
	 * Sets the value of the '{@link platoon.World#getPlatoon <em>Platoon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platoon</em>' reference.
	 * @see #getPlatoon()
	 * @generated
	 */
	void setPlatoon(Platoon value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see platoon.PlatoonPackage#getWorld_Route()
	 * @model required="true"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link platoon.World#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(Constraints)
	 * @see platoon.PlatoonPackage#getWorld_Constraint()
	 * @model
	 * @generated
	 */
	Constraints getConstraint();

	/**
	 * Sets the value of the '{@link platoon.World#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraints value);

} // World
