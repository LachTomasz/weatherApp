package com.lach.weatherApp.WeatherbitObject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.json.bind.annotation.JsonbProperty;

import java.util.List;
import java.util.Objects;

public class WeatherbitResponse {
    @JsonbProperty("city_name")
    private String cityName;                  //city_name: Nearest city name
    @JsonbProperty("data")
    private List<WeatherbitResponseDetail> weatherbitResponseDetail;    //data: weather detail for day

    public WeatherbitResponse() {
    }

    @JsonCreator
    public WeatherbitResponse(@JsonProperty(value = "city_name") String cityName,
                              @JsonProperty(value = "data") List<WeatherbitResponseDetail> weatherbitResponseDetail) {
        this.cityName = cityName;
        this.weatherbitResponseDetail = weatherbitResponseDetail;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<WeatherbitResponseDetail> getWeatherbitResponseDetail() {
        return weatherbitResponseDetail;
    }

    public void setWeatherbitResponseDetail(List<WeatherbitResponseDetail> weatherbitResponseDetail) {
        this.weatherbitResponseDetail = weatherbitResponseDetail;
    }

    @Override
    public String toString() {
        return "WeatherbitResponse{" +
                "cityName='" + cityName + '\'' +
                ", weatherbitResponseDetail=" + weatherbitResponseDetail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherbitResponse that = (WeatherbitResponse) o;

        if (!Objects.equals(cityName, that.cityName)) return false;
        return Objects.equals(weatherbitResponseDetail, that.weatherbitResponseDetail);
    }

    @Override
    public int hashCode() {
        int result = cityName != null ? cityName.hashCode() : 0;
        result = 31 * result + (weatherbitResponseDetail != null ? weatherbitResponseDetail.hashCode() : 0);
        return result;
    }
}
