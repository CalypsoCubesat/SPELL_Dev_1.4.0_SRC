package com.astra.ses.spell.dev.database.webapi;

import javax.json.JsonObject;
import javax.json.JsonStructure;


public interface DatabaseConnection {
	public enum QueryAllTypes {
		ALL_TM("-TM-mnemonics"),
		ALL_TC("-TC-mnemonics");
		
		private String path;

		QueryAllTypes(String path){
			this.path = path;
		}
		
		public String getPath(){
			return path;
		}
	}
	public enum QueryTypes {
		TM("-TM-"),
		TC("-TC-");
		
		private String path;

		QueryTypes(String path){
			this.path = path;
		}
		
		public String getPath(){
			return path;
		}
	}
	public String query(QueryAllTypes queryType);
	public String query(QueryTypes queryType,String specific);
	
	public String getAllTM();
	public String getAllTC();
	
	public String getTMVersion();
	public String getTCVersion();
	
	public String getTM(String mnemonic);
	public String getTC(String mnemonic);
	
	public boolean shouldUpdate(String lastHash,String currentHash);
	
	public boolean supportsOnlineUpdate();
	
	public boolean isConnected();
	
	public <T extends JsonStructure> T interpret(String data);
}
