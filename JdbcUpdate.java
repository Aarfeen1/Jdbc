package com.xworkz.jdbcUpdate;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
	String sqlQuery="update  license set dl_id=321 where dl_id=123";
Connection conn;


try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");
	Statement stmt=conn.createStatement();
stmt.executeUpdate(sqlQuery);
	System.out.println("databases updated  succesfully");

	
	
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} finally {

	
}


	}

}
