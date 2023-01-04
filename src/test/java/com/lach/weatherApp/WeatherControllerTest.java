package com.lach.weatherApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(value = "test")
class WeatherControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldGetBestWeatherStatus200() {
        //Given
        String url = "http://localhost:" + port + "/bestWeather/2023-01-04";

        //When
        ResponseEntity<BestWeatherResponse> result = restTemplate.getForEntity(url, BestWeatherResponse.class);

        //Then
        assertThat(result.getStatusCode().is2xxSuccessful()).isTrue();
        //todo poza statusem skontrolowac odpowiedzi, dopisac odpowiednie assercje
        assertThat(result.getBody().temp).isNotZero();
        assertThat(result.getBody().wind).isNotZero();
        assertThat(result.getBody().city).isExactlyInstanceOf(City.class);
    }

    @Test
    void shouldGetBestWeatherStatus400(){
        //Given
        String url = "http://localhost:" + port + "/bestWeather/2022-12-25";

        //When
        ResponseEntity<BestWeatherResponse> result = restTemplate.getForEntity(url, BestWeatherResponse.class);//w debugowaniu podmien se na stringa clase

        //Then
        assertThat(result.getStatusCode().is4xxClientError()).isTrue();

    }

    //todo test na zadne pasujace miasto -> w stubie w wybranym dniu dopasowac dane tak aby osiagnac pozytywny wynik tego testu
}