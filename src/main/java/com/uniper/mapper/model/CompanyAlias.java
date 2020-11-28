package com.uniper.mapper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Company_Alias")

public class CompanyAlias {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="MP_CMPNY_ALIAS_ID", allocationSize=1)
	
	
	//MP_CMPNY_ALIAS_ID
	
	@Column(name = "alias_id")
	private long aliasId;
	@Column(name = "entity_type_name")
	 private String entityTypeName;
	@Column(name = "upstream_App")
	 private String upStreamApp;
	@Column(name = "company_Name")
	 private String companyName;
	@Column(name = "upstream_Alias")
	 private String upStreamAlias;
	@Column(name = "downstream_App")
	 private String downStreamApp;
	@Column(name = "downstream_Alias")	
	 private String downStreamAlias;
	 @Column(name = "instrument_name",nullable = true)
	 private Integer instrumentName;
	 @Column(name = "instrument_Id",nullable = true)
	 private Integer instrumentId;
	 
	 
	public CompanyAlias() {
		super();
	}
	
	public long getAliasId() {
		return aliasId;
	}
	public void setAliasId(long aliasId) {
		this.aliasId = aliasId;
	}
	public String getEntityTypeName() {
		return entityTypeName;
	}
	public void setEntityTypeName(String entityTypeName) {
		this.entityTypeName = entityTypeName;
	}
	public String getUpStreamApp() {
		return upStreamApp;
	}
	public void setUpStreamApp(String upStreamApp) {
		this.upStreamApp = upStreamApp;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getUpStreamAlias() {
		return upStreamAlias;
	}
	public void setUpStreamAlias(String upStreamAlias) {
		this.upStreamAlias = upStreamAlias;
	}
	public String getDownStreamApp() {
		return downStreamApp;
	}
	public void setDownStreamApp(String downStreamApp) {
		this.downStreamApp = downStreamApp;
	}
	public String getDownStreamAlias() {
		return downStreamAlias;
	}
	public void setDownStreamAlias(String downStreamAlias) {
		this.downStreamAlias = downStreamAlias;
	}
	public Integer getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(Integer instrumentName) {
		this.instrumentName = instrumentName;
	}
	public Integer getInstrumentId() {
		return instrumentId;
	}
	public void setInstrumentId(Integer instrumentId) {
		this.instrumentId = instrumentId;
	}
	@Override
	public String toString() {
		return "Company_Alias [aliasId=" + aliasId + ", entityTypeName=" + entityTypeName + ", upStreamApp="
				+ upStreamApp + ", companyName=" + companyName + ", upStreamAlias=" + upStreamAlias + ", downStreamApp="
				+ downStreamApp + ", downStreamAlias=" + downStreamAlias + ", instrumentName=" + instrumentName
				+ ", instrumentId=" + instrumentId + "]";
	}
	
	 
	
	 
	 
	}
