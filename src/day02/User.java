package day02;

import java.util.Scanner;

// Example of encapsulation
public class User {

	private String UserID;
	private String UserPassword;
	
	// Getter Methods	
	public String getUserID() {
		return UserID;
	}
	
	public String getUserPassword() {
		return UserPassword;
	}
	
	//Setter Methods	
	public void setUserID(String userID) {
		this.UserID = userID;
	}
	
	public void setUserPassword(String userPassword) {
		this.UserPassword = userPassword;
	}
	
	public static void main(String[] args) {
		//Scanner Class help to take input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserID: ");
		String UserID = sc.next();
		
		System.out.println("Enter Password: ");
		String UserPassword = sc.next();
		
		System.out.println(UserID+" "+UserPassword);
	}
}
