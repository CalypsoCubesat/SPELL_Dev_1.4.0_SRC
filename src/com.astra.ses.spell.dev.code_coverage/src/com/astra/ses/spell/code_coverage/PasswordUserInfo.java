package com.astra.ses.spell.code_coverage;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

import com.jcraft.jsch.UIKeyboardInteractive;
import com.jcraft.jsch.UserInfo;

public class PasswordUserInfo implements UserInfo, UIKeyboardInteractive{
	public String getPassword(){ 
		return passwd;
	}
	public boolean promptYesNo(final String str){
		final boolean[] option = new boolean[]{false};
		
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				option[0] = MessageDialog.openQuestion(Display.getDefault().getActiveShell(), "Warning", str);
			}
		});
		
		return option[0];
	}

	String passwd;
	JTextField passwordField=(JTextField)new JPasswordField(20);

	public String getPassphrase(){ 
		return null; 
	}
	
	public boolean promptPassphrase(String message){ 
		return true; 
	}
	
	public boolean promptPassword(final String dest,final String message){
		final boolean[] r = new boolean[]{false};
		
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				InputDialog dialog = new InputDialog(Display.getDefault().getActiveShell(), "Please enter your password for "+dest+".", message, passwd, new IInputValidator() {
					
					@Override
					public String isValid(String newText) {
						// TODO Auto-generated method stub
						return null;
					}
				}){
					@Override
					protected int getInputTextStyle() {
						// TODO Auto-generated method stub
						return super.getInputTextStyle() | SWT.PASSWORD;
					}
				};
				
				int result = dialog.open();
				if (result == SWT.CANCEL){
					r[0] = false;
				} else {
					passwd = dialog.getValue();
					r[0] = true;
				}
			}
		});
		return r[0];
		
	}
	
	public void showMessage(final String message){
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				MessageDialog.openInformation(Display.getDefault().getActiveShell(), "", message);
			}
		});
		
	}
	
	final GridBagConstraints gbc = 
			new GridBagConstraints(0,0,1,1,1,1,
					GridBagConstraints.NORTHWEST,
					GridBagConstraints.NONE,
					new Insets(0,0,0,0),0,0);
	private Container panel;
	public String[] promptKeyboardInteractive(String destination,
			String name,
			String instruction,
			String[] prompt,
			boolean[] echo){
		if (promptPassword(destination,prompt[0])){
			
			String[] result = new String[]{passwd};
			return result;
		} else {
			return null;
		}
		 
	
		
		
	}
	@Override
	public boolean promptPassword(String message) {
		// TODO Auto-generated method stub
		return promptPassword("<unkown>", message);
	}
}