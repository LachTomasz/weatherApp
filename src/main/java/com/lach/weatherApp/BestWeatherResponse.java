package com.lach.weatherApp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class BestWeatherResponse {

    public final City city;
    public final Float wind;
    public final Float temp;

    @JsonCreator
    public BestWeatherResponse(@JsonProperty(value = "city") City city, @JsonProperty(value = "wind") Float wind, @JsonProperty(value = "temp") Float temp) {
        this.city = city;
        this.wind = wind;
        this.temp = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BestWeatherResponse that = (BestWeatherResponse) o;

        if (city != that.city) return false;
        if (!Objects.equals(wind, that.wind)) return false;
        return Objects.equals(temp, that.temp);
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (wind != null ? wind.hashCode() : 0);
        result = 31 * result + (temp != null ? temp.hashCode() : 0);
        return result;
    }
}



