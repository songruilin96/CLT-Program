package day04;

abstract class Oracle{
	abstract void driverConnection();
} // end of Oracle

abstract class Microsoft{       // Microsoft and Oracle are not parent and child class
	abstract void getSoftware();
} // end of Microsoft

class MyClass{
	
	void display() {
		
		Oracle refOracle = new Oracle() {

			@Override
			void driverConnection() {
				System.out.println("Oracle Driver connected.. ");
			}
		};//end of Oracle
		
		refOracle.driverConnection();
		
		Microsoft refMicrosoft = new Microsoft() {
			
			@Override
			void getSoftware() {
				System.out.println("Microsoft Software loaded.. ");				
			}
		};//end of Microsoft
		
		refMicrosoft.getSoftware();
		
	}//end of display
	
	// MyClass needs to access driverConnection() and getSoftware()
	
}//end of MyClass

public class AbstractClassExample02 {

	public static void main(String[] args) {
		
		MyClass refMyClass = new MyClass();
		refMyClass.display();
		
	}

}
