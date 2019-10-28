package com.astra.ses.spell.code_coverage.ui;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.astra.ses.spell.code_coverage.Activator;

public class CodeCoveragePreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {
	

	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preference Page for SPELL Code Coverage.");
	}

	@Override
	protected void createFieldEditors() {
		addField(new StringFieldEditor(CodeCoveragePreferences.CODE_COVERAGE_SERVER, "&Code Coverage Server:",
				getFieldEditorParent()));
		addField(new StringFieldEditor(CodeCoveragePreferences.CODE_COVERAGE_USER, "&Code Coverage User Name:",
				getFieldEditorParent()));
		addField(new StringFieldEditor(CodeCoveragePreferences.CODE_COVERAGE_RESULTS_FOLDER, "&Code Coverage Results Folder:",
				getFieldEditorParent()));
		addField(new StringFieldEditor(CodeCoveragePreferences.CODE_COVERAGE_STATUS_FOLDER, "&Code Coverage Status Folder:",
				getFieldEditorParent()));
		addField(new StringFieldEditor(CodeCoveragePreferences.CODE_COVERAGE_SPOOL_FOLDER, "&Code Coverage Spool Folder:",
				getFieldEditorParent()));
		
	}



}
