///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.database.hifly
//
// FILE      : HiflyDatabaseDriver.java
//
// DATE      : Feb 22, 2011
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
package com.astra.ses.spell.dev.database.webapi;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HttpsURLConnection;

import org.eclipse.core.runtime.IProgressMonitor;

import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabaseDriver;
import com.astra.ses.spell.dev.database.webapi.dbModel.WebAPIDatabase;

/******************************************************************************
 * hifly database driver implementation
 *****************************************************************************/
public class WebAPIDatabaseDriver implements ISpellDatabaseDriver
{

	/** Diver name */
	private static final String	DRIVER_NAME	= "webapi";
	

	
	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
	public boolean checkDatabase(String rootPath)
	{
		// TODO improve the strategy for determining if the path contains a
		// correct hifly database
		DatabaseConnection connection = WebAPIDatabaseConnectionManager.getInstance().getConnection(rootPath);

		return connection != null && connection.isConnected();
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
	public String getName()
	{
		return DRIVER_NAME;
	}

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
	public ISpellDatabase loadDatabase(String rootPath, IProgressMonitor monitor)
	{
		monitor.beginTask("Loading database...", 1);
		//long start = System.nanoTime();
		//ISpellDatabase database = new HiflyDatabase(rootPath);
		//long dur  = System.nanoTime() - start;
		//System.out.println("DB Load dur: " + (dur / 1000000) + " ms");
		DatabaseConnection connection = WebAPIDatabaseConnectionManager.getInstance().getConnection(rootPath);
		WebAPIDatabase db = new WebAPIDatabase();
		db.setDbConnection(connection);
		db.setDatabasePath(rootPath);
		
		//monitor.worked(1);
		
		
		
		return db;
	} 
	 
}
