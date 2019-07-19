package day02;

//Complexity Level 2

import java.util.Scanner;

class AuthenticationLogic2{
	
	String userID, userPassword; //How to hold value?
	
	public void UserInput(String userID, String localVariable) { //We are going to hold this value
		
		this.userID = userID; //this.globalVariable = localVariable (if both names are the same)
		userPassword = localVariable; //globalVariable = localVariable if names are different 
		validateUser();
	}// End of UserInput
	
	//Write logic to validate user
	public void validateUser() {
		
		//System.out.println(userID+""+userPassword);
		
		if (userID.contentEquals("admin") && userPassword.contentEquals("admin123")) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Not Valid");
		}
	}
} //End of AuthenticationLogic

public class UserLoginAuthentication2 {

	public static void main(String[] args) {
		//Scanner Class help to take input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserID: ");
		String userID = sc.next();
		
		System.out.println("Enter Password: ");
		String userPassword = sc.next();
		AuthenticationLogic2 ref = new AuthenticationLogic2();
		ref.UserInput(userID, userPassword);

	}
}
