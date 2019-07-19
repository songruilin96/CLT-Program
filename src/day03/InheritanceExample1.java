package day03;

class MasterCard{
	
	static void loginAuthentication1() {
		System.out.println("I'm in Visa => loginAuthentication1. ");
	}
	
	void loginAuthentication2() {
		System.out.println("I'm in Visa => loginAuthentication2. ");
	}
}//End of MasterCard

class DBSBank extends MasterCard{
	
	static void loginAuthentication1() {
		System.out.println("I'm in DBSBank => loginAuthentication1. ");
	}
	
	void loginAuthentication2() {
		System.out.println("I'm in DBSBank => loginAuthentication2. ");
	}
}//End of DBSBank

public class InheritanceExample1 {

	public static void main(String[] args) {

		MasterCard ref = new DBSBank();     //up class casting (can only be written when there is the presence of "extends" instruction
		//DBSBank ref = (DBSBank) new MasterCard();  //down class casting - java.lang.ClassCastException *AVOID*
		ref.loginAuthentication1();         //parent class static will get called since static method cannot be override, child static will never get called
		ref.loginAuthentication2();         //Child class non-static will get called (override Parent class)
	}

}
