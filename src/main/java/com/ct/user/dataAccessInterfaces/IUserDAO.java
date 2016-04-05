package com.ct.user.dataAccessInterfaces;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ct.objects.User;

/**
* DAO interface for User to perform CRUD operation.
* */
@Repository
public interface IUserDAO {
/**
* Used to Create the User Information
* @param employee
* @return {@link User}
*/
public User createUser(User employee);

/**
* Getting the User Information using Id
* @param id
* @return {@link User}
*/
public User getUser(int id);

/**
* Used to Update the User Information
* @param employee
* @return {@link User}
*/

public User updateUser(User employee);

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
 * Check if employee record exists
 * */
 public boolean userExists(int id);
 
}