package com.astra.ses.spell.code_coverage.ui;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.astra.ses.spell.code_coverage.Activator;

public class CodeCoveragePreferenceInitializer extends
		AbstractPreferenceInitializer {

	public CodeCoveragePreferenceInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(CodeCoveragePreferences.CODE_COVERAGE_SERVER, "valb-opasrv1");
		store.setDefault(CodeCoveragePreferences.CODE_COVERAGE_USER, "spellfuzz");
		store.setDefault(CodeCoveragePreferences.CODE_COVERAGE_RESULTS_FOLDER, "/home/spellfuzz/results");
		store.setDefault(CodeCoveragePreferences.CODE_COVERAGE_STATUS_FOLDER, "/home/spellfuzz/running");
		store.setDefault(CodeCoveragePreferences.CODE_COVERAGE_SPOOL_FOLDER, "/home/spellfuzz/spool");
	}

}
