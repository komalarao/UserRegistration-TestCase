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

		System.out.println("after every test case");
	}

	@Test
	public void checkFirstName() {
		UserRegistration validation = new UserRegistration();
		Assert.assertEquals(true, validation.checkFirstName("Srinu"));
	}

	@Test
	public void checkLastName() {
		UserRegistration validation = new UserRegistration();
		Assert.assertEquals(true, validation.checkLastName("Vakamullu"));
	}

	@Test
	public void checkEmail() {
		UserRegistration validation = new UserRegistration();
		Assert.assertEquals(true, validation.checkEmail("manoharvakamullu1999@gmail.com"));
	}
}

    static void beforeAllTestMsg() {
        System.out.println("-----Welcome to User Registration Problem-----");
    }
    @AfterClass
    static void afterAllTestPassedMsg(){
        System.out.println("All Test Case Passed");
    }

    @After
    public void afterEachTestPassMsg() {
        System.out.println("Happy Test Case");
    }

    @Test
    void given_first_name_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.checkFirstName("Komalarao"));

    }

    @Test
    void given_last_name_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.checkLastName("Srinu"));

    }

    @Test
    void given_email_id_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.checkemailId("Srinu.ab@gmail.com"));
    }

    @Test
    void given_phoneNumber_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
       Assert.assertEquals(true, validation.phoneNumber("91 9812040783"));
    }
    @Test
    void given_password_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.password("ksndfkdn"));
    }
    @Test
    void given_password1_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.password2("Ksndfkdn"));
    }
    @Test
    void given_password2_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Boolean result6 = validation.password3("Ksndkdv67");
        Assert.assertEquals(true, validation.password3("Ksndkdv67"));
    }  @Test
    void given_password3_should_returnTrue() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.password4("Ksndkdv67@"));

    }
    @Test
    void given_emailId_should_return_True() throws UserValidationException {
        UserValidation validation = new UserValidation();
        Assert.assertEquals(true, validation.checkEmailSeperate("abc@yahoo.com"));

    }
}

