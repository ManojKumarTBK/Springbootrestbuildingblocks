package com.uniper.mapper.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Person_Alias {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int alias_id;
	 private String entity_type_name;
	 private String Upstream_App;
	 private String person_Name;
	 private String upStream_Alias;
	 private String downStream_App;
	 private String downStream_Alias;
	 private int instrument_name;
	 private int instrument_Id;
	public int getAlias_id() {
		return alias_id;
	}
	public void setAlias_id(int alias_id) {
		this.alias_id = alias_id;
	}
	public String getEntity_type_name() {
		return entity_type_name;
	}
	public void setEntity_type_name(String entity_type_name) {
		this.entity_type_name = entity_type_name;
	}
	public String getUpstream_App() {
		return Upstream_App;
	}
	public void setUpstream_App(String upstream_App) {
		Upstream_App = upstream_App;
	}
	public String getPerson_Name() {
		return person_Name;
	}
	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}
	public String getUpStream_Alias() {
		return upStream_Alias;
	}
	public void setUpStream_Alias(String upStream_Alias) {
		this.upStream_Alias = upStream_Alias;
	}
	public String getDownStream_App() {
		return downStream_App;
	}
	public void setDownStream_App(String downStream_App) {
		this.downStream_App = downStream_App;
	}
	public String getDownStream_Alias() {
		return downStream_Alias;
	}
	public void setDownStream_Alias(String downStream_Alias) {
		this.downStream_Alias = downStream_Alias;
	}
	public int getInstrument_name() {
		return instrument_name;
	}
	public void setInstrument_name(int instrument_name) {
		this.instrument_name = instrument_name;
	}
	public int getInstrument_Id() {
		return instrument_Id;
	}
	public void setInstrument_Id(int instrument_Id) {
		this.instrument_Id = instrument_Id;
	}
	 
	 

}
