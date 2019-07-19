package day05;

class A{	
	B refB;   //Class A has a reference of class B

	public B getRefB() {            //getter
		return refB;
	}

	//Convert setter method to constructor
	A(B refB){
		this.refB = refB;
	} // end of constructor
	
	/*
	 * public void setRefB(B refB) { //setter this.refB = refB; }
	 */
}// end of class A

class B{
	C refC;

	public C getRefC() {
		return refC;
	}
	
	//constructor
	B(C refC){
		this.refC = refC;
	} // end of constructor

	/*
	 * public void setRefC(C refC) { this.refC = refC; }
	 */	
}

class C{
	
	String name;

	//constructor
	C(String name){
		this.name = name;
	} // end of constructor
	
	/*
	 * public void setName(String name) { this.name = name; }
	 */
	
	public String getName() {
		return name;
	}	
}// end of class C

public class SimpleApplication {

	public static void main(String[] args) {
		
		C refC = new C("Hello");
		B refB = new B(refC);
		A refA = new A(refB);
		
		/*
		 * //set refA.setRefB(refB); refB.setRefC(refC); refC.setName("Hello");
		 */
		
		//get
		System.out.println(refA.getRefB().getRefC().getName());
	}

}
