package com.sapient.standing.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.standing.POJO.FinalResponse;
import com.sapient.standing.exceptions.ResourceNotFoundException;
import com.sapient.standing.services.StandingControllerService;

@RestController
public class StandingController {

	@Autowired
	StandingControllerService service;
	
	@GetMapping("/")
	public String hello() {
		return "Welocome to the REST microservice !! \n Run http://localhost:8888/getStandingPositionForTeam/England/Birmingham/Championship";
	}

	@GetMapping("/getStandingPositionForTeam/{countryName}/{teamName}/{leagueName}")
	public ResponseEntity<List<FinalResponse>> getAll(@PathVariable("countryName") String countryName,
			@PathVariable("teamName") String teamName, @PathVariable("leagueName") String leagueName)
			throws ResourceNotFoundException {
		/* ResponseObject */
		List<FinalResponse> result = new ArrayList<FinalResponse>();
		FinalResponse response = new FinalResponse();
		response = service.getAll(countryName, teamName, leagueName);
		result.add(response);
		if (response == null)
			throw new ResourceNotFoundException("Object do not exist !! ");
		else
			return ResponseEntity.status(HttpStatus.OK).body(result);
	}

}
