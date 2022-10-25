package com.isaachome.database;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.isaachome.dao.CourseDAO;
import com.isaachome.utils.ConnectionManager;

class CourseDAOTest {

	@BeforeAll
	static void initDatabase() {
		System.out.println("Before All : Init Database.");
	}
	
	@AfterAll
	static void backupDatabase() {
		System.out.println("After All : Backup Database.");
	}
	
	@BeforeEach
	void initBeforeEachTest() {
		System.out.println("Before Each");
	}
	@AfterEach
	void afterEachTest() {
		System.out.println("After Each");
	}
	@Test
	void countCouseTest() {
		var dao = new CourseDAO(ConnectionManager.getInstance());
		var result =dao.getCouse();
		assertEquals(2, result);
	}

	@Test
	void getAllCoursesTest() {
		
	}
}
