/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.power#getAtom <em>Atom</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.power#getTrailer <em>Trailer</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getpower()
 * @model
 * @generated
 */
public interface power extends factor {
	/**
	 * Returns the value of the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atom</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atom</em>' containment reference.
	 * @see #setAtom(atom)
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getpower_Atom()
	 * @model containment="true"
	 * @generated
	 */
	atom getAtom();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.spell.controlflow.spell.power#getAtom <em>Atom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atom</em>' containment reference.
	 * @see #getAtom()
	 * @generated
	 */
	void setAtom(atom value);

	/**
	 * Returns the value of the '<em><b>Trailer</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.spell.controlflow.spell.trailer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trailer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trailer</em>' containment reference list.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#getpower_Trailer()
	 * @model containment="true"
	 * @generated
	 */
	EList<trailer> getTrailer();

} // power
