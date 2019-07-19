package controller;

import java.util.Scanner;

import pojo.User;
import service.LoginService;
import service.LoginServiceImpl;

public class LoginController {

	// loose coupling through reference of the interface
	LoginService refLoginService;   // LoginService is an interface 
	User refUser;                   // User is a POJO (Plain Old Java Object) class
	
	public void userLoginController() {
		
		userInput();
	}
	
	void userInput() {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. ask userID and Password
		System.out.println("Enter User ID: ");
		int userID = sc.nextInt();
		
		System.out.println("Enter User Password: ");
		String password = sc.next();
		
		// 2. create object of User class 		
		refUser = new User();
		
		// 3. set values to setter method of User class
		refUser.setUserID(userID);
		refUser.setUserPassword(password); //data is in object form
		
		// 4. create object of LoginServiceImpl class and refer to its interface (LoginService)
		refLoginService = new LoginServiceImpl();  // we have to create object
		
		// 5. call checkStatus & pass the reference of User class (refUser contains actual data)
		refLoginService.checkStatus(refUser);
	}
}
