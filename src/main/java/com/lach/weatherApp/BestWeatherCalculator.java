package com.lach.weatherApp;

import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BestWeatherCalculator {


    public BestWeatherResponse calculate(List<WeatherbitResponse> weatherbitResponseList, LocalDate date){

//var result = weatherbitResponseList.stream()
//        .filter(wind -> weatherbitResponseList.forEach(weatherbitResponse -> weatherbitResponse.getWeatherbitResponseDetail().get(Math.toIntExact(date))))
//        .;
        //todo zwracac dowolny element z mapy  i zapisac oraz zwrocic zmiast tego null podspodem. Done
        //todo long zamien na localdate w calej aplikacji. Done
//        return null;
        /*
        If the wind speed is not within <5; 18> (m/s) and the temperature is not in the range <5; 35> (°C),
        the location is not suitable for windsurfing. However, if they are in these ranges,
        then the best location is determined by the highest value calculated from the following formula:
            v * 3 + temp
    where v is the wind speed in m/s on a given day, and temp is an average forecasted temperature for a given day in Celsius,
    respectively - you can obtain these parameters from the “data” key in Weatherbit API’s response.

         */


        List<BestWeatherResponse> result = weatherbitResponseList.stream()
                .map(weatherbitResponse -> toBestWeatherResponse(weatherbitResponse, date))
                .collect(Collectors.toList());






        City city = City.valueOf(weatherbitResponseList.get(0).getCityName());
        Float wind = weatherbitResponseList.get(0).getWeatherbitResponseDetail().get(2).getWindSpd();
        BestWeatherResponse bestWeather =  new BestWeatherResponse(city, wind, 20F);
        return bestWeather;
    }

    private BestWeatherResponse toBestWeatherResponse(WeatherbitResponse weatherbitResponse, LocalDate date) {
        City cityName = City.valueOf(weatherbitResponse.getCityName());
        return weatherbitResponse.getWeatherbitResponseDetail().stream()
                .filter(weatherbitResponseDetail -> weatherbitResponseDetail.getDatetime().equals(date))
                .map(weatherbitResponseDetail -> new BestWeatherResponse(cityName, weatherbitResponseDetail.getWindSpd(), weatherbitResponseDetail.getTemp()))
                .findFirst()
                .orElseThrow();
    }
}
