package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		// Create an object of File class to open xlsx file

		File src = new File("./Configuration/config.properties");
		try {
			// Create an object of FileInputStream class to read excel file

			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	// for each and every variable
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;

	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}

	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}
}

