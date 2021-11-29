package com.example.WeatherApi.sercvice;

import com.example.WeatherApi.httpClient.WeatherServiceClient;
import com.example.WeatherApi.model.OpenWeatherWeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Autowired
    private WeatherServiceClient weatherServiceClient;

    public OpenWeatherWeatherDto getWeather(String city) {
        return weatherServiceClient.getWeatherForCity("Katowice");
    }
}
