package com.astra.ses.spell.dev.database.webapi;

import java.util.HashMap;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

import com.astra.ses.spell.dev.database.webapi.internal.AcceptAllHostNameVerifier;
import com.astra.ses.spell.dev.database.webapi.internal.TrustAllTrustManager;
import com.astra.ses.spell.dev.database.webapi.internal.WebAPIDatabaseConnection;


public class WebAPIDatabaseConnectionManager {
	protected static WebAPIDatabaseConnectionManager instance = null;
	
	protected HashMap<String,DatabaseConnection> connectionCache = new HashMap<String, DatabaseConnection>();
	
	public static synchronized WebAPIDatabaseConnectionManager getInstance(){
		if (instance == null){
			instance = new WebAPIDatabaseConnectionManager();
		}
		return instance;
	}
	
	
	private WebAPIDatabaseConnectionManager(){
		WebAPIDatabaseConnectionManager.setupConnection();
	}
	
	public static void setupConnection(){
		if (HttpsURLConnection.getDefaultHostnameVerifier() instanceof AcceptAllHostNameVerifier)
			return;
		synchronized (WebAPIDatabaseConnectionManager.class) {
			if (HttpsURLConnection.getDefaultHostnameVerifier() instanceof AcceptAllHostNameVerifier)
				return;
			try {
				HostnameVerifier hv = new AcceptAllHostNameVerifier();
				javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
				javax.net.ssl.TrustManager tm = new TrustAllTrustManager();
				trustAllCerts[0] = tm;
				javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext.getInstance("SSL");
				javax.net.ssl.SSLSessionContext sslsc = sc.getServerSessionContext();
				sslsc.setSessionTimeout(0);
				sc.init(null, trustAllCerts, null);
				HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
				HttpsURLConnection.setDefaultHostnameVerifier(hv);
			} catch (Exception ex){
				ex.printStackTrace();
			}
		}
		
	}

	public DatabaseConnection getConnection(String host){
		synchronized (connectionCache) {
			DatabaseConnection databaseConnection = connectionCache.get(host);
			if (databaseConnection != null)
				return databaseConnection;
		}
		DatabaseConnection databaseConnection = new WebAPIDatabaseConnection(this, host);
		String success = databaseConnection.getTMVersion();
		if (success.trim().isEmpty()){
			System.err.println("Could not connect to " + host);
			databaseConnection = null;
		}
		
		synchronized (connectionCache) {
			connectionCache.put(host,databaseConnection);
			
		}
		return databaseConnection;
	}
	
}
