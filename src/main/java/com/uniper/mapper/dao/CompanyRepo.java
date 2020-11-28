package com.uniper.mapper.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uniper.mapper.model.CompanyAlias;


@Repository
public interface CompanyRepo extends CrudRepository<CompanyAlias,Long> {
	
	public List<CompanyAlias> findAll();
	
	
	
	
	
	

}
