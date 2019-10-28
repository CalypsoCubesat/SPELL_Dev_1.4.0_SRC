/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel.util;

import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.IDatabaseElement;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;

import com.astra.ses.spell.dev.database.webapi.dbModel.*;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage
 * @generated
 */
public class DbModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DbModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DbModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DbModelSwitch<Adapter> modelSwitch =
		new DbModelSwitch<Adapter>() {
			@Override
			public Adapter caseWebAPIDatabase(ISpellDatabase object) {
				return createWebAPIDatabaseAdapter();
			}
			@Override
			public Adapter caseWebAPIDisplays(ITelemetryDisplayDefinition object) {
				return createWebAPIDisplaysAdapter();
			}
			@Override
			public Adapter caseWebAPITelemetryModel(ITelemetryParameter object) {
				return createWebAPITelemetryModelAdapter();
			}
			@Override
			public Adapter caseWebAPITelecommandModel(ITelecommand object) {
				return createWebAPITelecommandModelAdapter();
			}
			@Override
			public Adapter caseWebAPICalibrationModel(ICalibration object) {
				return createWebAPICalibrationModelAdapter();
			}
			@Override
			public Adapter caseWebAPITelecommandArgument(ITelecommandArgument object) {
				return createWebAPITelecommandArgumentAdapter();
			}
			@Override
			public Adapter caseDatabaseElement(IDatabaseElement object) {
				return createDatabaseElementAdapter();
			}
			@Override
			public Adapter caseStringToTMMapEntry(Map.Entry<String, ITelemetryParameter> object) {
				return createStringToTMMapEntryAdapter();
			}
			@Override
			public Adapter caseStringToTCMapEntry(Map.Entry<String, ITelecommand> object) {
				return createStringToTCMapEntryAdapter();
			}
			@Override
			public Adapter caseStringToCalMapEntry(Map.Entry<String, ICalibration> object) {
				return createStringToCalMapEntryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase <em>Web API Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase
	 * @generated
	 */
	public Adapter createWebAPIDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition <em>Web API Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition
	 * @generated
	 */
	public Adapter createWebAPIDisplaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter <em>Web API Telemetry Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter
	 * @generated
	 */
	public Adapter createWebAPITelemetryModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand <em>Web API Telecommand Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand
	 * @generated
	 */
	public Adapter createWebAPITelecommandModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration <em>Web API Calibration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration
	 * @generated
	 */
	public Adapter createWebAPICalibrationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To TM Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToTMMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To TC Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToTCMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Cal Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToCalMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement <em>Database Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.astra.ses.spell.dev.database.interfaces.IDatabaseElement
	 * @generated
	 */
	public Adapter createDatabaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument <em>Web API Telecommand Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument
	 * @generated
	 */
	public Adapter createWebAPITelecommandArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DbModelAdapterFactory
