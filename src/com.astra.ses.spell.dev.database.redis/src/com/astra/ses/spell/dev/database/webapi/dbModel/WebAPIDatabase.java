/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel;

import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;
import com.astra.ses.spell.dev.database.webapi.DatabaseConnection;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import javax.json.JsonObject;
import javax.json.JsonValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.swt.widgets.Display;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web API Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDatabasePath <em>Database Path</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getName <em>Name</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getVersion <em>Version</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelemetryParameterNames <em>Telemetry Parameter Names</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTelecommandNames <em>Telecommand Names</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getCalibrationNames <em>Calibration Names</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDisplays <em>Displays</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTmModels <em>Tm Models</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getLastTMUpdateHash <em>Last TM Update Hash</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getLastTCUpdateHash <em>Last TC Update Hash</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getTcModels <em>Tc Models</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getCalibrationModels <em>Calibration Models</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDbConnection <em>Db Connection</em>}</li>
 * </ul>
 *
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase()
 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ISpellDatabase"
 * @generated
 */
public class WebAPIDatabase extends MinimalEObjectImpl.Container implements ISpellDatabase {
	/**
	 * The default value of the '{@link #getDatabasePath() <em>Database Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabasePath() <em>Database Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabasePath()
	 * @generated
	 * @ordered
	 */
	protected String databasePath = DATABASE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "\"WebAPI Redis Database\"";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "\"1.0\"";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisplays() <em>Displays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplays()
	 * @generated
	 * @ordered
	 */
	protected EList<ITelemetryDisplayDefinition> displays;

	/**
	 * The cached value of the '{@link #getTmModels() <em>Tm Models</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmModels()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ITelemetryParameter> tmModels;

	/**
	 * The default value of the '{@link #getLastTMUpdateHash() <em>Last TM Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTMUpdateHash()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_TM_UPDATE_HASH_EDEFAULT = "-1";

	/**
	 * The cached value of the '{@link #getLastTMUpdateHash() <em>Last TM Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTMUpdateHash()
	 * @generated
	 * @ordered
	 */
	protected String lastTMUpdateHash = LAST_TM_UPDATE_HASH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastTCUpdateHash() <em>Last TC Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTCUpdateHash()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_TC_UPDATE_HASH_EDEFAULT = "-1";

	/**
	 * The cached value of the '{@link #getLastTCUpdateHash() <em>Last TC Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTCUpdateHash()
	 * @generated
	 * @ordered
	 */
	protected String lastTCUpdateHash = LAST_TC_UPDATE_HASH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTcModels() <em>Tc Models</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcModels()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ITelecommand> tcModels;

