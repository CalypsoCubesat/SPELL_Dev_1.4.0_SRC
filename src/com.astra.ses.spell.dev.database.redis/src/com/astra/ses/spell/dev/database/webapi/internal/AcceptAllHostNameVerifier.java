package com.astra.ses.spell.dev.database.webapi.internal;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class AcceptAllHostNameVerifier implements HostnameVerifier {
	public boolean verify(String urlHostName, SSLSession session) {
		return true;
	}
}