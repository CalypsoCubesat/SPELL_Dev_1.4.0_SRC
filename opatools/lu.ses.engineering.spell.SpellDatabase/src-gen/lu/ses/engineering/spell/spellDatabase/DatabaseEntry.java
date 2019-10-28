/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getDatabaseEntry()
 * @model
 * @generated
 */
public interface DatabaseEntry extends EObject
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
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getDatabaseEntry_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(DatabaseValue)
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#getDatabaseEntry_Value()
   * @model containment="true"
   * @generated
   */
  DatabaseValue getValue();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(DatabaseValue value);

} // DatabaseEntry
