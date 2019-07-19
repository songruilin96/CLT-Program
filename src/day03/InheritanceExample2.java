package day03;

class Bank{
	
	Bank(String location){
		
		System.out.println("I am in default constructor ==> Bank " + location);

	}
} //End of Bank

class DigitalBank extends Bank{ 
	
	DigitalBank(String location, int code){
		super(location);           //we must use super keyword to call parent class constructor
		System.out.println(code);  //1234
		                           //either we can print location here or we can call parent class constructor
	}
} //End of DigitalBank


 class ChildClassOfDigitalBank extends DigitalBank{

	ChildClassOfDigitalBank(String location, int code, String zone) {
		
		super(location, code);
		System.out.println(zone);
		
	} //end of ChildClassOfDigitalBank
 
 
 } //End of ChildClassOfDigitalBank


public class InheritanceExample2 {

	public static void main(String[] args) {
 
//new DigitalBank("DigiBank", 1234); //It will call line 14
		new ChildClassOfDigitalBank("Digibank", 1234, "East");
	}

} //End of InheritanceExample2
