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
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-20"), 3.5F, 4.9F)
                )),
                new WeatherbitResponse("Bridgetown", List.of(
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-18"), 26.5F, 7.9F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-19"), 26.4F, 6.0F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-20"), 26.6F, 5.6F)
                )),
                new WeatherbitResponse("Fortaleza", List.of(
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-18"), 29.6F, 3.9F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-19"), 29.8F, 1.6F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-20"), 29.4F, 1.6F)
                )),
                new WeatherbitResponse("Pissouri", List.of(
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-18"), 18.0F, 1.3F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-19"), 16.3F, 1.9F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-20"), 15.5F, 2.0F)
                )),
                new WeatherbitResponse("Le_Morne", List.of(
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-18"), 25.8F, 6.6F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-19"), 26.2F, 5.6F),
                        new WeatherbitResponseDetail(LocalDate.parse("2022-12-20"), 26.5F, 5.4F)
                ))
                        );
        //when
        var result = bestWeatherCalculator.calculate(weatherbitResponseList, LocalDate.parse("2022-12-19"));

        //then
        //todo dokoncz!!!
    }

}