package com.lach.weatherApp;

import com.lach.weatherApp.apiErrorHandling.BadRequestException;
import com.lach.weatherApp.apiErrorHandling.NotFoundException;
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

    @GetMapping(value = "/bestWeather/{date}")
    public BestWeatherResponse getBestWeather(@PathVariable("date") String sDate) {
        LocalDate date = LocalDate.parse(sDate);
        LocalDate today = LocalDate.now();
        long difference = ChronoUnit.DAYS.between(today, date);
        if (date.isBefore(today) || difference > 16L) throw new BadRequestException("Date not allowed");//odpytac o aktywny profil z importu
        return weatherService.bestWeather(date).orElseThrow(()->new NotFoundException("Weather not found"));
    }
}
