package com.vastika.smd.repository;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.vastika.smd.model.User;
import com.vastika.smd.util.HibernateUtil;
import com.vastika.smd.util.QueryUtil;


@Repository
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	 private SessionFactory sessionFactory;


	@Override
	public void saveUserInfo(User user) {
	
		
		
		Session session = HibernateUtil.getSession(sessionFactory);
		session.save(user);
		
		

	}

	@Override
	public List<User> getAllUserInfo() {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSession(sessionFactory);
		
		Criteria criteria = session.createCriteria(User.class);
		
		
		return criteria.list();
	}
	
	

	@Override
	public void deleteUserInfo(int id) {
		
		User user = getUserById(id);
		
		if(user != null) {
			Session session = HibernateUtil.getSession(sessionFactory);
			session.delete(user);
			
			
		}
		
		
		
	}
	
	@Override
	public User getUserById(int id) {
		
		Session session = HibernateUtil.getSession(sessionFactory);
		return (User) session.get(User.class, id);
		
	}

	@Override
	public User getUserByUsernameAndPassword(String username, String password) {
		
		
       Session session = HibernateUtil.getSession(sessionFactory);
		
		Criteria criteria = session.createCriteria(User.class);
		
		//adding restriction 
		
		criteria.add(Restrictions.eq("name", username))
		.add(Restrictions.eq("password", password));
		
		return (User) criteria.uniqueResult();
	}

}
