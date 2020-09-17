package com.sapient.standing.POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
	
	private Long country_id;
	private String country_name;
	public Long getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Long country_id) {
		this.country_id =country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(Long country_id, String country_name) {
		super();
		this.country_id =country_id;
		this.country_name = country_name;
	}
	@Override
	public String toString() {
		return "Country [id=" +country_id+ ", country_name=" + country_name + "]";
	}
	
	

}
