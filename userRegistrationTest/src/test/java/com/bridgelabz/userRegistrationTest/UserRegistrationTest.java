package com.bridgelabz.userRegistrationTest;

import org.junit.*;
import junit.framework.Assert;

public class UserRegistrationTest {
	@Before
	public void welcomeMsg() {
		System.out.println("Welcome to User Registration Problem");
	}

	@After
	public void afterTest() {

		System.out.println("after the test case");
	}

	@Test
	public void checkFirstName() {
		UserRegistration validation = new UserRegistration();
		Assert.assertEquals(true, validation.checkFirstName("Srinu"));
	}
}
