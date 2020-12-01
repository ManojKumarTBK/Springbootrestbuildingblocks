package com.uniper.mapper.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.uniper.mapper.exception.UpStreamAliasExistException;

import com.uniper.mapper.exception.CpNotFoundException;
import com.uniper.mapper.model.CompanyAlias;
import com.uniper.mapper.service.CPService;

@RestController
public class CPController {

	@Autowired
	private CPService CPService;
	
	@Autowired
	private CompanyAlias cpalias;

	
	/*
	 * @PostMapping("/cp" ) public CompanyAlias createcp(@RequestParam String
	 * entity_type_name, @RequestParam String upstream_app,@RequestParam String
	 * company_name,
	 * 
	 * @RequestParam String upstream_alias,@RequestParam String
	 * downstream_app, @RequestParam String downstream_alias) {
	 * 
	 * cpalias.setEntityTypeName(entity_type_name);
	 * cpalias.setUpStreamApp(upstream_app); cpalias.setCompanyName(company_name);
	 * cpalias.setUpStreamAlias(upstream_alias);
	 * cpalias.setDownStreamApp(downstream_app);
	 * cpalias.setDownStreamAlias(downstream_alias);
	 * cpalias.setUpStreamApp(upstream_app);
	 * 
	 * return CPService.createcp(cpalias); }
	 */
	  
	  
	 @PostMapping("/cp" ) 
	 public CompanyAlias createcp(@RequestBody CompanyAlias cpalias) { 	 
	 
		  try {
			return CPService.createcp(cpalias);
		} catch (UpStreamAliasExistException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"cp already exist so cant create one more cp with same  details.");
		} 
	 }
	 
	@GetMapping("/cps")
	public List<CompanyAlias> getAllCompanies() {
		return CPService.getAllCPs();

	}
	@GetMapping("/cps/{id}")
	public Optional<CompanyAlias> getCpById(@PathVariable("id") long id) {
		try {
			return CPService.getCpById(id);
		} catch (CpNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}

	}
	@PutMapping("/cps/{id}")
	public CompanyAlias updateCpById(@PathVariable("id") long id,@RequestBody CompanyAlias cpalias) {
		try {
			return CPService.updateCpbyId(id,cpalias);
		} catch (CpNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
		}
	}
	@DeleteMapping("/cps/{id}")
	public void deleteCpById(@PathVariable("id") long id) {
		CPService.deleteCpbyId(id);
	}
	@GetMapping("/cps/byCpName/{name}")
	public CompanyAlias getUpStreamByname(@PathVariable("name") String name) {
		return CPService.getUpStreamByname(name);
	
	
	}
}
