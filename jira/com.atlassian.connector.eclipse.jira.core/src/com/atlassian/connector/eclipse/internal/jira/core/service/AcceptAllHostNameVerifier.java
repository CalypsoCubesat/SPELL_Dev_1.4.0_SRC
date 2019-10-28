package com.atlassian.connector.eclipse.internal.jira.core.service;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class AcceptAllHostNameVerifier implements HostnameVerifier {
	public boolean verify(String urlHostName, SSLSession session) {
		return true;
	}
}