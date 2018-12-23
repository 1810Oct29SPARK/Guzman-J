package com.revature.service;

import com.revature.beans.Credentials;
import com.revature.beans.Employees;

public class AuthenticationService {
	
	public AuthenticationService() {
	}
	
	public Employees isValidUser(Credentials credentials) {
		Employees emp = null;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		//this is AUTHENTICATION (does the user exist in the system?)
		//now AUTHORIZATION (what can the user access within the system?) (user roles)
		//take credentials and return the User to which they belong if it exists
		
		BusinessDelegate bd = new BusinessDelegate();
		emp = bd.authenticateEmployees(username, password);
		
		return emp;
	}

}
