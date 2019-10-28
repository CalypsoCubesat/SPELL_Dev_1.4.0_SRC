package lu.ses.engineering.spell.revisiontools.preferences;

import lu.ses.engineering.spell.revisiontools.Activator;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class GenericPreferencePage  extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private PreferencePageBuilder builder;

	public GenericPreferencePage(PreferencePageBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preference Page for "+ builder.getName() + ".");

	}

	@Override
	protected void createFieldEditors() {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preference Page for "+ builder.getName() + ".");
		
		for (PreferenceOptionBuilder optionBuilder : builder.getOptionFields()) {
			FieldEditor fieldEditor = optionBuilder.createFieldEditor(this, getFieldEditorParent());
			if (fieldEditor != null){
				addField(fieldEditor);
			}
			
		}
	}

}
