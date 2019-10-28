package lu.ses.engineering.B7022SPELL.pages.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import es.gmv.views.Comment;
import es.gmv.views.MnemonicRow;
import es.gmv.views.TmRow;
import es.gmv.views.ViewsPackage;
import es.gmv.views.Xmltabulardisplaydefinition;
import lu.ses.engineering.B7022SPELL.pages.services.TmDisplayPagesGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractTmDisplayPagesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TmDisplayPagesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ViewsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ViewsPackage.COMMENT:
				if(context == grammarAccess.getCommentRule() ||
				   context == grammarAccess.getEntryRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			case ViewsPackage.MNEMONIC_ROW:
				if(context == grammarAccess.getEntryRule() ||
				   context == grammarAccess.getMnemonicRowRule()) {
					sequence_MnemonicRow(context, (MnemonicRow) semanticObject); 
					return; 
				}
				else break;
			case ViewsPackage.TM_ROW:
				if(context == grammarAccess.getEntryRule()) {
					sequence_Entry_StringTmRow_TmRow(context, (TmRow) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIMP_TM_EntryRule()) {
					sequence_IMP_TM_Entry(context, (TmRow) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStringTmRowRule()) {
					sequence_StringTmRow(context, (TmRow) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTmRowRule()) {
					sequence_TmRow(context, (TmRow) semanticObject); 
					return; 
				}
				else break;
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION:
				if(context == grammarAccess.getTmDisplayPageRule()) {
					sequence_IMP_File_PageFile_TmDisplayPage(context, (Xmltabulardisplaydefinition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getIMP_FileRule()) {
					sequence_IMP_File(context, (Xmltabulardisplaydefinition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPageFileRule()) {
					sequence_PageFile(context, (Xmltabulardisplaydefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     title=COMMENT_STRING
	 */
	protected void sequence_Comment(EObject context, Comment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=NUM note=Note) | (name=ID note=Note))
	 */
	protected void sequence_Entry_StringTmRow_TmRow(EObject context, TmRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((row+=Entry*) | ((row+=IMP_TM_Entry | row+=Comment)*))
	 */
	protected void sequence_IMP_File_PageFile_TmDisplayPage(EObject context, Xmltabulardisplaydefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((row+=IMP_TM_Entry | row+=Comment)*)
	 */
	protected void sequence_IMP_File(EObject context, Xmltabulardisplaydefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID note=Note)
	 */
	protected void sequence_IMP_TM_Entry(EObject context, TmRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (note=SCP_ID name=Note)
	 */
	protected void sequence_MnemonicRow(EObject context, MnemonicRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (row+=Entry*)
	 */
	protected void sequence_PageFile(EObject context, Xmltabulardisplaydefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID note=Note)
	 */
	protected void sequence_StringTmRow(EObject context, TmRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=NUM note=Note)
	 */
	protected void sequence_TmRow(EObject context, TmRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
