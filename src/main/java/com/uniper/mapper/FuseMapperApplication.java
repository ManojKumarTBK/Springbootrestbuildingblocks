package com.uniper.mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.uniper.mapper.model.CompanyAlias;

//This is my spring boot application//
@SpringBootApplication
public class FuseMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuseMapperApplication.class, args);
		//Company_Alias alias=context.getBean(CompanyAlias.class);
	}

}
