package com.astra.ses.spell.code_coverage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.UserInfo;

public class CodeCoverage {
	private static CodeCoverage instance = null;

	private Session session;
	private String host;
	private String user;
	private ChannelSftp sftpChannel;
	private String lastErrorMessage = "";
	
	public static synchronized CodeCoverage getInstance(){
		if (instance == null){
			instance = new CodeCoverage();
		}	
		return instance;
	}
	
	public String getLastErrorMessage() {
		return lastErrorMessage;
	}
	
	public void resetLastErrorMessage(){
		lastErrorMessage = "";
	}
	
	public boolean disconnect(){
		if (session != null){
			session.disconnect();
			session = null;
			return true;
		}
		return false;
	}
	
	public boolean connect(String user,String password,String host){
		
		if (session == null){
			JSch jsch=new JSch();
			try {
				session=jsch.getSession(user, host, 22);
				UserInfo ui=new PasswordUserInfo();
				session.setUserInfo(ui);
				session.setPassword(password);
				session.connect();
				this.user = user;
				this.host = host;
			} catch (JSchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				session = null;
				lastErrorMessage = "Connecting to server " + user + "@" + host + " failed: " + e.getMessage() + "<black>";
				return false;
			}
		}
		if (this.user == null || !this.user.equals(user)){
			if (session != null){
				session.disconnect();
			}
			session = null;
			return connect(user, password, host);
		}
		if (this.host == null || !this.host.equals(host)){
			if (session != null){
				session.disconnect();
			}
			session = null;
			return connect(user, password, host);
		}
		return true;
	}
	
	static int checkAck(InputStream in) throws IOException{
		int b=in.read();
		// b may be 0 for success,
		//          1 for error,
		//          2 for fatal error,
		//          -1
		if(b==0) return b;
		if(b==-1) return b;

		if(b==1 || b==2){
			StringBuffer sb=new StringBuffer();
			int c;
			do {
				c=in.read();
				sb.append((char)c);
			}
			while(c!='\n');
			if(b==1){ // error
				System.out.print(sb.toString());
			}
			if(b==2){ // fatal error
				System.out.print(sb.toString());
			}
		}
		return b;
	}
	

