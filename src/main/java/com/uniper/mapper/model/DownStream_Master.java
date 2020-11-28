package com.uniper.mapper.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DownStream_Master {
	
	@Id
	public int DownStream_id;
	public String downStream_app;
	public int getDownStream_id() {
		return DownStream_id;
	}
	public void setDownStream_id(int downStream_id) {
		DownStream_id = downStream_id;
	}
	public String getDownStream_app() {
		return downStream_app;
	}
	public void setDownStream_app(String downStream_app) {
		this.downStream_app = downStream_app;
	}
	
	
	

}
