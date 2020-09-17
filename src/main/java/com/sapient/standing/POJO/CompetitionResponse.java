package com.sapient.standing.POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompetitionResponse {

	private Long country_id;
	private String country_name;
	private Long league_id;
	private String league_name;
	public Long getCountry_id() {
		return country_id;
	}
	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public Long getLeague_id() {
		return league_id;
	}
	public void setLeague_id(Long league_id) {
		this.league_id = league_id;
	}
	public String getLeague_name() {
		return league_name;
	}
	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}
	@Override
	public String toString() {
		return "CompetitionResponse [country_id=" + country_id + ", country_name=" + country_name + ", league_id="
				+ league_id + ", league_name=" + league_name + "]";
	}
	public CompetitionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompetitionResponse(Long country_id, String country_name, Long league_id, String league_name) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.league_id = league_id;
		this.league_name = league_name;
	}
	
	
	
}
