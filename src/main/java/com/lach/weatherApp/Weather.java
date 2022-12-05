package com.lach.weatherApp;

public class Weather {

    private final String city;
    private final Float averageTemp;
    private final Float windSpeed;

    public Weather(String city, Float averageTemp, Float windSpeed) {
        this.city = city;
        this.averageTemp = averageTemp;
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public Float getAverageTemp() {
        return averageTemp;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }
}
