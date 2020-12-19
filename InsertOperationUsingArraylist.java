package com.xworkz.jdbcUsingArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertOperationUsingArraylist {
	public static void main(String[] args) {
		ArrayList<License> licenses=new ArrayList<License>();//to add multiple rows at once
		licenses.add(new License(123,"arjun","bangalore"));
		licenses.add(new License(124,"mohn","mysore"));
	//	licenses.add(new License(125,"kumar","btm"));
		for(License license: licenses) {
			insertRow(license);
		}
	}

	private static void insertRow(License license) {
		int id=license.getDl_id();
		 String name=license.getName();
		String address=license.getAddress();
		
		try (
		
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");
	Statement stmt=con.createStatement();
	){
			String sqlQuery="insert into license values("+id+" ,"+name+","+address+")";
		int result=stmt.executeUpdate(sqlQuery)	;
		System.out.println("the no of row inserted is "+result);
			
			
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
