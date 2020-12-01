package com.uniper.mapper.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	 
		  return CPService.createcp(cpalias); 
	 }
	 
	@GetMapping("/cps")
	public List<CompanyAlias> getAllCompanies() {
		return CPService.getAllCPs();

	}
	@GetMapping("/cps/{id}")
	public Optional<CompanyAlias> getCpById(@PathVariable("id") long id) {
		return CPService.getCpById(id);

	}
	@PutMapping("/cps/{id}")
	public CompanyAlias updateCpById(@PathVariable("id") long id,@RequestBody CompanyAlias cpalias) {
		return CPService.updateCpbyId(id,cpalias);
	}
	@DeleteMapping("/cps/{id}")
	public void deleteCpById(@PathVariable("id") long id) {
		CPService.deleteCpbyId(id);
	}
	@GetMapping("/cps/byCpName/{name}")
	public Optional<CompanyAlias> getCpByname(@PathVariable("name") String name) {
		return CPService.getCpByName(name);
	
	
	}
}
