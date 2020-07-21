package com.vastika.smd.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastika.smd.model.User;
import com.vastika.smd.repository.UserRepository;



@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUserInfo(User user) {
		// TODO Auto-generated method stub
		userRepository.saveUserInfo(user);
		
	}

	@Override
	public List<User> getAllUserInfo() {
		// TODO Auto-generated method stub
		return userRepository.getAllUserInfo();
	}

	@Override
	public void deleteUserInfo(int id) {
		// TODO Auto-generated method stub
		
		userRepository.deleteUserInfo(id);
		
	}

	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUsernameAndPassword(username, password);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getUserById(id);
	}
	

}
