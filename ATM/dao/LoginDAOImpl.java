package dao;

import pojo.User;

public class LoginDAOImpl implements loginDAO {

	boolean status; // Default is false (String default is null)
	
	// connect with DB here	
	
	@Override
	public boolean loginValidate(User ref) {

		if (ref.getUserID()==1234 && ref.getUserPassword().equals("test")) {  //setter was done in controller, now we do getter
			status = true;
		}else {
			status = false;
		}
		return status;
	}
}
