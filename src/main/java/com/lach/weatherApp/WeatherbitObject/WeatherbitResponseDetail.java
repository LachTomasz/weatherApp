package com.lach.weatherApp.WeatherbitObject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;

import java.time.LocalDate;
import java.util.Objects;

public class WeatherbitResponseDetail {
    @JsonbProperty("datetime")
    private LocalDate datetime;                                  //datetime:[DEPRECATED] Forecast valid date (YYYY-MM-DD)
   @JsonbProperty("temp")
    private Float temp;                                       //temp: Average Temperature (default Celsius)
   @JsonbProperty("wind_spd")
    private Float windSpd;                                    //wind_spd: Wind speed (Default m/s)

    public WeatherbitResponseDetail() {
    }

    @JsonCreator
    public WeatherbitResponseDetail(@JsonProperty(value = "datetime") LocalDate datetime, @JsonProperty(value = "temp") Float temp,
                                    @JsonProperty(value = "wind_spd") Float windSpd) {
        this.datetime = datetime;
        this.temp = temp;
        this.windSpd = windSpd;
    }

    public LocalDate getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDate datetime) {
        this.datetime = datetime;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(Float windSpd) {
        this.windSpd = windSpd;
    }

    @Override
    public String toString() {
        return "WeatherbitResponseDetail{" +
                "datetime='" + datetime + '\'' +
                ", temp=" + temp +
                ", windSpd=" + windSpd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherbitResponseDetail that = (WeatherbitResponseDetail) o;

        if (!Objects.equals(datetime, that.datetime)) return false;
        if (!Objects.equals(temp, that.temp)) return false;
        return Objects.equals(windSpd, that.windSpd);
    }

    @Override
    public int hashCode() {
        int result = datetime != null ? datetime.hashCode() : 0;
        result = 31 * result + (temp != null ? temp.hashCode() : 0);
        result = 31 * result + (windSpd != null ? windSpd.hashCode() : 0);
        return result;
    }
}
