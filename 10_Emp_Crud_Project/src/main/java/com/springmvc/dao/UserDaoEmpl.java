package com.springmvc.dao;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.entity.User;


@Repository
@Transactional
public class UserDaoEmpl implements UserDao{

	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	
	
	@Override
	public int saveUser(User user) {
		 int i=(Integer)hibernateTemplate.save(user);
		 return i;
	}

	@Override
	public User login(String email, String password) {
		 
		String hql = "from User where email = :em and password = :pwd";
		User user=(User)hibernateTemplate.execute(s->{
			
			Query<User> q=s.createQuery(hql,User.class);
			
			q.setParameter("em", email);
			q.setParameter("pwd", password);

			
			return q.uniqueResult();
			
		});
				return user;
	}

}
