package com.ct.user.serviceInterfaces;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ct.objects.User;
@Service
public interface IUserService {
	/**
	* Used to Create the User Information
	* @param user
	* @return {@link User}
	*/
	public User createUser(User user);

	/**
	* Getting the User Information using Id
	* @param id
	* @return {@link User}
	*/
	public User getUser(int id);

	/**
	* Used to Update the User Information
	* @param user
	* @return {@link User}
	*/

	public User updateUser(User user);

	/**
	* Deleting the User Information using Id
	* @param id
	*/
	public void deleteUser(int id);

	/**
	* Getting the All Users information
	* @return
	*/
	public List<User> getAllUsers();
	/**
	 * Check if record exists
	 */
	public boolean userExists(int id);
}





	

	

