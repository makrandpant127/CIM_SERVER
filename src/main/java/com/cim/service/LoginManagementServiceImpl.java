/**
 * 
 */
package com.cim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cim.dao.LoginManagementDAO;
import com.cim.domain.User;

/**
 * @author MakrandP
 *
 */
@Service
public class LoginManagementServiceImpl implements LoginManagementService {
	@Autowired
	LoginManagementDAO loginManagementDAO;
	
	@Override
	public User checkLoginDetails(User user) {
		return loginManagementDAO.checkLoginDetails(user);
	}

}
