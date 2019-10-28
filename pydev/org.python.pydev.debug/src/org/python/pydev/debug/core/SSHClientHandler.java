package org.python.pydev.debug.core;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

public class SSHClientHandler {
    private static Session lastSession = null;

    public static Session connect(String user, String password, String host) {
        JSch jsch = new JSch();
        Session session;
        try {
            session = jsch.getSession(user, host, 22);
            UserInfo ui = new PasswordUserInfo();
            session.setUserInfo(ui);
            session.setServerAliveCountMax(3);
            session.setServerAliveInterval(10000);
            session.connect();
            return lastSession = session;
        } catch (JSchException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeLastSession() {
        if (lastSession != null && lastSession.isConnected()) {
            lastSession.disconnect();
        }
        lastSession = null;
    }

    public static Session getLastSession() {
        if (lastSession != null && lastSession.isConnected()) {

            return lastSession;
        }
        try {
            closeLastSession();
        } catch (Exception ex) {

        }

        return null;
    }
}
