package com.lach.weatherApp;

import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BestWeatherCalculator {


    public BestWeatherResponse calculate(List<WeatherbitResponse> weatherbitResponseList, long date){

//var result = weatherbitResponseList.stream()
//        .filter(wind -> weatherbitResponseList.forEach(weatherbitResponse -> weatherbitResponse.getWeatherbitResponseDetail().get(Math.toIntExact(date))))
//        .;
        //todo zwracac dowolny element z mapy  i zapisac oraz zwrocic zmiast tego null podspodem
        //todo long zamien na localdate w calej aplikacji
        return null;

    }
}
