///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.model
//
// FILE      : IssueList.java
//
// DATE      : Feb 7, 2011
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
package com.astra.ses.spell.dev.scheck.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;

import com.astra.ses.spell.dev.scheck.interfaces.IIssue;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;

/******************************************************************************
 * Implementation of an issue list 
 *****************************************************************************/
public class IssueList implements IIssueList
{
	private List<IIssue> m_issues;
	private IResource m_resource;
	
	public IssueList( IResource resource )
	{
		m_resource = resource;
		m_issues = new ArrayList<IIssue>();
	}
	
	public void addIssue( IIssue issue )
	{
		// if two issues of different criticality match on the same line, the most critical one is left,
		// and the other is discarded.
		for(IIssue eissue : m_issues)
		{
			// If a matching issue exists
			if (eissue.getLine() == issue.getLine())
			{
				// If the new issue has bigger severity
				if (issue.getSeverity().ordinal() > eissue.getSeverity().ordinal())
				{
					// remove the old one
					m_issues.remove(eissue);
					m_issues.add(issue);
					return;
				}
				// if it has equal or lower severity, discard the new issue
				// it can come again on later re-analysis
				else  
				{
					return;
				}
			}
		}
		m_issues.add(issue);
	}
	
	@Override
	public List<IIssue> getIssues()
	{
		return m_issues;
	}
	
	@Override
	public IResource getResource()
	{
		return m_resource;
	}
	
	@Override
	public boolean resourceCorresponds( IResource resource )
	{
		String myPath = m_resource.getFullPath().toPortableString();
		String otherPath = resource.getFullPath().toPortableString();
		return myPath.equals(otherPath);
	}
	
	@Override
	public void clear()
	{
		m_issues.clear();
		m_resource = null;
	}
}
