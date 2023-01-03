package com.lach.weatherApp.ApiWeather;

import com.lach.weatherApp.City;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponseDetail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WeatherApiStub implements WeatherClient {

    private static Map<City, WeatherbitResponse> RESPONSE_MAP = Map.of(
            City.Jastarnia, new WeatherbitResponse("Jastarnia", List.of(
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-01"), -0.9F, 6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-02"), -2.3F, 7.1F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-03"), 3.5F, 4.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-04"), 4.6F, 4.5F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-05"), 5.3F, 6.1F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-06"), 5.5F, 4.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-07"), 6.3F, 5.2F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-08"), 4.7F, 5.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-09"), 3.7F, 5.0F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-10"), 3.6F, 4.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-11"), 3.8F, 5.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-12"), 1.2F, 5.2F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-13"), 1.6F, 6.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-14"), 5.2F, 10.0F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-15"), 3.5F, 7.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-16"), 4.2F, 8.0F)
            )),

            City.Bridgetown, new WeatherbitResponse("Bridgetown", List.of(
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-01"), 26.5F, 7.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-02"), 26.4F, 6.0F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-03"), 26.6F, 5.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-04"), 26.6F, 5.8F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-05"), 26.7F, 6.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-06"), 26.3F, 5.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-07"), 26.1F, 5.8F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-08"), 26.0F, 5.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-09"), 26.1F, 5.2F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-10"), 26.2F, 5.5F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-11"), 25.7F, 5.7F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-12"), 25.9F, 8.8F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-13"), 25.8F, 8.4F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-14"), 25.6F, 8.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-15"), 26.0F, 8.5F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-16"), 25.8F, 7.5F)
            )),
            City.Fortaleza, new WeatherbitResponse("Fortaleza", List.of(
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-01"), 29.6F, 3.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-02"), 29.8F, 1.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-03"), 29.4F, 1.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-04"), 29.1F, 1.7F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-05"), 28.7F, 1.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-06"), 28.4F, 1.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-07"), 28.3F, 1.4F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-08"), 28.5F, 1.4F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-09"), 28.9F, 1.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-10"), 29.1F, 1.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-11"), 27.8F, 1.8F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-12"), 27.0F, 6.0F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-13"), 27.6F, 6.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-14"), 27.2F, 6.5F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-15"), 27.5F, 6.2F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-16"), 27.6F, 6.4F)

            )),
            City.Pissouri, new WeatherbitResponse("Pissouri", List.of(
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-01"), 18.0F, 1.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-02"), 16.3F, 1.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-03"), 15.5F, 2.0F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-04"), 12.4F, 1.7F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-05"), 11.6F, 2.5F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-06"), 11.7F, 2.8F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-07"), 12.2F, 3.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-08"), 11.9F, 2.9F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-09"), 12.3F, 4.1F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-10"), 12.2F, 2.2F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-11"), 10.6F, 1.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-12"), 12.3F, 4.0F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-13"), 13.1F, 2.5F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-14"), 12.3F, 1.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-15"), 12.2F, 1.0F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-16"), 10.8F, 3.1F)

            )),
            City.Le_Morne, new WeatherbitResponse("Le_Morne", List.of(
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-01"), 25.8F, 6.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-02"), 26.2F, 5.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-03"), 26.5F, 5.4F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-04"), 26.5F, 5.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-05"), 26.6F, 5.4F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-06"), 26.1F, 5.0F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-07"), 26.3F, 5.3F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-08"), 26.1F, 5.5F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-09"), 25.8F, 5.4F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-10"), 25.7F, 5.2F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-11"), 26.0F, 5.1F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-12"), 24.2F, 6.7F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-13"), 24.2F, 5.5F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-14"), 24.3F, 6.2F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-15"), 24.3F, 6.6F),
                    new WeatherbitResponseDetail(LocalDate.parse("2023-01-16"), 24.4F, 5.2F)

            ))
    );
    @Override
    public WeatherbitResponse weatherbitResponse(City city) {
        return RESPONSE_MAP.get(city);
    }
}
