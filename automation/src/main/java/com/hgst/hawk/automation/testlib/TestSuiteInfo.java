package com.hgst.hawk.automation.testlib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.XML;

public class TestSuiteInfo {
	private static final String filePath = "src/main/resources/suite.json";

	public static void generateTestNGXML() {
		/*String xml = null;
		try {
			FileReader reader = new FileReader(filePath);

			JSONParser jsonParser = new JSONParser();
			JSONArray json = (JSONArray) jsonParser.parse(reader);

			for (Object obj : json) {
				JSONObject suite = (JSONObject) obj;
				
				xml = XML.toString(suite);
			}
			File file = new File("src/main/resources/testng.xml");

			if (!file.exists()) {
				file.createNewFile();
			}

			System.out.println(xml);
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(xml);
			bw.close();

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ParseException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}*/

	}
}
