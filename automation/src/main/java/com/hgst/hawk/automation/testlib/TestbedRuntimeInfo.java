package com.hgst.hawk.automation.testlib;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestbedRuntimeInfo {
	private static final String filePath = "src/main/resources/TestBed.json";

	public static String readMasterNode(String params) {
		String masterIP = null;
		String masterUiUser = null;
		String masterUiPass = null;
		//ArrayList<String> masterCommands = new ArrayList<String>();
		try {
			FileReader reader = new FileReader(filePath);

			JSONParser jsonParser = new JSONParser();
			JSONArray json = (JSONArray) jsonParser.parse(reader);

			for (Object obj : json) {
				JSONObject nodes = (JSONObject) obj;
				String node = (String) nodes.get("node");				
				if (node.matches("master")) {					
					masterIP = (String) nodes.get("IP");					
					masterUiUser = (String) nodes.get("uiuser");					
					masterUiPass = (String) nodes.get("uipass");
					
					//JSONArray commands = (JSONArray) nodes.get("commands");					
					//for(Object cmm : commands)	{
					//	masterCommands.add((String) cmm);
					//}					
				}				
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ParseException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		if (params == "masterIP") {
			return masterIP;
		} 
		else if (params == "masterUiUser") {
			return masterUiUser;
		} 
		else if (params == "masterUiPass") {
			return masterUiPass;
		} 
		else {
			return null;
		}
	}

	public static String getMasterIp() {
		String IP = readMasterNode("masterIP");
		return IP;
	}

	public static String getMasterUiUser() {
		String user = readMasterNode("masterUiUser");
		return user;
	}

	public static String getMasterUiPass() {
		String password = readMasterNode("masterUiPass");
		return password;
	}

	/*public static ArrayList<String> getMasterCommands() {
		ArrayList<String> commands = new ArrayList<String>();
		commands.add("sudo apt-get update");
		commands.add("sudo apt-get -y install git make");
		commands.add("git clone http://gerrit.sanjose.hgst.com/gerrit/hawk");
		commands.add("cd hawk");
		commands.add("make install");
		return commands;
	}*/
}
