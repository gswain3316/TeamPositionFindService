package com.sapient.standing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.sapient.standing.POJO.FinalResponse;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testrestclient;

	@Test
	public void defaultControllerMessage() throws Exception {
		assertThat(this.testrestclient.getForObject("http://localhost:" + port + "/", String.class))
				.contains("Welocome to the REST microservice !!");
	}

	/*
	 * @Test public void mainControllerMessage() throws Exception {
	 * 
	 * 
	 * List<FinalResponse> result= new ArrayList<FinalResponse>(); result.add(new
	 * FinalResponse(new Long(41), "England", new Long(149), "Championship", new
	 * Long(2631), "Birmingham", 1));
	 * 
	 * FinalResponse[] testresult = {new FinalResponse(new Long(41), "England", new
	 * Long(149), "Championship", new Long(2631), "Birmingham", 1)};
	 * 
	 * ResponseEntity<List<FinalResponse>> response =
	 * ResponseEntity.status(HttpStatus.OK).body(result);
	 * 
	 * assertThat(this.testrestclient.getForObject( "http://localhost:" + port +
	 * "/getStandingPositionForTeam/England/Birmingham/Championship",
	 * FinalResponse[].class)) .isEqualTo(testresult); }
	 */

}
