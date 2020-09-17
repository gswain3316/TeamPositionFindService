package com.sapient.standing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sapient.standing.controllers.StandingController;
import com.sapient.standing.services.StandingControllerService;

@SpringBootTest
public class SmokeTest {
	
	@Autowired
	private StandingController controller;
	
	@Autowired
	private StandingControllerService service;
	
	@Test
	public void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
		assertThat(service).isNotNull();
	}
	
}
