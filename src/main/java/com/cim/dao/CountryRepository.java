/**
 * 
 */
package com.cim.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cim.domain.Country;

/**
 * @author MakrandP
 *
 */
@Transactional
public interface CountryRepository extends CrudRepository<Country,Integer>{
	List<Country>  findAllByOrderByIdAsc();
	
}
