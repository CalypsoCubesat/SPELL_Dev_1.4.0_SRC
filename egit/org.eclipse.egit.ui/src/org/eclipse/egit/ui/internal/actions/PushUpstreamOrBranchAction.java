/*******************************************************************************
 * Copyright (C) 2010, 2013 Mathias Kinzler <mathias.kinzler@sap.com> and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.egit.ui.internal.actions;

/**
 * Action for "Push to Upstream" or "Push Branch..." if not configured
 */
public class PushUpstreamOrBranchAction extends RepositoryAction {
	/**
	 *
	 */
	public PushUpstreamOrBranchAction() {
		super(ActionCommands.SIMPLE_PUSH_ACTION,
				new PushUpstreamOrBranchActionHandler());
	}
}
