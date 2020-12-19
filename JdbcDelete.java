package com.xworkz.jdbcUpdate;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {

	public static void main(String[] args) {
	String sqlQuery="delete from license where dl_id=3234";
Connection conn;


try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");
	Statement stmt=conn.createStatement();
stmt.executeUpdate(sqlQuery);
	System.out.println("databases deleted  succesfully");

	
	
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} finally {

	
}


	}

}
