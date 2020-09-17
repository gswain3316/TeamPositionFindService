package com.sapient.standing;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sapient.standing.POJO.FinalResponse;
import com.sapient.standing.services.StandingControllerService;

@SpringBootTest
@EnableWebMvc
class TeamStandingMicroserviceApplicationTests {


	@MockBean
	private StandingControllerService service;
	
	@Test
	void contextLoads() throws Exception{
		FinalResponse value = new FinalResponse(new Long(41), "England", new Long(149), "Championship", new Long(2631), "Birmingham", 1);
		when(service.getAll("England", "Birmingham", "Championship")).thenReturn(value);
	}

}
