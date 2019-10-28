/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel;

import com.astra.ses.spell.dev.database.interfaces.CalibrationType;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;

import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import java.io.DataOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.Map.Entry;

import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonString;
import javax.json.JsonStructure;
import javax.json.JsonValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web API Calibration Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getType <em>Type</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getCachedWebAPIData <em>Cached Web API Data</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getInternalValidValues <em>Internal Valid Values</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getDatabase <em>Database</em>}</li>
 * </ul>
 *
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel()
 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ICalibration"
 * @generated
 */
public class WebAPICalibrationModel extends MinimalEObjectImpl.Container implements ICalibration {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CalibrationType TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CalibrationType type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;
	/**
	 * The default value of the '{@link #getCachedWebAPIData() <em>Cached Web API Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedWebAPIData()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHED_WEB_API_DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCachedWebAPIData() <em>Cached Web API Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedWebAPIData()
	 * @generated
	 * @ordered
	 */
	protected String cachedWebAPIData = CACHED_WEB_API_DATA_EDEFAULT;
	/**
	 * The cached value of the '{@link #getInternalValidValues() <em>Internal Valid Values</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalValidValues()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> internalValidValues;
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected ISpellDatabase database;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAPICalibrationModel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbModelPackage.Literals.WEB_API_CALIBRATION_MODEL;
	}

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(CalibrationType)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel_Type()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.CalibrationType"
	 * @generated
	 */
	public CalibrationType getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	public void setType(CalibrationType newType) {
		CalibrationType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_CALIBRATION_MODEL__TYPE, oldType, type));
	}

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel_Identifier()
	 * @model
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_CALIBRATION_MODEL__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * Returns the value of the '<em><b>Cached Web API Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached Web API Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Web API Data</em>' attribute.
	 * @see #setCachedWebAPIData(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel_CachedWebAPIData()
	 * @model
	 * @generated
	 */
	public String getCachedWebAPIData() {
		return cachedWebAPIData;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getCachedWebAPIData <em>Cached Web API Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Web API Data</em>' attribute.
	 * @see #getCachedWebAPIData()
	 * @generated
	 */
	public void setCachedWebAPIData(String newCachedWebAPIData) {
		String oldCachedWebAPIData = cachedWebAPIData;
		cachedWebAPIData = newCachedWebAPIData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_CALIBRATION_MODEL__CACHED_WEB_API_DATA, oldCachedWebAPIData, cachedWebAPIData));
	}

	/**
	 * Returns the value of the '<em><b>Internal Valid Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Valid Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Valid Values</em>' map.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel_InternalValidValues()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	public EMap<String, String> getInternalValidValues() {
		if (internalValidValues == null) {
			internalValidValues = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DbModelPackage.WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES);
		}
		return internalValidValues;
	}

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(ISpellDatabase)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel_Database()
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase"
	 * @generated
	 */
	public ISpellDatabase getDatabase() {
		if (database != null && ((EObject)database).eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (ISpellDatabase)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbModelPackage.WEB_API_CALIBRATION_MODEL__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISpellDatabase basicGetDatabase() {
		return database;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ICalibration#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	public void setDatabase(ISpellDatabase newDatabase) {
		ISpellDatabase oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_CALIBRATION_MODEL__DATABASE, oldDatabase, database));
	}

	/**
	 * Returns the value of the '<em><b>Valid Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Values</em>' attribute list.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPICalibrationModel_ValidValues()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public EList<String> getValidValues() {
		return new BasicEList<String>(getInternalValidValues().values());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model streamDataType="com.astra.ses.spell.dev.database.webapi.dbModel.DataOutputStream"
	 * @generated
	 */
	public void serialize(DataOutputStream stream) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public String getCalibrated(String rawValue) {
		return getInternalValidValues().get(rawValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public boolean isValidValue(String engValue) {
		return getInternalValidValues().values().contains(engValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jsonObjectDataType="com.astra.ses.spell.dev.database.webapi.dbModel.JsonObject"
	 * @generated NOT
	 */
	public void loadParsed(JsonObject calibrations) {
		Set<Entry<String,JsonValue>> entrySet = calibrations.entrySet();
		for (Entry<String, JsonValue> entry : entrySet) {
			try {
				JsonStructure jsonStructure = (JsonStructure) entry.getValue();//((WebAPIDatabase) getDatabase()).getDbConnection().interpret(entry.getKey());
				String rawValue = "";
				if (jsonStructure instanceof JsonArray){
					rawValue = ((JsonArray) jsonStructure).get(0).toString();
				} else if (jsonStructure instanceof JsonValue){
					rawValue = jsonStructure.toString();
				}  
				String engValue = entry.getKey();
				setType(CalibrationType.STATUS);
				getInternalValidValues().put(rawValue, engValue);
			} catch (ClassCastException ex){
				JsonStructure jsonStructure = ((WebAPIDatabase) getDatabase()).getDbConnection().interpret(entry.getKey());
				String rawValue = "";
				if (jsonStructure instanceof JsonArray){
					rawValue = ((JsonArray) jsonStructure).get(0).toString();
				} else if (jsonStructure instanceof JsonValue){
					rawValue = jsonStructure.toString();
				}  
				String engValue = entry.getValue().toString();
				setType(CalibrationType.STATUS);
				getInternalValidValues().put(rawValue, engValue);
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jsonArrayDataType="com.astra.ses.spell.dev.database.webapi.dbModel.JsonArray"
	 * @generated NOT
	 */
	public void loadParsed(JsonArray calibrations) {
		for (JsonValue calibratedPair : calibrations) {
			if (calibratedPair instanceof JsonString) {
				JsonString constantValue  = (JsonString) calibratedPair;
				getInternalValidValues().put(constantValue.getString(), constantValue.getString());
				continue;
			}
			JsonArray calibratedArray  = (JsonArray) calibratedPair;
			
			try {
				JsonValue jsonStructure = calibratedArray.get(0);//((WebAPIDatabase) getDatabase()).getDbConnection().interpret(entry.getKey());
				String rawValue = "";
				if (jsonStructure instanceof JsonArray){
					rawValue = ((JsonArray) jsonStructure).get(0).toString();
				} else if (jsonStructure instanceof JsonValue){
					rawValue = jsonStructure.toString();
				}  
				JsonValue jsonValue = calibratedArray.get(1);
				switch (jsonValue.getValueType()){
				case STRING:
					String engValue = ((JsonString)jsonValue).getString();
					setType(CalibrationType.STATUS);
					getInternalValidValues().put(rawValue, engValue);
					break;
				case NUMBER:
					engValue = ((JsonNumber)jsonValue).toString();
					setType(CalibrationType.STATUS);
					getInternalValidValues().put(rawValue, engValue);
					break;
				default:
					break;
				}
				
			} catch (ClassCastException ex){
				ex.printStackTrace();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES:
				return ((InternalEList<?>)getInternalValidValues()).basicRemove(otherEnd, msgs);
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
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__TYPE:
				return getType();
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__IDENTIFIER:
				return getIdentifier();
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__CACHED_WEB_API_DATA:
				return getCachedWebAPIData();
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__VALID_VALUES:
				return getValidValues();
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES:
				if (coreType) return getInternalValidValues();
				else return getInternalValidValues().map();
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
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
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__TYPE:
				setType((CalibrationType)newValue);
				return;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__CACHED_WEB_API_DATA:
				setCachedWebAPIData((String)newValue);
				return;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES:
				((EStructuralFeature.Setting)getInternalValidValues()).set(newValue);
				return;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__DATABASE:
				setDatabase((ISpellDatabase)newValue);
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
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__CACHED_WEB_API_DATA:
				setCachedWebAPIData(CACHED_WEB_API_DATA_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES:
				getInternalValidValues().clear();
				return;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__DATABASE:
				setDatabase((ISpellDatabase)null);
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
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__CACHED_WEB_API_DATA:
				return CACHED_WEB_API_DATA_EDEFAULT == null ? cachedWebAPIData != null : !CACHED_WEB_API_DATA_EDEFAULT.equals(cachedWebAPIData);
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__VALID_VALUES:
				return !getValidValues().isEmpty();
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__INTERNAL_VALID_VALUES:
				return internalValidValues != null && !internalValidValues.isEmpty();
			case DbModelPackage.WEB_API_CALIBRATION_MODEL__DATABASE:
				return database != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DbModelPackage.WEB_API_CALIBRATION_MODEL___SERIALIZE__DATAOUTPUTSTREAM:
				serialize((DataOutputStream)arguments.get(0));
				return null;
			case DbModelPackage.WEB_API_CALIBRATION_MODEL___GET_CALIBRATED__STRING:
				return getCalibrated((String)arguments.get(0));
			case DbModelPackage.WEB_API_CALIBRATION_MODEL___IS_VALID_VALUE__STRING:
				return isValidValue((String)arguments.get(0));
			case DbModelPackage.WEB_API_CALIBRATION_MODEL___LOAD_PARSED__JSONOBJECT:
				loadParsed((JsonObject)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", cachedWebAPIData: ");
		result.append(cachedWebAPIData);
		result.append(')');
		return result.toString();
	}

} // WebAPICalibrationModel
