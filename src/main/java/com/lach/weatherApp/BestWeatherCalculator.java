package com.lach.weatherApp;

import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;
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
        LocalDate today = LocalDate.now();
        Duration difference = Duration.between(today, date);
        Integer day = (int)difference.toDays();

        City city = City.valueOf(weatherbitResponseList.get(day).getCityName());
        Float wind = weatherbitResponseList.get(day).getWeatherbitResponseDetail().get(2).getWindSpd();
return new BestWeatherResponse(city, wind);
    }
}
