/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel;

import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.IMonitoringCheck;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;
import com.astra.ses.spell.dev.database.webapi.DatabaseConnection;

import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonString;
import javax.json.JsonValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web API Telemetry Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getLastUpdateHash <em>Last Update Hash</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getMeasuringUnit <em>Measuring Unit</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getCalibrations <em>Calibrations</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getCalibration <em>Calibration</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getDefaultCalibrationId <em>Default Calibration Id</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getMonitoringChecks <em>Monitoring Checks</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#isLoaded <em>Loaded</em>}</li>
 * </ul>
 *
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel()
 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter" superTypes="com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseElement"
 * @generated
 */
public class WebAPITelemetryModel extends DatabaseElement implements ITelemetryParameter {
	/**
	 * The default value of the '{@link #getLastUpdateHash() <em>Last Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateHash()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_UPDATE_HASH_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getLastUpdateHash() <em>Last Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateHash()
	 * @generated
	 * @ordered
	 */
	protected int lastUpdateHash = LAST_UPDATE_HASH_EDEFAULT;
	/**
	 * The default value of the '{@link #getMeasuringUnit() <em>Measuring Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuringUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURING_UNIT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMeasuringUnit() <em>Measuring Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuringUnit()
	 * @generated
	 * @ordered
	 */
	protected String measuringUnit = MEASURING_UNIT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getCalibration() <em>Calibration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibration()
	 * @generated
	 * @ordered
	 */
	protected ICalibration calibration;
	/**
	 * The default value of the '{@link #getDefaultCalibrationId() <em>Default Calibration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCalibrationId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_CALIBRATION_ID_EDEFAULT = null;
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
	 * The default value of the '{@link #isLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOADED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoaded()
	 * @generated
	 * @ordered
	 */
	protected boolean loaded = LOADED_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAPITelemetryModel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WebAPITelemetryModel(WebAPIDatabase db) {
		super();
		this.setDatabase(db);
		//loadParsed();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbModelPackage.Literals.WEB_API_TELEMETRY_MODEL;
	}

