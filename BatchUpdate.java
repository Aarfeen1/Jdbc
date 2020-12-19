package com.xworkz.jdbcUsingArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.xworkz.jdbcconnection.ConnectivityJdbc;

public class BatchUpdate {
public static void main(String[] args) {
	String SqlQuery="insert into license values(?,?,?)";
//ConnectivityJdbc conn=new ConnectivityJdbc();
try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");
		PreparedStatement  prepStmt=conn.prepareStatement(SqlQuery);){
	ArrayList<License> licenses=new ArrayList<License>();//to add multiple rows at once
	//licenses.add(new License(1,"arjuna","bangalore"));
	//licenses.add(new License(7,"mohni","mysore"));
	licenses.add(new License(4321,"kumar","btm"));
	//String SqlQuery="insert into license values(?,?,?)";
	for(License license: licenses) {
		
		prepStmt.setInt(1, license.getDl_id());
		prepStmt.setString(2,license.getName());
		prepStmt.setString(3, license.getAddress());
		prepStmt.addBatch();
		int[] result=prepStmt.executeBatch();
		System.out.println(result);
		}
	   prepStmt.addBatch("update license set name='Aarfeen' where dl_id=756");
       //prepStmt.setString(2, "arjuuuuun");
       //prepStmt.setInt(1, 756);
       int[] result=prepStmt.executeBatch();
		System.out.println(result);
	
	
}
	catch(SQLException e) {
		
		e.printStackTrace();
	}




}
}

