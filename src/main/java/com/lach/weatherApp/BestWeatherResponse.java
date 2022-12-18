package com.lach.weatherApp;

public class BestWeatherResponse {

    private final City city;
    private final Float wind;

    public BestWeatherResponse(City city, Float wind) {
        this.city = city;
        this.wind = wind;
    }

}



