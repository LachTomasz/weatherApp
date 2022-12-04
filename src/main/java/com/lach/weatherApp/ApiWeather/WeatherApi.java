package com.lach.weatherApp.ApiWeather;

import com.lach.weatherApp.City;
import com.lach.weatherApp.WeatherbitObject.WeatherbitResponse;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;


public class WeatherApi {

    private static final String API_URL_TEMPLATE = "http://api.weatherbit.io/v2.0/forecast/daily?&city=";
    private static final String API_KEY = "3a592d44641446cd87518392b3497ebb";

    private final ConnectionFactory connectionFactory;
    private final Jsonb jsonb;

    public WeatherApi() {
        this(new ConnectionFactory(), JsonbBuilder.create());
    }

    public WeatherApi(ConnectionFactory connectionFactory, Jsonb jsonb) {
        this.connectionFactory = connectionFactory;
        this.jsonb = jsonb;
    }

    public WeatherbitResponse weatherbitResponse(City city) {
        String requestUrl = API_URL_TEMPLATE + city.name() + "&key=" + API_KEY;
        WeatherbitResponse weatherbitResponse;
        try (HttpConnection connection = connectionFactory.build(requestUrl)) {
            String response = connection.response();
            weatherbitResponse = jsonb.fromJson(response, WeatherbitResponse.class);
        }
        return weatherbitResponse;
    }

}