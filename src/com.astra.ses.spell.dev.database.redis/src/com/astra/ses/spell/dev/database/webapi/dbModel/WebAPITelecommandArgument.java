/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel;

import com.astra.ses.spell.dev.database.interfaces.ArgumentType;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.database.interfaces.Radix;
import java.lang.reflect.InvocationTargetException;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.jface.viewers.deferred.SetModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web API Telecommand Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDescription <em>Description</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getName <em>Name</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isLoaded <em>Loaded</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getType <em>Type</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getRadix <em>Radix</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getUnits <em>Units</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isCalibrated <em>Calibrated</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getCalibrationId <em>Calibration Id</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDatabase <em>Database</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getCalibration <em>Calibration</em>}</li>
 * </ul>
 *
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument()
 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument"
 * @generated
 */
public class WebAPITelecommandArgument extends MinimalEObjectImpl.Container implements ITelecommandArgument {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ArgumentType TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ArgumentType type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getRadix() <em>Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadix()
	 * @generated
	 * @ordered
	 */
	protected static final Radix RADIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRadix() <em>Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadix()
	 * @generated
	 * @ordered
	 */
	protected Radix radix = RADIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #isCalibrated() <em>Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCalibrated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALIBRATED_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;
	/**
	 * The default value of the '{@link #getCalibrationId() <em>Calibration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibrationId()
	 * @generated
	 * @ordered
	 */
	protected static final String CALIBRATION_ID_EDEFAULT = null;

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
	 * The cached value of the '{@link #getCalibration() <em>Calibration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibration()
	 * @generated
	 * @ordered
	 */
	protected ICalibration calibration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAPITelecommandArgument() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param iSpellDatabase 
	 * @generated NOT
	 */
	public WebAPITelecommandArgument(ISpellDatabase iSpellDatabase) {
		super();
		setDatabase(iSpellDatabase);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbModelPackage.Literals.WEB_API_TELECOMMAND_ARGUMENT;
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Description()
	 * @model
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getName <em>Name</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__NAME, oldName, name));
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
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Loaded()
	 * @model default="false"
	 * @generated
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isLoaded <em>Loaded</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__LOADED, oldLoaded, loaded));
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
	 * @see #setType(ArgumentType)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Type()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.ArgumentType"
	 * @generated
	 */
	public ArgumentType getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	public void setType(ArgumentType newType) {
		ArgumentType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__TYPE, oldType, type));
	}

	/**
	 * Returns the value of the '<em><b>Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radix</em>' attribute.
	 * @see #setRadix(Radix)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Radix()
	 * @model dataType="com.astra.ses.spell.dev.database.webapi.dbModel.Radix"
	 * @generated
	 */
	public Radix getRadix() {
		return radix;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getRadix <em>Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radix</em>' attribute.
	 * @see #getRadix()
	 * @generated
	 */
	public void setRadix(Radix newRadix) {
		Radix oldRadix = radix;
		radix = newRadix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__RADIX, oldRadix, radix));
	}

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Units()
	 * @model
	 * @generated
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__UNITS, oldUnits, units));
	}

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_DefaultValue()
	 * @model
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * Returns the value of the '<em><b>Calibrated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibrated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibrated</em>' attribute.
	 * @see #setCalibrated(boolean)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Calibrated()
	 * @model volatile="true" derived="true"
	 * @generated NOT
	 */
	public boolean isCalibrated() {
		return getCalibration() != null;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isCalibrated <em>Calibrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrated</em>' attribute.
	 * @see #isCalibrated()
	 * @generated
	 */
	public void setCalibrated(boolean newCalibrated) {
		// TODO: implement this method to set the 'Calibrated' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Optional()
	 * @model
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__OPTIONAL, oldOptional, optional));
	}

	/**
	 * Returns the value of the '<em><b>Calibration Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calibration Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration Id</em>' attribute.
	 * @see #setCalibrationId(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_CalibrationId()
	 * @model volatile="true" derived="true"
	 * @generated NOT
	 */
	public String getCalibrationId() {
		if (this.getCalibration() == null){
			return "";
		}
		return getCalibration().getIdentifier();
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getCalibrationId <em>Calibration Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration Id</em>' attribute.
	 * @see #getCalibrationId()
	 * @generated
	 */
	public void setCalibrationId(String newCalibrationId) {
		// TODO: implement this method to set the 'Calibration Id' attribute
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
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Database()
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase"
	 * @generated
	 */
	public ISpellDatabase getDatabase() {
		if (database != null && ((EObject)database).eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (ISpellDatabase)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DATABASE, oldDatabase, database));
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
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getDatabase <em>Database</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DATABASE, oldDatabase, database));
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
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPITelecommandArgument_Calibration()
	 * @model type="com.astra.ses.spell.dev.database.webapi.dbModel.WebAPICalibrationModel"
	 * @generated
	 */
	public ICalibration getCalibration() {
		if (calibration != null && ((EObject)calibration).eIsProxy()) {
			InternalEObject oldCalibration = (InternalEObject)calibration;
			calibration = (ICalibration)eResolveProxy(oldCalibration);
			if (calibration != oldCalibration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION, oldCalibration, calibration));
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
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument#getCalibration <em>Calibration</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION, oldCalibration, calibration));
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public boolean hasDefaultValue() {
		return defaultValue != null && !defaultValue.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jsonObjectDataType="com.astra.ses.spell.dev.database.webapi.dbModel.JsonObject"
	 * @generated NOT
	 */
	public void loadParsed(JsonObject jsonObject) {
		if (jsonObject.isNull("description")) {
			System.err.println("Name for argument was null!");
			setLoaded(true);
			return;
		}
		String name = jsonObject.getString("description");
		if ("Active_Generic_Sel".equals(name))
			setOptional(true);
		setName(name);

		setDescription(name);
		JsonValue jsonValue = jsonObject.get("default");
		String defaultValue;
		switch (jsonValue.getValueType()){
		case NUMBER:
			defaultValue = ""+jsonValue.toString()+"";break;
		case STRING:
			defaultValue = "'"+jsonValue.toString()+"'";break;
		case TRUE:
			defaultValue = "True";break;
		case FALSE:
			defaultValue = "False";break;
		case NULL:
			defaultValue = "None";break;
		default:
			defaultValue = "UNKNOWN";
		}
		setDefaultValue(defaultValue);
		String type = jsonObject.getString("datatype");
		if (type != null && !type.isEmpty()){
			setType(ArgumentType.getTypeFromChar(type.charAt(0)));
		} else {
			setType(ArgumentType.ASCII);
		}
		
		//jsonObject.getString("flag");
		JsonArray rangeArray = jsonObject.getJsonArray("range");
		if (rangeArray != JsonObject.NULL){
			if (rangeArray.get(0).equals(rangeArray.get(1))){
				setOptional(true);
			}
			
			setUnits(rangeArray.toString());
		}
		JsonValue calibration = jsonObject.get("calibrations");
		if (calibration != JsonObject.NULL){
			WebAPICalibrationModel model = null;
			if (calibration instanceof JsonObject){
				model = new WebAPICalibrationModel();
				JsonObject calibrations = (JsonObject) calibration;
				model.loadParsed(calibrations);
			}
			if (calibration instanceof JsonArray){
				model = new WebAPICalibrationModel();
				JsonArray calibrations = (JsonArray) calibration;
				model.loadParsed(calibrations);
			}
			if (model != null){
				if (!model.getInternalValidValues().isEmpty()){
					this.setCalibration(model);
					model.setIdentifier("CAL-ARG-" + this.getName() + "-" + calibration.toString().hashCode());
					((WebAPIDatabase)this.database).getCalibrationModels().put(model.getIdentifier(), model);
					defaultValue = getDefaultValue();
					if(defaultValue != null && !defaultValue.isEmpty()){
						defaultValue = model.getCalibrated(defaultValue);
						setDefaultValue("'" + defaultValue + "'");
					}
				}
			}
		} 
		setRadix(Radix.DECIMAL);
		if ("Port_ID".equals(name))
			setOptional(true);
		
		setLoaded(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jsonObjectDataType="com.astra.ses.spell.dev.database.webapi.dbModel.JsonArray"
	 * @generated
	 */
	public void loadParsed(JsonArray jsonObject) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DESCRIPTION:
				return getDescription();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__NAME:
				return getName();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__LOADED:
				return isLoaded();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__TYPE:
				return getType();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__RADIX:
				return getRadix();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__UNITS:
				return getUnits();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DEFAULT_VALUE:
				return getDefaultValue();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATED:
				return isCalibrated();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__OPTIONAL:
				return isOptional();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION_ID:
				return getCalibrationId();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION:
				if (resolve) return getCalibration();
				return basicGetCalibration();
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
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__NAME:
				setName((String)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__LOADED:
				setLoaded((Boolean)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__TYPE:
				setType((ArgumentType)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__RADIX:
				setRadix((Radix)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__UNITS:
				setUnits((String)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATED:
				setCalibrated((Boolean)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION_ID:
				setCalibrationId((String)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DATABASE:
				setDatabase((ISpellDatabase)newValue);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION:
				setCalibration((ICalibration)newValue);
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
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__LOADED:
				setLoaded(LOADED_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__RADIX:
				setRadix(RADIX_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATED:
				setCalibrated(CALIBRATED_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION_ID:
				setCalibrationId(CALIBRATION_ID_EDEFAULT);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DATABASE:
				setDatabase((ISpellDatabase)null);
				return;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION:
				setCalibration((ICalibration)null);
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
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__LOADED:
				return loaded != LOADED_EDEFAULT;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__RADIX:
				return RADIX_EDEFAULT == null ? radix != null : !RADIX_EDEFAULT.equals(radix);
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATED:
				return isCalibrated() != CALIBRATED_EDEFAULT;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION_ID:
				return CALIBRATION_ID_EDEFAULT == null ? getCalibrationId() != null : !CALIBRATION_ID_EDEFAULT.equals(getCalibrationId());
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__DATABASE:
				return database != null;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT__CALIBRATION:
				return calibration != null;
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
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT___HAS_DEFAULT_VALUE:
				return hasDefaultValue();
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT___LOAD_PARSED__JSONOBJECT:
				loadParsed((JsonObject)arguments.get(0));
				return null;
			case DbModelPackage.WEB_API_TELECOMMAND_ARGUMENT___LOAD_PARSED__JSONARRAY:
				loadParsed((JsonArray)arguments.get(0));
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
		result.append(" (description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", loaded: ");
		result.append(loaded);
		result.append(", type: ");
		result.append(type);
		result.append(", radix: ");
		result.append(radix);
		result.append(", units: ");
		result.append(units);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} // WebAPITelecommandArgument
