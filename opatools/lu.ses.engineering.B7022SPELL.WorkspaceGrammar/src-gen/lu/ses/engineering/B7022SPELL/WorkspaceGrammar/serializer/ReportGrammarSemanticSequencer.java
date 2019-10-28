package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.services.ReportGrammarGrammarAccess;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Workspace;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ReportGrammarSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReportGrammarGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == WorkspacePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case WorkspacePackage.ESTRING_TO_LAYOUT_MAP_ENTRY:
				if(context == grammarAccess.getEStringToLayoutMapEntryRule()) {
					sequence_EStringToLayoutMapEntry(context, (Entry<?, ?>) semanticObject); 
					return; 
				}
				else break;
			case WorkspacePackage.LAYOUT:
				if(context == grammarAccess.getLayoutRule() ||
				   context == grammarAccess.getWorkspaceRule()) {
					sequence_Layout(context, (Layout) semanticObject); 
					return; 
				}
				else break;
			case WorkspacePackage.WORKSPACE:
				if(context == grammarAccess.getWorkspaceRule()) {
					sequence_Workspace(context, (Workspace) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (key=ID value=Layout)
	 */
	protected void sequence_EStringToLayoutMapEntry(EObject context, Entry<?, ?> semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, WorkspacePackage.Literals.ESTRING_TO_LAYOUT_MAP_ENTRY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, WorkspacePackage.Literals.ESTRING_TO_LAYOUT_MAP_ENTRY__KEY));
			if(transientValues.isValueTransient((EObject)semanticObject, WorkspacePackage.Literals.ESTRING_TO_LAYOUT_MAP_ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, WorkspacePackage.Literals.ESTRING_TO_LAYOUT_MAP_ENTRY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getEStringToLayoutMapEntryAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEStringToLayoutMapEntryAccess().getValueLayoutParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID calls+=[Layout|ID]* isCalled+=[Layout|ID]*)
	 */
	protected void sequence_Layout(EObject context, Layout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     procedures+=EStringToLayoutMapEntry*
	 */
	protected void sequence_Workspace(EObject context, Workspace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
