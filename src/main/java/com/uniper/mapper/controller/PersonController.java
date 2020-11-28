package com.uniper.mapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class PersonController {
	
	

	
	@RequestMapping("/form")
	public String addPerson() {
		
		ModelAndView mv=new ModelAndView("form");
		
	     
				
		
		return "form";
	}
	

}
