package assignment;

public class Problem01 {

	public static void main(String[] args) {
		
        for(int rows = 1; rows <= 4; rows++) {       //Loop for rows
        	
            for(int col = 1; col <= rows; col++) {   //Loop for columns
            	
                System.out.print("* ");
            }
            
           System.out.println();                     //Next line
        }
	}

}
