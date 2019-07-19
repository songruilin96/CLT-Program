package day02;

import java.util.Scanner;

//Complexity level 3 

class AuthenticationLogic3{
	
	String userID, userPassword;
	boolean status;
	
	public void userInput(String userID, String localVariable) {
		this.userID = userID;
		userPassword = localVariable;
		checkValidateStatus();
	}//End of userInput
	
	void checkValidateStatus() {
		
		validateUser();
		
		if (validateUser() == true) {
			System.out.println("Welcome");
		} else {
			System.out.println("NotValid");
		}
	}
	
	//Write logic to validate user
	public boolean validateUser() {
		if (userID.equals("admin") && userPassword.equals("admin123")) {
			status = true;
		}else {
			status = false;
		}
		return status;
	}
}//End of AuthenticationLogic

public class UserLoginAuthentication3 {

	public static void main(String[] args) {

			//Scanner Class help to take input from the user
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter UserID: ");
			String userID = sc.next();
			
			System.out.println("Enter Password: ");
			String userPassword = sc.next();
			AuthenticationLogic3 ref = new AuthenticationLogic3();
			ref.userInput(userID, userPassword);

		}
	}
