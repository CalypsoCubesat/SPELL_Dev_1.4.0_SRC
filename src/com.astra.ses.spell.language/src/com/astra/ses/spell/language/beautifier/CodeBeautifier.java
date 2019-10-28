///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.language.beautifier
// 
// FILE      : CodeBeautifier.java
//
// DATE      : 2009-11-23
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
package com.astra.ses.spell.language.beautifier;

import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.Module;
import org.python.pydev.shared_core.string.StringUtils;

import com.astra.ses.spell.language.Parser;

public class CodeBeautifier
{
	private static Parser s_parser = new Parser();
	
	/****************************************************************************
	 * Beautify the given piece of code
	 * @param code
	 * @param maxWidth
	 * @return
	 ***************************************************************************/
	public static String beautifyCode( String code, int maxWidth, int indent )
	{
		String newCode = "";
		try 
		{
			SimpleNode root = s_parser.parseCodeGetTree(code);
			
			String aligned = "";
			synchronized (Paragraph.class) {
				Paragraph pars = parseBlock( root, maxWidth );
				Paragraph lastLine = pars.getLines().get(pars.getLines().size() - 1);
				if (lastLine.endsWithNewline() && !lastLine.getM_postfix().isEmpty())
					lastLine.getM_postfix().remove(lastLine.getM_postfix().size() - 1);
				pars.buildOrder(0);
				aligned = pars.makeAlignedString(0);
				pars.cleanup();
			}
			
			String[] splittedAlign = aligned.split("\n",Integer.MAX_VALUE);
			if (splittedAlign.length > 1 && indent > 0){
			StringBuilder builder = new StringBuilder();
			String indentStr = StringUtils.repeatString(" ", indent);
			builder.append(splittedAlign[0]);
			for (int i = 1; i < splittedAlign.length; i++) {
				builder.append("\n");
				builder.append(indentStr);
				builder.append(splittedAlign[i]);
			}
			return builder.toString();
			} else {
				return aligned;
			}
		} 
		catch (Throwable e) 
		{
			if (!code.contains("\\\n") && code.contains("\n")) {
				return beautifyCode(code.replace("\n", " \\\n"), maxWidth, indent);
			} else {
				System.err.println("Could not parse " + code + " (reason: "+e+" )");			
				//e.printStackTrace();
				return null;
			}
			
		}
	}
	
	/****************************************************************************
	 * Parse the given code block
	 * @param code
	 * @param maxWidth
	 * @return
	 ***************************************************************************/
	protected static Paragraph parseBlock( SimpleNode node, int maxWidth )
	{
		Paragraph result = null;
		if (node instanceof Module)
		{
			Paragraph p = new Paragraph(null);
			result = ModuleParser.parse( (Module)node, 0, maxWidth ,p);
		}
		return result;
	}
	
	public static void main( String[] args )
	{
		String code2 = "[ [325235235235325,235235235325,23523523555], 153534543534534535,3453453455345345342,[1463463463464363,243634634634646346,334634634634646],345345345353]";
		String code3 = "{ Adffgdf:5645654654654655641, Bdfg:2546456456546565, Cf:54645645645645643 }";
		String code4 = "[ [325235235235325,235235235325,23523523555], { A:153534543534534535, BBb:435435664456, Ceeeee:56756767} ,3453453455345345342,[1463463463464363,243634634634646346,334634634634646],345345345353]";
		String code5 = "{ A:1, B:2, C:3}";
		String code6 = "{ Adffgdf:5645654654654655641, Bdfg:[5345435353453453455,4534534534534543535,34534534543534534534], Cf:54645645645645643 }";
		String code7 = "GetTM( 'TMPOINT', Value, 45, [1,2,3], Wait=True, ValueFormat=RAW, config = {Config:X})";
		String code8 = "Send( command = 'TC', args=[['ARG1',56],['ARG2',54,{ValueFormat:RAW}]], verify = [['TM1 rtert', eq, 466],['TM2 egrtgretreg ert ert trt', lt, 34, {Modifier5:0.1}]], Modifier1=1, Modifier2=4, config = {Modifier3:True})";
	    CodeBeautifier beautifier = new CodeBeautifier();

	    int maxWidth = 80;
	    
	    String beautifyCode = beautifier.beautifyCode(code2, maxWidth,0);
	    String beautifyCode2 = beautifier.beautifyCode(code2, maxWidth,8);
		String beautifyCode3 = beautifier.beautifyCode(code3, maxWidth,0);
		String beautifyCode4 = beautifier.beautifyCode(code4, maxWidth,0);
		String beautifyCode5 = beautifier.beautifyCode(code5, maxWidth,0);
		String beautifyCode6 = beautifier.beautifyCode(code6, maxWidth,0);
		String beautifyCode7 = beautifier.beautifyCode(code7, maxWidth,0);
		String beautifyCode8 = beautifier.beautifyCode(code8, maxWidth,0);
		System.out.println(beautifyCode );
		System.out.println(beautifyCode2);
		System.out.println(beautifyCode3);
		System.out.println(beautifyCode4);
		System.out.println(beautifyCode5);
		System.out.println(beautifyCode6);
		System.out.println(beautifyCode7);
		System.out.println(beautifyCode8);
	}
}
