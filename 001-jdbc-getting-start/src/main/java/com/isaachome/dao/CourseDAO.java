package com.isaachome.dao;

import java.sql.SQLException;

import com.isaachome.utils.ConnectionManager;

public class CourseDAO {
	private ConnectionManager manager;
	private String SQL = "SELECT COUNT(*) FROM COURSE";
	
	public CourseDAO(ConnectionManager manager) {
		this.manager=manager;
	}
	public long getCouse() {
		try(var conn = manager.getConnection();
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
