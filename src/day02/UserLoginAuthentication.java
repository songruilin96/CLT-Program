package day02;

//Complexity Level 1

import java.util.Scanner;

/*class User{
	
	//userID take as String
	//userPassword take as String
	
}
*/

class AuthenticationLogic{
	
	//Write logic to validate user
	public void validateUser(String userID, String userPassword) {
		
		if (userID.contentEquals("admin") && userPassword.contentEquals("admin123")) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Not Valid");
		}
	}
} //End of AuthenticationLogic

public class UserLoginAuthentication {

	public static void main(String[] args) {
		//Scanner Class help to take input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserID: ");
		String userID = sc.next();
		
		System.out.println("Enter Password: ");
		String userPassword = sc.next();
		AuthenticationLogic ref = new AuthenticationLogic();
		ref.validateUser(userID, userPassword);

	}
}
