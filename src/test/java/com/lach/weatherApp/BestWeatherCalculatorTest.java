package com.lach.weatherApp;

import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponseDetail;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestWeatherCalculatorTest {

    BestWeatherCalculator bestWeatherCalculator = new BestWeatherCalculator();

    @Test
    public void shouldCalculateBestWeather(){
        //given
        List<WeatherbitResponse> weatherbitResponseList = List.of(
                new WeatherbitResponse("Jastarnia", List.of(
                new WeatherbitResponseDetail(LocalDate.parse("2022-12-18"), -0.9F, 6F),
                new WeatherbitResponseDetail(LocalDate.parse("2022-12-19"), -2.3F, 7.1F),
                new WeatherbitResponseDetail(LocalDate.parse("2022-12-20"), 4.2F, 8.0F)
        )),
                new WeatherbitResponse("Bridgetown", List.of(
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-18"), -0.9F, 6F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-19"), -2.3F, 7.1F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-20"), 4.2F, 8.0F)
                ))
                );
        //todo dodaj pozostalłe miasta z stuba
        //when
        var result = bestWeatherCalculator.calculate(weatherbitResponseList, LocalDate.parse("2022-12-19"));

        //then
    }

}