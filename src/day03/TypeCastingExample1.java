package day03;

class Parent{}
class Child extends Parent{}

public class TypeCastingExample1 {

	// Implicit & Explicit casting (depends on memory size)
	
	int num1 = 10;
	long num2 = num1; // implicit casting by JVM
	
	long num3 = 500;
	int num4 = (int) num3; // we need to add cast (int), explicit casting 
	
	// Up casting & Down casting (Depends on hierarchy/class level)
	
	String ref1 = "Java";
	
	// super class of all classes in Java (root class)
	
	Object ref2 = ref1;  // Up casting
	
	Parent refparent = new Child(); // Up casting ==> Class level
	
	Object ref3 = "Python";
	String ref4 = (String) ref3; // we need to add cast (String) for down casting
	
	// Autoboxing & Unboxing
	
	
	public static void main(String[] args) {

	}

}
