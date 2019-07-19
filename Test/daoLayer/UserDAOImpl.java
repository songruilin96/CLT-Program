package daoLayer;

import userPOJO.UserData;

public class UserDAOImpl implements UserDAO {

	boolean UserStatus;
	
	public boolean userValidate(UserData ref) {
		
		if(ref.getID().equals("Test") && ref.getPW() == 1234) {
			UserStatus = true;
		} else {
			UserStatus = false;
		}
		return UserStatus;
	}
}
