///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.commands
// 
// FILE      : OpenFile.java
//
// DATE      : 2010-11-25
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
// SUBPROJECT: SPELL Development Environment
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.dev.commands;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.UIPlugin;

import com.astra.ses.spell.dev.Activator;

/*******************************************************************************
 * 
 * OpenFile handler opens the file whose absolute path is given as a
 * command parameter
 *
 ******************************************************************************/
public class OpenFile extends AbstractHandler {

	/** File path parameter id */
	private static final String PARAM_PATH = "filepath";
	
	/*==========================================================================
	 * (non-Javadoc)
	 * @see AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 =========================================================================*/
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		String filePath = event.getParameter(PARAM_PATH).replaceFirst("\\$SPELL_DEV_HOME\\$","").substring(1);
		String[] split = filePath.split("/",2);
		URL entry = null;
		Enumeration<URL> entries = Activator.getDefault().getBundle().findEntries(split[0],split[1],true);
		if (entries != null){
			if (!entries.hasMoreElements()){
				return false;
			}
			entry = entries.nextElement();
		} else {
			entry = Activator.getDefault().getBundle().getResource(filePath);
		}
		
		boolean result = false;

		try {
			InputStream in = (InputStream) entry.getContent();
			
			File tempFile = File.createTempFile(split[1].substring(0,split[1].indexOf(".")), ".pdf");
			tempFile.deleteOnExit();
			FileOutputStream out = new FileOutputStream(tempFile);
			
			byte[]  buf = new byte[4096];

			for (int length = 0;(length = in.read(buf)) != -1;){
				out.write(buf, 0, length);
			}
			out.close();
			in.close();
			filePath = tempFile.getAbsolutePath();
		} catch (IOException e) {
			Shell shell = new Shell();
			MessageDialog.openError(shell, 
					"File does not exist",
					"Cannot open file " + filePath);
			e.printStackTrace();
			shell.dispose();
			return false;
		}
		
		result = Program.launch(filePath);
		if (!result)
		{
			Shell shell = new Shell();
			MessageDialog.openError(shell, 
					"Error while opening the file",
					"Cannot open file " + filePath + ".\n" +
							"Check there is a tool for viewing the manual " +
					"installed in the workstation");
			shell.dispose();
		}
		return result;
	}

}
