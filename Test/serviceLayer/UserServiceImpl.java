package serviceLayer;

import daoLayer.UserDAO;
import daoLayer.UserDAOImpl;
import userPOJO.UserData;

public class UserServiceImpl implements UserService {

	UserDAO refUserDAO;
	
	@Override 
	public void UserStatus(UserData ref) {
		
		refUserDAO = new UserDAOImpl();
		
		if(refUserDAO.userValidate(ref) == true) {
			System.out.println("Welcome!");
		} else {
			System.out.println("Incorrect Password or User ID.");
		}
	}
}
