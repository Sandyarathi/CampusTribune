package com.ct.user;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.objects.User;
import com.ct.user.service.UserService;

@RestController
@RequestMapping("/cmpe295SandyarathiDas036/rest")
@Configuration
@ComponentScan("com.ct.service")
public class UserController {
		
	@Autowired
	private UserService userService;
	
	public UserController() {
		System.out.println("UserController()");
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<User> createUser( @RequestBody @Valid User user){
		if(!userService.userExists(user.getUser_id())){
			User emp = userService.createUser(user);
			if(emp !=null){
				return new ResponseEntity<User>(emp,HttpStatus.CREATED);
			}
			else
				return new ResponseEntity<User>(HttpStatus.CONFLICT);
		}
		else
			return new ResponseEntity<User>(HttpStatus.CONFLICT);
	}
	
	
			

	
	
	@RequestMapping(value="/user/{user_id}", method = RequestMethod.GET, produces ="application/json")
    public ResponseEntity<User> viewUser(@PathVariable("user_id") int userId ) {
	  if(userService.userExists(userId))
		  return new ResponseEntity<User>(userService.getUser(userId), HttpStatus.OK);
	  else{
		  
		  return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	  }
    }
	
	
	@RequestMapping(value="/user/{user_id}", method = RequestMethod.PUT, produces ="application/json")
	public ResponseEntity<User> updateUser(@PathVariable int user_id, @RequestBody @Valid User user) {
		if(userService.userExists(user_id)){
			if(user.getUser_id() == user_id){
				return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.OK);
			}
			else{
				if(userService.userExists(user_id)){
					//return conflict error code, if the put request uses an already existing id while updating record
					return new ResponseEntity<User>(HttpStatus.CONFLICT);
				}
				else
					return new ResponseEntity<User>(userService.updateUser(user), HttpStatus.OK);
			}
		}
		else
			 return new ResponseEntity<User>(HttpStatus.NOT_FOUND);

	}
	
	
	@RequestMapping(value="/user/{user_id}", method = RequestMethod.DELETE, produces ="application/json")
    public ResponseEntity<String> deleteUser(@PathVariable("user_id") int userId ) {
		if(userService.userExists(userId)){
		  userService.deleteUser(userId);
		  return new ResponseEntity<String>( HttpStatus.OK);
	  }
	  else{
		  return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	  }
    }
	
	
	@RequestMapping(value="/user", method = RequestMethod.GET, produces ="application/json")
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> empList= userService.getAllUsers();
		if(!empList.isEmpty())
			return new ResponseEntity<List<User>>(empList, HttpStatus.OK);		  
		else
			return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);  
			
	}
	

}
