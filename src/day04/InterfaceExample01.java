package day04;

// Interface is a fully abstract class
// We need to use 'implements' keyword

interface Bank{   // We use interface keyword to create an interface 
	
	void deposit();            // method is abstract by default
	abstract void withdraw();  // abstract is optional to write
	void checkBalance();
	
//	int code; we cannot declare like this ==> compilation error
	final static int code = 204050; // have to declare variable value, by default it is final and static
	
} //end of Bank

interface UserLoginCredential{
	
	void userLogin();
	void userLogout();
	
} //end of UserLoginCredential

//functional interface: Java 1.8 version onwards

@FunctionalInterface

interface SingleMethod{ // functional interface cannot have more than 1 abstract method
	
	void method1();
	//void method2();
	
} // end of SingleMethod

// Java 1.8 new feature ==> default method in interface 

interface DefaultMethod extends SingleMethod{  // interface can extends to another interface
	
	public default void myMethod() {   // not an abstract method, it is a concrete method
		
		System.out.println("From Java 1.8 version, we can have method with a body..");
	}
} // end of DefaultMethod

class CitiBank implements Bank, UserLoginCredential{   // Java supports multiple inheritance by using interface

	@Override
	public void deposit() {	
	}

	@Override
	public void withdraw() {
	}

	@Override
	public void checkBalance() {
	}

	@Override
	public void userLogin() {		
	}

	@Override
	public void userLogout() {		
	}
} //end of CitiBank

public class InterfaceExample01 {
	public static void main(String[] args) {
		
	}

}
