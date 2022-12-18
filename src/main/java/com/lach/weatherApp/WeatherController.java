package com.lach.weatherApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


@RestController
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/bestWeather/{date}")
    public BestWeatherResponse getBestWeather(@PathVariable("date") String sDate) {
        LocalDate date = LocalDate.parse(sDate);
        LocalDate today = LocalDate.now();
        Duration difference = Duration.between(today, date);
        if (date.isAfter(today) & difference.toDays() < 16L) return weatherService.bestWeather(date);
        else return null;
    }
//todo napisać test do tego na poczatek tylko status 200 testowac. dodaj test dla badrequesta - data musi byc w przedziale anie poza nim. data poza przedzialem status 400

}
