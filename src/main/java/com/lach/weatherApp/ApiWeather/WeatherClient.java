package com.lach.weatherApp.ApiWeather;

import com.lach.weatherApp.City;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;

public interface WeatherClient {
    WeatherbitResponse weatherbitResponse(City city);
}
