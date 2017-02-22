/**
 * 
 */
package com.cim.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cim.domain.User;

/**
 * @author MakrandP
 *
 */
@Repository
public class LoginManagementDAOImpl implements LoginManagementDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public User checkLoginDetails(User user) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		String SQL_QUERY = "from User where user_name= '" + user.getUserName() + "' and password= '"
				+ user.getPassword() + "'";
		Query query = session.createQuery(SQL_QUERY);
		List<?> list = query.list();
		User userbean = (User) list.get(0);
		session.close();

		return userbean;
	}

}
