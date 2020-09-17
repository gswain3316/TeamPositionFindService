package com.sapient.standing.POJO;

public class FinalResponse {
	
	private Long country_id;
	private String country_name;
	private Long league_id;
	private String league_name;
	private Long team_id;
	private String team_name;
	private Integer overall_league_position;
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
	public Long getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Long team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public Integer getOverall_league_position() {
		return overall_league_position;
	}
	public void setOverall_league_position(Integer overall_league_position) {
		this.overall_league_position = overall_league_position;
	}
	public FinalResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FinalResponse [country_id=" + country_id + ", country_name=" + country_name + ", league_id=" + league_id
				+ ", league_name=" + league_name + ", team_id=" + team_id + ", team_name=" + team_name
				+ ", overall_league_position=" + overall_league_position + "]";
	}
	public FinalResponse(Long country_id, String country_name, Long league_id, String league_name, Long team_id,
			String team_name, Integer overall_league_position) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.league_id = league_id;
		this.league_name = league_name;
		this.team_id = team_id;
		this.team_name = team_name;
		this.overall_league_position = overall_league_position;
	}	
	
}
