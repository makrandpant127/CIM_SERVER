/**
 * 
 */
package com.cim.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cim.domain.Country;

/**
 * @author MakrandP
 *
 */
public interface CountryDAO {
	
	
	List<Country> getAllCountries();

	List<Country> getAllCountriesJPA();
	
}
