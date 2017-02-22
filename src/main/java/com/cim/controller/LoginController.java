/**
 * 
 */
package com.cim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cim.domain.User;

import com.cim.service.LoginManagementService;

/**
 * @author MakrandP
 *
 */
@Controller
public class LoginController {
	@Autowired
	LoginManagementService loginManagementService;

	@RequestMapping(value="/service/login", method = RequestMethod.POST,headers = "Accept=application/json")
	public User loginManagement(@ModelAttribute ("user") User user) {
		User userDetails = loginManagementService.checkLoginDetails(user);	
		System.out.println(userDetails.getFirstName()+userDetails.getLastName());
		System.out.println(userDetails);
		return userDetails;
	}
}
