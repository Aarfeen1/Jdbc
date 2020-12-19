package com.xworkz.jdbcUsingArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {
public static void main(String[] args) {
	//String SqlQuery="insert into license values(?,?,?)";
	//String SqlQuery="select *from license";
//	String SqlQuery="delete from license where dl_id=?";
	String SqlQuery="update license set dl_id=? where dl_id=?";
	try (
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");
		PreparedStatement prepStmt=conn.prepareStatement(SqlQuery);
			
			){
		prepStmt.setInt(1, 123);
		prepStmt.setInt(2, 231);
		/* * 
		prepStmt.setString(2, "abcd");
		prepStmt.setString(3, "bangalore");*/
 boolean isSucess=prepStmt.execute();		
 System.out.println(isSucess);
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
