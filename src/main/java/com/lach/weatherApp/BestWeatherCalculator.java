package com.lach.weatherApp;

import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Component
public class BestWeatherCalculator {


    public BestWeatherResponse calculate(List<WeatherbitResponse> weatherbitResponseList, LocalDate date){

//var result = weatherbitResponseList.stream()
//        .filter(wind -> weatherbitResponseList.forEach(weatherbitResponse -> weatherbitResponse.getWeatherbitResponseDetail().get(Math.toIntExact(date))))
//        .;
        //todo zwracac dowolny element z mapy  i zapisac oraz zwrocic zmiast tego null podspodem. Done
        //todo long zamien na localdate w calej aplikacji. Done
//        return null;
        City city = City.valueOf(weatherbitResponseList.get(0).getCityName());
        Float wind = weatherbitResponseList.get(0).getWeatherbitResponseDetail().get(2).getWindSpd();
        BestWeatherResponse bestWeather =  new BestWeatherResponse(city, wind);
        return bestWeather;
    }
}
