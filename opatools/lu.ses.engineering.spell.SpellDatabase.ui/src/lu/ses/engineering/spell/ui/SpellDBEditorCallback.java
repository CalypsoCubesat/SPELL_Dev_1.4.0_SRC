package lu.ses.engineering.spell.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DefaultLineTracker;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewerExtension7;
import org.eclipse.jface.text.TabsToSpacesConverter;
import org.eclipse.ui.texteditor.ITextEditorExtension3;
import org.eclipse.ui.texteditor.ITextEditorExtension3.InsertMode;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.validation.ValidatingEditorCallback;

import com.astra.ses.spell.dev.database.DatabaseManager;

public class SpellDBEditorCallback extends ValidatingEditorCallback {
	

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		DatabaseManager databaseManager = DatabaseManager.getInstance();
//		try {
//			XtextDocument doc = (XtextDocument) editor.getDocument();
//			doc.search(0, "\t",true, false, false);
//			doc.replace(0, editor.getDocument().getLength(), "    ");
//
//		} catch (BadLocationException e1) {
//			
//		}

		TabsToSpacesConverter tabsToSpacesConverter = new TabsToSpacesConverter();
		tabsToSpacesConverter.setNumberOfSpacesPerTab(4);
		tabsToSpacesConverter.setLineTracker(new DefaultLineTracker() );
		((ITextViewerExtension7)editor.getInternalSourceViewer()).setTabsToSpacesConverter(tabsToSpacesConverter);
		
		try {
			databaseManager.getClass().getDeclaredMethod("procedureOpened", IFile.class,IProgressMonitor.class).invoke(databaseManager, (IFile) editor.getResource(), new NullProgressMonitor());
			databaseManager.getClass().getDeclaredMethod("procedureFocused", IFile.class).invoke(databaseManager, (IFile) editor.getResource());
			databaseManager.fileFocused();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.afterCreatePartControl(editor);

	}
	
	
	
	@Override
	public void afterSetInput(XtextEditor editor) {
		super.afterSetInput(editor);
	}
	
}
