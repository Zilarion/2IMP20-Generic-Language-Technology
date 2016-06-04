/**
 */
package platoon.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import platoon.FollowVehicle;
import platoon.LeadingVehicle;
import platoon.Platoon;
import platoon.PlatoonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platoon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link platoon.impl.PlatoonImpl#getLV <em>LV</em>}</li>
 *   <li>{@link platoon.impl.PlatoonImpl#getFV <em>FV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatoonImpl extends MinimalEObjectImpl.Container implements Platoon {
	/**
	 * The cached value of the '{@link #getLV() <em>LV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLV()
	 * @generated
	 * @ordered
	 */
	protected LeadingVehicle lv;

	/**
	 * The cached value of the '{@link #getFV() <em>FV</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFV()
	 * @generated
	 * @ordered
	 */
	protected EList<FollowVehicle> fv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatoonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatoonPackage.Literals.PLATOON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadingVehicle getLV() {
		return lv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLV(LeadingVehicle newLV, NotificationChain msgs) {
		LeadingVehicle oldLV = lv;
		lv = newLV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlatoonPackage.PLATOON__LV, oldLV, newLV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLV(LeadingVehicle newLV) {
		if (newLV != lv) {
			NotificationChain msgs = null;
			if (lv != null)
				msgs = ((InternalEObject)lv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.PLATOON__LV, null, msgs);
			if (newLV != null)
				msgs = ((InternalEObject)newLV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlatoonPackage.PLATOON__LV, null, msgs);
			msgs = basicSetLV(newLV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatoonPackage.PLATOON__LV, newLV, newLV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FollowVehicle> getFV() {
		if (fv == null) {
			fv = new EObjectContainmentEList<FollowVehicle>(FollowVehicle.class, this, PlatoonPackage.PLATOON__FV);
		}
		return fv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatoonPackage.PLATOON__LV:
				return basicSetLV(null, msgs);
			case PlatoonPackage.PLATOON__FV:
				return ((InternalEList<?>)getFV()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatoonPackage.PLATOON__LV:
				return getLV();
			case PlatoonPackage.PLATOON__FV:
				return getFV();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlatoonPackage.PLATOON__LV:
				setLV((LeadingVehicle)newValue);
				return;
			case PlatoonPackage.PLATOON__FV:
				getFV().clear();
				getFV().addAll((Collection<? extends FollowVehicle>)newValue);
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
			case PlatoonPackage.PLATOON__LV:
				setLV((LeadingVehicle)null);
				return;
			case PlatoonPackage.PLATOON__FV:
				getFV().clear();
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
			case PlatoonPackage.PLATOON__LV:
				return lv != null;
			case PlatoonPackage.PLATOON__FV:
				return fv != null && !fv.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatoonImpl
