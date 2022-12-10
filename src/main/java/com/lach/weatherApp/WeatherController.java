package com.lach.weatherApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


@RestController
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/bestWeather/{yyyy-mm-dd}")
    public BestWeatherResponse getbestWeather(@PathVariable("yyyy-mm-dd") String id) {///pathVariable zmien nazwe z formatu na date
        LocalDate date = LocalDate.parse(id);
        LocalDate startDate = LocalDate.now();
        Long range = ChronoUnit.DAYS.between(date, startDate);
        if (range < 16l) {


        }
        return null;
    }
//todo napisać test do tego na poczatek tylko status 200 testowac. dodaj test dla badrequesta - data musi byc w przedziale anie poza nim. data poza przedzialem status 400

}
