/**
 * 
 */
package com.cim.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cim.dao.CountryDAO;
import com.cim.dao.CountryRepository;
import com.cim.domain.Country;

/**
 * @author MakrandP
 *
 */
@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	CountryDAO countryDAO;
	
	@Override
	public List<Country> getAllCountries() {
		return countryDAO.getAllCountries();
	}

	public List<Country> getAllCountriesJPA() {
		
		return countryDAO.getAllCountriesJPA();
	}

	   
}
