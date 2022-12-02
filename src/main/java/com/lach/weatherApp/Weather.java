package com.lach.weatherApp;

public class Weather {

    private final Float averageTemp;
    private final Float windSpeed;

    public Weather(Float averageTemp, Float windSpeed) {
        this.averageTemp = averageTemp;
        this.windSpeed = windSpeed;
    }

    public Float getAverageTemp() {
        return averageTemp;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }
}
