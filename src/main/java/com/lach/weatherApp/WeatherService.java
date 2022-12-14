package com.lach.weatherApp;

import com.lach.weatherApp.ApiWeather.WeatherApi;
import com.lach.weatherApp.ApiWeather.WeatherClient;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;
    private final WeatherClient weatherApi;
    private final BestWeatherCalculator bestWeatherCalculator;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository, WeatherClient weatherApi, BestWeatherCalculator bestWeatherCalculator) {
        this.weatherRepository = weatherRepository;
        this.weatherApi = weatherApi;
        this.bestWeatherCalculator = bestWeatherCalculator;
    }

    public BestWeatherResponse bestWeather(Long day) {

        List<WeatherbitResponse> weatherList = Arrays.stream(City.values())
                .map(city -> weatherApi.weatherbitResponse(city))
                .collect(Collectors.toList());
        return bestWeatherCalculator.calculate(weatherList, day);
    }
//todo unit test metoda robi zapytanie do weatherbitSerwice mockiem. Done
    //todo wyciagnac do properity file stałe z url i key


}
