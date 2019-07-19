package controllerLayer;

import java.util.Scanner;

import serviceLayer.UserService;
import serviceLayer.UserServiceImpl;
import userPOJO.UserData;

public class LoginRequest {
	
	UserService refUserService;
	
	UserData refUserData;
	
	public void userLogin() {
		input();
	}

	void input() {
		
		Scanner sc = new Scanner(System.in);
		
		//1. ask for userID and PW
		System.out.println("Enter User ID: ");
		String ID = sc.next();
		
		System.out.println("Enter User Password: ");
		int PW = sc.nextInt();
		
		//2. create object of user class
		refUserData = new UserData();
		
		//3. set values to setter method of UserData 
		refUserData.setID(ID);
		refUserData.setPW(PW);
		
		//4. create object 
		refUserService = new UserServiceImpl();
		
		//5. call UserStatus & pass reference of UserData class
		refUserService.UserStatus(refUserData);
		
	}
}
