///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.ui
// 
// FILE      : MarkerResolutionGenerator.java
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
package com.astra.ses.spell.dev.scheck.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator2;

import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.scheck.QuickFix;
import com.astra.ses.spell.dev.scheck.interfaces.IIssue;
import com.astra.ses.spell.dev.scheck.ui.quickfix.QuickFix_TcId;
import com.astra.ses.spell.dev.scheck.ui.quickfix.QuickFix_TcPrefix;
import com.astra.ses.spell.dev.scheck.ui.quickfix.QuickFix_TmId;
import com.astra.ses.spell.dev.scheck.ui.quickfix.QuickFix_TmPrefix;

public class MarkerResolutionGenerator implements IMarkerResolutionGenerator2
{
	private QuickFix_TcId	  m_qfTcId	   = new QuickFix_TcId();
	private QuickFix_TmId	  m_qfTmId	   = new QuickFix_TmId();
	private QuickFix_TcPrefix m_qfTcPrefix = new QuickFix_TcPrefix();
	private QuickFix_TmPrefix m_qfTmPrefix = new QuickFix_TmPrefix();

	@Override
	public IMarkerResolution[] getResolutions(IMarker marker)
	{
		try
		{
			List<IMarkerResolution> list = new LinkedList<IMarkerResolution>();
			Object attr = marker.getAttribute(IIssue.QUICK_FIX_ID);
			if (attr != null)
			{
				QuickFix id = QuickFix.valueOf( (String)attr );
				switch (id)
				{
				case TC_ID_FIX:
					list.add(m_qfTcId);
					break;
				case TM_ID_FIX:
					list.add(m_qfTmId);
					break;
				case TC_PREFIX_FIX:
					list.add(m_qfTcPrefix);
					break;
				case TM_PREFIX_FIX:
					list.add(m_qfTmPrefix);
					break;
				}
				return list.toArray(new IMarkerResolution[0]);
			}
		}
		catch (CoreException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean hasResolutions(IMarker marker)
	{
		try
		{
			Object attr = marker.getAttribute(IIssue.QUICK_FIX_ID);
			if (attr != null)
			{
				QuickFix id = QuickFix.valueOf( (String) attr );
				switch (id)
				{
				case TC_ID_FIX:
				case TM_ID_FIX:
					ISpellDatabase db = DatabaseManager.getInstance().getProjectDatabase(marker.getResource());
					if (db == null) return false;
					break;
				default:
					break;
				}
				return true;
			}
			else
			{
				return false;
			}
		}
		catch (CoreException e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
