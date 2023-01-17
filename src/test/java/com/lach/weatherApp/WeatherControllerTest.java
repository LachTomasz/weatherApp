package com.lach.weatherApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@ActiveProfiles(value = "test") //zapis poniżej jest równowarzny z liniami 16 i 17
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = "spring.profiles.active:test")
class WeatherControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldGetBestWeatherStatus200() {
        //Given
        String url = "http://localhost:" + port + "/bestWeather/2023-01-06";

        //When
        ResponseEntity<BestWeatherResponse> result = restTemplate.getForEntity(url, BestWeatherResponse.class);

        //Then
        assertThat(result.getStatusCode().is2xxSuccessful()).isTrue();
        //todo poza statusem skontrolowac odpowiedzi, dopisac odpowiednie assercje
        assertThat(result.getBody().temp).isEqualTo(26.3F);
        assertThat(result.getBody().wind).isEqualTo(5.9F);
        assertThat(result.getBody().city).isEqualTo(City.Bridgetown);
    }

    @Test
    void shouldGetBestWeatherStatus400() {
        //Given
        String url = "http://localhost:" + port + "/bestWeather/2022-12-25";

        //When
        ResponseEntity<BestWeatherResponse> result = restTemplate.getForEntity(url, BestWeatherResponse.class);//w debugowaniu podmien se na stringa clase

        //Then
        assertThat(result.getStatusCode().is4xxClientError()).isTrue();

    }

    //todo test na zadne pasujace miasto -> w stubie w wybranym dniu dopasowac dane tak aby osiagnac pozytywny wynik tego testu
    @Test
    void shouldDontGetBestWeatherStatus404() {
        //Given
        String url = "http://localhost:" + port + "/bestWeather/2023-01-16";

        //When
        ResponseEntity<BestWeatherResponse> result = restTemplate.getForEntity(url, BestWeatherResponse.class);

        //Then
        assertThat(result.getStatusCode().is4xxClientError()).isTrue();

    }
//58:50
    //todo 1:02:00 o obejsciu daty wstecznej
}