/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel;

import com.astra.ses.spell.dev.database.interfaces.ArgumentType;
import com.astra.ses.spell.dev.database.interfaces.CalibrationType;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.IDatabaseElement;
import com.astra.ses.spell.dev.database.interfaces.IMonitoringCheck;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;
import com.astra.ses.spell.dev.database.interfaces.Radix;
import com.astra.ses.spell.dev.database.webapi.DatabaseConnection;
import java.io.DataOutputStream;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.json.JsonArray;
import javax.json.JsonObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage
 * @generated
 */
public class DbModelFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DbModelFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbModelFactory init() {
		try {
			DbModelFactory theDbModelFactory = (DbModelFactory)EPackage.Registry.INSTANCE.getEFactory(DbModelPackage.eNS_URI);
			if (theDbModelFactory != null) {
				return theDbModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DbModelFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbModelFactory() {
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
			case DbModelPackage.WEB_API_DATABASE: return (EObject)createWebAPIDatabase();
			case DbModelPackage.WEB_API_TELEMETRY_MODEL: return (EObject)createWebAPITelemetryModel();
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL: return (EObject)createWebAPITelecommandModel();
			case DbModelPackage.WEB_API_CALIBRATION_MODEL: return (EObject)createWebAPICalibrationModel();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT: return (EObject)createWebAPITelecommandArgument();
			case DbModelPackage.DATABASE_ELEMENT: return (EObject)createDatabaseElement();
			case DbModelPackage.STRING_TO_TM_MAP_ENTRY: return (EObject)createStringToTMMapEntry();
			case DbModelPackage.STRING_TO_TC_MAP_ENTRY: return (EObject)createStringToTCMapEntry();
			case DbModelPackage.STRING_TO_CAL_MAP_ENTRY: return (EObject)createStringToCalMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DbModelPackage.ECOLLECTION:
				return createECollectionFromString(eDataType, initialValue);
			case DbModelPackage.DATABASE_CONNECTION:
				return createDatabaseConnectionFromString(eDataType, initialValue);
			case DbModelPackage.ARGUMENT_TYPE:
				return createArgumentTypeFromString(eDataType, initialValue);
			case DbModelPackage.MONITORING_CHECK:
				return createMonitoringCheckFromString(eDataType, initialValue);
			case DbModelPackage.RADIX:
				return createRadixFromString(eDataType, initialValue);
			case DbModelPackage.DATA_OUTPUT_STREAM:
				return createDataOutputStreamFromString(eDataType, initialValue);
			case DbModelPackage.VALID_VALUE_SET:
				return createValidValueSetFromString(eDataType, initialValue);
			case DbModelPackage.CALIBRATION_TYPE:
				return createCalibrationTypeFromString(eDataType, initialValue);
			case DbModelPackage.JSON_OBJECT:
				return createJsonObjectFromString(eDataType, initialValue);
			case DbModelPackage.JSON_ARRAY:
				return createJsonArrayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DbModelPackage.ECOLLECTION:
				return convertECollectionToString(eDataType, instanceValue);
			case DbModelPackage.DATABASE_CONNECTION:
				return convertDatabaseConnectionToString(eDataType, instanceValue);
			case DbModelPackage.ARGUMENT_TYPE:
				return convertArgumentTypeToString(eDataType, instanceValue);
			case DbModelPackage.MONITORING_CHECK:
				return convertMonitoringCheckToString(eDataType, instanceValue);
			case DbModelPackage.RADIX:
				return convertRadixToString(eDataType, instanceValue);
			case DbModelPackage.DATA_OUTPUT_STREAM:
				return convertDataOutputStreamToString(eDataType, instanceValue);
			case DbModelPackage.VALID_VALUE_SET:
				return convertValidValueSetToString(eDataType, instanceValue);
			case DbModelPackage.CALIBRATION_TYPE:
				return convertCalibrationTypeToString(eDataType, instanceValue);
			case DbModelPackage.JSON_OBJECT:
				return convertJsonObjectToString(eDataType, instanceValue);
			case DbModelPackage.JSON_ARRAY:
				return convertJsonArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISpellDatabase createWebAPIDatabase() {
		WebAPIDatabase webAPIDatabase = new WebAPIDatabase();
		return webAPIDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ITelemetryParameter createWebAPITelemetryModel() {
		WebAPITelemetryModel webAPITelemetryModel = new WebAPITelemetryModel(null);
		return webAPITelemetryModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ITelecommand createWebAPITelecommandModel() {
		WebAPITelecommandModel webAPITelecommandModel = new WebAPITelecommandModel(null);
		return webAPITelecommandModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICalibration createWebAPICalibrationModel() {
		WebAPICalibrationModel webAPICalibrationModel = new WebAPICalibrationModel();
		return webAPICalibrationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITelecommandArgument createWebAPITelecommandArgument() {
		WebAPITelecommandArgument webAPITelecommandArgument = new WebAPITelecommandArgument();
		return webAPITelecommandArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ITelemetryParameter> createStringToTMMapEntry() {
		StringToTMMapEntry stringToTMMapEntry = new StringToTMMapEntry();
		return stringToTMMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ITelecommand> createStringToTCMapEntry() {
		StringToTCMapEntry stringToTCMapEntry = new StringToTCMapEntry();
		return stringToTCMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ICalibration> createStringToCalMapEntry() {
		StringToCalMapEntry stringToCalMapEntry = new StringToCalMapEntry();
		return stringToCalMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDatabaseElement createDatabaseElement() {
		DatabaseElement databaseElement = new DatabaseElement();
		return databaseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalibrationType createCalibrationTypeFromString(EDataType eDataType, String initialValue) {
		return (CalibrationType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalibrationTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonObject createJsonObjectFromString(EDataType eDataType, String initialValue) {
		return (JsonObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonArray createJsonArrayFromString(EDataType eDataType, String initialValue) {
		return (JsonArray)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJsonArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> createECollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseConnection createDatabaseConnectionFromString(EDataType eDataType, String initialValue) {
		return (DatabaseConnection)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseConnectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentType createArgumentTypeFromString(EDataType eDataType, String initialValue) {
		return (ArgumentType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArgumentTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMonitoringCheck createMonitoringCheckFromString(EDataType eDataType, String initialValue) {
		return (IMonitoringCheck)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringCheckToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Radix createRadixFromString(EDataType eDataType, String initialValue) {
		return (Radix)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRadixToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutputStream createDataOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (DataOutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedHashSet<?> createValidValueSetFromString(EDataType eDataType, String initialValue) {
		return (LinkedHashSet<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidValueSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbModelPackage getDbModelPackage() {
		return (DbModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DbModelPackage getPackage() {
		return DbModelPackage.eINSTANCE;
	}

} //DbModelFactory
