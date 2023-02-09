package com.bridgelabz.userRegistrationTest;

import java.util.regex.*;

public class UserRegistration {

	public static final String VALIDATE_NAME = "^[A-Z]+[a-z]{2,}$";
	public static final String EMAIL_ID = "^[a-z]{3,}[0-9]+[@]+[a-z]{5,}[.]+[a-z]{3,}+$";

	public boolean checkFirstName(String firstName) {
		return (Pattern.matches(VALIDATE_NAME, firstName));
	}

	public boolean checkLastName(String lastName) {
		return (Pattern.matches(VALIDATE_NAME, lastName));
	}

	public boolean checkEmail(String email) {
		return (Pattern.matches(VALIDATE_NAME, email));
	}
}
