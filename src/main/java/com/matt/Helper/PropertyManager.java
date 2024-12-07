package com.matt.Helper;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

	String projectPath = System.getProperty("user.dir");
	String propertiesPath = projectPath + "\\src\\test\\resources\\properties\\env.properties";

	public String getProperty(String key) {
		Properties properties = null;
		try {
			FileInputStream input = new FileInputStream(propertiesPath);
			properties = new Properties();
			properties.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return String.valueOf(properties.get(key));
	}
	
}