	/**
	 * The cached value of the '{@link #getCalibrationModels() <em>Calibration Models</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibrationModels()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, ICalibration> calibrationModels;

	/**
	 * The default value of the '{@link #getDbConnection() <em>Db Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbConnection()
	 * @generated
	 * @ordered
	 */
	protected static final DatabaseConnection DB_CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbConnection() <em>Db Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbConnection()
	 * @generated
	 * @ordered
	 */
	protected DatabaseConnection dbConnection = DB_CONNECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAPIDatabase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbModelPackage.Literals.WEB_API_DATABASE;
	}

	/**
	 * Returns the value of the '<em><b>Database Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Path</em>' attribute.
	 * @see #setDatabasePath(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_DatabasePath()
	 * @model
	 * @generated
	 */
	public String getDatabasePath() {
		return databasePath;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDatabasePath <em>Database Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Path</em>' attribute.
	 * @see #getDatabasePath()
	 * @generated
	 */
	public void setDatabasePath(String newDatabasePath) {
		String oldDatabasePath = databasePath;
		databasePath = newDatabasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_DATABASE__DATABASE_PATH, oldDatabasePath, databasePath));
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"\"WebAPI Redis Database\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_Name()
	 * @model default="\"WebAPI Redis Database\""
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_DATABASE__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"\"1.0\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_Version()
	 * @model default="\"1.0\""
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_DATABASE__VERSION, oldVersion, version));
	}

	/**
	 * Returns the value of the '<em><b>Telemetry Parameter Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telemetry Parameter Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telemetry Parameter Names</em>' attribute.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_TelemetryParameterNames()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.ECollection<org.eclipse.emf.ecore.EString>" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public Collection<String> getTelemetryParameterNames() {
		EMap<String,ITelemetryParameter> models = this.getTmModels();
		synchronized (this) {
			Set<String> keySet = models.keySet();
			String version = null;
			try {
				version = dbConnection.getTMVersion();
			} catch (Exception ex){

			}
			if (version != null && !version.equals(getLastTMUpdateHash())){
				keySet.clear();
			}
			if (!keySet.isEmpty()){

				return keySet;
			}

			String allTM = dbConnection.getAllTM().trim();

			this.setLastTMUpdateHash(version);
			JsonObject allTMObject = dbConnection.interpret(allTM);
			allTM = "";
			if (allTMObject != null){
				for (final Entry<String, JsonValue> tmEntry : allTMObject.entrySet()) {
					if (tmEntry.getValue() instanceof JsonObject){
						String tm = tmEntry.getKey();
						tm = tm.trim();
						//tm = tm.substring(1, tm.length()-1);
						final WebAPITelemetryModel tmModel = new WebAPITelemetryModel(this);
						tmModel.setName(tm);
						tmModel.setFullName(tm);
						tmModel.setDescription("");
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								tmModel.loadParsed((JsonObject) tmEntry.getValue());
								tmModel.setLoaded(true);
							}
						});

						models.put(tm, tmModel);
					} else {
						System.out.println("Unknown entry:  " + tmEntry.getKey());
					}
				}
			}

			keySet = models.keySet();
			if (!keySet.isEmpty()){
				return keySet;
			}
			return Collections.EMPTY_LIST;
		}
	}

	/**
	 * Returns the value of the '<em><b>Telecommand Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecommand Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecommand Names</em>' attribute.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_TelecommandNames()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.ECollection<org.eclipse.emf.ecore.EString>" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public Collection<String> getTelecommandNames() {
		EMap<String, ITelecommand> models = this.getTcModels();
		synchronized (this) {
			Set<String> keySet = models.keySet();
			String version = null;
			try {
				version = dbConnection.getTCVersion();
			} catch (Exception ex){

			}
			if (version != null && !version.equals(getLastTCUpdateHash())){
				keySet.clear();
			}
			if (!keySet.isEmpty()){
				return keySet;
			}
			try {

				String allTM = dbConnection.getAllTC().trim();

				this.setLastTCUpdateHash(version);
				JsonObject allTMObject = dbConnection.interpret(allTM);
				allTM= "";
				if (allTMObject != null){
					for (Entry<String, JsonValue> tmEntry : allTMObject.entrySet()) {
						if (tmEntry.getValue() instanceof JsonObject){
							String tm = tmEntry.getKey();
							tm = tm.trim();
							//tm = tm.substring(1, tm.length()-1);
							WebAPITelecommandModel tmModel = new WebAPITelecommandModel(this);
							tmModel.setName(tm);
							tmModel.setFullName(tm);
							tmModel.setDescription("");

							tmModel.loadParsed((JsonObject) tmEntry.getValue());
							tmModel.setLoaded(true);
							models.put(tm, tmModel);
						} else {
							System.out.println("Unknown entry:  " + tmEntry.getKey());
						}
					}
				}
			} catch (Throwable ex){
				ex.printStackTrace();
			}

			//		String allTM = dbConnection.getAllTC().trim();
			//		allTM = allTM.substring(1, allTM.length() - 1);
			//		String[] splittedTMs = allTM.split(",");
			//		for (String tm : splittedTMs) {
			//			tm = tm.trim();
			//			tm = tm.substring(1, tm.length() - 1);
			//			WebAPITelecommandModel tmModel = new WebAPITelecommandModel(this);
			//			tmModel.setName(tm);
			//			tmModel.setFullName(tm);
			//			tmModel.setDescription("");
			//			
			//			models.put(tm, tmModel);
			//		}
			keySet = models.keySet();
			if (!keySet.isEmpty()){
				return keySet;
			}
			return Collections.EMPTY_LIST;
		}
	}

	/**
	 * Returns the value of the '<em><b>Calibration Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibration Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration Names</em>' attribute.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_CalibrationNames()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.ECollection<org.eclipse.emf.ecore.EString>" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public Collection<String> getCalibrationNames() {
		return getCalibrationModels().keySet();
	}

	/**
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displays</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_Displays()
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDisplays" containment="true"
	 * @generated
	 */
	public EList<ITelemetryDisplayDefinition> getDisplays() {
		if (displays == null) {
			displays = new EObjectContainmentEList<ITelemetryDisplayDefinition>(ITelemetryDisplayDefinition.class, this, DbModelPackage.WEB_API_DATABASE__DISPLAYS);
		}
		return displays;
	}

	/**
	 * Returns the value of the '<em><b>Tm Models</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tm Models</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tm Models</em>' map.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_TmModels()
	 * @model mapType="com.astra.ses.spell.dev.database.webapi.dbModel.StringToTMMapEntry<org.eclipse.emf.ecore.EString, com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelemetryModel>"
	 * @generated
	 */
	public EMap<String, ITelemetryParameter> getTmModels() {
		if (tmModels == null) {
			tmModels = new EcoreEMap<String,ITelemetryParameter>(DbModelPackage.Literals.STRING_TO_TM_MAP_ENTRY, StringToTMMapEntry.class, this, DbModelPackage.WEB_API_DATABASE__TM_MODELS);
		}
		return tmModels;
	}

	/**
	 * Returns the value of the '<em><b>Last TM Update Hash</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last TM Update Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last TM Update Hash</em>' attribute.
	 * @see #setLastTMUpdateHash(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_LastTMUpdateHash()
	 * @model default="-1"
	 * @generated
	 */
	public String getLastTMUpdateHash() {
		return lastTMUpdateHash;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getLastTMUpdateHash <em>Last TM Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last TM Update Hash</em>' attribute.
	 * @see #getLastTMUpdateHash()
	 * @generated
	 */
	public void setLastTMUpdateHash(String newLastTMUpdateHash) {
		String oldLastTMUpdateHash = lastTMUpdateHash;
		lastTMUpdateHash = newLastTMUpdateHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_DATABASE__LAST_TM_UPDATE_HASH, oldLastTMUpdateHash, lastTMUpdateHash));
	}

	/**
	 * Returns the value of the '<em><b>Last TC Update Hash</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last TC Update Hash</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last TC Update Hash</em>' attribute.
	 * @see #setLastTCUpdateHash(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_LastTCUpdateHash()
	 * @model default="-1"
	 * @generated
	 */
	public String getLastTCUpdateHash() {
		return lastTCUpdateHash;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getLastTCUpdateHash <em>Last TC Update Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last TC Update Hash</em>' attribute.
	 * @see #getLastTCUpdateHash()
	 * @generated
	 */
	public void setLastTCUpdateHash(String newLastTCUpdateHash) {
		String oldLastTCUpdateHash = lastTCUpdateHash;
		lastTCUpdateHash = newLastTCUpdateHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_DATABASE__LAST_TC_UPDATE_HASH, oldLastTCUpdateHash, lastTCUpdateHash));
	}

	/**
	 * Returns the value of the '<em><b>Tc Models</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link com.astra.ses.spell.dev.database.interfaces.ITelecommand},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tc Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tc Models</em>' map.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_TcModels()
	 * @model mapType="com.astra.ses.spell.dev.database.webapi.dbModel.StringToTCMapEntry<org.eclipse.emf.ecore.EString, com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandModel>"
	 * @generated
	 */
	public EMap<String, ITelecommand> getTcModels() {
		if (tcModels == null) {
			tcModels = new EcoreEMap<String,ITelecommand>(DbModelPackage.Literals.STRING_TO_TC_MAP_ENTRY, StringToTCMapEntry.class, this, DbModelPackage.WEB_API_DATABASE__TC_MODELS);
		}
		return tcModels;
	}

	/**
	 * Returns the value of the '<em><b>Calibration Models</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link com.astra.ses.spell.dev.database.interfaces.ICalibration},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibration Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration Models</em>' map.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_CalibrationModels()
	 * @model mapType="com.astra.ses.spell.dev.database.webapi.dbModel.StringToCalMapEntry<org.eclipse.emf.ecore.EString, com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel>"
	 * @generated
	 */
	public EMap<String, ICalibration> getCalibrationModels() {
		if (calibrationModels == null) {
			calibrationModels = new EcoreEMap<String,ICalibration>(DbModelPackage.Literals.STRING_TO_CAL_MAP_ENTRY, StringToCalMapEntry.class, this, DbModelPackage.WEB_API_DATABASE__CALIBRATION_MODELS);
		}
		return calibrationModels;
	}

	/**
	 * Returns the value of the '<em><b>Db Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Connection</em>' attribute.
	 * @see #setDbConnection(DatabaseConnection)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDatabase_DbConnection()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseConnection"
	 * @generated
	 */
	public DatabaseConnection getDbConnection() {
		return dbConnection;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ISpellDatabase#getDbConnection <em>Db Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Connection</em>' attribute.
	 * @see #getDbConnection()
	 * @generated
	 */
	public void setDbConnection(DatabaseConnection newDbConnection) {
		DatabaseConnection oldDbConnection = dbConnection;
		dbConnection = newDbConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_DATABASE__DB_CONNECTION, oldDbConnection, dbConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public boolean isTelemetryParameter(String mnemonic) {
		return getTmModels().containsKey(mnemonic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public boolean isTelecommand(String mnemonic) {
		return getTcModels().containsKey(mnemonic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public boolean isSequence(String mnemonic) {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelemetryModel"
	 * @generated NOT
	 */
	public ITelemetryParameter getTelemetryModel(String mnemonic) {
		return getTmModels().get(mnemonic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandModel"
	 * @generated NOT
	 */
	public ITelecommand getTelecommandModel(String mnemonic) {
		return getTcModels().get(mnemonic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel"
	 * @generated NOT
	 */
	public ICalibration getCalibrationModel(String mnemonic) {
		ICalibration calibration = getCalibrationModels().get(mnemonic);
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DbModelPackage.WEB_API_DATABASE__DISPLAYS:
				return ((InternalEList<?>)getDisplays()).basicRemove(otherEnd, msgs);
			case DbModelPackage.WEB_API_DATABASE__TM_MODELS:
				return ((InternalEList<?>)getTmModels()).basicRemove(otherEnd, msgs);
			case DbModelPackage.WEB_API_DATABASE__TC_MODELS:
				return ((InternalEList<?>)getTcModels()).basicRemove(otherEnd, msgs);
			case DbModelPackage.WEB_API_DATABASE__CALIBRATION_MODELS:
				return ((InternalEList<?>)getCalibrationModels()).basicRemove(otherEnd, msgs);
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
			case DbModelPackage.WEB_API_DATABASE__DATABASE_PATH:
				return getDatabasePath();
			case DbModelPackage.WEB_API_DATABASE__NAME:
				return getName();
			case DbModelPackage.WEB_API_DATABASE__VERSION:
				return getVersion();
			case DbModelPackage.WEB_API_DATABASE__TELEMETRY_PARAMETER_NAMES:
				return getTelemetryParameterNames();
			case DbModelPackage.WEB_API_DATABASE__TELECOMMAND_NAMES:
				return getTelecommandNames();
			case DbModelPackage.WEB_API_DATABASE__CALIBRATION_NAMES:
				return getCalibrationNames();
			case DbModelPackage.WEB_API_DATABASE__DISPLAYS:
				return getDisplays();
			case DbModelPackage.WEB_API_DATABASE__TM_MODELS:
				if (coreType) return getTmModels();
				else return getTmModels().map();
			case DbModelPackage.WEB_API_DATABASE__LAST_TM_UPDATE_HASH:
				return getLastTMUpdateHash();
			case DbModelPackage.WEB_API_DATABASE__LAST_TC_UPDATE_HASH:
				return getLastTCUpdateHash();
			case DbModelPackage.WEB_API_DATABASE__TC_MODELS:
				if (coreType) return getTcModels();
				else return getTcModels().map();
			case DbModelPackage.WEB_API_DATABASE__CALIBRATION_MODELS:
				if (coreType) return getCalibrationModels();
				else return getCalibrationModels().map();
			case DbModelPackage.WEB_API_DATABASE__DB_CONNECTION:
				return getDbConnection();
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
			case DbModelPackage.WEB_API_DATABASE__DATABASE_PATH:
				setDatabasePath((String)newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__NAME:
				setName((String)newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__VERSION:
				setVersion((String)newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__DISPLAYS:
				getDisplays().clear();
				getDisplays().addAll((Collection<? extends ITelemetryDisplayDefinition>)newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__TM_MODELS:
				((EStructuralFeature.Setting)getTmModels()).set(newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__LAST_TM_UPDATE_HASH:
				setLastTMUpdateHash((String)newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__LAST_TC_UPDATE_HASH:
				setLastTCUpdateHash((String)newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__TC_MODELS:
				((EStructuralFeature.Setting)getTcModels()).set(newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__CALIBRATION_MODELS:
				((EStructuralFeature.Setting)getCalibrationModels()).set(newValue);
				return;
			case DbModelPackage.WEB_API_DATABASE__DB_CONNECTION:
				setDbConnection((DatabaseConnection)newValue);
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
			case DbModelPackage.WEB_API_DATABASE__DATABASE_PATH:
				setDatabasePath(DATABASE_PATH_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_DATABASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_DATABASE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_DATABASE__DISPLAYS:
				getDisplays().clear();
				return;
			case DbModelPackage.WEB_API_DATABASE__TM_MODELS:
				getTmModels().clear();
				return;
			case DbModelPackage.WEB_API_DATABASE__LAST_TM_UPDATE_HASH:
				setLastTMUpdateHash(LAST_TM_UPDATE_HASH_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_DATABASE__LAST_TC_UPDATE_HASH:
				setLastTCUpdateHash(LAST_TC_UPDATE_HASH_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_DATABASE__TC_MODELS:
				getTcModels().clear();
				return;
			case DbModelPackage.WEB_API_DATABASE__CALIBRATION_MODELS:
				getCalibrationModels().clear();
				return;
			case DbModelPackage.WEB_API_DATABASE__DB_CONNECTION:
				setDbConnection(DB_CONNECTION_EDEFAULT);
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
			case DbModelPackage.WEB_API_DATABASE__DATABASE_PATH:
				return DATABASE_PATH_EDEFAULT == null ? databasePath != null : !DATABASE_PATH_EDEFAULT.equals(databasePath);
			case DbModelPackage.WEB_API_DATABASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DbModelPackage.WEB_API_DATABASE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DbModelPackage.WEB_API_DATABASE__TELEMETRY_PARAMETER_NAMES:
				return getTelemetryParameterNames() != null;
			case DbModelPackage.WEB_API_DATABASE__TELECOMMAND_NAMES:
				return getTelecommandNames() != null;
			case DbModelPackage.WEB_API_DATABASE__CALIBRATION_NAMES:
				return getCalibrationNames() != null;
			case DbModelPackage.WEB_API_DATABASE__DISPLAYS:
				return displays != null && !displays.isEmpty();
			case DbModelPackage.WEB_API_DATABASE__TM_MODELS:
				return tmModels != null && !tmModels.isEmpty();
			case DbModelPackage.WEB_API_DATABASE__LAST_TM_UPDATE_HASH:
				return LAST_TM_UPDATE_HASH_EDEFAULT == null ? lastTMUpdateHash != null : !LAST_TM_UPDATE_HASH_EDEFAULT.equals(lastTMUpdateHash);
			case DbModelPackage.WEB_API_DATABASE__LAST_TC_UPDATE_HASH:
				return LAST_TC_UPDATE_HASH_EDEFAULT == null ? lastTCUpdateHash != null : !LAST_TC_UPDATE_HASH_EDEFAULT.equals(lastTCUpdateHash);
			case DbModelPackage.WEB_API_DATABASE__TC_MODELS:
				return tcModels != null && !tcModels.isEmpty();
			case DbModelPackage.WEB_API_DATABASE__CALIBRATION_MODELS:
				return calibrationModels != null && !calibrationModels.isEmpty();
			case DbModelPackage.WEB_API_DATABASE__DB_CONNECTION:
				return DB_CONNECTION_EDEFAULT == null ? dbConnection != null : !DB_CONNECTION_EDEFAULT.equals(dbConnection);
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
			case DbModelPackage.WEB_API_DATABASE___IS_TELEMETRY_PARAMETER__STRING:
				return isTelemetryParameter((String)arguments.get(0));
			case DbModelPackage.WEB_API_DATABASE___IS_TELECOMMAND__STRING:
				return isTelecommand((String)arguments.get(0));
			case DbModelPackage.WEB_API_DATABASE___IS_SEQUENCE__STRING:
				return isSequence((String)arguments.get(0));
			case DbModelPackage.WEB_API_DATABASE___GET_TELEMETRY_MODEL__STRING:
				return getTelemetryModel((String)arguments.get(0));
			case DbModelPackage.WEB_API_DATABASE___GET_TELECOMMAND_MODEL__STRING:
				return getTelecommandModel((String)arguments.get(0));
			case DbModelPackage.WEB_API_DATABASE___GET_CALIBRATION_MODEL__STRING:
				return getCalibrationModel((String)arguments.get(0));
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
		result.append(" (databasePath: ");
		result.append(databasePath);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", lastTMUpdateHash: ");
		result.append(lastTMUpdateHash);
		result.append(", lastTCUpdateHash: ");
		result.append(lastTCUpdateHash);
		result.append(", dbConnection: ");
		result.append(dbConnection);
		result.append(')');
		return result.toString();
	}

} // WebAPIDatabase
