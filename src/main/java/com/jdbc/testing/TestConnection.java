package com.jdbc.testing;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Connection con = DBConnectionFactory.getConnection();// stop// proced
		Statement stmt = con.createStatement();
		System.out.println("Created DB Connection....");
		ResultSet rs = stmt.executeQuery("select empno, ename,sal, hiredate from employee");
		System.out.println("***********************");
		while (rs.next()) {
			System.out.println("Employee No: " + rs.getString("empno"));
			System.out.println("Employee Name: " + rs.getString("ename"));
			System.out.println("Employee Salary: " + rs.getString("sal"));
			System.out.println("Employee Hiredate: " + rs.getString("hiredate"));
			System.out.println("***********************");
		}
		rs.close();
		con.close();
	}
}