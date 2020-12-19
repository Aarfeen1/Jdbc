package com.xworkz.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectivityJdbc {
	
	 Connection conn;

	public void Connectivity() throws SQLException
	{
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/driving_license", "root", "root123");
}
}