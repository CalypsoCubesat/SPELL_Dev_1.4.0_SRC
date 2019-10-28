///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly.parsers.commanding
// 
// FILE      : ArgumentDefinition.java
//
// DATE      : Jul 4, 2013
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
package com.astra.ses.spell.dev.database.hifly.parsers.commanding;

import com.astra.ses.spell.dev.database.interfaces.ArgumentType;
import com.astra.ses.spell.dev.database.interfaces.CalibrationType;
import com.astra.ses.spell.dev.database.interfaces.Radix;

public class TelecommandArgumentCPCDefinition
{
	public String name;
	public String description;
	public ArgumentType type;
	public String defaultValue;
	public Radix radix;
	public String units;
	public String calibration;
	public CalibrationType calibrationType;
	public boolean optional;
	
	public TelecommandArgumentCPCDefinition( String[] tabs )
	{
		name = tabs[0];
		description = tabs[1];
		type = ArgumentType.getTypeFromChar(tabs[4].charAt(0));
		defaultValue = "";
		radix = Radix.getFromChar(tabs[5].charAt(0));
		units = tabs[6];
		optional = false;
		String CPC_CATEG = tabs[7];
		if (CPC_CATEG.equals("C"))
		{
			calibration = tabs[9];
			calibrationType = CalibrationType.NUMERICAL;
		}
		else if (CPC_CATEG.equals("T"))
		{
			calibration = tabs[10];
			calibrationType = CalibrationType.STATUS;
		}
		else if (CPC_CATEG.equals("P"))
		{
			calibration = tabs[13];
			calibrationType = CalibrationType.UNKNOWN;
		}
		else
		{
			calibration = null;
		}
	}
}
