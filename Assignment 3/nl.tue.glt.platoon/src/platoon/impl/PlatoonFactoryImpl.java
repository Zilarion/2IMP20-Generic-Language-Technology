/**
 */
package platoon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import platoon.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlatoonFactoryImpl extends EFactoryImpl implements PlatoonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlatoonFactory init() {
		try {
			PlatoonFactory thePlatoonFactory = (PlatoonFactory)EPackage.Registry.INSTANCE.getEFactory(PlatoonPackage.eNS_URI);
			if (thePlatoonFactory != null) {
				return thePlatoonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlatoonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatoonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlatoonPackage.PLATOON: return createPlatoon();
			case PlatoonPackage.ROUTE: return createRoute();
			case PlatoonPackage.FOLLOW_VEHICLE: return createFollowVehicle();
			case PlatoonPackage.LEADING_VEHICLE: return createLeadingVehicle();
			case PlatoonPackage.COMMAND: return createCommand();
			case PlatoonPackage.FORWARD_COMMAND: return createForwardCommand();
			case PlatoonPackage.TURN_COMMAND: return createTurnCommand();
			case PlatoonPackage.HEADWAY_CONSTRAINT: return createHeadwayConstraint();
			case PlatoonPackage.CONSTRAINT: return createConstraint();
			case PlatoonPackage.WORLD: return createWorld();
			case PlatoonPackage.CONSTRAINTS: return createConstraints();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platoon createPlatoon() {
		PlatoonImpl platoon = new PlatoonImpl();
		return platoon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FollowVehicle createFollowVehicle() {
		FollowVehicleImpl followVehicle = new FollowVehicleImpl();
		return followVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadingVehicle createLeadingVehicle() {
		LeadingVehicleImpl leadingVehicle = new LeadingVehicleImpl();
		return leadingVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardCommand createForwardCommand() {
		ForwardCommandImpl forwardCommand = new ForwardCommandImpl();
		return forwardCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnCommand createTurnCommand() {
		TurnCommandImpl turnCommand = new TurnCommandImpl();
		return turnCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadwayConstraint createHeadwayConstraint() {
		HeadwayConstraintImpl headwayConstraint = new HeadwayConstraintImpl();
		return headwayConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public World createWorld() {
		WorldImpl world = new WorldImpl();
		return world;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraints createConstraints() {
		ConstraintsImpl constraints = new ConstraintsImpl();
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatoonPackage getPlatoonPackage() {
		return (PlatoonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlatoonPackage getPackage() {
		return PlatoonPackage.eINSTANCE;
	}

} //PlatoonFactoryImpl