	/**
	 * Returns the value of the '<em><b>Last Update Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update Hash</em>' attribute.
	 * @see #setLastUpdateHash(int)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel_LastUpdateHash()
	 * @model
	 * @generated
	 */
	public int getLastUpdateHash() {
		return lastUpdateHash;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getLastUpdateHash <em>Last Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update Hash</em>' attribute.
	 * @see #getLastUpdateHash()
	 * @generated
	 */
	public void setLastUpdateHash(int newLastUpdateHash) {
		int oldLastUpdateHash = lastUpdateHash;
		lastUpdateHash = newLastUpdateHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELEMETRY_MODEL__LAST_UPDATE_HASH, oldLastUpdateHash, lastUpdateHash));
	}

	/**
	 * Returns the value of the '<em><b>Measuring Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measuring Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measuring Unit</em>' attribute.
	 * @see #setMeasuringUnit(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel_MeasuringUnit()
	 * @model
	 * @generated
	 */
	public String getMeasuringUnit() {
		return measuringUnit;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getMeasuringUnit <em>Measuring Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measuring Unit</em>' attribute.
	 * @see #getMeasuringUnit()
	 * @generated
	 */
	public void setMeasuringUnit(String newMeasuringUnit) {
		String oldMeasuringUnit = measuringUnit;
		measuringUnit = newMeasuringUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELEMETRY_MODEL__MEASURING_UNIT, oldMeasuringUnit, measuringUnit));
	}

	/**
	 * Returns the value of the '<em><b>Calibrations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibrations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibrations</em>' attribute.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel_Calibrations()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.ECollection<org.eclipse.emf.ecore.EString>" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public Collection<String> getCalibrations() {
		return this.getCalibration().getValidValues();
	}

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' reference.
	 * @see #setCalibration(ICalibration)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel_Calibration()
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel"
	 * @generated
	 */
	public ICalibration getCalibration() {
		if (calibration != null && ((EObject)calibration).eIsProxy()) {
			InternalEObject oldCalibration = (InternalEObject)calibration;
			calibration = (ICalibration)eResolveProxy(oldCalibration);
			if (calibration != oldCalibration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbModelPackage.WEB_API_TELEMETRY_MODEL__CALIBRATION, oldCalibration, calibration));
			}
		}
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICalibration basicGetCalibration() {
		return calibration;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getCalibration <em>Calibration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration</em>' reference.
	 * @see #getCalibration()
	 * @generated
	 */
	public void setCalibration(ICalibration newCalibration) {
		ICalibration oldCalibration = calibration;
		calibration = newCalibration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELEMETRY_MODEL__CALIBRATION, oldCalibration, calibration));
	}

	/**
	 * Returns the value of the '<em><b>Default Calibration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Calibration Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Calibration Id</em>' attribute.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel_DefaultCalibrationId()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public String getDefaultCalibrationId() {
		if (!isLoaded())
			this.loadParsed();
		if (this.getCalibration() == null){
			return "";
		}
		return this.getCalibration().getIdentifier();
	}

	/**
	 * Returns the value of the '<em><b>Monitoring Checks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring Checks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Checks</em>' attribute.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel_MonitoringChecks()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.ECollection<? extends com.astra.ses.spell.dev.database.webapi.dbModel.MonitoringCheck>" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	public Collection<? extends IMonitoringCheck> getMonitoringChecks() {
		// TODO: implement this method to return the 'Monitoring Checks' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel_Database()
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase"
	 * @generated
	 */
	public ISpellDatabase getDatabase() {
		if (database != null && ((EObject)database).eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (ISpellDatabase)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbModelPackage.WEB_API_TELEMETRY_MODEL__DATABASE, oldDatabase, database));
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
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#getDatabase <em>Database</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELEMETRY_MODEL__DATABASE, oldDatabase, database));
	}

	/**
	 * Returns the value of the '<em><b>Loaded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded</em>' attribute.
	 * @see #setLoaded(boolean)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelemetryModel_Loaded()
	 * @model default="false"
	 * @generated
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter#isLoaded <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded</em>' attribute.
	 * @see #isLoaded()
	 * @generated
	 */
	public void setLoaded(boolean newLoaded) {
		boolean oldLoaded = loaded;
		loaded = newLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELEMETRY_MODEL__LOADED, oldLoaded, loaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void addCalibration(String calibrationId, boolean defaultRepresentation) {
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model streamDataType="com.astra.ses.spell.dev.database.webapi.dbModel.DataOutputStream"
	 * @generated NOT
	 */
	public void serialize(DataOutputStream stream) {
		if (!isLoaded())
			loadParsed();
		
		try
		{
			stream.writeInt(getName().length());
			stream.write(getName().getBytes());
			stream.writeInt(getDescription().length());
			stream.write(getDescription().replace("'", "\\'").getBytes());
			stream.writeInt(getMeasuringUnit().length());
			stream.write(getMeasuringUnit().getBytes());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void loadParsed() {
		if (this.isLoaded())
			return;
		DatabaseConnection dbConnection = ((WebAPIDatabase) database).getDbConnection();
		if (this.getCachedWebAPIData() == null || this.getCachedWebAPIData().isEmpty()){
			String tmData = dbConnection.getTM(this.getName());
			this.setCachedWebAPIData(tmData);
		}
		try {
			String webAPIData = this.getCachedWebAPIData();
			if (webAPIData.isEmpty()){
				System.err.println("Could not find " + getFullName() + "!");
				return;
			}
			JsonObject interpreted = dbConnection.interpret(webAPIData);
			loadParsed(interpreted);
			this.setLoaded(true);


		} catch (Throwable ex){
			ex.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jsonObjectDataType="com.astra.ses.spell.dev.database.webapi.dbModel.JsonObject"
	 * @generated NOT
	 */
	public void loadParsed(JsonObject jsonObject) {
		if (jsonObject == null)
			return;
		JsonString mnemonic = jsonObject.getJsonString("mnemonic");
		JsonString description = jsonObject.getJsonString("description");
		JsonString unit = jsonObject.getJsonString("unit");
		JsonArray datatype = jsonObject.getJsonArray("datatype");
		JsonValue rawCalibrations = jsonObject.get("calibrations");
		//JsonArray range = jsonObject.getJsonArray("range");
		this.setDescription(description.getString());
		this.setMeasuringUnit(unit.getString());
		
		if (rawCalibrations instanceof JsonObject){
			WebAPICalibrationModel model = new WebAPICalibrationModel();
			JsonObject calibrations = (JsonObject) rawCalibrations;
			model.loadParsed(calibrations);
			
			if (!model.getInternalValidValues().isEmpty()){
				this.setCalibration(model);
				model.setIdentifier("CAL-" + this.getFullName());
				((WebAPIDatabase)this.database).getCalibrationModels().put("CAL-" + this.getFullName(), model);
			}
		}
		if (rawCalibrations instanceof JsonArray){
			WebAPICalibrationModel model = new WebAPICalibrationModel();
			JsonArray calibrations = (JsonArray) rawCalibrations;
			model.loadParsed(calibrations);
			
			if (!model.getInternalValidValues().isEmpty()){
				this.setCalibration(model);
				model.setIdentifier("CAL-" + this.getFullName());
				((WebAPIDatabase)this.database).getCalibrationModels().put("CAL-" + this.getFullName(), model);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__LAST_UPDATE_HASH:
				return getLastUpdateHash();
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__MEASURING_UNIT:
				return getMeasuringUnit();
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__CALIBRATIONS:
				return getCalibrations();
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__CALIBRATION:
				if (resolve) return getCalibration();
				return basicGetCalibration();
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__DEFAULT_CALIBRATION_ID:
				return getDefaultCalibrationId();
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__MONITORING_CHECKS:
				return getMonitoringChecks();
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__LOADED:
				return isLoaded();
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
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__LAST_UPDATE_HASH:
				setLastUpdateHash((Integer)newValue);
				return;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__MEASURING_UNIT:
				setMeasuringUnit((String)newValue);
				return;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__CALIBRATION:
				setCalibration((ICalibration)newValue);
				return;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__DATABASE:
				setDatabase((ISpellDatabase)newValue);
				return;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__LOADED:
				setLoaded((Boolean)newValue);
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
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__LAST_UPDATE_HASH:
				setLastUpdateHash(LAST_UPDATE_HASH_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__MEASURING_UNIT:
				setMeasuringUnit(MEASURING_UNIT_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__CALIBRATION:
				setCalibration((ICalibration)null);
				return;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__DATABASE:
				setDatabase((ISpellDatabase)null);
				return;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__LOADED:
				setLoaded(LOADED_EDEFAULT);
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
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__LAST_UPDATE_HASH:
				return lastUpdateHash != LAST_UPDATE_HASH_EDEFAULT;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__MEASURING_UNIT:
				return MEASURING_UNIT_EDEFAULT == null ? measuringUnit != null : !MEASURING_UNIT_EDEFAULT.equals(measuringUnit);
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__CALIBRATIONS:
				return getCalibrations() != null;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__CALIBRATION:
				return calibration != null;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__DEFAULT_CALIBRATION_ID:
				return DEFAULT_CALIBRATION_ID_EDEFAULT == null ? getDefaultCalibrationId() != null : !DEFAULT_CALIBRATION_ID_EDEFAULT.equals(getDefaultCalibrationId());
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__MONITORING_CHECKS:
				return getMonitoringChecks() != null;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__DATABASE:
				return database != null;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL__LOADED:
				return loaded != LOADED_EDEFAULT;
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
			case DbModelPackage.WEB_API_TELEMETRY_MODEL___ADD_CALIBRATION__STRING_BOOLEAN:
				addCalibration((String)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL___SERIALIZE__DATAOUTPUTSTREAM:
				serialize((DataOutputStream)arguments.get(0));
				return null;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL___LOAD_PARSED:
				loadParsed();
				return null;
			case DbModelPackage.WEB_API_TELEMETRY_MODEL___LOAD_PARSED__JSONOBJECT:
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
		result.append(" (lastUpdateHash: ");
		result.append(lastUpdateHash);
		result.append(", measuringUnit: ");
		result.append(measuringUnit);
		result.append(", loaded: ");
		result.append(loaded);
		result.append(')');
		return result.toString();
	}

} // WebAPITelemetryModel
