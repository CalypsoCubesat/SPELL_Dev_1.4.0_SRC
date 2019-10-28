package lu.ses.engineering.spell.revisiontools;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import lu.ses.engineering.spell.revisiontools.preferences.ExecutePythonScriptAction;

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

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.UserInfo;

public class Code_Coverage {
	private static Code_Coverage instance = null;
	private ExecutePythonScriptAction action;
	private Session session;
	private String host;
	private String user;
	private ChannelSftp sftpChannel;
	
	public static synchronized Code_Coverage getInstance(ExecutePythonScriptAction action){
		if (instance == null){
			instance = new Code_Coverage();
		}
		instance.action = action;		
		return instance;
	}
	
	public String disconnect(){
		if (session != null){
			session.disconnect();
			session = null;
			return "Session successfully closed.";
		}
		return "Session is already closed.";
	}
	
	public String connect(String user,String password,String host){
		
		if (session == null){
			JSch jsch=new JSch();
			try {
				session=jsch.getSession(user, host, 22);
				UserInfo ui=new PasswordUserInfo();
				session.setUserInfo(ui);
				
				session.connect();
				this.user = user;
				this.host = host;
			} catch (JSchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				session = null;
				return "<red>ERROR: Connecting to server " + user + "@" + host + " failed: " + e.getMessage() + "<black>";
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
		return "<green>Successfully connected to server " + user + "@" + host + ".<black>";
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
	

	public String openShell(final InputStream consoleInput,final OutputStream consoleOut){
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
			Thread inputThread = new Thread(){
				@Override
				public void run() {
					while (channel.isConnected() && !channel.isClosed() && !channel.isEOF()){
						try {
							String returnValue = "";
							byte[] buf=new byte[1024];
							int length = 0;


							length = consoleInput.read(buf, 0, 1024);

							if (length > 0)
								returnValue += new String(buf, 0, length);

							//System.out.println("input: " + returnValue);
							
							out.write((returnValue.trim()  + "\n").getBytes());
							//out.write(0);
							out.flush();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
			};
			inputThread.start();

			String returnValue = "";
			int length;
			do {
				length = in.read(buf, 0, 1024);
				if (length > 0)
					returnValue = new String(buf, 0, length);
				
				consoleOut.write(returnValue.getBytes());
				consoleOut.flush();


			} while (channel.isConnected() && !channel.isClosed() && !channel.isEOF());

			channel.disconnect();
			
			return "Done";
		} catch(Exception e){
			System.out.println(e);
			try{
				if(fos!=null)
					fos.close();
			} catch(Exception ee){
				
			}
			return "<red>ERROR while opening shell reason: " + e.getMessage() + "<black>" ;
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
	public String openSFTPChannel(){
		try {
			if (sftpChannel == null){
				com.jcraft.jsch.Channel channel = session.openChannel("sftp");
				channel.connect();
				sftpChannel = (ChannelSftp) channel;

				return "SFTP Channel opened.";
			} else {
				return "SFTP Channel already open";
			}
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Failed to open SFTP Channel!";
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


	public String startAnalysis(String satellite,String base_path,String procedure){
		
		return "Success";
	}
	
	
	public String stopAnalysis(String satellite,String base_path,String procedure){
		
		return "Success";
	}
	
	public String reportStatus(String satellite,String base_path,String procedure){
		
		return "Success";
	}
	
	public String pullReportFile(String satellite,String base_path,String procedure){
		
		return "Success";
	}
}
