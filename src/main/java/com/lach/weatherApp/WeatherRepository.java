package com.lach.weatherApp;

import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class WeatherRepository {

    private final Map<City, WeatherbitResponse> idToWeather;

    public WeatherRepository(Map<City, WeatherbitResponse> idToWeather) { this.idToWeather = idToWeather; }

    public WeatherbitResponse save(WeatherbitResponse weatherbitResponse){
        idToWeather.put(City.valueOf(weatherbitResponse.getCityName()),weatherbitResponse);
        return idToWeather.get(City.valueOf(weatherbitResponse.getCityName()));
    }

    public WeatherbitResponse update(WeatherbitResponse weatherbitResponse){
        idToWeather.put(City.valueOf(weatherbitResponse.getCityName()), weatherbitResponse);
        return idToWeather.get(City.valueOf(weatherbitResponse.getCityName()));
    }

    public WeatherbitResponse find(City city){ return idToWeather.get(city);}

    public void delete(City city){idToWeather.remove(city);}


}
