/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel;

import java.io.DataOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map.Entry;

import javax.json.JsonObject;
import javax.json.JsonString;
import javax.json.JsonValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.database.webapi.DatabaseConnection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web API Telecommand Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#isCritical <em>Critical</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#getArguments <em>Arguments</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#isLoaded <em>Loaded</em>}</li>
 * </ul>
 *
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandModel()
 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ITelecommand" superTypes="com.astra.ses.spell.dev.database.webapi.dbModel.DatabaseElement"
 * @generated
 */
public class WebAPITelecommandModel extends DatabaseElement implements ITelecommand {
	/**
	 * The default value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRITICAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCritical()
	 * @generated
	 * @ordered
	 */
	protected boolean critical = CRITICAL_EDEFAULT;
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ITelecommandArgument> arguments;

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
	public WebAPITelecommandModel() {
		super();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WebAPITelecommandModel(WebAPIDatabase db) {
		super();
		this.setDatabase(db);
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbModelPackage.Literals.WEB_API_TELECOMMAND_MODEL;
	}

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see #setCritical(boolean)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandModel_Critical()
	 * @model
	 * @generated
	 */
	public boolean isCritical() {
		return critical;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#isCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see #isCritical()
	 * @generated
	 */
	public void setCritical(boolean newCritical) {
		boolean oldCritical = critical;
		critical = newCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_MODEL__CRITICAL, oldCritical, critical));
	}

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandModel_Arguments()
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPITelecommandArgument"
	 * @generated
	 */
	public EList<ITelecommandArgument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<ITelecommandArgument>(ITelecommandArgument.class, this, DbModelPackage.WEB_API_TELECOMMAND_MODEL__ARGUMENTS);
		}
		return arguments;
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
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandModel_Database()
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase"
	 * @generated
	 */
	public ISpellDatabase getDatabase() {
		if (database != null && ((EObject)database).eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (ISpellDatabase)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbModelPackage.WEB_API_TELECOMMAND_MODEL__DATABASE, oldDatabase, database));
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
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#getDatabase <em>Database</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_MODEL__DATABASE, oldDatabase, database));
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
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandModel_Loaded()
	 * @model default="false"
	 * @generated
	 */
	public boolean isLoaded() {
		return loaded;
	}


	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommand#isLoaded <em>Loaded</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_MODEL__LOADED, oldLoaded, loaded));
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
	public void loadParsed() {
		if (this.isLoaded())
			return;
		DatabaseConnection dbConnection = ((WebAPIDatabase) database).getDbConnection();
		if (this.getCachedWebAPIData() == null || this.getCachedWebAPIData().isEmpty()){
			String tmData = dbConnection.getTC(this.getName());
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
		
		this.setDescription(description.getString());
		try {
			if (jsonObject.get("args") != JsonValue.NULL){
				JsonObject args = jsonObject.getJsonObject("args");
				for (Entry<String, JsonValue> iTelecommandArgument : args.entrySet()) {
					WebAPITelecommandArgument arg = new WebAPITelecommandArgument(getDatabase());
					arg.loadParsed((JsonObject) iTelecommandArgument.getValue());
					getArguments().add(arg);
				}
			}
		} catch (Exception ex){
			ex.printStackTrace();
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
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__CRITICAL:
				return isCritical();
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__ARGUMENTS:
				return getArguments();
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__LOADED:
				return isLoaded();
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
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__CRITICAL:
				setCritical((Boolean)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends ITelecommandArgument>)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__DATABASE:
				setDatabase((ISpellDatabase)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__LOADED:
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
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__ARGUMENTS:
				getArguments().clear();
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__DATABASE:
				setDatabase((ISpellDatabase)null);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__LOADED:
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
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__DATABASE:
				return database != null;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL__LOADED:
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
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL___SERIALIZE__DATAOUTPUTSTREAM:
				serialize((DataOutputStream)arguments.get(0));
				return null;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL___LOAD_PARSED:
				loadParsed();
				return null;
			case DbModelPackage.WEB_API_TELECOMMAND_MODEL___LOAD_PARSED__JSONOBJECT:
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
		result.append(" (critical: ");
		result.append(critical);
		result.append(", loaded: ");
		result.append(loaded);
		result.append(')');
		return result.toString();
	}

} // WebAPITelecommandModel
