package com.isaachome.database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CourseDAO {
	private String SQL = "SELECT COUNT(*) FROM COURSE";
	
	public long getCouses() {
		try(var conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdc_db","root","root");
				var statement = conn.createStatement()) {
			var resultSet = statement.executeQuery(SQL);
			System.out.println(resultSet);
			while (resultSet.next()) {
				return resultSet.getLong(1);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
