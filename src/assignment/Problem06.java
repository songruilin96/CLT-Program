package assignment;

public class Problem06 {

	public static void main(String[] args) {
		
		 int rows, col, k=3;     
		 
		 System.out.println("*");
		 
		 for(rows=1; rows<=4; rows++) {                //rows
			 
			 for(col=1; col<k; col++){              //columns
				 System.out.print("* ");          
				 }
			 
			 k = k + 2;   // each line add 2 (even)
			 System.out.println(); 
			 }
		 }	
}