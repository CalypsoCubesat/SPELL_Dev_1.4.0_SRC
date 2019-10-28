package com.astra.ses.spell.dev.wizard.importWizards;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

public class CloneRepository extends Job {
	Object[] items = null;

	public CloneRepository(String name, Object[] items) {
		super(name);
		this.items = items;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		return null;
	}

}
