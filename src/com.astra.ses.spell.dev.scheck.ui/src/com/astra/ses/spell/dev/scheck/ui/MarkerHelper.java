///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.ui
// 
// FILE      : MarkerHelper.java
//
// DATE      : Apr 22, 2014
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

import org.eclipse.core.resources.IMarker;

import com.astra.ses.spell.dev.scheck.QuickFix;
import com.astra.ses.spell.dev.scheck.interfaces.IIssue;

public class MarkerHelper
{
	/************************************************************************************
	 * Extract the line number information from a marker
	 * @param marker
	 * @return
	 ***********************************************************************************/
	public static int getLineNo( IMarker marker )
	{
		try
		{
			return (Integer) marker.getAttribute(IMarker.LINE_NUMBER);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return -1;
	}

	/************************************************************************************
	 * Extract the character start offset information from a marker
	 * @param marker
	 * @return
	 ***********************************************************************************/
	public static int getStart( IMarker marker )
	{
		try
		{
			return (Integer) marker.getAttribute(IMarker.CHAR_START);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return -1;
	}

	/************************************************************************************
	 * Extract the character end offset information from a marker
	 * @param marker
	 * @return
	 ***********************************************************************************/
	public static int getEnd( IMarker marker )
	{
		try
		{
			return (Integer) marker.getAttribute(IMarker.CHAR_END);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return -1;
	}

	/************************************************************************************
	 * Extract the message information from a marker
	 * @param marker
	 * @return
	 ***********************************************************************************/
	public static String getMessage( IMarker marker )
	{
		try
		{
			return (String) marker.getAttribute(IMarker.MESSAGE);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

	/************************************************************************************
	 * Convert a marker to a debugging string
	 * @param marker
	 * @return
	 ***********************************************************************************/
	public static String toString( IMarker marker )
	{
		try
		{
			int s = (Integer) marker.getAttribute(IMarker.CHAR_START);
			int e = (Integer) marker.getAttribute(IMarker.CHAR_END);
			int l = (Integer) marker.getAttribute(IMarker.LINE_NUMBER);
			String m = (String) marker.getAttribute(IMarker.MESSAGE);
			Object quickFix = marker.getAttribute(IIssue.QUICK_FIX_ID);
			if (quickFix != null)
			{
				return "[marker (" + l + ":" + s + "-" + e + ") qf:" + quickFix + " > " + m + "]";
			}
			else
			{
				return "[marker (" + l + ":" + s + "-" + e + ") > " + m + "]";
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return "[marker]";
	}
}
