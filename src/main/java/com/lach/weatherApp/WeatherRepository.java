package com.lach.weatherApp;

import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class WeatherRepository {

    private final Map<Long, WeatherbitResponse> idToWeather;

    public WeatherRepository(Map<Long, WeatherbitResponse> idToWeather) {
        this.idToWeather = idToWeather;
    }
}
