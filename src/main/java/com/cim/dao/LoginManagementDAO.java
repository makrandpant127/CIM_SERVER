/**
 * 
 */
package com.cim.dao;

import com.cim.domain.User;

/**
 * @author MakrandP
 *
 */
public interface LoginManagementDAO {
	
	User checkLoginDetails(User user);
}
