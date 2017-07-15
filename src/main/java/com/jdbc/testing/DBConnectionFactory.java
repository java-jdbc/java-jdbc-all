package com.jdbc.testing;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnectionFactory {
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		// ic

		Properties ps = DBProperties.getDBProperties();
		Class.forName(ps.getProperty("DB_DRIVER_CLASS"));
		Connection con = DriverManager.getConnection(ps.getProperty("DB_URL"), ps.getProperty("DB_USERNAME"),
				ps.getProperty("DB_PASSWORD"));
		// Statement stmt = con.createStatement();
		System.out.println(con);
		System.out.println("Created DB Connection....");
		con.setAutoCommit(false);
		return con;
	}
}
