package com.lach.weatherApp;

import com.lach.weatherApp.ApiWeather.WeatherApi;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WeatherServiceTest {

    @Test
    void bestWeather() {
        //Given
        WeatherRepository weatherRepository = Mockito.mock(WeatherRepository.class);
        WeatherApi weatherApi = Mockito.mock(WeatherApi.class);
        BestWeatherCalculator bestWeatherCalculator = Mockito.mock(BestWeatherCalculator.class);
        WeatherService weatherService = new WeatherService(weatherRepository,weatherApi, bestWeatherCalculator);
        when(weatherService.bestWeather(2l)).thenReturn(null);

        //When
        BestWeatherResponse result = weatherService.bestWeather(2l);

        //Then
        assertThat(result).isEqualTo(null);
    }
}