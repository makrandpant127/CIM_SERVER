/**
 * 
 */
package com.cim.service;

import java.util.List;

import com.cim.domain.Country;

/**
 * @author MakrandP
 *
 */
public interface CountryService {

	List<Country> getAllCountries();

	List<Country> getAllCountriesJPA();

}
