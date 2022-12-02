package com.lach.weatherApp.WeatherbitObject;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.json.bind.annotation.JsonbProperty;

import java.util.List;
import java.util.Objects;

public class WeatherbitResponse {
    @JsonbProperty("city_name")
    private String cityName;                  //city_name: Nearest city name
    @JsonbProperty("country_code")
    private String countryCode;               //country_code: Country abbreviation
    @JsonbProperty("data")
    private List<WeatherbitResponseDetail> weatherbitResponseDetail;    //data: weather detail for day
    @JsonbProperty("lat")
    private Float lat;                        //lat: Latitude (Degrees)
    @JsonbProperty("lon")
    private Float lon;                        //lon: Longitude (Degrees)
    @JsonbProperty("state_code")
    private String stateCode;                 //state_code: State abbreviation/code
    @JsonbProperty("timezone")
    private String timeZone;                  //timezone: Local IANA Timezone

    public WeatherbitResponse() {
    }

    @JsonCreator
    public WeatherbitResponse(@JsonProperty(value = "city_name") String cityName, @JsonProperty(value = "country_code") String countryCode,
                              @JsonProperty(value = "data") List<WeatherbitResponseDetail> weatherbitResponseDetail,
                              @JsonProperty(value = "lat") Float lat, @JsonProperty(value = "lon") Float lon,
                              @JsonProperty(value = "state_code") String stateCode, @JsonProperty(value = "timezone") String timeZone) {
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.weatherbitResponseDetail = weatherbitResponseDetail;
        this.lat = lat;
        this.lon = lon;
        this.stateCode = stateCode;
        this.timeZone = timeZone;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<WeatherbitResponseDetail> getWeatherbitResponseDetail() {
        return weatherbitResponseDetail;
    }

    public void setWeatherbitResponseDetail(List<WeatherbitResponseDetail> weatherbitResponseDetail) {
        this.weatherbitResponseDetail = weatherbitResponseDetail;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "WeatherbitResponse{" +
                "cityName='" + cityName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", weatherbitResponseDetail=" + weatherbitResponseDetail +
                ", lat=" + lat +
                ", lon=" + lon +
                ", stateCode='" + stateCode + '\'' +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherbitResponse that = (WeatherbitResponse) o;

        if (!Objects.equals(cityName, that.cityName)) return false;
        if (!Objects.equals(countryCode, that.countryCode)) return false;
        if (!Objects.equals(weatherbitResponseDetail, that.weatherbitResponseDetail))
            return false;
        if (!Objects.equals(lat, that.lat)) return false;
        if (!Objects.equals(lon, that.lon)) return false;
        if (!Objects.equals(stateCode, that.stateCode)) return false;
        return Objects.equals(timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        int result = cityName != null ? cityName.hashCode() : 0;
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (weatherbitResponseDetail != null ? weatherbitResponseDetail.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        result = 31 * result + (stateCode != null ? stateCode.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        return result;
    }
}
