package com.ct.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ct.objects.User;
import com.ct.user.dataAccessObjects.copy.UserDAO;
import com.ct.user.serviceInterfaces.IUserService;


public class UserService implements IUserService {

	@Autowired
	private UserDAO userDAO;
	
	public UserService() {
		super(); 
	} 
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.createUser(user);
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUser(id);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.updateUser(user);
	}

	@Override
	public void deleteUser(int id) {
		userDAO.deleteUser(id);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.getAllUsers();
	}

	@Override
	public boolean userExists(int id) {
		// TODO Auto-generated method stub
		return userDAO.userExists(id);
	}

}
