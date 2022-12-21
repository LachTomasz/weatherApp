package com.lach.weatherApp;

import com.lach.weatherApp.ApiWeather.WeatherApi;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class WeatherServiceTest {

    WeatherRepository weatherRepository = Mockito.mock(WeatherRepository.class);
    WeatherApi weatherApi = Mockito.mock(WeatherApi.class);
    BestWeatherCalculator bestWeatherCalculator = Mockito.mock(BestWeatherCalculator.class);
    WeatherService weatherService = new WeatherService(weatherRepository,weatherApi, bestWeatherCalculator);


    //Jastarnia, Bridgetown, Fortaleza, Pissouri, Le_Morne


    @Test
    void bestWeather() {
        //Given
        WeatherbitResponse weatherbitResponseJastarnia = new WeatherbitResponse("Jastarnia", List.of());
        when(weatherApi.weatherbitResponse(City.Jastarnia)).thenReturn(weatherbitResponseJastarnia);
        WeatherbitResponse weatherbitResponseBridgetown = new WeatherbitResponse("Bridgetown", List.of());
        when(weatherApi.weatherbitResponse(City.Bridgetown)).thenReturn(weatherbitResponseBridgetown);
        WeatherbitResponse weatherbitResponseFortaleza = new WeatherbitResponse("Fortaleza", List.of());
        when(weatherApi.weatherbitResponse(City.Fortaleza)).thenReturn(weatherbitResponseFortaleza);
        WeatherbitResponse weatherbitResponsePissouri = new WeatherbitResponse("Pissouri", List.of());
        when(weatherApi.weatherbitResponse(City.Pissouri)).thenReturn(weatherbitResponsePissouri);
        WeatherbitResponse weatherbitResponseLe_Morne = new WeatherbitResponse("Le_Morne", List.of());
        when(weatherApi.weatherbitResponse(City.Le_Morne)).thenReturn(weatherbitResponseLe_Morne);
        //todo dopisac dla pozostałych miast. Done

        BestWeatherResponse bestWeatherResponse = new BestWeatherResponse(City.Jastarnia, 6F, 20F);
        when(weatherService.bestWeather(LocalDate.parse("2022-12-18"))).thenReturn(bestWeatherResponse);

        //When
        BestWeatherResponse result = weatherService.bestWeather(LocalDate.parse("2022-12-18"));

        //Then
        assertThat(result).isEqualTo(bestWeatherResponse);
    }
}