///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.impl.commanding.args
// 
// FILE      : TelecommandArgument.java
//
// DATE      : 2009-09-15
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
package com.astra.ses.spell.dev.database.impl;

import com.astra.ses.spell.dev.database.interfaces.ArgumentType;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.database.interfaces.Radix;

/******************************************************************************
 * 
 * Representation of a telecommand argument
 * 
 *****************************************************************************/
public class TelecommandArgument implements ITelecommandArgument
{
    private static final long serialVersionUID = 1L;
	/** Name */
	private String	     	m_name;
	/** Description */
	private String	     	m_description;
	/** Type */
	private ArgumentType	m_type;
	/** Default value */
	private String 			m_defaultValue;
	/** Radix */
	private Radix			m_radix;
	/** Units */
	private String			m_units;
	/** Calibration if any */
	private String			m_calibrationId;
	/** Optional flag */
	private boolean			m_optional;

	/***************************************************************************
	 * Constructor
	 * 
	 * @param name
	 * @param description
	 * @param type
	 ***************************************************************************/
	public TelecommandArgument(String name, String description, ArgumentType type, String defaultValue, Radix radix, String units, String calibration, boolean optional)
	{
		m_name = name;
		m_description = description;
		m_type = type;
		m_defaultValue = defaultValue;
		m_radix = radix;
		m_units = units;
		m_calibrationId = calibration;
		m_optional = optional;
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
	public String getDescription()
	{
		return m_description;
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
	public String getName()
	{
		return m_name;
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
	public ArgumentType getType()
	{
		return m_type;
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
	public String getDefaultValue()
	{
		return m_defaultValue;
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public Radix getRadix()
    {
	    return m_radix;
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public String getUnits()
    {
	    return m_units;
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public boolean hasDefaultValue()
    {
	    return (m_defaultValue != null) && (!m_defaultValue.isEmpty());
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public boolean isCalibrated()
    {
	    return m_calibrationId != null;
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public boolean isOptional()
    {
	    return m_optional;
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public String getCalibrationId()
    {
	    return m_calibrationId;
    }

}
