///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.language
// 
// FILE      : Parser.java
//
// DATE      : Apr 28, 2014
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
package com.astra.ses.spell.language;

import org.eclipse.swt.widgets.Display;
import org.python.pydev.core.IGrammarVersionProvider;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.parser.IGrammar;
import org.python.pydev.parser.PyParser;
import org.python.pydev.parser.grammar27.PythonGrammar27;
import org.python.pydev.parser.jython.FastCharStream;
import org.python.pydev.parser.jython.ParseException;
import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.Visitor;

public class Parser
{
	protected static IGrammar createGrammar( char[] cs )
	{
		FastCharStream in = new FastCharStream(cs);
		// CHANGE THIS FOR GRAMMAR 3.0
		return new PythonGrammar27(true,in);
		//return new SpellGrammar30(true,in);
	}
	
	public static void parseCode(String code) throws ParseException
	{
		char[] cs = code.toCharArray();
		IGrammar grammar = createGrammar(cs);
		grammar.file_input();
	}

	public static void parseCode(String code, Visitor visitor) throws Exception
	{
		char[] cs = code.toCharArray();
		IGrammar grammar = createGrammar(cs);
		SimpleNode root = grammar.file_input();
		root.accept(visitor);
	}

	public static SimpleNode parseCodeGetTree(String code) throws Throwable
	{
		char[] cs = code.toCharArray();
		
		final IGrammar grammar = createGrammar(cs);
		
		final SimpleNode[] file_input = {null};
		final Throwable[] ex = {null};
		Thread p = new Thread("Formatting Parser Thread") {
		    public void run() {
		        try {
					file_input[0] = grammar.file_input();
				} catch (Throwable e) {
				    ex[0] = e;
				}
		    };
		};
		p.start();
		while(file_input[0] == null && ex[0] == null) {
		    if (Display.getCurrent() != null) {
		        if (!Display.getCurrent().readAndDispatch()) {
		            Thread.sleep(10);
		        }
		    }
		}
		if (ex[0] != null)
		    throw ex[0];
		Throwable errorOnParsing = grammar.getErrorOnParsing();
		if (errorOnParsing != null)
			throw errorOnParsing;
		return file_input[0];

	}
}
