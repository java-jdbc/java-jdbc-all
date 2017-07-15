package com.properties.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigurationData {
	/*
	 * public static void main(String[] args) throws IOException { Properties ps
	 * = new Properties();
	 * 
	 * OutputStream os = new FileOutputStream("config.properties");
	 * 
	 * ps.setProperty("userName", "Rajesh"); ps.setProperty("password",
	 * "1234567");
	 * 
	 * ps.store(os, null); System.out.println("File Loaded Successfully");
	 * 
	 * }
	 */
	public static Properties getConfiguration() throws IOException {
		Properties ps = new Properties();

		InputStream is = new FileInputStream("config.properties");
		ps.load(is);
		return ps;
	}
}
