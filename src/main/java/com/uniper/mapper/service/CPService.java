package com.uniper.mapper.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uniper.mapper.dao.CompanyRepo;
import com.uniper.mapper.model.CompanyAlias;


@Service
public class CPService {
	
	@Autowired
	private  CompanyRepo repo;
	
	//get all cps method	
	public List<CompanyAlias> getAllCPs(){
		return repo.findAll();
		
	}
	//addcp method
	public CompanyAlias createcp(CompanyAlias CompanyAlias) {		
			
		return repo.save(CompanyAlias);	
		
	}
	public Optional<CompanyAlias> getCpById(long id){
		
		return repo.findById(id);	
	}
	public CompanyAlias updateCpbyId(long id,CompanyAlias CompanyAlias) {		
		CompanyAlias.setAliasId(id);
		return repo.save(CompanyAlias);			
	}
	public void deleteCpbyId(long id) {		
		if(repo.findById(id).isPresent()) {
		 repo.deleteById(id);
}		
	}
public Optional<CompanyAlias> getCpByName(String cpName){
	
		System.out.println("manoj");
		return repo.findByCompanyName(cpName);	
	}
	

	

}
