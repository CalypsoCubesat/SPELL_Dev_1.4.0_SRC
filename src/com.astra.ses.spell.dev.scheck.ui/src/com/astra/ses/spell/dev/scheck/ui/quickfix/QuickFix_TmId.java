///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.ui.quickfix
// 
// FILE      : QuickFix_TmId.java
//
// DATE      : Apr 17, 2014
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
package com.astra.ses.spell.dev.scheck.ui.quickfix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;
import com.astra.ses.spell.dev.scheck.QuickFix;

public class QuickFix_TmId extends QuickFixBase
{
	@Override
    public String getLabel()
    {
	    return "Fix telemetry mnemonic and description";
    }
	
	@Override
	public String getId()
	{
		return QuickFix.TM_ID_FIX.name();
	}

	@Override
    protected String getReplacement( String old, IMarker marker ) throws Exception
    {
    	// CAREFUL: the OLD contains quotes!
    	String replacement = null;
    	String[] elements = old.replace("'", "").replace("\"","").split(" ");

    	String mnemonic = null;
    	if (elements.length==1)
    	{
    		mnemonic = elements[0];
    	}
    	else
    	{
    		mnemonic = elements[1];
    	}
    	// replacement string
    	ISpellDatabase db = DatabaseManager.getInstance().getProjectDatabase(marker.getResource());
    	ITelemetryParameter tm = db.getTelemetryModel(mnemonic);
    	
    	// try known variations in case of not finding the mnmenonic (BOEING PATCH)
    	if (tm == null)
    	{
    		tm = db.getTelemetryModel("1" + mnemonic);
    	}
    	if (tm == null)
    	{
    		tm = db.getTelemetryModel("2" + mnemonic);
    	}
    	
    	
    	if (tm != null)
    	{
    		replacement = "'T " + mnemonic + " " + tm.getDescription() + "'";
    	}
    	else
    	{
    		MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
    				                "Quick fix error", 
    						        "Cannot perform quick fix.\nUnable to find a telemetry parameter model in the database for mnemonic '" + mnemonic + "'\n\n" +
    						        "Complete string: >" + old + "<\n" +
									"At line: " + (Integer) marker.getAttribute(IMarker.LINE_NUMBER));
    		throw new RuntimeException("Failed to get replacement");
    	}
		    	
    	return replacement;
    }

	@Override
    public String getDescription()
    {
	    return "Change the current telemetry parameter identifier to comply with\nSPELL coding guidelines, and to match the current TM/TC database data";
    }
}
