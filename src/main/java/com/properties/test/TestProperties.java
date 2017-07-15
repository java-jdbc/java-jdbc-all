package com.properties.test;

import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws IOException {
		String userName;
		String password;

		Properties ps = ConfigurationData.getConfiguration();

		userName = ps.getProperty("userName");
		password = ps.getProperty("password");

		System.out.println("User Name is " + userName);
		System.out.println("Password is " + password);

	}
}
