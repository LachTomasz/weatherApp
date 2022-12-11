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
        return null;

    }
}
