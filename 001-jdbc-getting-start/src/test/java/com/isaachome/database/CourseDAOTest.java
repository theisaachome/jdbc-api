package com.isaachome.database;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CourseDAOTest {

	
	@Test
	void test() {
		var dao = new CourseDAO();
		var result =dao.getCouses();
		assertEquals(1, result);
	}

}
