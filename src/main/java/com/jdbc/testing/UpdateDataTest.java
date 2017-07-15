package com.jdbc.testing;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		Connection con = DBConnectionFactory.getConnection();
		Statement st = con.createStatement();

		int rows = 0;//Again mummy calling.okka
		try {
			rows = st.executeUpdate("update employee set sal = sal+500 where deptno = 20");
			con.commit();
		} catch (Exception e) {
			// TODO: handle exception
			con.rollback();
		} finally {
			con.close();
		}

	}// Yes got it
}
