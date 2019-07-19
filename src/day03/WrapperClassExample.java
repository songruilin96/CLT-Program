package day03;

class MyGenericClass {
	void genericMethod(Object ref) {
		System.out.println(ref);
	}
} // end of MyGenericClass

public class WrapperClassExample {
	
	public static void main(String[] args) {  //execution starts at main method

		MyGenericClass refMyGenericClass = new MyGenericClass();
		
		int numberVariable = 20;
		Integer numberReference = numberVariable;   // Autoboxing ==> int (Primitive data type) to Integer (Class)
		
		refMyGenericClass.genericMethod(numberReference);
		
		String reference = "Java";                  // String class is already in JAVA
		refMyGenericClass.genericMethod(reference); // Passing String value to Object (Up casting)
		
		Person refPerson = new Person();            // Need to create a Class called Person (User defined class)
		refMyGenericClass.genericMethod(refPerson); // Passing Person reference
		
		Long longReference = (long) 50000;          // class is already in JAVA
		long longVariable = longReference;          // Unboxing ==> Long to long
		
	}

}
