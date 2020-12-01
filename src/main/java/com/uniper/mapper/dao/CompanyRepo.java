package com.uniper.mapper.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uniper.mapper.model.CompanyAlias;


@Repository
public interface CompanyRepo extends JpaRepository<CompanyAlias,Long> {
	
	public Optional<CompanyAlias> findByCompanyName(String companyName);
	
	
	
	
	
	

}
