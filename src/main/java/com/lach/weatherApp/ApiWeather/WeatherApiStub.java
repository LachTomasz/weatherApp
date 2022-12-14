package com.lach.weatherApp.ApiWeather;

import com.lach.weatherApp.City;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;

import java.util.Map;

public class WeatherApiStub implements WeatherClient {

    private static Map<City, WeatherbitResponse> RESPONSE_MAP = Map.of(City.Jastarnia, new WeatherbitResponse("Jastarnia", null));
    @Override
    public WeatherbitResponse weatherbitResponse(City city) {
        return RESPONSE_MAP.get(city);
    }
}
