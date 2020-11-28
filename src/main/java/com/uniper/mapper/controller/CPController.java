package com.uniper.mapper.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.uniper.mapper.dao.CompanyRepo;
import com.uniper.mapper.model.CompanyAlias;




@Controller
public class CPController {
	
	@Autowired
	CompanyRepo repo;
	
	@Autowired
	CompanyAlias alias;	
	
	
	@RequestMapping(value = "/ajaxcp" ,produces = { "application/json"})
	@ResponseBody
	
	public ModelAndView getMapperAjax(ModelAndView model, HttpServletRequest request, HttpServletResponse response) throws JsonParseException, JsonMappingException, IOException  {
		
		
		List<CompanyAlias> cpList = (List<CompanyAlias>) repo.findAll();	
		List list=new ArrayList();
		
	ObjectMapper mapper = new ObjectMapper();
	String json = "";
	//String json1 = "";
       
		for(int i=0;i<1;i++){
		    //System.out.println("javaobject"+ cpList.get(i));
		    json = mapper.writeValueAsString(cpList.get(i));
		    System.out.println("Json String" + json);
			/*
			 * //Company_Alias temp= mapper.readValue(json, Company_Alias.class);
			 * //System.out.println("json object" +temp); list.add(json);
			 * alias=mapper.readValue(json,CompanyAlias.class);
			 * System.out.println("Json Object" +alias);
			 * json1=mapper.writeValueAsString(mapper.readValue(json,CompanyAlias.class));
			 */
		   
		    
		
		
		}
		
		model.addObject("cpList", json);		
		model.setViewName("form");
		
		return model;
	}
	@RequestMapping(value="/addCP" )
	public String addNewCP(@RequestParam String entity_type_name, @RequestParam String upstream_app, 
			@RequestParam String company_name, @RequestParam String upstream_alias, 
			@RequestParam String downstream_app, @RequestParam String downstream_alias, Model model) {
		
		
		
		alias.setCompanyName(company_name);
		alias.setDownStreamAlias(downstream_alias);
		alias.setDownStreamApp(downstream_app);
		alias.setEntityTypeName(entity_type_name);
		alias.setUpStreamAlias(upstream_alias);
		alias.setUpStreamApp(upstream_app);
				
		
		repo.save(alias);
		return "home";
	}
	
	
	

	
	

}
