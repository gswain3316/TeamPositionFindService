package com.sapient.standing.POJO;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse{
	
	private String country_name;
	private Long league_id;
	private String league_name;
	private Long team_id;
	private String team_name;
	private Integer overall_league_position;
	private Integer overall_league_payed;
	private Integer overall_league_W;
	private Integer overall_league_D;
	private Integer overall_league_L;
	private Integer overall_league_GF;
	private Integer overall_league_GA;
	private Integer overall_league_PTS;
	private Integer home_league_position;
	private Integer home_league_payed;
	private Integer home_league_W;
	private Integer home_league_D;
	private Integer home_league_L;
	private Integer home_league_GF;
	private Integer home_league_GA;
	private Integer home_league_PTS;
	private Integer away_league_position;
	private Integer away_league_payed;
	private Integer away_league_W;
	private Integer away_league_D;
	private Integer away_league_L;
	private Integer away_league_GF;
	private Integer away_league_GA;
	private Integer away_league_PTS;
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
	public Integer getOverall_league_payed() {
		return overall_league_payed;
	}
	public void setOverall_league_payed(Integer overall_league_payed) {
		this.overall_league_payed = overall_league_payed;
	}
	public Integer getOverall_league_W() {
		return overall_league_W;
	}
	public void setOverall_league_W(Integer overall_league_W) {
		this.overall_league_W = overall_league_W;
	}
	public Integer getOverall_league_D() {
		return overall_league_D;
	}
	public void setOverall_league_D(Integer overall_league_D) {
		this.overall_league_D = overall_league_D;
	}
	public Integer getOverall_league_L() {
		return overall_league_L;
	}
	public void setOverall_league_L(Integer overall_league_L) {
		this.overall_league_L = overall_league_L;
	}
	public Integer getOverall_league_GF() {
		return overall_league_GF;
	}
	public void setOverall_league_GF(Integer overall_league_GF) {
		this.overall_league_GF = overall_league_GF;
	}
	public Integer getOverall_league_GA() {
		return overall_league_GA;
	}
	public void setOverall_league_GA(Integer overall_league_GA) {
		this.overall_league_GA = overall_league_GA;
	}
	public Integer getOverall_league_PTS() {
		return overall_league_PTS;
	}
	public Long getTeam_id() {
		return team_id;
	}
	public void setTeam_id(Long team_id) {
		this.team_id = team_id;
	}
	public void setOverall_league_PTS(Integer overall_league_PTS) {
		this.overall_league_PTS = overall_league_PTS;
	}
	public Integer getHome_league_position() {
		return home_league_position;
	}
	public void setHome_league_position(Integer home_league_position) {
		this.home_league_position = home_league_position;
	}
	public Integer getHome_league_payed() {
		return home_league_payed;
	}
	public void setHome_league_payed(Integer home_league_payed) {
		this.home_league_payed = home_league_payed;
	}
	public Integer getHome_league_W() {
		return home_league_W;
	}
	public void setHome_league_W(Integer home_league_W) {
		this.home_league_W = home_league_W;
	}
	public Integer getHome_league_D() {
		return home_league_D;
	}
	public void setHome_league_D(Integer home_league_D) {
		this.home_league_D = home_league_D;
	}
	public Integer getHome_league_L() {
		return home_league_L;
	}
	public void setHome_league_L(Integer home_league_L) {
		this.home_league_L = home_league_L;
	}
	public Integer getHome_league_GF() {
		return home_league_GF;
	}
	public void setHome_league_GF(Integer home_league_GF) {
		this.home_league_GF = home_league_GF;
	}
	public Integer getHome_league_GA() {
		return home_league_GA;
	}
	public void setHome_league_GA(Integer home_league_GA) {
		this.home_league_GA = home_league_GA;
	}
	public Integer getHome_league_PTS() {
		return home_league_PTS;
	}
	public void setHome_league_PTS(Integer home_league_PTS) {
		this.home_league_PTS = home_league_PTS;
	}
	public Integer getAway_league_position() {
		return away_league_position;
	}
	public void setAway_league_position(Integer away_league_position) {
		this.away_league_position = away_league_position;
	}
	public Integer getAway_league_payed() {
		return away_league_payed;
	}
	public void setAway_league_payed(Integer away_league_payed) {
		this.away_league_payed = away_league_payed;
	}
	public Integer getAway_league_W() {
		return away_league_W;
	}
	public void setAway_league_W(Integer away_league_W) {
		this.away_league_W = away_league_W;
	}
	public Integer getAway_league_D() {
		return away_league_D;
	}
	public void setAway_league_D(Integer away_league_D) {
		this.away_league_D = away_league_D;
	}
	public Integer getAway_league_L() {
		return away_league_L;
	}
	public void setAway_league_L(Integer away_league_L) {
		this.away_league_L = away_league_L;
	}
	public Integer getAway_league_GF() {
		return away_league_GF;
	}
	public void setAway_league_GF(Integer away_league_GF) {
		this.away_league_GF = away_league_GF;
	}
	public Integer getAway_league_GA() {
		return away_league_GA;
	}
	public void setAway_league_GA(Integer away_league_GA) {
		this.away_league_GA = away_league_GA;
	}
	public Integer getAway_league_PTS() {
		return away_league_PTS;
	}
	public void setAway_league_PTS(Integer away_league_PTS) {
		this.away_league_PTS = away_league_PTS;
	}
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ApiResponse [country_name=" + country_name + ", league_id=" + league_id + ", league_name=" + league_name
				+ ", team_name=" + team_name + ", overall_league_position=" + overall_league_position
				+ ", overall_league_payed=" + overall_league_payed + ", overall_league_W=" + overall_league_W
				+ ", overall_league_D=" + overall_league_D + ", overall_league_L=" + overall_league_L
				+ ", overall_league_GF=" + overall_league_GF + ", overall_league_GA=" + overall_league_GA
				+ ", overall_league_PTS=" + overall_league_PTS + ", home_league_position=" + home_league_position
				+ ", home_league_payed=" + home_league_payed + ", home_league_W=" + home_league_W + ", home_league_D="
				+ home_league_D + ", home_league_L=" + home_league_L + ", home_league_GF=" + home_league_GF
				+ ", home_league_GA=" + home_league_GA + ", home_league_PTS=" + home_league_PTS
				+ ", away_league_position=" + away_league_position + ", away_league_payed=" + away_league_payed
				+ ", away_league_W=" + away_league_W + ", away_league_D=" + away_league_D + ", away_league_L="
				+ away_league_L + ", away_league_GF=" + away_league_GF + ", away_league_GA=" + away_league_GA
				+ ", away_league_PTS=" + away_league_PTS + "]";
	}
	
	
	
	
}