	public Channel openShell(final InputStream consoleInput,final OutputStream consoleOut){
		FileOutputStream fos = null;
		try {

			final com.jcraft.jsch.Channel channel=session.openChannel("shell");
			//((ChannelShell)channel).setCommand(command);
			//((ChannelShell)channel).setPtyType("vt100");
			
			// get I/O streams for remote scp
			final OutputStream out=channel.getOutputStream();
			InputStream in=channel.getInputStream();
			
			channel.connect();
			
			byte[] buf=new byte[1024];
			
			
			return channel;
		} catch(Exception e){
			System.out.println(e);
			try{
				if(fos!=null)
					fos.close();
			} catch(Exception ee){
				
			}
			lastErrorMessage = "ERROR while opening shell reason: " + e.getMessage();
			return null;
		}
	}
	private static String result = ""; 
	public String askUserName(final String host){
		
		
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				InputDialog dialog = new InputDialog(Display.getDefault().getActiveShell(), "User name for server " + host, "Enter user name for server " + host, result, new IInputValidator() {
					
					@Override
					public String isValid(String newText) {
						return null;
					}
				});
				
				int open = dialog.open();
				if (open == SWT.CANCEL){
					result =  "CANCELED!";
				}			
				
				result = dialog.getValue();
				
			}
		});
		
		return result;
	}
	
	public void openReport(final IFile file){
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				
				
				IEditorDescriptor webView = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(".html");
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(new FileEditorInput(file), webView.getId());
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
			}
		});
	}
	
	public String uploadProjectToSFTP(String projectName,final String baseTargetFolder){
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		try {
			sftpChannel.cd(sftpChannel.getHome());
		} catch (SftpException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}
		
		try {
			sftpChannel.cd(baseTargetFolder + "/" + projectName);
		} catch (SftpException e1) {
			try {
				try {
					sftpChannel.mkdir(baseTargetFolder);
				}catch (Exception ex){
					
				};
				try {
					sftpChannel.mkdir(baseTargetFolder + "/" + projectName);
				}catch (Exception ex){
				
				};
				
				
				sftpChannel.cd(baseTargetFolder + "/" + projectName);
				
				
			} catch (SftpException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}	
		try {
			sftpChannel.cd(sftpChannel.getHome());
		} catch (SftpException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}
		
		try {
			project.accept(new IResourceVisitor() {

				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFolder){
						IFolder file = (IFolder) resource;
						String targetRelativePath = file.getFullPath().toString().replaceAll("\\\\", "/");
						String targetRelativePathDir = file.getFullPath().removeLastSegments(1).toString().replaceAll("\\\\", "/");

						String sourceAbsolutePath = file.getLocation().toString();
						if (file.toString().contains(".git")){
							return false;
						}
						//System.out.println("Handling " + file.toString());
						String target = baseTargetFolder + targetRelativePath;
						String targetDir = baseTargetFolder + targetRelativePathDir + "/";
						String source = sourceAbsolutePath;

						try {
							sftpChannel.mkdir(target);

						} catch (SftpException e2){
							//e2.printStackTrace();	
						}
					}
					return true;
				}
			});


			project.accept(new IResourceVisitor() {
				
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile){
						final IFile file = (IFile) resource;
						String targetRelativePath = file.getFullPath().toString().replaceAll("\\\\", "/");
						String targetRelativePathDir = file.getFullPath().removeLastSegments(1).toString().replaceAll("\\\\", "/");
						
						
						String sourceAbsolutePath = file.getLocation().toString();
						if (file.toString().contains(".git")){
							return false;
						}
						//System.out.println("Handling " + file.toString());
						String target = baseTargetFolder + targetRelativePath;
						String targetDir = baseTargetFolder + targetRelativePathDir + "/";
						String source = sourceAbsolutePath;
						try {
							try {
								long lastMod = new File(source).lastModified() / 1000;
								SftpATTRS targetStat = sftpChannel.stat(target);
								
								if (lastMod > targetStat.getMTime()){
									sftpChannel.put(source, target);
								}
							} catch (SftpException e1){
								sftpChannel.put(source, target);
							}
						} catch (SftpException e) {
							e.printStackTrace();
						}
					}
					return true;
				}
			});
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}
	
	public String closeSFTPChannel(){
		if (sftpChannel != null){
			sftpChannel.exit();
			sftpChannel = null;
			return "SFTP Channel closed.";
		} else {
			return  "";
		}
	}
	public ChannelSftp openSFTPChannel(){
		if (sftpChannel != null && sftpChannel.isClosed()){
			sftpChannel = null;
		}
		try {
			if (sftpChannel == null){
				com.jcraft.jsch.Channel channel = session.openChannel("sftp");
				channel.connect();
				sftpChannel = (ChannelSftp) channel;

				return sftpChannel;
			} else {
				return sftpChannel;
			}
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public String pullFile(String sourceFile,String targetFile){
		FileOutputStream fos = null;
		try {
			String command="scp -f "+sourceFile;
			com.jcraft.jsch.Channel channel=session.openChannel("exec");
			((ChannelExec)channel).setCommand(command);

			// get I/O streams for remote scp
			OutputStream out=channel.getOutputStream();
			InputStream in=channel.getInputStream();

			channel.connect();

			byte[] buf=new byte[1024];

			// send '\0'
			buf[0]=0; 
			out.write(buf, 0, 1); 
			out.flush();

			while(true){
				int c=checkAck(in);
				if(c!='C'){
					break;
				}

				// read '0644 '
				in.read(buf, 0, 5);

				long filesize=0L;
				while(true){
					if(in.read(buf, 0, 1)<0){
						// error
						break; 
					}
					if(buf[0]==' ')
						break;
					filesize=filesize*10L+(long)(buf[0]-'0');
				}

				String file=null;
				for(int i=0;;i++){
					in.read(buf, i, 1);
					if(buf[i]==(byte)0x0a){
						file=new String(buf, 0, i);
						break;
					}
				}

				// send '\0'
				buf[0]=0;
				out.write(buf, 0, 1);
				out.flush();

				// read a content of lfile
				fos=new FileOutputStream(targetFile);
				int foo;
				while(true){
					if(buf.length<filesize) foo=buf.length;
					else foo=(int)filesize;
					foo=in.read(buf, 0, foo);
					if(foo<0){
						// error 
						break;
					}
					fos.write(buf, 0, foo);
					filesize-=foo;
					if(filesize==0L) break;
				}
				fos.close();
				fos=null;

				if(checkAck(in)!=0){
					return "";
				}

				// send '\0'
				buf[0]=0; out.write(buf, 0, 1); out.flush();
				
				//System.out.println("filesize="+filesize+", file="+file);
			}
			channel.disconnect();
			return "";
		}
		catch(Exception e){
			System.out.println(e);
			try{
				if(fos!=null)
					fos.close();
			} catch(Exception ee){
				
			}
			return "<red>ERROR while pulling file " + sourceFile + " reason: " + e.getMessage()+ "<black>" ;
		}
		//return "";
	}

	public String getSCDBEntry(IProject p,String entryName){
		try {
			File scdb_Path_1 = new File(p.getLocation() + File.separator + "\\InputFiles\\SpacecraftDB\\SCDB.DB");
			File scdb_Path_2 = new File(p.getLocation() + File.separator + "\\InputFiles\\SPELL_FORMAT\\SpacecraftDB\\SCDB.DB");
			File scdb_Path = null;

			if (scdb_Path_1.exists()){
				scdb_Path = scdb_Path_1;
			} else if (scdb_Path_2.exists()){
				scdb_Path = scdb_Path_2;
			}
			if (scdb_Path == null)
				return "";
			BufferedReader in = new BufferedReader(new FileReader(scdb_Path));
			try {
				
				for(String line;(line = in.readLine()) != null;){

					if (line.startsWith("#"))
						continue;
					if (line.startsWith(entryName)){
						in.close();
						String[] split = line.split("\\s+");
						if (split.length > 1)
							return split[1];
						else
							return "";
					}
				}

			} finally {
				in.close();
			}
		} catch (IOException e) {
			
		}
		return "";
	}
	
	public boolean isConnected() {
		return session != null && session.isConnected();
	}
	
}
