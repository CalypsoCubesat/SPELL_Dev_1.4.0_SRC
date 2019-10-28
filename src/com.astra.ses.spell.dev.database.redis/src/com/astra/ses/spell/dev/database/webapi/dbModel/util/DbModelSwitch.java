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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage
 * @generated
 */
public class DbModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DbModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbModelSwitch() {
		if (modelPackage == null) {
			modelPackage = DbModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DbModelPackage.WEB_API_DATABASE: {
				ISpellDatabase webAPIDatabase = (ISpellDatabase)theEObject;
				T result = caseWebAPIDatabase(webAPIDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.WEB_API_DISPLAYS: {
				ITelemetryDisplayDefinition webAPIDisplays = (ITelemetryDisplayDefinition)theEObject;
				T result = caseWebAPIDisplays(webAPIDisplays);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.WEB_API_TELEMETRY_MODEL: {
				ITelemetryParameter webAPITelemetryModel = (ITelemetryParameter)theEObject;
				T result = caseWebAPITelemetryModel(webAPITelemetryModel);
				if (result == null) result = caseDatabaseElement(webAPITelemetryModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL: {
				ITelecommand webAPITelecommandModel = (ITelecommand)theEObject;
				T result = caseWebAPITelecommandModel(webAPITelecommandModel);
				if (result == null) result = caseDatabaseElement(webAPITelecommandModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.WEB_API_CALIBRATION_MODEL: {
				ICalibration webAPICalibrationModel = (ICalibration)theEObject;
				T result = caseWebAPICalibrationModel(webAPICalibrationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT: {
				ITelecommandArgument webAPITelecommandArgument = (ITelecommandArgument)theEObject;
				T result = caseWebAPITelecommandArgument(webAPITelecommandArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.DATABASE_ELEMENT: {
				IDatabaseElement databaseElement = (IDatabaseElement)theEObject;
				T result = caseDatabaseElement(databaseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.STRING_TO_TM_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, ITelemetryParameter> stringToTMMapEntry = (Map.Entry<String, ITelemetryParameter>)theEObject;
				T result = caseStringToTMMapEntry(stringToTMMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.STRING_TO_TC_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, ITelecommand> stringToTCMapEntry = (Map.Entry<String, ITelecommand>)theEObject;
				T result = caseStringToTCMapEntry(stringToTCMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DbModelPackage.STRING_TO_CAL_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, ICalibration> stringToCalMapEntry = (Map.Entry<String, ICalibration>)theEObject;
				T result = caseStringToCalMapEntry(stringToCalMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web API Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web API Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAPIDatabase(ISpellDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web API Displays</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web API Displays</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAPIDisplays(ITelemetryDisplayDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web API Telemetry Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web API Telemetry Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAPITelemetryModel(ITelemetryParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web API Telecommand Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web API Telecommand Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAPITelecommandModel(ITelecommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web API Calibration Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web API Calibration Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAPICalibrationModel(ICalibration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web API Telecommand Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web API Telecommand Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAPITelecommandArgument(ITelecommandArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To TM Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To TM Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToTMMapEntry(Map.Entry<String, ITelemetryParameter> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To TC Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To TC Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToTCMapEntry(Map.Entry<String, ITelecommand> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Cal Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Cal Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToCalMapEntry(Map.Entry<String, ICalibration> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseElement(IDatabaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DbModelSwitch
