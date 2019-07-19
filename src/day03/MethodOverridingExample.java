package day03;

//inheritance
//In inheritance, child class override method of parent class ==> method name same, parameter same and return type must be same
//Parent/base/super and child/derived/sub


                                      //Visa is Parent class
class Visa{
	
	void ageLimit() {                 //Visa follows rule ==> user must be >18 yrs of age to apply for credit card
		System.out.println("Age should not be less than 18.");
	}
	
}

                                      //here CitiBank is Child class
class CitiBank extends Visa{          //we use extends keywords to call Parent class from Child
	
	@Override                         //must give @override before method name
	void ageLimit() {
		
	}
}

public class MethodOverridingExample{

	public static void main(String[] args) {
		
	}
}

//final & static & private method cannot override