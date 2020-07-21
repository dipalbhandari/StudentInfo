package com.vastika.smd.repository;


import java.util.List;

import com.vastika.smd.model.User;

public interface UserRepository {
	
	
	   void saveUserInfo(User user);
	   
	   List<User> getAllUserInfo();
	   
	   void deleteUserInfo(int id);
	   public User getUserById(int id);
	   
	   User getUserByUsernameAndPassword(String username , String password);

}
