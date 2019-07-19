package day05;

class A{	
	B refB;   //Class A has a reference of class B

	public B getRefB() {            //getter
		return refB;
	}

	public void setRefB(B refB) {   //setter
		this.refB = refB;
	}
}// end of class A

class B{
	C refC;

	public C getRefC() {
		return refC;
	}

	public void setRefC(C refC) {
		this.refC = refC;
	}	
}

class C{
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}// end of class C

public class SimpleApplication {

	public static void main(String[] args) {

		A refA = new A();
		B refB = new B();
		C refC = new C();
		
		//set
		refA.setRefB(refB);
		refB.setRefC(refC);  
		refC.setName("Hello");
		
		//get
		System.out.println(refA.getRefB().getRefC().getName());
	}

}
