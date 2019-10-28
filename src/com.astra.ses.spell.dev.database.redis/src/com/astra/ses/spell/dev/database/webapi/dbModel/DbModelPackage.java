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
import com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;
import com.astra.ses.spell.dev.database.interfaces.Radix;
import com.astra.ses.spell.dev.database.webapi.DatabaseConnection;
import java.io.DataOutputStream;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.json.JsonArray;
import javax.json.JsonObject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelFactory
 * @model kind="package"
 * @generated
 */
public class DbModelPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "dbModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.ses.com/webAPI/dbModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "dbModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DbModelPackage eINSTANCE = com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage.init();

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase <em>Web API Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase()
	 * @generated
	 */
	public static final int WEB_API_DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Database Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__DATABASE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Telemetry Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__TELEMETRY_PARAMETER_NAMES = 3;

	/**
	 * The feature id for the '<em><b>Telecommand Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__TELECOMMAND_NAMES = 4;

	/**
	 * The feature id for the '<em><b>Calibration Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__CALIBRATION_NAMES = 5;

	/**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__DISPLAYS = 6;

	/**
	 * The feature id for the '<em><b>Tm Models</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__TM_MODELS = 7;

	/**
	 * The feature id for the '<em><b>Last TM Update Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__LAST_TM_UPDATE_HASH = 8;

	/**
	 * The feature id for the '<em><b>Last TC Update Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__LAST_TC_UPDATE_HASH = 9;

	/**
	 * The feature id for the '<em><b>Tc Models</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__TC_MODELS = 10;

	/**
	 * The feature id for the '<em><b>Calibration Models</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__CALIBRATION_MODELS = 11;

	/**
	 * The feature id for the '<em><b>Db Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE__DB_CONNECTION = 12;

	/**
	 * The number of structural features of the '<em>Web API Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Is Telemetry Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE___IS_TELEMETRY_PARAMETER__STRING = 0;

	/**
	 * The operation id for the '<em>Is Telecommand</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE___IS_TELECOMMAND__STRING = 1;

	/**
	 * The operation id for the '<em>Is Sequence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE___IS_SEQUENCE__STRING = 2;

	/**
	 * The operation id for the '<em>Get Telemetry Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE___GET_TELEMETRY_MODEL__STRING = 3;

	/**
	 * The operation id for the '<em>Get Telecommand Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE___GET_TELECOMMAND_MODEL__STRING = 4;

	/**
	 * The operation id for the '<em>Get Calibration Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE___GET_CALIBRATION_MODEL__STRING = 5;

	/**
	 * The number of operations of the '<em>Web API Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DATABASE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDisplays <em>Web API Displays</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDisplays
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDisplays()
	 * @generated
	 */
	public static final int WEB_API_DISPLAYS = 1;

	/**
	 * The number of structural features of the '<em>Web API Displays</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DISPLAYS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Web API Displays</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_DISPLAYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseElement <em>Database Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseElement
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseElement()
	 * @generated
	 */
	public static final int DATABASE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_ELEMENT__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_ELEMENT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Cached Web API Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_ELEMENT__CACHED_WEB_API_DATA = 3;

	/**
	 * The number of structural features of the '<em>Database Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Database Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelemetryModel <em>Web API Telemetry Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelemetryModel
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel()
	 * @generated
	 */
	public static final int WEB_API_TELEMETRY_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__FULL_NAME = DATABASE_ELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__DESCRIPTION = DATABASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__NAME = DATABASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cached Web API Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__CACHED_WEB_API_DATA = DATABASE_ELEMENT__CACHED_WEB_API_DATA;

	/**
	 * The feature id for the '<em><b>Last Update Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__LAST_UPDATE_HASH = DATABASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measuring Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__MEASURING_UNIT = DATABASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calibrations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__CALIBRATIONS = DATABASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Calibration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__CALIBRATION = DATABASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Calibration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__DEFAULT_CALIBRATION_ID = DATABASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Monitoring Checks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__MONITORING_CHECKS = DATABASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__DATABASE = DATABASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL__LOADED = DATABASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Web API Telemetry Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL_FEATURE_COUNT = DATABASE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Calibration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL___ADD_CALIBRATION__STRING_BOOLEAN = DATABASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Serialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL___SERIALIZE__DATAOUTPUTSTREAM = DATABASE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Load Parsed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL___LOAD_PARSED = DATABASE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Load Parsed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL___LOAD_PARSED__JSONOBJECT = DATABASE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Web API Telemetry Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELEMETRY_MODEL_OPERATION_COUNT = DATABASE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandModel <em>Web API Telecommand Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandModel
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandModel()
	 * @generated
	 */
	public static final int WEB_API_TELECOMMAND_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL__FULL_NAME = DATABASE_ELEMENT__FULL_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL__DESCRIPTION = DATABASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL__NAME = DATABASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cached Web API Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL__CACHED_WEB_API_DATA = DATABASE_ELEMENT__CACHED_WEB_API_DATA;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL__CRITICAL = DATABASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL__ARGUMENTS = DATABASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL__DATABASE = DATABASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL__LOADED = DATABASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Web API Telecommand Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL_FEATURE_COUNT = DATABASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Serialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL___SERIALIZE__DATAOUTPUTSTREAM = DATABASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Load Parsed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL___LOAD_PARSED = DATABASE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Load Parsed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL___LOAD_PARSED__JSONOBJECT = DATABASE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Web API Telecommand Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_MODEL_OPERATION_COUNT = DATABASE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel <em>Web API Calibration Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel()
	 * @generated
	 */
	public static final int WEB_API_CALIBRATION_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Cached Web API Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL__CACHED_WEB_API_DATA = 2;

	/**
	 * The feature id for the '<em><b>Valid Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL__VALID_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Internal Valid Values</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL__DATABASE = 5;

	/**
	 * The number of structural features of the '<em>Web API Calibration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Serialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL___SERIALIZE__DATAOUTPUTSTREAM = 0;

	/**
	 * The operation id for the '<em>Get Calibrated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL___GET_CALIBRATED__STRING = 1;

	/**
	 * The operation id for the '<em>Is Valid Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL___IS_VALID_VALUE__STRING = 2;

	/**
	 * The operation id for the '<em>Load Parsed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL___LOAD_PARSED__JSONOBJECT = 3;

	/**
	 * The number of operations of the '<em>Web API Calibration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_CALIBRATION_MODEL_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.StringToTMMapEntry <em>String To TM Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.StringToTMMapEntry
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getStringToTMMapEntry()
	 * @generated
	 */
	public static final int STRING_TO_TM_MAP_ENTRY = 7;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.StringToTCMapEntry <em>String To TC Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.StringToTCMapEntry
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getStringToTCMapEntry()
	 * @generated
	 */
	public static final int STRING_TO_TC_MAP_ENTRY = 8;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.StringToCalMapEntry <em>String To Cal Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.StringToCalMapEntry
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getStringToCalMapEntry()
	 * @generated
	 */
	public static final int STRING_TO_CAL_MAP_ENTRY = 9;

	/**
	 * The meta object id for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandArgument <em>Web API Telecommand Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandArgument
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument()
	 * @generated
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__LOADED = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__RADIX = 4;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__UNITS = 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__DEFAULT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__CALIBRATED = 7;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__OPTIONAL = 8;

	/**
	 * The feature id for the '<em><b>Calibration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION_ID = 9;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__DATABASE = 10;

	/**
	 * The feature id for the '<em><b>Calibration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION = 11;

	/**
	 * The number of structural features of the '<em>Web API Telecommand Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Has Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT___HAS_DEFAULT_VALUE = 0;

	/**
	 * The operation id for the '<em>Load Parsed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT___LOAD_PARSED__JSONOBJECT = 1;

	/**
	 * The operation id for the '<em>Load Parsed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT___LOAD_PARSED__JSONARRAY = 2;

	/**
	 * The number of operations of the '<em>Web API Telecommand Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int WEB_API_TELECOMMAND_ARGUMENT_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_TM_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_TM_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To TM Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_TM_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To TM Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_TM_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_TC_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_TC_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To TC Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_TC_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To TC Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_TC_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_CAL_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_CAL_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Cal Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_CAL_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Cal Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_TO_CAL_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Calibration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.interfaces.CalibrationType
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getCalibrationType()
	 * @generated
	 */
	public static final int CALIBRATION_TYPE = 17;

	/**
	 * The meta object id for the '<em>Json Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.json.JsonObject
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getJsonObject()
	 * @generated
	 */
	public static final int JSON_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Json Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.json.JsonArray
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getJsonArray()
	 * @generated
	 */
	public static final int JSON_ARRAY = 19;

	/**
	 * The meta object id for the '<em>ECollection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getECollection()
	 * @generated
	 */
	public static final int ECOLLECTION = 10;

	/**
	 * The meta object id for the '<em>Database Connection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.webapi.DatabaseConnection
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseConnection()
	 * @generated
	 */
	public static final int DATABASE_CONNECTION = 11;

	/**
	 * The meta object id for the '<em>Argument Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.interfaces.ArgumentType
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getArgumentType()
	 * @generated
	 */
	public static final int ARGUMENT_TYPE = 12;

	/**
	 * The meta object id for the '<em>Monitoring Check</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.interfaces.IMonitoringCheck
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getMonitoringCheck()
	 * @generated
	 */
	public static final int MONITORING_CHECK = 13;

	/**
	 * The meta object id for the '<em>Radix</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.astra.ses.spell.dev.database.interfaces.Radix
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getRadix()
	 * @generated
	 */
	public static final int RADIX = 14;

	/**
	 * The meta object id for the '<em>Data Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.DataOutputStream
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDataOutputStream()
	 * @generated
	 */
	public static final int DATA_OUTPUT_STREAM = 15;

	/**
	 * The meta object id for the '<em>Valid Value Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.LinkedHashSet
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getValidValueSet()
	 * @generated
	 */
	public static final int VALID_VALUE_SET = 16;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAPIDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAPIDisplaysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAPITelemetryModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAPITelecommandModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAPICalibrationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToTMMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToTCMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToCalMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAPITelecommandArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCollectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType databaseConnectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType argumentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType monitoringCheckEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType radixEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataOutputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType validValueSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calibrationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonArrayEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DbModelPackage() {
		super(eNS_URI, DbModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DbModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DbModelPackage init() {
		if (isInited) return (DbModelPackage)EPackage.Registry.INSTANCE.getEPackage(DbModelPackage.eNS_URI);

		// Obtain or create and register package
		DbModelPackage theDbModelPackage = (DbModelPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DbModelPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DbModelPackage());

		isInited = true;

		// Create package meta-data objects
		theDbModelPackage.createPackageContents();

		// Initialize created meta-data
		theDbModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDbModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DbModelPackage.eNS_URI, theDbModelPackage);
		return theDbModelPackage;
	}


	/**
	 * Returns the meta object for class '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase <em>Web API Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web API Database</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ISpellDatabase"
	 * @generated
	 */
	public EClass getWebAPIDatabase() {
		return webAPIDatabaseEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDatabasePath <em>Database Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Path</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDatabasePath()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_DatabasePath() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getName()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_Name() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getVersion()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_Version() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelemetryParameterNames <em>Telemetry Parameter Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telemetry Parameter Names</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelemetryParameterNames()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_TelemetryParameterNames() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelecommandNames <em>Telecommand Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telecommand Names</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelecommandNames()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_TelecommandNames() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getCalibrationNames <em>Calibration Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calibration Names</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getCalibrationNames()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_CalibrationNames() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the containment reference list '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displays</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDisplays()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EReference getWebAPIDatabase_Displays() {
		return (EReference)webAPIDatabaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the map '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTmModels <em>Tm Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tm Models</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTmModels()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EReference getWebAPIDatabase_TmModels() {
		return (EReference)webAPIDatabaseEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getLastTMUpdateHash <em>Last TM Update Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last TM Update Hash</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getLastTMUpdateHash()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_LastTMUpdateHash() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getLastTCUpdateHash <em>Last TC Update Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last TC Update Hash</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getLastTCUpdateHash()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_LastTCUpdateHash() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the map '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTcModels <em>Tc Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Tc Models</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTcModels()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EReference getWebAPIDatabase_TcModels() {
		return (EReference)webAPIDatabaseEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for the map '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getCalibrationModels <em>Calibration Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Calibration Models</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getCalibrationModels()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EReference getWebAPIDatabase_CalibrationModels() {
		return (EReference)webAPIDatabaseEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDbConnection <em>Db Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Connection</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDbConnection()
	 * @see #getWebAPIDatabase()
	 * @generated
	 */
	public EAttribute getWebAPIDatabase_DbConnection() {
		return (EAttribute)webAPIDatabaseEClass.getEStructuralFeatures().get(12);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#isTelemetryParameter(java.lang.String) <em>Is Telemetry Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Telemetry Parameter</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#isTelemetryParameter(java.lang.String)
	 * @generated
	 */
	public EOperation getWebAPIDatabase__IsTelemetryParameter__String() {
		return webAPIDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#isTelecommand(java.lang.String) <em>Is Telecommand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Telecommand</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#isTelecommand(java.lang.String)
	 * @generated
	 */
	public EOperation getWebAPIDatabase__IsTelecommand__String() {
		return webAPIDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#isSequence(java.lang.String) <em>Is Sequence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sequence</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#isSequence(java.lang.String)
	 * @generated
	 */
	public EOperation getWebAPIDatabase__IsSequence__String() {
		return webAPIDatabaseEClass.getEOperations().get(2);
	}

	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelemetryModel(java.lang.String) <em>Get Telemetry Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Telemetry Model</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelemetryModel(java.lang.String)
	 * @generated
	 */
	public EOperation getWebAPIDatabase__GetTelemetryModel__String() {
		return webAPIDatabaseEClass.getEOperations().get(3);
	}

	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelecommandModel(java.lang.String) <em>Get Telecommand Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Telecommand Model</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelecommandModel(java.lang.String)
	 * @generated
	 */
	public EOperation getWebAPIDatabase__GetTelecommandModel__String() {
		return webAPIDatabaseEClass.getEOperations().get(4);
	}

	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getCalibrationModel(java.lang.String) <em>Get Calibration Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Calibration Model</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getCalibrationModel(java.lang.String)
	 * @generated
	 */
	public EOperation getWebAPIDatabase__GetCalibrationModel__String() {
		return webAPIDatabaseEClass.getEOperations().get(5);
	}


	/**
	 * Returns the meta object for class '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition <em>Web API Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web API Displays</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition"
	 * @generated
	 */
	public EClass getWebAPIDisplays() {
		return webAPIDisplaysEClass;
	}

	/**
	 * Returns the meta object for class '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter <em>Web API Telemetry Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web API Telemetry Model</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter" superTypes="com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseElement"
	 * @generated
	 */
	public EClass getWebAPITelemetryModel() {
		return webAPITelemetryModelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getLastUpdateHash <em>Last Update Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update Hash</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getLastUpdateHash()
	 * @see #getWebAPITelemetryModel()
	 * @generated
	 */
	public EAttribute getWebAPITelemetryModel_LastUpdateHash() {
		return (EAttribute)webAPITelemetryModelEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getMeasuringUnit <em>Measuring Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measuring Unit</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getMeasuringUnit()
	 * @see #getWebAPITelemetryModel()
	 * @generated
	 */
	public EAttribute getWebAPITelemetryModel_MeasuringUnit() {
		return (EAttribute)webAPITelemetryModelEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getCalibrations <em>Calibrations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calibrations</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getCalibrations()
	 * @see #getWebAPITelemetryModel()
	 * @generated
	 */
	public EAttribute getWebAPITelemetryModel_Calibrations() {
		return (EAttribute)webAPITelemetryModelEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the reference '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getCalibration <em>Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calibration</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getCalibration()
	 * @see #getWebAPITelemetryModel()
	 * @generated
	 */
	public EReference getWebAPITelemetryModel_Calibration() {
		return (EReference)webAPITelemetryModelEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getDefaultCalibrationId <em>Default Calibration Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Calibration Id</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getDefaultCalibrationId()
	 * @see #getWebAPITelemetryModel()
	 * @generated
	 */
	public EAttribute getWebAPITelemetryModel_DefaultCalibrationId() {
		return (EAttribute)webAPITelemetryModelEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getMonitoringChecks <em>Monitoring Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Checks</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getMonitoringChecks()
	 * @see #getWebAPITelemetryModel()
	 * @generated
	 */
	public EAttribute getWebAPITelemetryModel_MonitoringChecks() {
		return (EAttribute)webAPITelemetryModelEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the reference '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getDatabase()
	 * @see #getWebAPITelemetryModel()
	 * @generated
	 */
	public EReference getWebAPITelemetryModel_Database() {
		return (EReference)webAPITelemetryModelEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#isLoaded <em>Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loaded</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#isLoaded()
	 * @see #getWebAPITelemetryModel()
	 * @generated
	 */
	public EAttribute getWebAPITelemetryModel_Loaded() {
		return (EAttribute)webAPITelemetryModelEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#addCalibration(java.lang.String, boolean) <em>Add Calibration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Calibration</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#addCalibration(java.lang.String, boolean)
	 * @generated
	 */
	public EOperation getWebAPITelemetryModel__AddCalibration__String_boolean() {
		return webAPITelemetryModelEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#serialize(java.io.DataOutputStream) <em>Serialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Serialize</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#serialize(java.io.DataOutputStream)
	 * @generated
	 */
	public EOperation getWebAPITelemetryModel__Serialize__DataOutputStream() {
		return webAPITelemetryModelEClass.getEOperations().get(1);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#loadParsed() <em>Load Parsed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Parsed</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#loadParsed()
	 * @generated
	 */
	public EOperation getWebAPITelemetryModel__LoadParsed() {
		return webAPITelemetryModelEClass.getEOperations().get(2);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#loadParsed(javax.json.JsonObject) <em>Load Parsed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Parsed</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#loadParsed(javax.json.JsonObject)
	 * @generated
	 */
	public EOperation getWebAPITelemetryModel__LoadParsed__JsonObject() {
		return webAPITelemetryModelEClass.getEOperations().get(3);
	}


	/**
	 * Returns the meta object for class '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand <em>Web API Telecommand Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web API Telecommand Model</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ITelecommand" superTypes="com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseElement"
	 * @generated
	 */
	public EClass getWebAPITelecommandModel() {
		return webAPITelecommandModelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#isCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand#isCritical()
	 * @see #getWebAPITelecommandModel()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandModel_Critical() {
		return (EAttribute)webAPITelecommandModelEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the reference list '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand#getArguments()
	 * @see #getWebAPITelecommandModel()
	 * @generated
	 */
	public EReference getWebAPITelecommandModel_Arguments() {
		return (EReference)webAPITelecommandModelEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the reference '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand#getDatabase()
	 * @see #getWebAPITelecommandModel()
	 * @generated
	 */
	public EReference getWebAPITelecommandModel_Database() {
		return (EReference)webAPITelecommandModelEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#isLoaded <em>Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loaded</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand#isLoaded()
	 * @see #getWebAPITelecommandModel()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandModel_Loaded() {
		return (EAttribute)webAPITelecommandModelEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#serialize(java.io.DataOutputStream) <em>Serialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Serialize</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand#serialize(java.io.DataOutputStream)
	 * @generated
	 */
	public EOperation getWebAPITelecommandModel__Serialize__DataOutputStream() {
		return webAPITelecommandModelEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#loadParsed() <em>Load Parsed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Parsed</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand#loadParsed()
	 * @generated
	 */
	public EOperation getWebAPITelecommandModel__LoadParsed() {
		return webAPITelecommandModelEClass.getEOperations().get(1);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#loadParsed(javax.json.JsonObject) <em>Load Parsed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Parsed</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommand#loadParsed(javax.json.JsonObject)
	 * @generated
	 */
	public EOperation getWebAPITelecommandModel__LoadParsed__JsonObject() {
		return webAPITelecommandModelEClass.getEOperations().get(2);
	}


	/**
	 * Returns the meta object for class '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration <em>Web API Calibration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web API Calibration Model</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ICalibration"
	 * @generated
	 */
	public EClass getWebAPICalibrationModel() {
		return webAPICalibrationModelEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#getType()
	 * @see #getWebAPICalibrationModel()
	 * @generated
	 */
	public EAttribute getWebAPICalibrationModel_Type() {
		return (EAttribute)webAPICalibrationModelEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#getIdentifier()
	 * @see #getWebAPICalibrationModel()
	 * @generated
	 */
	public EAttribute getWebAPICalibrationModel_Identifier() {
		return (EAttribute)webAPICalibrationModelEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getCachedWebAPIData <em>Cached Web API Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached Web API Data</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#getCachedWebAPIData()
	 * @see #getWebAPICalibrationModel()
	 * @generated
	 */
	public EAttribute getWebAPICalibrationModel_CachedWebAPIData() {
		return (EAttribute)webAPICalibrationModelEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the map '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getInternalValidValues <em>Internal Valid Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Internal Valid Values</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#getInternalValidValues()
	 * @see #getWebAPICalibrationModel()
	 * @generated
	 */
	public EReference getWebAPICalibrationModel_InternalValidValues() {
		return (EReference)webAPICalibrationModelEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the reference '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#getDatabase()
	 * @see #getWebAPICalibrationModel()
	 * @generated
	 */
	public EReference getWebAPICalibrationModel_Database() {
		return (EReference)webAPICalibrationModelEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the attribute list '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Values</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#getValidValues()
	 * @see #getWebAPICalibrationModel()
	 * @generated
	 */
	public EAttribute getWebAPICalibrationModel_ValidValues() {
		return (EAttribute)webAPICalibrationModelEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#serialize(java.io.DataOutputStream) <em>Serialize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Serialize</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#serialize(java.io.DataOutputStream)
	 * @generated
	 */
	public EOperation getWebAPICalibrationModel__Serialize__DataOutputStream() {
		return webAPICalibrationModelEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getCalibrated(java.lang.String) <em>Get Calibrated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Calibrated</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#getCalibrated(java.lang.String)
	 * @generated
	 */
	public EOperation getWebAPICalibrationModel__GetCalibrated__String() {
		return webAPICalibrationModelEClass.getEOperations().get(1);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#isValidValue(java.lang.String) <em>Is Valid Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid Value</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#isValidValue(java.lang.String)
	 * @generated
	 */
	public EOperation getWebAPICalibrationModel__IsValidValue__String() {
		return webAPICalibrationModelEClass.getEOperations().get(2);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#loadParsed(javax.json.JsonObject) <em>Load Parsed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Parsed</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ICalibration#loadParsed(javax.json.JsonObject)
	 * @generated
	 */
	public EOperation getWebAPICalibrationModel__LoadParsed__JsonObject() {
		return webAPICalibrationModelEClass.getEOperations().get(3);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To TM Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To TM Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelemetryModel" valueContainment="true"
	 * @generated
	 */
	public EClass getStringToTMMapEntry() {
		return stringToTMMapEntryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTMMapEntry()
	 * @generated
	 */
	public EAttribute getStringToTMMapEntry_Key() {
		return (EAttribute)stringToTMMapEntryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTMMapEntry()
	 * @generated
	 */
	public EReference getStringToTMMapEntry_Value() {
		return (EReference)stringToTMMapEntryEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To TC Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To TC Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandModel" valueContainment="true"
	 * @generated
	 */
	public EClass getStringToTCMapEntry() {
		return stringToTCMapEntryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTCMapEntry()
	 * @generated
	 */
	public EAttribute getStringToTCMapEntry_Key() {
		return (EAttribute)stringToTCMapEntryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTCMapEntry()
	 * @generated
	 */
	public EReference getStringToTCMapEntry_Value() {
		return (EReference)stringToTCMapEntryEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Cal Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Cal Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel" valueContainment="true"
	 * @generated
	 */
	public EClass getStringToCalMapEntry() {
		return stringToCalMapEntryEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToCalMapEntry()
	 * @generated
	 */
	public EAttribute getStringToCalMapEntry_Key() {
		return (EAttribute)stringToCalMapEntryEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToCalMapEntry()
	 * @generated
	 */
	public EReference getStringToCalMapEntry_Value() {
		return (EReference)stringToCalMapEntryEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement <em>Database Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Element</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.IDatabaseElement
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.IDatabaseElement"
	 * @generated
	 */
	public EClass getDatabaseElement() {
		return databaseElementEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getFullName()
	 * @see #getDatabaseElement()
	 * @generated
	 */
	public EAttribute getDatabaseElement_FullName() {
		return (EAttribute)databaseElementEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getDescription()
	 * @see #getDatabaseElement()
	 * @generated
	 */
	public EAttribute getDatabaseElement_Description() {
		return (EAttribute)databaseElementEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getName()
	 * @see #getDatabaseElement()
	 * @generated
	 */
	public EAttribute getDatabaseElement_Name() {
		return (EAttribute)databaseElementEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getCachedWebAPIData <em>Cached Web API Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached Web API Data</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getCachedWebAPIData()
	 * @see #getDatabaseElement()
	 * @generated
	 */
	public EAttribute getDatabaseElement_CachedWebAPIData() {
		return (EAttribute)databaseElementEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for class '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument <em>Web API Telecommand Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web API Telecommand Argument</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument"
	 * @generated
	 */
	public EClass getWebAPITelecommandArgument() {
		return webAPITelecommandArgumentEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDescription()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_Description() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getName()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_Name() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isLoaded <em>Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loaded</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isLoaded()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_Loaded() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getType()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_Type() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getRadix <em>Radix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radix</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getRadix()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_Radix() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getUnits()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_Units() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDefaultValue()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_DefaultValue() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isCalibrated <em>Calibrated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calibrated</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isCalibrated()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_Calibrated() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(7);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isOptional()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_Optional() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(8);
	}


	/**
	 * Returns the meta object for the attribute '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getCalibrationId <em>Calibration Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calibration Id</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getCalibrationId()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EAttribute getWebAPITelecommandArgument_CalibrationId() {
		return (EAttribute)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(9);
	}


	/**
	 * Returns the meta object for the reference '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDatabase()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EReference getWebAPITelecommandArgument_Database() {
		return (EReference)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(10);
	}


	/**
	 * Returns the meta object for the reference '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getCalibration <em>Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calibration</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getCalibration()
	 * @see #getWebAPITelecommandArgument()
	 * @generated
	 */
	public EReference getWebAPITelecommandArgument_Calibration() {
		return (EReference)webAPITelecommandArgumentEClass.getEStructuralFeatures().get(11);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#hasDefaultValue() <em>Has Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Default Value</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#hasDefaultValue()
	 * @generated
	 */
	public EOperation getWebAPITelecommandArgument__HasDefaultValue() {
		return webAPITelecommandArgumentEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#loadParsed(javax.json.JsonObject) <em>Load Parsed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Parsed</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#loadParsed(javax.json.JsonObject)
	 * @generated
	 */
	public EOperation getWebAPITelecommandArgument__LoadParsed__JsonObject() {
		return webAPITelecommandArgumentEClass.getEOperations().get(1);
	}


	/**
	 * Returns the meta object for the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#loadParsed(javax.json.JsonArray) <em>Load Parsed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Parsed</em>' operation.
	 * @see com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#loadParsed(javax.json.JsonArray)
	 * @generated
	 */
	public EOperation getWebAPITelecommandArgument__LoadParsed__JsonArray() {
		return webAPITelecommandArgumentEClass.getEOperations().get(2);
	}


	/**
	 * Returns the meta object for data type '{@link com.astra.ses.spell.dev.database.interfaces.CalibrationType <em>Calibration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calibration Type</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.CalibrationType
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.CalibrationType"
	 * @generated
	 */
	public EDataType getCalibrationType() {
		return calibrationTypeEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link javax.json.JsonObject <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Json Object</em>'.
	 * @see javax.json.JsonObject
	 * @model instanceClass="javax.json.JsonObject"
	 * @generated
	 */
	public EDataType getJsonObject() {
		return jsonObjectEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link javax.json.JsonArray <em>Json Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Json Array</em>'.
	 * @see javax.json.JsonArray
	 * @model instanceClass="javax.json.JsonArray"
	 * @generated
	 */
	public EDataType getJsonArray() {
		return jsonArrayEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>ECollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ECollection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="E"
	 * @generated
	 */
	public EDataType getECollection() {
		return eCollectionEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link com.astra.ses.spell.dev.database.webapi.DatabaseConnection <em>Database Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Database Connection</em>'.
	 * @see com.astra.ses.spell.dev.database.webapi.DatabaseConnection
	 * @model instanceClass="com.astra.ses.spell.dev.database.webapi.DatabaseConnection"
	 * @generated
	 */
	public EDataType getDatabaseConnection() {
		return databaseConnectionEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link com.astra.ses.spell.dev.database.interfaces.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Argument Type</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.ArgumentType
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ArgumentType"
	 * @generated
	 */
	public EDataType getArgumentType() {
		return argumentTypeEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link com.astra.ses.spell.dev.database.interfaces.IMonitoringCheck <em>Monitoring Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Monitoring Check</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.IMonitoringCheck
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.IMonitoringCheck"
	 * @generated
	 */
	public EDataType getMonitoringCheck() {
		return monitoringCheckEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link com.astra.ses.spell.dev.database.interfaces.Radix <em>Radix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Radix</em>'.
	 * @see com.astra.ses.spell.dev.database.interfaces.Radix
	 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.Radix"
	 * @generated
	 */
	public EDataType getRadix() {
		return radixEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link java.io.DataOutputStream <em>Data Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Output Stream</em>'.
	 * @see java.io.DataOutputStream
	 * @model instanceClass="java.io.DataOutputStream"
	 * @generated
	 */
	public EDataType getDataOutputStream() {
		return dataOutputStreamEDataType;
	}


	/**
	 * Returns the meta object for data type '{@link java.util.LinkedHashSet <em>Valid Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valid Value Set</em>'.
	 * @see java.util.LinkedHashSet
	 * @model instanceClass="java.util.LinkedHashSet" typeParameters="E"
	 * @generated
	 */
	public EDataType getValidValueSet() {
		return validValueSetEDataType;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public DbModelFactory getDbModelFactory() {
		return (DbModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		webAPIDatabaseEClass = createEClass(WEB_API_DATABASE);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__DATABASE_PATH);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__NAME);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__VERSION);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__TELEMETRY_PARAMETER_NAMES);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__TELECOMMAND_NAMES);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__CALIBRATION_NAMES);
		createEReference(webAPIDatabaseEClass, WEB_API_DATABASE__DISPLAYS);
		createEReference(webAPIDatabaseEClass, WEB_API_DATABASE__TM_MODELS);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__LAST_TM_UPDATE_HASH);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__LAST_TC_UPDATE_HASH);
		createEReference(webAPIDatabaseEClass, WEB_API_DATABASE__TC_MODELS);
		createEReference(webAPIDatabaseEClass, WEB_API_DATABASE__CALIBRATION_MODELS);
		createEAttribute(webAPIDatabaseEClass, WEB_API_DATABASE__DB_CONNECTION);
		createEOperation(webAPIDatabaseEClass, WEB_API_DATABASE___IS_TELEMETRY_PARAMETER__STRING);
		createEOperation(webAPIDatabaseEClass, WEB_API_DATABASE___IS_TELECOMMAND__STRING);
		createEOperation(webAPIDatabaseEClass, WEB_API_DATABASE___IS_SEQUENCE__STRING);
		createEOperation(webAPIDatabaseEClass, WEB_API_DATABASE___GET_TELEMETRY_MODEL__STRING);
		createEOperation(webAPIDatabaseEClass, WEB_API_DATABASE___GET_TELECOMMAND_MODEL__STRING);
		createEOperation(webAPIDatabaseEClass, WEB_API_DATABASE___GET_CALIBRATION_MODEL__STRING);

		webAPIDisplaysEClass = createEClass(WEB_API_DISPLAYS);

		webAPITelemetryModelEClass = createEClass(WEB_API_TELEMETRY_MODEL);
		createEAttribute(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL__LAST_UPDATE_HASH);
		createEAttribute(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL__MEASURING_UNIT);
		createEAttribute(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL__CALIBRATIONS);
		createEReference(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL__CALIBRATION);
		createEAttribute(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL__DEFAULT_CALIBRATION_ID);
		createEAttribute(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL__MONITORING_CHECKS);
		createEReference(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL__DATABASE);
		createEAttribute(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL__LOADED);
		createEOperation(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL___ADD_CALIBRATION__STRING_BOOLEAN);
		createEOperation(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL___SERIALIZE__DATAOUTPUTSTREAM);
		createEOperation(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL___LOAD_PARSED);
		createEOperation(webAPITelemetryModelEClass, WEB_API_TELEMETRY_MODEL___LOAD_PARSED__JSONOBJECT);

		webAPITelecommandModelEClass = createEClass(WEB_API_TELECOMMAND_MODEL);
		createEAttribute(webAPITelecommandModelEClass, WEB_API_TELECOMMAND_MODEL__CRITICAL);
		createEReference(webAPITelecommandModelEClass, WEB_API_TELECOMMAND_MODEL__ARGUMENTS);
		createEReference(webAPITelecommandModelEClass, WEB_API_TELECOMMAND_MODEL__DATABASE);
		createEAttribute(webAPITelecommandModelEClass, WEB_API_TELECOMMAND_MODEL__LOADED);
		createEOperation(webAPITelecommandModelEClass, WEB_API_TELECOMMAND_MODEL___SERIALIZE__DATAOUTPUTSTREAM);
		createEOperation(webAPITelecommandModelEClass, WEB_API_TELECOMMAND_MODEL___LOAD_PARSED);
		createEOperation(webAPITelecommandModelEClass, WEB_API_TELECOMMAND_MODEL___LOAD_PARSED__JSONOBJECT);

		webAPICalibrationModelEClass = createEClass(WEB_API_CALIBRATION_MODEL);
		createEAttribute(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL__TYPE);
		createEAttribute(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL__IDENTIFIER);
		createEAttribute(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL__CACHED_WEB_API_DATA);
		createEAttribute(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL__VALID_VALUES);
		createEReference(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES);
		createEReference(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL__DATABASE);
		createEOperation(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL___SERIALIZE__DATAOUTPUTSTREAM);
		createEOperation(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL___GET_CALIBRATED__STRING);
		createEOperation(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL___IS_VALID_VALUE__STRING);
		createEOperation(webAPICalibrationModelEClass, WEB_API_CALIBRATION_MODEL___LOAD_PARSED__JSONOBJECT);

		webAPITelecommandArgumentEClass = createEClass(WEB_API_TELECOMMAND_ARGUMENT);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__DESCRIPTION);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__NAME);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__LOADED);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__TYPE);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__RADIX);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__UNITS);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__DEFAULT_VALUE);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__CALIBRATED);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__OPTIONAL);
		createEAttribute(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION_ID);
		createEReference(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__DATABASE);
		createEReference(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION);
		createEOperation(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT___HAS_DEFAULT_VALUE);
		createEOperation(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT___LOAD_PARSED__JSONOBJECT);
		createEOperation(webAPITelecommandArgumentEClass, WEB_API_TELECOMMAND_ARGUMENT___LOAD_PARSED__JSONARRAY);

		databaseElementEClass = createEClass(DATABASE_ELEMENT);
		createEAttribute(databaseElementEClass, DATABASE_ELEMENT__FULL_NAME);
		createEAttribute(databaseElementEClass, DATABASE_ELEMENT__DESCRIPTION);
		createEAttribute(databaseElementEClass, DATABASE_ELEMENT__NAME);
		createEAttribute(databaseElementEClass, DATABASE_ELEMENT__CACHED_WEB_API_DATA);

		stringToTMMapEntryEClass = createEClass(STRING_TO_TM_MAP_ENTRY);
		createEAttribute(stringToTMMapEntryEClass, STRING_TO_TM_MAP_ENTRY__KEY);
		createEReference(stringToTMMapEntryEClass, STRING_TO_TM_MAP_ENTRY__VALUE);

		stringToTCMapEntryEClass = createEClass(STRING_TO_TC_MAP_ENTRY);
		createEAttribute(stringToTCMapEntryEClass, STRING_TO_TC_MAP_ENTRY__KEY);
		createEReference(stringToTCMapEntryEClass, STRING_TO_TC_MAP_ENTRY__VALUE);

		stringToCalMapEntryEClass = createEClass(STRING_TO_CAL_MAP_ENTRY);
		createEAttribute(stringToCalMapEntryEClass, STRING_TO_CAL_MAP_ENTRY__KEY);
		createEReference(stringToCalMapEntryEClass, STRING_TO_CAL_MAP_ENTRY__VALUE);

		// Create data types
		eCollectionEDataType = createEDataType(ECOLLECTION);
		databaseConnectionEDataType = createEDataType(DATABASE_CONNECTION);
		argumentTypeEDataType = createEDataType(ARGUMENT_TYPE);
		monitoringCheckEDataType = createEDataType(MONITORING_CHECK);
		radixEDataType = createEDataType(RADIX);
		dataOutputStreamEDataType = createEDataType(DATA_OUTPUT_STREAM);
		validValueSetEDataType = createEDataType(VALID_VALUE_SET);
		calibrationTypeEDataType = createEDataType(CALIBRATION_TYPE);
		jsonObjectEDataType = createEDataType(JSON_OBJECT);
		jsonArrayEDataType = createEDataType(JSON_ARRAY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(eCollectionEDataType, "E");
		addETypeParameter(validValueSetEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		webAPITelemetryModelEClass.getESuperTypes().add(this.getDatabaseElement());
		webAPITelecommandModelEClass.getESuperTypes().add(this.getDatabaseElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(webAPIDatabaseEClass, ISpellDatabase.class, "WebAPIDatabase", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAPIDatabase_DatabasePath(), ecorePackage.getEString(), "databasePath", null, 0, 1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPIDatabase_Name(), ecorePackage.getEString(), "name", "\"WebAPI Redis Database\"", 0, 1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPIDatabase_Version(), ecorePackage.getEString(), "version", "\"1.0\"", 0, 1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getECollection());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getWebAPIDatabase_TelemetryParameterNames(), g1, "telemetryParameterNames", null, 0, 1, ISpellDatabase.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getECollection());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getWebAPIDatabase_TelecommandNames(), g1, "telecommandNames", null, 0, 1, ISpellDatabase.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getECollection());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getWebAPIDatabase_CalibrationNames(), g1, "calibrationNames", null, 0, 1, ISpellDatabase.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPIDatabase_Displays(), this.getWebAPIDisplays(), null, "displays", null, 0, -1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPIDatabase_TmModels(), this.getStringToTMMapEntry(), null, "tmModels", null, 0, -1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPIDatabase_LastTMUpdateHash(), ecorePackage.getEString(), "lastTMUpdateHash", "-1", 0, 1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPIDatabase_LastTCUpdateHash(), ecorePackage.getEString(), "lastTCUpdateHash", "-1", 0, 1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPIDatabase_TcModels(), this.getStringToTCMapEntry(), null, "tcModels", null, 0, -1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPIDatabase_CalibrationModels(), this.getStringToCalMapEntry(), null, "calibrationModels", null, 0, -1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPIDatabase_DbConnection(), this.getDatabaseConnection(), "dbConnection", null, 0, 1, ISpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getWebAPIDatabase__IsTelemetryParameter__String(), ecorePackage.getEBoolean(), "isTelemetryParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mnemonic", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPIDatabase__IsTelecommand__String(), ecorePackage.getEBoolean(), "isTelecommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mnemonic", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPIDatabase__IsSequence__String(), ecorePackage.getEBoolean(), "isSequence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mnemonic", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPIDatabase__GetTelemetryModel__String(), this.getWebAPITelemetryModel(), "getTelemetryModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mnemonic", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPIDatabase__GetTelecommandModel__String(), this.getWebAPITelecommandModel(), "getTelecommandModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mnemonic", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPIDatabase__GetCalibrationModel__String(), this.getWebAPICalibrationModel(), "getCalibrationModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mnemonic", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(webAPIDisplaysEClass, ITelemetryDisplayDefinition.class, "WebAPIDisplays", IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(webAPITelemetryModelEClass, ITelemetryParameter.class, "WebAPITelemetryModel", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAPITelemetryModel_LastUpdateHash(), ecorePackage.getEInt(), "lastUpdateHash", null, 0, 1, ITelemetryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelemetryModel_MeasuringUnit(), ecorePackage.getEString(), "measuringUnit", null, 0, 1, ITelemetryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getECollection());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEAttribute(getWebAPITelemetryModel_Calibrations(), g1, "calibrations", null, 0, 1, ITelemetryParameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPITelemetryModel_Calibration(), this.getWebAPICalibrationModel(), null, "calibration", null, 0, 1, ITelemetryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelemetryModel_DefaultCalibrationId(), ecorePackage.getEString(), "defaultCalibrationId", null, 0, 1, ITelemetryParameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getECollection());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getMonitoringCheck());
		g2.setEUpperBound(g3);
		initEAttribute(getWebAPITelemetryModel_MonitoringChecks(), g1, "monitoringChecks", null, 0, 1, ITelemetryParameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPITelemetryModel_Database(), this.getWebAPIDatabase(), null, "database", null, 0, 1, ITelemetryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelemetryModel_Loaded(), ecorePackage.getEBoolean(), "loaded", "false", 0, 1, ITelemetryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getWebAPITelemetryModel__AddCalibration__String_boolean(), null, "addCalibration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "calibrationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "defaultRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPITelemetryModel__Serialize__DataOutputStream(), null, "serialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataOutputStream(), "stream", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWebAPITelemetryModel__LoadParsed(), null, "loadParsed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPITelemetryModel__LoadParsed__JsonObject(), null, "loadParsed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJsonObject(), "jsonObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(webAPITelecommandModelEClass, ITelecommand.class, "WebAPITelecommandModel", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAPITelecommandModel_Critical(), ecorePackage.getEBoolean(), "critical", null, 0, 1, ITelecommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPITelecommandModel_Arguments(), this.getWebAPITelecommandArgument(), null, "arguments", null, 0, -1, ITelecommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPITelecommandModel_Database(), this.getWebAPIDatabase(), null, "database", null, 0, 1, ITelecommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandModel_Loaded(), ecorePackage.getEBoolean(), "loaded", "false", 0, 1, ITelecommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getWebAPITelecommandModel__Serialize__DataOutputStream(), null, "serialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataOutputStream(), "stream", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getWebAPITelecommandModel__LoadParsed(), null, "loadParsed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPITelecommandModel__LoadParsed__JsonObject(), null, "loadParsed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJsonObject(), "jsonObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(webAPICalibrationModelEClass, ICalibration.class, "WebAPICalibrationModel", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAPICalibrationModel_Type(), this.getCalibrationType(), "type", null, 0, 1, ICalibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPICalibrationModel_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ICalibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPICalibrationModel_CachedWebAPIData(), ecorePackage.getEString(), "cachedWebAPIData", null, 0, 1, ICalibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPICalibrationModel_ValidValues(), ecorePackage.getEString(), "validValues", null, 0, -1, ICalibration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPICalibrationModel_InternalValidValues(), ecorePackage.getEStringToStringMapEntry(), null, "internalValidValues", null, 0, -1, ICalibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPICalibrationModel_Database(), this.getWebAPIDatabase(), null, "database", null, 0, 1, ICalibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getWebAPICalibrationModel__Serialize__DataOutputStream(), null, "serialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDataOutputStream(), "stream", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPICalibrationModel__GetCalibrated__String(), ecorePackage.getEString(), "getCalibrated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "rawValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPICalibrationModel__IsValidValue__String(), ecorePackage.getEBoolean(), "isValidValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "engValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPICalibrationModel__LoadParsed__JsonObject(), null, "loadParsed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJsonObject(), "jsonObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(webAPITelecommandArgumentEClass, ITelecommandArgument.class, "WebAPITelecommandArgument", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAPITelecommandArgument_Description(), ecorePackage.getEString(), "description", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_Loaded(), ecorePackage.getEBoolean(), "loaded", "false", 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_Type(), this.getArgumentType(), "type", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_Radix(), this.getRadix(), "radix", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_Units(), ecorePackage.getEString(), "units", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_Calibrated(), ecorePackage.getEBoolean(), "calibrated", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebAPITelecommandArgument_CalibrationId(), ecorePackage.getEString(), "calibrationId", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPITelecommandArgument_Database(), this.getWebAPIDatabase(), null, "database", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebAPITelecommandArgument_Calibration(), this.getWebAPICalibrationModel(), null, "calibration", null, 0, 1, ITelecommandArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getWebAPITelecommandArgument__HasDefaultValue(), ecorePackage.getEBoolean(), "hasDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPITelecommandArgument__LoadParsed__JsonObject(), null, "loadParsed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJsonObject(), "jsonObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWebAPITelecommandArgument__LoadParsed__JsonArray(), null, "loadParsed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJsonArray(), "jsonObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseElementEClass, IDatabaseElement.class, "DatabaseElement", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseElement_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, IDatabaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, IDatabaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IDatabaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseElement_CachedWebAPIData(), ecorePackage.getEString(), "cachedWebAPIData", null, 0, 1, IDatabaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToTMMapEntryEClass, Map.Entry.class, "StringToTMMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToTMMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToTMMapEntry_Value(), this.getWebAPITelemetryModel(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToTCMapEntryEClass, Map.Entry.class, "StringToTCMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToTCMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToTCMapEntry_Value(), this.getWebAPITelecommandModel(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToCalMapEntryEClass, Map.Entry.class, "StringToCalMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToCalMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToCalMapEntry_Value(), this.getWebAPICalibrationModel(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eCollectionEDataType, Collection.class, "ECollection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(databaseConnectionEDataType, DatabaseConnection.class, "DatabaseConnection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(argumentTypeEDataType, ArgumentType.class, "ArgumentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(monitoringCheckEDataType, IMonitoringCheck.class, "MonitoringCheck", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(radixEDataType, Radix.class, "Radix", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataOutputStreamEDataType, DataOutputStream.class, "DataOutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(validValueSetEDataType, LinkedHashSet.class, "ValidValueSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(calibrationTypeEDataType, CalibrationType.class, "CalibrationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jsonObjectEDataType, JsonObject.class, "JsonObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jsonArrayEDataType, JsonArray.class, "JsonArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase <em>Web API Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase()
		 * @generated
		 */
		public static final EClass WEB_API_DATABASE = eINSTANCE.getWebAPIDatabase();

		/**
		 * The meta object literal for the '<em><b>Database Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__DATABASE_PATH = eINSTANCE.getWebAPIDatabase_DatabasePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__NAME = eINSTANCE.getWebAPIDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__VERSION = eINSTANCE.getWebAPIDatabase_Version();

		/**
		 * The meta object literal for the '<em><b>Telemetry Parameter Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__TELEMETRY_PARAMETER_NAMES = eINSTANCE.getWebAPIDatabase_TelemetryParameterNames();

		/**
		 * The meta object literal for the '<em><b>Telecommand Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__TELECOMMAND_NAMES = eINSTANCE.getWebAPIDatabase_TelecommandNames();

		/**
		 * The meta object literal for the '<em><b>Calibration Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__CALIBRATION_NAMES = eINSTANCE.getWebAPIDatabase_CalibrationNames();

		/**
		 * The meta object literal for the '<em><b>Displays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_DATABASE__DISPLAYS = eINSTANCE.getWebAPIDatabase_Displays();

		/**
		 * The meta object literal for the '<em><b>Tm Models</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_DATABASE__TM_MODELS = eINSTANCE.getWebAPIDatabase_TmModels();

		/**
		 * The meta object literal for the '<em><b>Last TM Update Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__LAST_TM_UPDATE_HASH = eINSTANCE.getWebAPIDatabase_LastTMUpdateHash();

		/**
		 * The meta object literal for the '<em><b>Last TC Update Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__LAST_TC_UPDATE_HASH = eINSTANCE.getWebAPIDatabase_LastTCUpdateHash();

		/**
		 * The meta object literal for the '<em><b>Tc Models</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_DATABASE__TC_MODELS = eINSTANCE.getWebAPIDatabase_TcModels();

		/**
		 * The meta object literal for the '<em><b>Calibration Models</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_DATABASE__CALIBRATION_MODELS = eINSTANCE.getWebAPIDatabase_CalibrationModels();

		/**
		 * The meta object literal for the '<em><b>Db Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_DATABASE__DB_CONNECTION = eINSTANCE.getWebAPIDatabase_DbConnection();

		/**
		 * The meta object literal for the '<em><b>Is Telemetry Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_DATABASE___IS_TELEMETRY_PARAMETER__STRING = eINSTANCE.getWebAPIDatabase__IsTelemetryParameter__String();

		/**
		 * The meta object literal for the '<em><b>Is Telecommand</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_DATABASE___IS_TELECOMMAND__STRING = eINSTANCE.getWebAPIDatabase__IsTelecommand__String();

		/**
		 * The meta object literal for the '<em><b>Is Sequence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_DATABASE___IS_SEQUENCE__STRING = eINSTANCE.getWebAPIDatabase__IsSequence__String();

		/**
		 * The meta object literal for the '<em><b>Get Telemetry Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_DATABASE___GET_TELEMETRY_MODEL__STRING = eINSTANCE.getWebAPIDatabase__GetTelemetryModel__String();

		/**
		 * The meta object literal for the '<em><b>Get Telecommand Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_DATABASE___GET_TELECOMMAND_MODEL__STRING = eINSTANCE.getWebAPIDatabase__GetTelecommandModel__String();

		/**
		 * The meta object literal for the '<em><b>Get Calibration Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_DATABASE___GET_CALIBRATION_MODEL__STRING = eINSTANCE.getWebAPIDatabase__GetCalibrationModel__String();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDisplays <em>Web API Displays</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDisplays
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDisplays()
		 * @generated
		 */
		public static final EClass WEB_API_DISPLAYS = eINSTANCE.getWebAPIDisplays();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelemetryModel <em>Web API Telemetry Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelemetryModel
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel()
		 * @generated
		 */
		public static final EClass WEB_API_TELEMETRY_MODEL = eINSTANCE.getWebAPITelemetryModel();

		/**
		 * The meta object literal for the '<em><b>Last Update Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELEMETRY_MODEL__LAST_UPDATE_HASH = eINSTANCE.getWebAPITelemetryModel_LastUpdateHash();

		/**
		 * The meta object literal for the '<em><b>Measuring Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELEMETRY_MODEL__MEASURING_UNIT = eINSTANCE.getWebAPITelemetryModel_MeasuringUnit();

		/**
		 * The meta object literal for the '<em><b>Calibrations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELEMETRY_MODEL__CALIBRATIONS = eINSTANCE.getWebAPITelemetryModel_Calibrations();

		/**
		 * The meta object literal for the '<em><b>Calibration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_TELEMETRY_MODEL__CALIBRATION = eINSTANCE.getWebAPITelemetryModel_Calibration();

		/**
		 * The meta object literal for the '<em><b>Default Calibration Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELEMETRY_MODEL__DEFAULT_CALIBRATION_ID = eINSTANCE.getWebAPITelemetryModel_DefaultCalibrationId();

		/**
		 * The meta object literal for the '<em><b>Monitoring Checks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELEMETRY_MODEL__MONITORING_CHECKS = eINSTANCE.getWebAPITelemetryModel_MonitoringChecks();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_TELEMETRY_MODEL__DATABASE = eINSTANCE.getWebAPITelemetryModel_Database();

		/**
		 * The meta object literal for the '<em><b>Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELEMETRY_MODEL__LOADED = eINSTANCE.getWebAPITelemetryModel_Loaded();

		/**
		 * The meta object literal for the '<em><b>Add Calibration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELEMETRY_MODEL___ADD_CALIBRATION__STRING_BOOLEAN = eINSTANCE.getWebAPITelemetryModel__AddCalibration__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Serialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELEMETRY_MODEL___SERIALIZE__DATAOUTPUTSTREAM = eINSTANCE.getWebAPITelemetryModel__Serialize__DataOutputStream();

		/**
		 * The meta object literal for the '<em><b>Load Parsed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELEMETRY_MODEL___LOAD_PARSED = eINSTANCE.getWebAPITelemetryModel__LoadParsed();

		/**
		 * The meta object literal for the '<em><b>Load Parsed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELEMETRY_MODEL___LOAD_PARSED__JSONOBJECT = eINSTANCE.getWebAPITelemetryModel__LoadParsed__JsonObject();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandModel <em>Web API Telecommand Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandModel
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandModel()
		 * @generated
		 */
		public static final EClass WEB_API_TELECOMMAND_MODEL = eINSTANCE.getWebAPITelecommandModel();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_MODEL__CRITICAL = eINSTANCE.getWebAPITelecommandModel_Critical();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_TELECOMMAND_MODEL__ARGUMENTS = eINSTANCE.getWebAPITelecommandModel_Arguments();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_TELECOMMAND_MODEL__DATABASE = eINSTANCE.getWebAPITelecommandModel_Database();

		/**
		 * The meta object literal for the '<em><b>Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_MODEL__LOADED = eINSTANCE.getWebAPITelecommandModel_Loaded();

		/**
		 * The meta object literal for the '<em><b>Serialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELECOMMAND_MODEL___SERIALIZE__DATAOUTPUTSTREAM = eINSTANCE.getWebAPITelecommandModel__Serialize__DataOutputStream();

		/**
		 * The meta object literal for the '<em><b>Load Parsed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELECOMMAND_MODEL___LOAD_PARSED = eINSTANCE.getWebAPITelecommandModel__LoadParsed();

		/**
		 * The meta object literal for the '<em><b>Load Parsed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELECOMMAND_MODEL___LOAD_PARSED__JSONOBJECT = eINSTANCE.getWebAPITelecommandModel__LoadParsed__JsonObject();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel <em>Web API Calibration Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel()
		 * @generated
		 */
		public static final EClass WEB_API_CALIBRATION_MODEL = eINSTANCE.getWebAPICalibrationModel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_CALIBRATION_MODEL__TYPE = eINSTANCE.getWebAPICalibrationModel_Type();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_CALIBRATION_MODEL__IDENTIFIER = eINSTANCE.getWebAPICalibrationModel_Identifier();

		/**
		 * The meta object literal for the '<em><b>Cached Web API Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_CALIBRATION_MODEL__CACHED_WEB_API_DATA = eINSTANCE.getWebAPICalibrationModel_CachedWebAPIData();

		/**
		 * The meta object literal for the '<em><b>Internal Valid Values</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES = eINSTANCE.getWebAPICalibrationModel_InternalValidValues();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_CALIBRATION_MODEL__DATABASE = eINSTANCE.getWebAPICalibrationModel_Database();

		/**
		 * The meta object literal for the '<em><b>Valid Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_CALIBRATION_MODEL__VALID_VALUES = eINSTANCE.getWebAPICalibrationModel_ValidValues();

		/**
		 * The meta object literal for the '<em><b>Serialize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_CALIBRATION_MODEL___SERIALIZE__DATAOUTPUTSTREAM = eINSTANCE.getWebAPICalibrationModel__Serialize__DataOutputStream();

		/**
		 * The meta object literal for the '<em><b>Get Calibrated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_CALIBRATION_MODEL___GET_CALIBRATED__STRING = eINSTANCE.getWebAPICalibrationModel__GetCalibrated__String();

		/**
		 * The meta object literal for the '<em><b>Is Valid Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_CALIBRATION_MODEL___IS_VALID_VALUE__STRING = eINSTANCE.getWebAPICalibrationModel__IsValidValue__String();

		/**
		 * The meta object literal for the '<em><b>Load Parsed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_CALIBRATION_MODEL___LOAD_PARSED__JSONOBJECT = eINSTANCE.getWebAPICalibrationModel__LoadParsed__JsonObject();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.StringToTMMapEntry <em>String To TM Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.StringToTMMapEntry
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getStringToTMMapEntry()
		 * @generated
		 */
		public static final EClass STRING_TO_TM_MAP_ENTRY = eINSTANCE.getStringToTMMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STRING_TO_TM_MAP_ENTRY__KEY = eINSTANCE.getStringToTMMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STRING_TO_TM_MAP_ENTRY__VALUE = eINSTANCE.getStringToTMMapEntry_Value();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.StringToTCMapEntry <em>String To TC Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.StringToTCMapEntry
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getStringToTCMapEntry()
		 * @generated
		 */
		public static final EClass STRING_TO_TC_MAP_ENTRY = eINSTANCE.getStringToTCMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STRING_TO_TC_MAP_ENTRY__KEY = eINSTANCE.getStringToTCMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STRING_TO_TC_MAP_ENTRY__VALUE = eINSTANCE.getStringToTCMapEntry_Value();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.StringToCalMapEntry <em>String To Cal Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.StringToCalMapEntry
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getStringToCalMapEntry()
		 * @generated
		 */
		public static final EClass STRING_TO_CAL_MAP_ENTRY = eINSTANCE.getStringToCalMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute STRING_TO_CAL_MAP_ENTRY__KEY = eINSTANCE.getStringToCalMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference STRING_TO_CAL_MAP_ENTRY__VALUE = eINSTANCE.getStringToCalMapEntry_Value();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseElement <em>Database Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseElement
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseElement()
		 * @generated
		 */
		public static final EClass DATABASE_ELEMENT = eINSTANCE.getDatabaseElement();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATABASE_ELEMENT__FULL_NAME = eINSTANCE.getDatabaseElement_FullName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATABASE_ELEMENT__DESCRIPTION = eINSTANCE.getDatabaseElement_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATABASE_ELEMENT__NAME = eINSTANCE.getDatabaseElement_Name();

		/**
		 * The meta object literal for the '<em><b>Cached Web API Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATABASE_ELEMENT__CACHED_WEB_API_DATA = eINSTANCE.getDatabaseElement_CachedWebAPIData();

		/**
		 * The meta object literal for the '{@link com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandArgument <em>Web API Telecommand Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandArgument
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument()
		 * @generated
		 */
		public static final EClass WEB_API_TELECOMMAND_ARGUMENT = eINSTANCE.getWebAPITelecommandArgument();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__DESCRIPTION = eINSTANCE.getWebAPITelecommandArgument_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__NAME = eINSTANCE.getWebAPITelecommandArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__LOADED = eINSTANCE.getWebAPITelecommandArgument_Loaded();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__TYPE = eINSTANCE.getWebAPITelecommandArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Radix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__RADIX = eINSTANCE.getWebAPITelecommandArgument_Radix();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__UNITS = eINSTANCE.getWebAPITelecommandArgument_Units();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__DEFAULT_VALUE = eINSTANCE.getWebAPITelecommandArgument_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Calibrated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__CALIBRATED = eINSTANCE.getWebAPITelecommandArgument_Calibrated();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__OPTIONAL = eINSTANCE.getWebAPITelecommandArgument_Optional();

		/**
		 * The meta object literal for the '<em><b>Calibration Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION_ID = eINSTANCE.getWebAPITelecommandArgument_CalibrationId();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_TELECOMMAND_ARGUMENT__DATABASE = eINSTANCE.getWebAPITelecommandArgument_Database();

		/**
		 * The meta object literal for the '<em><b>Calibration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION = eINSTANCE.getWebAPITelecommandArgument_Calibration();

		/**
		 * The meta object literal for the '<em><b>Has Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELECOMMAND_ARGUMENT___HAS_DEFAULT_VALUE = eINSTANCE.getWebAPITelecommandArgument__HasDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Load Parsed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELECOMMAND_ARGUMENT___LOAD_PARSED__JSONOBJECT = eINSTANCE.getWebAPITelecommandArgument__LoadParsed__JsonObject();

		/**
		 * The meta object literal for the '<em><b>Load Parsed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation WEB_API_TELECOMMAND_ARGUMENT___LOAD_PARSED__JSONARRAY = eINSTANCE.getWebAPITelecommandArgument__LoadParsed__JsonArray();

		/**
		 * The meta object literal for the '<em>Calibration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.interfaces.CalibrationType
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getCalibrationType()
		 * @generated
		 */
		public static final EDataType CALIBRATION_TYPE = eINSTANCE.getCalibrationType();

		/**
		 * The meta object literal for the '<em>Json Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.json.JsonObject
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getJsonObject()
		 * @generated
		 */
		public static final EDataType JSON_OBJECT = eINSTANCE.getJsonObject();

		/**
		 * The meta object literal for the '<em>Json Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.json.JsonArray
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getJsonArray()
		 * @generated
		 */
		public static final EDataType JSON_ARRAY = eINSTANCE.getJsonArray();

		/**
		 * The meta object literal for the '<em>ECollection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getECollection()
		 * @generated
		 */
		public static final EDataType ECOLLECTION = eINSTANCE.getECollection();

		/**
		 * The meta object literal for the '<em>Database Connection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.webapi.DatabaseConnection
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseConnection()
		 * @generated
		 */
		public static final EDataType DATABASE_CONNECTION = eINSTANCE.getDatabaseConnection();

		/**
		 * The meta object literal for the '<em>Argument Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.interfaces.ArgumentType
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getArgumentType()
		 * @generated
		 */
		public static final EDataType ARGUMENT_TYPE = eINSTANCE.getArgumentType();

		/**
		 * The meta object literal for the '<em>Monitoring Check</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.interfaces.IMonitoringCheck
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getMonitoringCheck()
		 * @generated
		 */
		public static final EDataType MONITORING_CHECK = eINSTANCE.getMonitoringCheck();

		/**
		 * The meta object literal for the '<em>Radix</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.astra.ses.spell.dev.database.interfaces.Radix
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getRadix()
		 * @generated
		 */
		public static final EDataType RADIX = eINSTANCE.getRadix();

		/**
		 * The meta object literal for the '<em>Data Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.DataOutputStream
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDataOutputStream()
		 * @generated
		 */
		public static final EDataType DATA_OUTPUT_STREAM = eINSTANCE.getDataOutputStream();

		/**
		 * The meta object literal for the '<em>Valid Value Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.LinkedHashSet
		 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getValidValueSet()
		 * @generated
		 */
		public static final EDataType VALID_VALUE_SET = eINSTANCE.getValidValueSet();

	}

} //DbModelPackage
