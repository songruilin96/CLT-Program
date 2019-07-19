package day02;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		System.out.println("Class loader loads this main.."); //Step 1 - Execution starts here, print 1st
		main(20); //Step 2
		System.out.println("Final print.."); //Step 8 - print last
		
	}//end of main 
	
    public static void main(int number) { //Step 3
		
    	main("Data"); //Step 4
    	System.out.println(number); //Step 7 - Print 3rd
		
	}//end of main
    
    public static void main(String reference) { //Step 5
		
    	System.out.println(reference); //Step 6 - Print 2nd
		
	}//end of main
}//End of MethodOverloadingExample class
