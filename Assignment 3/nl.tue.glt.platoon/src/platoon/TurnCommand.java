/**
 */
package platoon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link platoon.TurnCommand#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see platoon.PlatoonPackage#getTurnCommand()
 * @model
 * @generated
 */
public interface TurnCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' reference.
	 * @see #setDirection(Direction)
	 * @see platoon.PlatoonPackage#getTurnCommand_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link platoon.TurnCommand#getDirection <em>Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // TurnCommand
