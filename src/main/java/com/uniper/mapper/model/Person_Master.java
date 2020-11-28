package com.uniper.mapper.model;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Person_Master {
	
	private int person_Id;
	private String person_Name;
	public int getPerson_Id() {
		return person_Id;
	}
	public void setPerson_Id(int person_Id) {
		this.person_Id = person_Id;
	}
	public String getPerson_Name() {
		return person_Name;
	}
	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}
	
	

}
