/**
 * 
 */
package com.cim.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cim.domain.Country;

/**
 * @author MakrandP
 *
 */
@Repository
public class CountryDAOImpl implements CountryDAO {
	@Autowired
	CountryRepository countryRepoJPA;
	
	static HashMap<Integer, Country> countryIdMap = getCountryIdMap();

	public static HashMap<Integer, Country> getCountryIdMap() {
		return countryIdMap;
	}

	@Override
	public List<Country> getAllCountries() {
		List<Country> countries = new ArrayList<Country>(countryIdMap.values());
		return countries;
	}

	public CountryDAOImpl() {
		super();

		if (countryIdMap == null) {
			
			countryIdMap = new HashMap<Integer, Country>();
			
			Country indiaCountry = new Country(1, "India");
			Country chinaCountry = new Country(4, "China");
			Country nepalCountry = new Country(3, "Nepal");
			Country bhutanCountry = new Country(2, "Bhutan");

			countryIdMap.put(1, indiaCountry);
			countryIdMap.put(4, chinaCountry);
			countryIdMap.put(3, nepalCountry);
			countryIdMap.put(2, bhutanCountry);
		}
	}

	@Override
	public List<Country> getAllCountriesJPA() {
		Country country = new Country(1,"India");
		countryRepoJPA.save(country);
		return countryRepoJPA.findAllByOrderByIdAsc();
	}
}
