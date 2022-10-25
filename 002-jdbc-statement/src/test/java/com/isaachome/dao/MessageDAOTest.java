package com.isaachome.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.isaachome.dto.Message;
import com.isaachome.utils.ConnectionManager;

class MessageDAOTest {
	
	MessageDAO messageDAO;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@BeforeEach
	void setUpBefore() {
		messageDAO = new MessageDAO(ConnectionManager.getInstance());
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testCreateMessage() {
		Message message = new Message("Access ", "Access Jira Database");
		var result = messageDAO.createMessage(message);
		assertEquals(1, result);
	}

}
