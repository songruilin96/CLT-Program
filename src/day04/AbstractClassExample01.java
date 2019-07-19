package day04;

abstract class Visa{         // Abstract class acts as parent class
	 
	abstract void login1();  // Abstract method, without a body, ends with a semicolon
	abstract String login2();
	abstract void login3();
	
	// If we declare any abstract method in a abstract class we must define in its sub class
	
	void logout() {
		// method with body
	} // end of logout
	
}//End of Visa

class HSBC extends Visa{    // Child class

	@Override
	void login1() {
		
	}

	@Override
	String login2() {
		return null;
		
	}

	@Override
	void login3() {
		
	}
	
}

public class AbstractClassExample01 {

	public static void main(String[] args) {

		
	}

}
