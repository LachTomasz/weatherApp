package com.lach.weatherApp.ApiWeather;

import com.lach.weatherApp.City;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponseDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WeatherApiStub implements WeatherClient {

    private static Map<City, WeatherbitResponse> RESPONSE_MAP = Map.of(
            City.Jastarnia, new WeatherbitResponse("Jastarnia", List.of(
                    new WeatherbitResponseDetail("2022-12-18", -0.9F, 6F),
                    new WeatherbitResponseDetail("2022-12-19", -2.3F, 7.1F),
                    new WeatherbitResponseDetail("2022-12-20", 3.5F, 4.9F),
                    new WeatherbitResponseDetail("2022-12-21", 4.6F, 4.5F),
                    new WeatherbitResponseDetail("2022-12-22", 5.3F, 6.1F),
                    new WeatherbitResponseDetail("2022-12-23", 5.5F, 4.9F),
                    new WeatherbitResponseDetail("2022-12-24", 6.3F, 5.2F),
                    new WeatherbitResponseDetail("2022-12-25", 4.7F, 5.3F),
                    new WeatherbitResponseDetail("2022-12-26", 3.7F, 5.0F),
                    new WeatherbitResponseDetail("2022-12-27", 3.6F, 4.9F),
                    new WeatherbitResponseDetail("2022-12-28", 3.8F, 5.3F),
                    new WeatherbitResponseDetail("2022-12-29", 1.2F, 5.2F),
                    new WeatherbitResponseDetail("2022-12-30", 1.6F, 6.3F),
                    new WeatherbitResponseDetail("2022-12-31", 5.2F, 10.0F),
                    new WeatherbitResponseDetail("2023-01-01", 3.5F, 7.3F),
                    new WeatherbitResponseDetail("2023-01-02", 4.2F, 8.0F)
            )),

            City.Bridgetown, new WeatherbitResponse("Bridgetown", List.of(
                    new WeatherbitResponseDetail("2022-12-18", 26.5F, 7.9F),
                    new WeatherbitResponseDetail("2022-12-19", 26.4F, 6.0F),
                    new WeatherbitResponseDetail("2022-12-20", 26.6F, 5.6F),
                    new WeatherbitResponseDetail("2022-12-21", 26.6F, 5.8F),
                    new WeatherbitResponseDetail("2022-12-22", 26.7F, 6.3F),
                    new WeatherbitResponseDetail("2022-12-23", 26.3F, 5.9F),
                    new WeatherbitResponseDetail("2022-12-24", 26.1F, 5.8F),
                    new WeatherbitResponseDetail("2022-12-25", 26.0F, 5.6F),
                    new WeatherbitResponseDetail("2022-12-26", 26.1F, 5.2F),
                    new WeatherbitResponseDetail("2022-12-27", 26.2F, 5.5F),
                    new WeatherbitResponseDetail("2022-12-28", 25.7F, 5.7F),
                    new WeatherbitResponseDetail("2022-12-29", 25.9F, 8.8F),
                    new WeatherbitResponseDetail("2022-12-30", 25.8F, 8.4F),
                    new WeatherbitResponseDetail("2022-12-31", 25.6F, 8.6F),
                    new WeatherbitResponseDetail("2023-01-01", 26.0F, 8.5F),
                    new WeatherbitResponseDetail("2023-01-02", 25.8F, 7.5F)
            )),
            City.Fortaleza, new WeatherbitResponse("Fortaleza", List.of(
                    new WeatherbitResponseDetail("2022-12-18", 29.6F, 3.9F),
                    new WeatherbitResponseDetail("2022-12-19", 29.8F, 1.6F),
                    new WeatherbitResponseDetail("2022-12-20", 29.4F, 1.6F),
                    new WeatherbitResponseDetail("2022-12-21", 29.1F, 1.7F),
                    new WeatherbitResponseDetail("2022-12-22", 28.7F, 1.6F),
                    new WeatherbitResponseDetail("2022-12-23", 28.4F, 1.3F),
                    new WeatherbitResponseDetail("2022-12-24", 28.3F, 1.4F),
                    new WeatherbitResponseDetail("2022-12-25", 28.5F, 1.4F),
                    new WeatherbitResponseDetail("2022-12-26", 28.9F, 1.6F),
                    new WeatherbitResponseDetail("2022-12-27", 29.1F, 1.6F),
                    new WeatherbitResponseDetail("2022-12-28", 27.8F, 1.8F),
                    new WeatherbitResponseDetail("2022-12-29", 27.0F, 6.0F),
                    new WeatherbitResponseDetail("2022-12-30", 27.6F, 6.9F),
                    new WeatherbitResponseDetail("2022-12-31", 27.2F, 6.5F),
                    new WeatherbitResponseDetail("2023-01-01", 27.5F, 6.2F),
                    new WeatherbitResponseDetail("2023-01-02", 27.6F, 6.4F)

            )),
            City.Pissouri, new WeatherbitResponse("Pissouri", List.of(
                    new WeatherbitResponseDetail("2022-12-18", 18.0F, 1.3F),
                    new WeatherbitResponseDetail("2022-12-19", 16.3F, 1.9F),
                    new WeatherbitResponseDetail("2022-12-20", 15.5F, 2.0F),
                    new WeatherbitResponseDetail("2022-12-21", 12.4F, 1.7F),
                    new WeatherbitResponseDetail("2022-12-22", 11.6F, 2.5F),
                    new WeatherbitResponseDetail("2022-12-23", 11.7F, 2.8F),
                    new WeatherbitResponseDetail("2022-12-24", 12.2F, 3.3F),
                    new WeatherbitResponseDetail("2022-12-25", 11.9F, 2.9F),
                    new WeatherbitResponseDetail("2022-12-26", 12.3F, 4.1F),
                    new WeatherbitResponseDetail("2022-12-27", 12.2F, 2.2F),
                    new WeatherbitResponseDetail("2022-12-28", 10.6F, 1.6F),
                    new WeatherbitResponseDetail("2022-12-29", 12.3F, 4.0F),
                    new WeatherbitResponseDetail("2022-12-30", 13.1F, 2.5F),
                    new WeatherbitResponseDetail("2022-12-31", 12.3F, 1.3F),
                    new WeatherbitResponseDetail("2023-01-01", 12.2F, 1.0F),
                    new WeatherbitResponseDetail("2023-01-02", 10.8F, 3.1F)

            )),
            City.Le_Morne, new WeatherbitResponse("Le_Morne", List.of(
                    new WeatherbitResponseDetail("2022-12-18", 25.8F, 6.6F),
                    new WeatherbitResponseDetail("2022-12-19", 26.2F, 5.6F),
                    new WeatherbitResponseDetail("2022-12-20", 26.5F, 5.4F),
                    new WeatherbitResponseDetail("2022-12-21", 26.5F, 5.6F),
                    new WeatherbitResponseDetail("2022-12-22", 26.6F, 5.4F),
                    new WeatherbitResponseDetail("2022-12-23", 26.1F, 5.0F),
                    new WeatherbitResponseDetail("2022-12-24", 26.3F, 5.3F),
                    new WeatherbitResponseDetail("2022-12-25", 26.1F, 5.5F),
                    new WeatherbitResponseDetail("2022-12-26", 25.8F, 5.4F),
                    new WeatherbitResponseDetail("2022-12-27", 25.7F, 5.2F),
                    new WeatherbitResponseDetail("2022-12-28", 26.0F, 5.1F),
                    new WeatherbitResponseDetail("2022-12-29", 24.2F, 6.7F),
                    new WeatherbitResponseDetail("2022-12-30", 24.2F, 5.5F),
                    new WeatherbitResponseDetail("2022-12-31", 24.3F, 6.2F),
                    new WeatherbitResponseDetail("2023-01-01", 24.3F, 6.6F),
                    new WeatherbitResponseDetail("2023-01-02", 24.4F, 5.2F)

            ))
    );
    @Override
    public WeatherbitResponse weatherbitResponse(City city) {
        return RESPONSE_MAP.get(city);
    }
}
