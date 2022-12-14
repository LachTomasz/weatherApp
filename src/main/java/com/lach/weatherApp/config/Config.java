package com.lach.weatherApp.config;

import com.lach.weatherApp.ApiWeather.ConnectionFactory;
import com.lach.weatherApp.ApiWeather.WeatherApi;
import com.lach.weatherApp.ApiWeather.WeatherApiStub;
import com.lach.weatherApp.ApiWeather.WeatherClient;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    public ConnectionFactory connectionFactory() {
        return new ConnectionFactory();
    }

    @Bean
    public Jsonb jsonbBuilder() {
        return JsonbBuilder.create();
    }

    @Bean
    @Profile(value = "prod")
    public WeatherClient weatherApi(ConnectionFactory connectionFactory, Jsonb jsonb) {
        return new WeatherApi(connectionFactory, jsonb);
    }

    @Bean
    @Profile(value = "test")
    public WeatherClient weatherApiStub(ConnectionFactory connectionFactory, Jsonb jsonb) {
        return new WeatherApiStub();
    }

}
