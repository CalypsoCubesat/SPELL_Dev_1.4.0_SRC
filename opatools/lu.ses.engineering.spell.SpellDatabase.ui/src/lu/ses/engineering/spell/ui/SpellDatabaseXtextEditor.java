package lu.ses.engineering.spell.ui;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.XtextUIMessages;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.ILexerTokenRegion;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

public class SpellDatabaseXtextEditor extends XtextEditor {
	private static final int	TAB_LEN	= 4;
	
	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.getName().equals("com.astra.ses.spell.dev.dictionary.utils.DictionaryEditorInfo")){
			try {
				Class<?> loadClass = adapter.getClassLoader().loadClass("com.astra.ses.spell.dev.dictionary.utils.DictionaryEditorInfo");
				Object obj = loadClass.getConstructors()[0].newInstance((IFile)getResource());
				//Thread.dumpStack();
				return obj;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (adapter.getName().equals("com.astra.ses.spell.dev.spelleditor.utils.SpellEditorInfo")){
			try {
				Class<?> loadClass = adapter.getClassLoader().loadClass("com.astra.ses.spell.dev.spelleditor.utils.SpellEditorInfo");
				Object obj = loadClass.getConstructors()[0].newInstance((IFile)getResource());
				//Thread.dumpStack();
				return obj;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return super.getAdapter(adapter);
	}
	private int maxKeyLength = -1;
	public void formatDocument() {
		maxKeyLength = -1;
		IDocumentProvider provider = getDocumentProvider();
		XtextDocument doc = (XtextDocument) provider.getDocument(getEditorInput());
		int lineCount = doc.getNumberOfLines();
		for (int i = 0; i < lineCount; i++)
		{
			try
			{
				int offset = doc.getLineOffset(i);
				int length = doc.getLineLength(i);

				String lineText = doc.get(offset, length);
				handleLine(lineText);
			}
			catch (BadLocationException e)
			{
				e.printStackTrace();
			}
		}
		if (maxKeyLength < 0) {
			maxKeyLength = 0;
		}
		maxKeyLength += TAB_LEN * 3;
		
		for (int i = 0; i < lineCount; i++)
		{
			try
			{
				int offset = doc.getLineOffset(i);
				int length = doc.getLineLength(i);
				String lineText = doc.get(offset, length);
				String converted = convertLine(lineText,doc,offset);
				if (converted != null)
				{
					doc.replace(offset, length, converted);
				}
			}
			catch (BadLocationException e)
			{
				e.printStackTrace();
			}
		}
		currentTempIndent.clear();
	}
	
	private void handleLine(String line) {
		if  (line.isEmpty() || line.equals("\n") || line.equals("\r\n") || line.trim().isEmpty() ){
			return;
		}
		char c = line.charAt(0);
		if (c == ' ' || c == '\'' || c == '\t' || c == '"' || c == '[' || c == '{' || c == '}' || c == '{' || c == '\\' || c == '#'){
			return;
		}
		String[] split = line.split("\\s+",2);
		if (split.length > 1){
			int keyLength = split[0].length();
			if (keyLength > maxKeyLength){
				maxKeyLength = keyLength;
			}
		}
	}
	
	/***************************************************************************
	 * Format line
	 * @param doc 
	 * @param offset 
	 * 
	 * @return
	 **************************************************************************/
	private Deque<Integer> currentTempIndent = new ArrayDeque<Integer>();
	private String convertLine(String line, XtextDocument doc, int offset)	{
		if (line.isEmpty() || line.equals("\n") || line.trim().isEmpty()) {
			return null; 
		}

		if (line.charAt(0) == '#') {
			return null;
		} else {
			line = line.replace("\t", "    ");
			String[] splitted = line.split("[ ]+", 2);
			String newLine = splitted[0];
			if (splitted.length > 1) {
				int keyLength = newLine.length();
				int toFill;
				if (currentTempIndent.isEmpty()){
					toFill = maxKeyLength - keyLength;
				} else {
					toFill = currentTempIndent.peekFirst() - keyLength;
				}
				
				char[] blanks = new char[toFill];
				Arrays.fill(blanks, ' ');
				newLine += new String(blanks);
				newLine += splitted[1];
			}

			int numberOpenBrackets = newLine.split("[{\\[]").length ;
			int numberClosedBrackets = newLine.split("[}\\]]").length;

			if (numberOpenBrackets != numberClosedBrackets){
				for (int i = 0; i < newLine.length(); i++) {
					char c = newLine.charAt(i);
					if (c == '{' || c == '['){
						int lookahead = 1;
						for (;lookahead < 16;lookahead++){
							if (newLine.charAt(i + lookahead) != ' '){
								break;
							}
						}
						currentTempIndent.addFirst(i + lookahead);
					}
					if (c == '}' || c == ']'){
						if (!currentTempIndent.isEmpty())
							currentTempIndent.removeFirst();
					}
				}
			}				

			return newLine;
		}
	}
	
	
	@Override
	protected void createActions() {
		super.createActions();
		if (getSourceViewerConfiguration().getContentFormatter(getSourceViewer()) != null) {
			Action action = new TextFormatAction(XtextUIMessages.getResourceBundle(),
					"Format.", this, ISourceViewer.FORMAT){
				
			}; //$NON-NLS-1$
			action.setActionDefinitionId("org.eclipse.xtext.ui.FormatAction");
			setAction("Format", action); //$NON-NLS-1$
			markAsStateDependentAction("Format", true); //$NON-NLS-1$
			markAsSelectionDependentAction("Format", true); //$NON-NLS-1$
		}


	
	}
	

}
