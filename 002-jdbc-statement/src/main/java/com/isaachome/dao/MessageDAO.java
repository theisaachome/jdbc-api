package com.isaachome.dao;

import java.sql.SQLException;

import com.isaachome.dto.Message;
import com.isaachome.utils.ConnectionManager;

public class MessageDAO {

	private ConnectionManager manager;

	public MessageDAO(ConnectionManager manager) {
		super();
		this.manager = manager;
	}
	
	public int createMessage(Message data) {
		var sql = "INSERT INTO message(title,content) VALUES ('%s','%s')"
				.formatted(data.title(),data.content());
		
		try(var conn = manager.getConnection();
				var stmt = conn.createStatement()) {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
