package com.xworkz.jdbcUsingArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class InsertUsingPreparedStmt {
	public static void main(String[] args) {
		ArrayList<License> licenses=new ArrayList<License>();//to add multiple rows at once
		licenses.add(new License(2354,"arjun","bangalore"));
		licenses.add(new License(908,"mohn","mysore"));
		licenses.add(new License(809,"k","btm"));
		String SqlQuery="insert into license values(?,?,?)";
		try (
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");
				PreparedStatement prepStmt=conn.prepareStatement(SqlQuery);
					
					){
			for(License license: licenses) {
				
			prepStmt.setInt(1, license.getDl_id());
			prepStmt.setString(2,license.getName());
			prepStmt.setString(3, license.getAddress());
			boolean result=prepStmt.execute();
			System.out.println(result);
			}
			


			}

			
		
			
catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}



