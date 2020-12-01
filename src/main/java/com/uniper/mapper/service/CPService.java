package com.uniper.mapper.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.uniper.mapper.dao.CompanyRepo;
import com.uniper.mapper.exception.UpStreamAliasExistException;
import com.uniper.mapper.exception.CpNotFoundException;
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
	public CompanyAlias createcp(CompanyAlias cpAlias) throws UpStreamAliasExistException {		
		CompanyAlias existingUpStreamAlias=repo.findByUpStreamAlias(cpAlias.getUpStreamAlias());
			//System.out.println(existingUpStreamAlias.getUpStreamAlias());
			if(existingUpStreamAlias!= null) {
				System.out.println(existingUpStreamAlias.getUpStreamAlias());
				throw  new UpStreamAliasExistException("there is an already one upstream existes  in the repository");
			}
		return repo.save(cpAlias);	
		
	}
	public Optional<CompanyAlias> getCpById(long id) throws CpNotFoundException{
		
		Optional<CompanyAlias> cpAlias= repo.findById(id);	
		if(!cpAlias.isPresent()) {
			throw new CpNotFoundException ("there is no such conterparty exist with requested id");
		}
		return cpAlias;
	}
	public CompanyAlias updateCpbyId(long id,CompanyAlias CompanyAlias) throws CpNotFoundException {	
		Optional<CompanyAlias> cpAlias= repo.findById(id);	
		if(!cpAlias.isPresent()) {
			throw new CpNotFoundException ("there is no such conterparty exist with requested id");
		}
		CompanyAlias.setAliasId(id);
		return repo.save(CompanyAlias);			
	}
	public void deleteCpbyId(long id) {	
		
		if(!repo.findById(id).isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "there is no such conterparty exist with requested id");
		}
		 repo.deleteById(id);
		
	}
public CompanyAlias getUpStreamByname(String upStreamAliasName){
	
		System.out.println("manoj");
		return repo.findByUpStreamAlias(upStreamAliasName);	
	}
	

	

}
