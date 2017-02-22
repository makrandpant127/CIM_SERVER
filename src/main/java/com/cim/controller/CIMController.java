package com.cim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cim.domain.Country;
import com.cim.service.CountryService;

@RestController
public class CIMController {
	@Autowired
	CountryService countryService;

	@RequestMapping("/service/healthCheck")
	public String healthCheck() {
		return "Hey, CIM Application is running";
	}

	@RequestMapping(value = "/service/getCountries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getCountries() {
		List<Country> listOfCountries = countryService.getAllCountries();
		return listOfCountries;
	}

	
	@RequestMapping(value = "/service/getCountriesJPA", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getCountriesJPA() {
		List<Country> listOfCountries = countryService.getAllCountriesJPA();
		return listOfCountries;
	}
}
