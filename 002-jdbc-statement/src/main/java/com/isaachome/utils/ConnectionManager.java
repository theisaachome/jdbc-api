package com.isaachome.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionManager {

	String URL="jdbc:mysql://localhost:3306/jdc_db";
	String USER="root";
	String PWD="root";
	Connection getConnection() throws SQLException;
	
	public static ConnectionManager getInstance() {
		return ()-> DriverManager.getConnection(URL, USER, PWD);
	}
}
