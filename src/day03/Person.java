package day03;

public class Person {

	String name = "Tom"; //String Class
	
	@Override                    //to return name instead of memory location
	public String toString() {   //convert object to string
		return name;  
	}
	
	
}
