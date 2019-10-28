///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.header
//
// FILE      : HeaderChecker.java
//
// DATE      : Feb 9, 2011
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
package com.astra.ses.spell.dev.scheck.dictionaries;

import org.eclipse.core.resources.IFile;
import org.python.pydev.parser.jython.ParseException;
import org.python.pydev.parser.jython.Token;

import com.astra.ses.spell.dev.scheck.ResourceManager;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;
import com.astra.ses.spell.dev.scheck.interfaces.IStaticRuleChecker;
import com.astra.ses.spell.dev.scheck.interfaces.IssueFactory;
import com.astra.ses.spell.language.Parser;

public class DictionaryChecker implements IStaticRuleChecker 
{
	@Override
	public String getName() 
	{
		return "Dictionary checker";
	}

	@Override
	public void performCheck( IIssueList issues ) 
	{
		Parser parser = new Parser();
		
		IFile file = (IFile) issues.getResource();
		
		if (file.getFileExtension().equals("py")) return;
		
		String sourceCode = ResourceManager.instance().getSource( file );
		String[] source = sourceCode.split( "\n" );

		String currentLine = "";
		for(int lineNo = 0; lineNo < source.length; lineNo++)
		{
			if (!currentLine.isEmpty()) currentLine += "\n";
			currentLine += source[lineNo].trim();
			
			if (currentLine.endsWith("\\")) continue;
			if (currentLine.startsWith("#"))
			{
				currentLine = "";
				continue;
			}

			int idx = currentLine.indexOf(" ");
			String value = currentLine;
			if (idx != -1)
			{
				value = currentLine.substring(idx).trim();
			}
			else
			{
				value = value.trim();
			}

			try
            {
	            if (!value.isEmpty()) parser.parseCode(value);
            }
            catch (ParseException e)
            {
	            Token tok = e.currentToken;
            	int position = 0;
            	for(int elineNo = 0; elineNo < lineNo; elineNo++)
            	{
            		position += source[elineNo].length() + 1;
            	}
            	position += currentLine.indexOf(value);
            	position += tok.beginColumn;
            	int length = 1;
            	if (tok.image != null) length = tok.image.length();
	        	issues.addIssue( IssueFactory.createErrorIssue("Dictionary value syntax error: " + e.getLocalizedMessage(), lineNo, position, position+length));
            }
            catch (Exception e)
            {
            	System.err.println("Internal error while parsing value '" + value + "'");
            	e.printStackTrace();
            }
			currentLine = "";
		}
		
	}

}
