package com.deimus.pingpongdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest(classes = PingPongDemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PingPongDemoApplicationTests {

	@Autowired
	private TestRestTemplate template;
	
	@Test
	public void ping_test() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/ping", String.class);
		assertThat(response.getBody()).isEqualTo("Pong");
	}

}
