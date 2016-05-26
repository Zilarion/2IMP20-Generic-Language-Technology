/**
 */
package platoon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import platoon.FollowVehicle;
import platoon.PlatoonPackage;
import platoon.Vehicle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Follow Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.FollowVehicleImpl#getFrontRunner <em>Front Runner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FollowVehicleImpl extends VehicleImpl implements FollowVehicle {
	/**
	 * The cached value of the '{@link #getFrontRunner() <em>Front Runner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontRunner()
	 * @generated
	 * @ordered
	 */
	protected Vehicle frontRunner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FollowVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.FOLLOW_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getFrontRunner() {
		if (frontRunner != null && frontRunner.eIsProxy()) {
			InternalEObject oldFrontRunner = (InternalEObject)frontRunner;
			frontRunner = (Vehicle)eResolveProxy(oldFrontRunner);
			if (frontRunner != oldFrontRunner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatoonPackage.FOLLOW_VEHICLE__FRONT_RUNNER, oldFrontRunner, frontRunner));
			}
		}
		return frontRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetFrontRunner() {
		return frontRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontRunner(Vehicle newFrontRunner) {
		Vehicle oldFrontRunner = frontRunner;
		frontRunner = newFrontRunner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.FOLLOW_VEHICLE__FRONT_RUNNER, oldFrontRunner, frontRunner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.FOLLOW_VEHICLE__FRONT_RUNNER:
				if (resolve) return getFrontRunner();
				return basicGetFrontRunner();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatoonPackage.FOLLOW_VEHICLE__FRONT_RUNNER:
				setFrontRunner((Vehicle)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlatoonPackage.FOLLOW_VEHICLE__FRONT_RUNNER:
				setFrontRunner((Vehicle)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlatoonPackage.FOLLOW_VEHICLE__FRONT_RUNNER:
				return frontRunner != null;
		}
		return super.eIsSet(featureID);
	}

} //FollowVehicleImpl
