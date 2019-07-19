package service;

import dao.LoginDAOImpl;
import dao.loginDAO;
import pojo.User;

public class LoginServiceImpl implements LoginService{

	loginDAO refLoginDAO;

	@Override
	public void checkStatus(User ref) {

		refLoginDAO = new LoginDAOImpl();  // create object (Child) and ref to interface (Parent) - up casting
		
		if(refLoginDAO.loginValidate(ref) == true) { //make as simple as possible with if/else or swtich 
			System.out.println("Welcome");
		} else {
			System.out.println("Not Valid");
		}
	}
	
}
