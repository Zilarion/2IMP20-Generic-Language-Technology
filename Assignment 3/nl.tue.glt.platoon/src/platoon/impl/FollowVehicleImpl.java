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
 *   <li>{@link platoon.impl.FollowVehicleImpl#getFollows <em>Follows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FollowVehicleImpl extends VehicleImpl implements FollowVehicle {
	/**
	 * The cached value of the '{@link #getFollows() <em>Follows</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollows()
	 * @generated
	 * @ordered
	 */
	protected Vehicle follows;
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
	public Vehicle getFollows() {
		if (follows != null && follows.eIsProxy()) {
			InternalEObject oldFollows = (InternalEObject)follows;
			follows = (Vehicle)eResolveProxy(oldFollows);
			if (follows != oldFollows) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatoonPackage.FOLLOW_VEHICLE__FOLLOWS, oldFollows, follows));
			}
		}
		return follows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetFollows() {
		return follows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollows(Vehicle newFollows) {
		Vehicle oldFollows = follows;
		follows = newFollows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.FOLLOW_VEHICLE__FOLLOWS, oldFollows, follows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.FOLLOW_VEHICLE__FOLLOWS:
				if (resolve) return getFollows();
				return basicGetFollows();
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
			case PlatoonPackage.FOLLOW_VEHICLE__FOLLOWS:
				setFollows((Vehicle)newValue);
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
			case PlatoonPackage.FOLLOW_VEHICLE__FOLLOWS:
				setFollows((Vehicle)null);
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
			case PlatoonPackage.FOLLOW_VEHICLE__FOLLOWS:
				return follows != null;
		}
		return super.eIsSet(featureID);
	}

} //FollowVehicleImpl
