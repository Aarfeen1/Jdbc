package com.xworkz.jdbcUpdate;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

public class jdbcInsert {

	public static void main(String[] args) {
	String sqlQuery="insert into license values(9876,'arun','mysore')";
Connection conn;


try {
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");
	Statement stmt=conn.createStatement();
stmt.executeUpdate(sqlQuery);
	System.out.println("data inserted succesfully");

	
	
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} finally {

	
}


	}

}
