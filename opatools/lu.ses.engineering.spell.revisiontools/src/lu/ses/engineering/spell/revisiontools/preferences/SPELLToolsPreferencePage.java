package lu.ses.engineering.spell.revisiontools.preferences;

import lu.ses.engineering.spell.revisiontools.Activator;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class SPELLToolsPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	protected void createFieldEditors() {
		addField(new FileFieldEditor("PYTHON_PATH", "&Python Executable:",
				getFieldEditorParent()));
		
		addField(new DirectoryFieldEditor("SPELL_CHECK_PATH", "&SPELL Check Directory:",
				getFieldEditorParent()));


		addField(new BooleanFieldEditor("EXTRACT_CHECKS", "&Extract SPELL checker files.",
				getFieldEditorParent()));
		
		addField(new BooleanFieldEditor("UPDATE_CHECKS", "&Extract and Update SPELL checker files.",
				getFieldEditorParent()));
		
	}

	  @Override
	  public void init(IWorkbench workbench) {
	    setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    setDescription("Preference Page for SPELL Tools.");
	  }
	  
}
