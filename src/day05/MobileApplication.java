package day05;

import java.util.Scanner;

public class MobileApplication {

	public static void main(String[] args) {

		//1. Create  objects of all classes
		Mobile refMobile = new Mobile();
		Whatsapp refWhatsapp = new Whatsapp();
		Chat refChat = new Chat();
		
		//2.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your text: ");
		String myText = sc.next();
		
		//Reference all setters
		refChat.setChat(myText);  // this argument will set the value to setter method in Chat class
		refMobile.setRefWhatsapp(refWhatsapp);
		refWhatsapp.setRefChat(refChat);
		
		//Print all getters
		System.out.println(refMobile.getRefWhatsapp().getRefChat().getChat());
		
	}

}
