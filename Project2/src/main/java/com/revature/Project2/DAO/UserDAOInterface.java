package com.revature.Project2.DAO;

import com.revature.Project2.beans.User;

public interface UserDAOInterface {

	/**
	 * registerUser() will register a user
	 */
	public void registerUser();
	
	/**
	 * login() will validate a user's credentials
	 * @return true if valid user
	 */
	public boolean login();
	
	/**
	 * logout() will end the user's session	
	 */
	public void logout();
	
	/**
	 * findUser() allows a user to search for another user
	 * @param firstname, target user's firstname
	 * @param lastName, target user's lastname
	 * @return user
	 */
	public User findUser(String firstname, String lastName);
	
	
	public String makePost();
	
}
