/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel;

import com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web API Displays</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getWebAPIDisplays()
 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.ITelemetryDisplayDefinition"
 * @generated
 */
public abstract class WebAPIDisplays extends MinimalEObjectImpl.Container implements ITelemetryDisplayDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAPIDisplays() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbModelPackage.Literals.WEB_API_DISPLAYS;
	}

} // WebAPIDisplays
