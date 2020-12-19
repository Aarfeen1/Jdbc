package com.xworkz.jdbcconnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcConnection {
	public static void main(String[] args) {
		try {
		
		java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");

System.out.println(conn);
Statement stmt=conn.createStatement();
String sqlQuery="select *from license ";
ResultSet results=stmt.executeQuery(sqlQuery);
while(results.next()) {
	int id=results.getInt("dl_id");
	System.out.println("dl id="+id);
	String name=results.getString("name");
	System.out.println("name  "+name);
	String addres=results.getString("address");
	System.out.println("address=="+addres);
}


		}
		catch(SQLException e) {
			e.printStackTrace();
		}
}
}