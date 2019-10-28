package com.astra.ses.spell.dev.database.webapi.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.eclipse.swt.widgets.Display;

import com.astra.ses.spell.dev.database.webapi.DatabaseConnection;
import com.astra.ses.spell.dev.database.webapi.WebAPIDatabaseConnectionManager;

public class WebAPIDatabaseConnection implements DatabaseConnection {
	
	
	protected URLConnection dbConnection = null;
	protected String hostName;
	protected WebAPIDatabaseConnectionManager manager;

	protected WeakReference<String> tmCache = new WeakReference<String>(null);
	protected WeakReference<String> tcCache = new WeakReference<String>(null);
	protected WeakReference<String> tmVersion = new WeakReference<String>(null);
	protected WeakReference<String> tcVersion = new WeakReference<String>(null);
	
	protected ScriptEngine jsEngine = null;
	
	public WebAPIDatabaseConnection(WebAPIDatabaseConnectionManager manager,String hostName) {
		this.hostName = hostName;
		this.manager = manager;
	}

	

	public synchronized ScriptEngine getScriptingEngine(){
		if (jsEngine != null)
			return jsEngine;
		jsEngine = new ScriptEngineManager().getEngineByExtension("js");
		return jsEngine;
	}
	
	@Override
	public String query(QueryAllTypes queryType) {
		//TODO move query to extra Thread
		URL dbURL;
		try {
			WebAPIDatabaseConnectionManager.setupConnection();
			
			if (!hostName.contains("://")){
				hostName = "https://" + hostName;
			}
			dbURL = new URL(hostName + queryType.getPath());

			dbConnection = dbURL.openConnection();
			if (dbConnection instanceof HttpURLConnection)
				((HttpURLConnection)dbConnection).setRequestProperty("Accept-Encoding", "gzip");
			dbConnection.setUseCaches(true);
			dbConnection.setReadTimeout(20000);
			dbConnection.setConnectTimeout(5000);
			dbConnection.connect();
			Map<String, List<String>> headers = dbConnection.getHeaderFields();
			InputStream input;
			if ("gzip".equals(dbConnection.getContentEncoding())) {
				try{
					input = new GZIPInputStream(dbConnection.getInputStream());
				} catch (Exception ex){
					input = dbConnection.getInputStream();
					input.reset();
				}
			} else {
				input = dbConnection.getInputStream();
			}
			final InputStream in = input;
			final IOException[] failed = {null};
			final StringBuilder resp = new StringBuilder();
			Thread inputThread = new Thread(){
				public void run() {
					byte[] buffer = new byte[4096];
					int length = -1;
					try {
						while ((length = in.read(buffer)) != -1){
							if (length > 0)
								resp.append(new String(buffer,0,length));
						}
						if (resp.length() > 10000000) {
							System.out.println();
						}
					} catch (IOException e) {
						failed[0] = e;
						System.err.println("Could not connect to TMTC Server!");
					
					}
				};
			};

			inputThread.start();
			while (inputThread.isAlive()){
				Display display = Display.getCurrent();
			
				if (display == null || !display.readAndDispatch()) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						
					}
				}
			};
			if (failed[0] != null){
				throw failed[0];
			}
			String answer = resp.toString();
			//System.out.println(answer);
			in.close();
			return answer;
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			if (dbConnection instanceof HttpURLConnection){
				try {
					HttpURLConnection urlConnection = (HttpURLConnection)dbConnection;
					if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK){
						return query(queryType);
					} else {
						System.err.println("Could not connect to TMTC Server! Got Error Code " + urlConnection.getResponseCode() + "!");
					}
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				e.printStackTrace();
			}
		} 
		
		return "";
	}

	@Override
	public String query(QueryTypes queryType,String specific) {
		URL dbURL;
		String contentEncoding;
		try {
			WebAPIDatabaseConnectionManager.setupConnection();
			if (!hostName.contains("://")){
				hostName = "https://" + hostName;
			}
			dbURL = new URL(hostName + queryType.getPath() + specific);

			dbConnection = dbURL.openConnection();
			if (dbConnection instanceof HttpURLConnection)
				((HttpURLConnection)dbConnection).setRequestProperty("Accept-Encoding", "gzip");
			dbConnection.setUseCaches(true);
			dbConnection.setReadTimeout(20000);
			dbConnection.setConnectTimeout(5000);
			dbConnection.connect();
			InputStream input;
			contentEncoding = dbConnection.getContentEncoding();
			if ("gzip".equals(contentEncoding)) {
				try{
					input = new GZIPInputStream(dbConnection.getInputStream());
				} catch (Exception ex){
					input = dbConnection.getInputStream();
					input.reset();
				}
			} else {
				input = dbConnection.getInputStream();
			}
			final InputStream in = input;
			StringBuilder resp = new StringBuilder();
			byte[] buffer = new byte[4096];
			int length = -1;
			while ((length = in.read(buffer)) != -1){
				if (length > 0)
					resp.append(new String(buffer,0,length));
			}
			String answer = resp.toString();
			//System.out.println(answer);
			in.close();
			return answer.trim();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			if (dbConnection instanceof HttpURLConnection){
				try {
					HttpURLConnection urlConnection = (HttpURLConnection)dbConnection;
					if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK){
						return query(queryType, specific);
					} else {
						System.err.println("Could not connect to TMTC Server! Got Error Code " + urlConnection.getResponseCode() + "!");
					}
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else {
				e.printStackTrace();
			}
		} 
		
		return "";
	}

	@Override
	public String getAllTM() {
		if (tmCache.get() != null && !shouldUpdate(tmVersion.get(),query(QueryTypes.TM,"version"))){
			return tmCache.get();
		} else {
			String all_tm = query(QueryAllTypes.ALL_TM);
			tmVersion = new WeakReference<String>(query(QueryTypes.TM,"version"));
			tmCache = new WeakReference<String>(all_tm);
			return tmCache.get();
		}
	}

	@Override
	public String getAllTC() {
		if (tcCache.get() != null && !shouldUpdate(tcVersion.get(),query(QueryTypes.TC,"version"))){
			return tcCache.get();
		} else {
			String all_tc = query(QueryAllTypes.ALL_TC);
			tcVersion = new WeakReference<String>(query(QueryTypes.TC,"version"));
			tcCache = new WeakReference<String>(all_tc);
			return tcCache.get();
		}
	}

	@Override
	public String getTM(String mnemonic) {
		String tm = query(QueryTypes.TM,mnemonic);
		return tm;
	}

	@Override
	public String getTC(String mnemonic) {
		String tc = query(QueryTypes.TC,mnemonic);
		return tc;
	}

	@Override
	public boolean shouldUpdate(String lastHash,String currentHash) {
		
		return currentHash != null && !currentHash.equals(lastHash);
	}

	@Override
	public boolean supportsOnlineUpdate() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return dbConnection != null;
	}

	@Override
	public <T extends JsonStructure> T interpret(String data) {
		if (data == null || data.isEmpty())
			return (T) null;
		StringReader reader = new StringReader(data);
		JsonReader rdr = Json.createReader(reader);
		T jsonObject = (T)rdr.read();
		reader.close();
		rdr.close();
		return jsonObject;
	}



	@Override
	public String getTMVersion() {
		//TODO move query to extra Thread
		return query(QueryTypes.TM,"version");

	}



	@Override
	public String getTCVersion() {
		// TODO Auto-generated method stub
		return query(QueryTypes.TC,"version");
	}

	

}
