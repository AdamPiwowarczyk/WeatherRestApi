package com.example.WeatherApi.model;

public class OpenWeatherWeatherDto {
    private OpenWeatherMainDto main;
    private OpenWeatherWindDto wind;

    public OpenWeatherMainDto getMain() {
        return main;
    }

    public OpenWeatherWindDto getWind() {
        return wind;
    }
}
