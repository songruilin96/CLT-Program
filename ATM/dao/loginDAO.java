package dao;

import pojo.User;

public interface loginDAO {

	boolean loginValidate(User ref);   // we are interested to return true/false
}
