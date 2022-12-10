package com.lach.weatherApp.config;

import com.lach.weatherApp.ApiWeather.ConnectionFactory;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ConnectionFactory connectionFactory(){
        return new ConnectionFactory();
    }

    @Bean
    public Jsonb jsonbBuilder(){
        return  JsonbBuilder.create();
    }

}
