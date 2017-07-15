package com.jdbc.testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBProperties {
	public static Properties getDBProperties() throws IOException {
		Properties ps = new Properties();

		InputStream is =null; //DBProperties.class.getClassLoader().getResourceAsStream("config.properties");//
				is=ClassLoader.getSystemResourceAsStream("config.properties");
		
		ps.load(is);
		return ps;
	}
}
