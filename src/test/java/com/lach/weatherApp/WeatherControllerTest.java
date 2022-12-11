package com.lach.weatherApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WeatherControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldGetBestWeather() {
        //Given
        String url = "http://localhost:" + port + "/bestWeather/2022-12-13";

        //When
        ResponseEntity<BestWeatherResponse> result = restTemplate.getForEntity(url, BestWeatherResponse.class);

        //Then
        assertThat(result.getStatusCode().is2xxSuccessful()).isTrue();
    }
}