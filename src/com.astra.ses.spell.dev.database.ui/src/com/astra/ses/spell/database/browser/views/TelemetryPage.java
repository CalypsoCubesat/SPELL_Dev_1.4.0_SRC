///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.database.browser.views
//
// FILE      : TelemetryPage.java
//
// DATE      : Feb 18, 2011
//
// Copyright (C) 2008, 2011 SES ENGINEERING, Luxembourg S.A.R.L.
//
// By using this software in any way, you are agreeing to be bound by
// the terms of this license.
//
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// NO WARRANTY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, THE PROGRAM IS PROVIDED
// ON AN "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER
// EXPRESS OR IMPLIED INCLUDING, WITHOUT LIMITATION, ANY WARRANTIES OR
// CONDITIONS OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A
// PARTICULAR PURPOSE. Each Recipient is solely responsible for determining
// the appropriateness of using and distributing the Program and assumes all
// risks associated with its exercise of rights under this Agreement ,
// including but not limited to the risks and costs of program errors,
// compliance with applicable laws, damage to or loss of data, programs or
// equipment, and unavailability or interruption of operations.
//
// DISCLAIMER OF LIABILITY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, NEITHER RECIPIENT NOR ANY
// CONTRIBUTORS SHALL HAVE ANY LIABILITY FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING WITHOUT LIMITATION
// LOST PROFITS), HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OR DISTRIBUTION OF THE PROGRAM OR THE
// EXERCISE OF ANY RIGHTS GRANTED HEREUNDER, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGES.
//
// Contributors:
//    SES ENGINEERING - initial API and implementation and/or initial documentation
//
// PROJECT   : SPELL
//
// SUBPROJECT: SPELL DEV
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.database.browser.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.astra.ses.spell.database.browser.ui.TelecommandViewDialog;
import com.astra.ses.spell.database.browser.ui.TelemetryViewDialog;
import com.astra.ses.spell.dev.database.impl.Telecommand;
import com.astra.ses.spell.dev.database.impl.TelemetryParameter;
import com.astra.ses.spell.dev.database.interfaces.IDatabaseElement;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;

public class TelemetryPage extends DatabasePage 
{

	/**************************************************************************
	 * Constructor
	 *************************************************************************/
	public TelemetryPage( IFile file )
	{
		super(file);
	}
	
	/***************************************************************************
	 * Get the collection of telemetry parameters from the database
	 **************************************************************************/
	@Override
	protected IDatabaseElement[] getInput()
	{
		if (!hasCurrentDB())
		{
			return new ITelemetryParameter[0];
		}

		synchronized (getCurrentDB()) {
			Collection<String> parameters = getCurrentDB().getTelemetryParameterNames();
			ITelemetryParameter[] result = new ITelemetryParameter[parameters.size()];
			int i = 0;
			for (String param :parameters)
			{
				result[i] = getCurrentDB().getTelemetryModel(param);
				i++;
			}
			return result;
		}
	}
	
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		super.createControl(parent);
		m_viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				final ITelemetryParameter tm = (ITelemetryParameter) selection.getFirstElement();
				if (tm != null){
					Display.getDefault().asyncExec(new Runnable() {
						
						@Override
						public void run() {
							Shell shell = new Shell(Display.getDefault().getActiveShell());
							TelemetryViewDialog dialog = new TelemetryViewDialog(shell, tm,m_currentDB);
							dialog.open();
							shell.dispose();
							
						}
					});
				}
				
				
			}
		});
	}

}
