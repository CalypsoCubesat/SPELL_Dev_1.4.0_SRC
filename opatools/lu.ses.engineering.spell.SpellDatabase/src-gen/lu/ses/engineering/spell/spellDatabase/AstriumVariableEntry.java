/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Astrium Variable Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getAstriumTime <em>Astrium Time</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getValue <em>Value</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getSimpleValue <em>Simple Value</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumVariableEntry()
 * @model
 * @generated
 */
public interface AstriumVariableEntry extends EObject
{
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
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumVariableEntry_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Astrium Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Astrium Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Astrium Time</em>' attribute.
   * @see #setAstriumTime(String)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumVariableEntry_AstriumTime()
   * @model
   * @generated
   */
  String getAstriumTime();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getAstriumTime <em>Astrium Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Astrium Time</em>' attribute.
   * @see #getAstriumTime()
   * @generated
   */
  void setAstriumTime(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Atom)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumVariableEntry_Value()
   * @model containment="true"
   * @generated
   */
  Atom getValue();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Atom value);

  /**
   * Returns the value of the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Value</em>' attribute.
   * @see #setSimpleValue(String)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getAstriumVariableEntry_SimpleValue()
   * @model
   * @generated
   */
  String getSimpleValue();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getSimpleValue <em>Simple Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Value</em>' attribute.
   * @see #getSimpleValue()
   * @generated
   */
  void setSimpleValue(String value);

} // AstriumVariableEntry
