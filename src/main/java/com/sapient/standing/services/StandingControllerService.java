package com.sapient.standing.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sapient.standing.POJO.ApiResponse;
import com.sapient.standing.POJO.CompetitionResponse;
import com.sapient.standing.POJO.Country;
import com.sapient.standing.POJO.FinalResponse;
import com.sapient.standing.exceptions.ResourceNotFoundException;

@Component
public class StandingControllerService {

	Logger logger = LoggerFactory.getLogger(StandingControllerService.class);

	@Autowired
	RestTemplate restClient;

	public /* ResponseObject */ FinalResponse getAll (String countryName, String teamName, String leagueName) 
		throws ResourceNotFoundException{
		final String API = "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
		FinalResponse response = new FinalResponse();
		List<Country> countries = new ArrayList<Country>();
		Country required = new Country();
		logger.info(countryName);

		countries = Arrays.asList(restClient
				.getForObject("https://apiv2.apifootball.com/?action=get_countries&APIkey=" + API, Country[].class));

		required = countries.stream().filter(country -> countryName.equals(country.getCountry_name())).findAny()
				.orElseThrow(() -> new ResourceNotFoundException("Object do not exist !! "));

		logger.info(required.toString());
		List<CompetitionResponse> competitions = new ArrayList<CompetitionResponse>();
		competitions = Arrays
				.asList(restClient.getForObject("https://apiv2.apifootball.com/?action=get_leagues&country_id="
						+ required.getCountry_id() + "&APIkey=" + API, CompetitionResponse[].class));
		CompetitionResponse actual = new CompetitionResponse();
		actual = competitions.stream().filter(league -> leagueName.equals(league.getLeague_name())).findAny()
				.orElseThrow(() -> new ResourceNotFoundException("Object do not exist !! "));
		logger.info(actual.toString());
		String url = "https://apiv2.apifootball.com/?action=get_standings&league_id=" + actual.getLeague_id() + "&APIkey="
				+ API;
		List<ApiResponse> finalList = new ArrayList<ApiResponse>();
		finalList = Arrays.asList(restClient.getForObject(url, ApiResponse[].class));
		for (ApiResponse apiResponse : finalList) {
			logger.info(apiResponse.toString());
			if ((apiResponse.getCountry_name().equals(countryName)) && (apiResponse.getTeam_name().equals(teamName))) {
				response.setCountry_id(required.getCountry_id());
				response.setCountry_name(apiResponse.getCountry_name());
				response.setLeague_id(apiResponse.getLeague_id());
				response.setTeam_id(apiResponse.getTeam_id());
				response.setLeague_name(apiResponse.getLeague_name());
				response.setOverall_league_position(apiResponse.getOverall_league_position());
				response.setTeam_name(apiResponse.getTeam_name());
				break;
			} 
		}
		logger.info(response.toString());

		/* restClient.getForObject(url, ApiResponse[].class); */
		return response;
	}

}
