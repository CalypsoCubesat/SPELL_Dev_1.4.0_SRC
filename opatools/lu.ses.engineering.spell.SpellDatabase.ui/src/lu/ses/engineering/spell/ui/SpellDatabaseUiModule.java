/*
 * generated by Xtext
 */
package lu.ses.engineering.spell.ui;

import java.util.regex.Pattern;

import lu.ses.engineering.spell.SpellDatabaseRuntimeModule;
import lu.ses.engineering.spell.spellDatabase.StringValue;
import lu.ses.engineering.spell.ui.SpellDatabaseUiModule.AntlrTokenToAttributeIdMapper;
import lu.ses.engineering.spell.ui.SpellDatabaseUiModule.SpellSemanticHighlighter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.jface.text.source.ICharacterPairMatcher;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.HighlightingHelper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.HighlightingReconciler;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingHelper;
import org.eclipse.xtext.util.ITextRegion;

import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SpellDatabaseUiModule extends lu.ses.engineering.spell.ui.AbstractSpellDatabaseUiModule {
	public SpellDatabaseUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return SpellDBEditorCallback.class;
	}
	
	public static ISpellDatabase getCurrentDatabase(){
		
		return SpellDatabaseRuntimeModule.getCurrentDatabase();
	}

	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return SpellHighlightingConfiguration.class;
	}

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return AntlrTokenToAttributeIdMapper.class ;
	}
	
	public Class<? extends DefaultSemanticHighlightingCalculator> bindDefaultSemanticHighlightingCalculator() {
		return SpellSemanticHighlighter.class ;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.HighlightingReconciler> bindHighlightingReconciler() {
		return HighlightingReconciler.class ;
	}
	public Class<? extends IHighlightingHelper> bindIHighlightingHelper() {
		return HighlightingHelper.class;
	}
	public ICharacterPairMatcher bindICharacterPairMatcher() {
		return new DefaultCharacterPairMatcher(new char[] { '(', ')', '{', '}', '[', ']' });
	}
	
	public Class<? extends XtextEditor> bindXtextEditor() {
		return SpellDatabaseXtextEditor.class;
	}

	static class SpellSemanticHighlighter extends DefaultSemanticHighlightingCalculator{
		@Override
		protected boolean highlightElement(EObject object,
				IHighlightedPositionAcceptor acceptor) {
			// TODO Auto-generated method stub
			if (object instanceof StringValue){
				return highlightStringValue((StringValue) object,acceptor);
			}
			return super.highlightElement(object, acceptor);
		}
		
		protected void highlightNode(IHighlightedPositionAcceptor acceptor, INode node,int offset,int length, String... styleIds) {
			if (node == null)
				return;
			if (node instanceof ILeafNode) {
				ITextRegion textRegion = node.getTextRegion();
				if (textRegion.getLength() > length){
					acceptor.addPosition(textRegion.getOffset(), length, styleIds);
				} else {
					acceptor.addPosition(textRegion.getOffset(), textRegion.getLength(), styleIds);
					length -= textRegion.getLength();
				}
				
			} else {
				for (ILeafNode leaf : node.getLeafNodes()) {
					if (!leaf.isHidden()) {
						ITextRegion leafRegion = leaf.getTextRegion();
						if (leafRegion.getLength() > length){
							acceptor.addPosition(leafRegion.getOffset(), length, styleIds);
						} else {
							acceptor.addPosition(leafRegion.getOffset(), leafRegion.getLength(), styleIds);
							length -= leafRegion.getLength();
						}
						
						//acceptor.addPosition(leafRegion.getOffset(), leafRegion.getLength(), styleIds);
					}
				}
			}
		}
		private boolean highlightStringValue(StringValue object,
				IHighlightedPositionAcceptor acceptor) {
			String tmValue = object.getVal();
			
			ISpellDatabase db = getCurrentDatabase();
			if (db == null){
				//System.out.println("Current Database is not set!");
				return false;
			}
			int length = 0;
			int offset = 0;
			if (tmValue.startsWith("'")){
				tmValue = tmValue.substring(1,tmValue.length()-1);
				offset += 1;
				length += 2;
			}
			String origTM = tmValue;
			//System.out.println("handling " + tmValue);
			if (tmValue.startsWith("T ")){
				if (tmValue.contains(" ") && !tmValue.equals("T ")){
					tmValue = tmValue.split(" ")[1];
				}
				if (db.isTelemetryParameter(tmValue)){
					ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
					highlightNode(acceptor, node, "TM_VALUE");
					//System.out.println("TM Marked " + tmValue + " for object " + object);
					return true;
				} else {
					tmValue = origTM;
				}
			}
			if (db.isTelemetryParameter(tmValue)){
				ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
				highlightNode(acceptor, node, "TM_VALUE");
				//System.out.println("TM Marked " + tmValue + " for object " + object);
				return true;
			}
			if (tmValue.startsWith("C ")){
				if (tmValue.contains(" ") && !tmValue.equals("C ")){
					tmValue = tmValue.split(" ")[1];
				}
				if (db.isTelecommand(tmValue)){
					ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
					highlightNode(acceptor, node, "TC_VALUE");
					//System.out.println("TC Marked " + tmValue + " for object " + object);
					return true;
				} else {
					tmValue = origTM;
				}
			}
			if (db.isTelecommand(tmValue)){
				ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
				highlightNode(acceptor, node, "TC_VALUE");
				//System.out.println("TC Marked " + tmValue + " for object " + object);
				return true;
			}
			if (tmValue.contains(" ")){
				tmValue = tmValue.split(" ")[0];
			}
			if (db.isTelemetryParameter(tmValue)){
				ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
				highlightNode(acceptor, node, "TM_VALUE");
				//System.out.println("TM Marked " + tmValue + " for object " + object);
				return true;
			}
			if (db.isTelecommand(tmValue)){
				ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
				highlightNode(acceptor, node, "TC_VALUE");
				//System.out.println("TC Marked " + tmValue + " for object " + object);
				return true;
			}
			
			return true;
		}
	}
	
	
	static class AntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
		private static final Pattern QUOTED = Pattern.compile("(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);
		
		private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");
		
		@Override
		protected String getMappedValue(int tokenType) {
			// TODO Auto-generated method stub
			return super.getMappedValue(tokenType);
		}
		@Override
		protected String calculateId(String tokenName, int tokenType) {
			//System.out.println(tokenType + ": " + tokenName);
			if (tokenName.equals("RULE_FLOAT")){
				return DefaultHighlightingConfiguration.NUMBER_ID;
			}
			if (tokenName.equals("RULE_INTEGER")){
				return DefaultHighlightingConfiguration.NUMBER_ID;
			}
			if (tokenName.equals("RULE_INT")){
				return DefaultHighlightingConfiguration.NUMBER_ID;
			}
			if (tokenName.equals("RULE_BIN_HEX_OCT")){
				return DefaultHighlightingConfiguration.NUMBER_ID;
			}
			if (tokenName.equals("RULE_RELTIME")){
				return DefaultHighlightingConfiguration.NUMBER_ID;
			}
			if (tokenName.equals("RULE_ABSTIME")){
				return DefaultHighlightingConfiguration.NUMBER_ID;
			}
			if (tokenName.equals("RULE_ID_STMT")){
				return "KEY_NAME";
			}
			if (tokenName.equals("RULE_ID")){
				return "KEY_NAME";
			}
			if (tokenName.equals("RULE_BOOL_EXPR")){
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if (tokenName.equals("RULE_TIME_EXPR")){
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if (tokenName.equals("RULE_SPELL")){
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if (tokenName.equals("RULE_WAIT")){
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if (tokenName.equals("RULE_PAUSE")){
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if (tokenName.equals("RULE_CMD")){
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if (tokenName.equals("RULE_TM")){
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if (tokenName.equals("RULE_STATE_EXPR")){
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if(PUNCTUATION.matcher(tokenName).matches()) {
				return DefaultHighlightingConfiguration.PUNCTUATION_ID;
			}
			if(QUOTED.matcher(tokenName).matches()) {
				return DefaultHighlightingConfiguration.KEYWORD_ID;
			}
			if("RULE_STRING".equals(tokenName)) {
				return DefaultHighlightingConfiguration.STRING_ID;
			}
			if("RULE_INT".equals(tokenName)) {
				return DefaultHighlightingConfiguration.NUMBER_ID;
			}
			if("RULE_ML_COMMENT".equals(tokenName) || "RULE_SL_COMMENT".equals(tokenName)) {
				return DefaultHighlightingConfiguration.COMMENT_ID;
			}
			return DefaultHighlightingConfiguration.DEFAULT_ID;
		}
		
	}
	
}