package com.lach.weatherApp.ApiWeather;

public class ConnectionFactory {
    public HttpConnection build(String url) {
        return new HttpConnection(url);
    }
}
