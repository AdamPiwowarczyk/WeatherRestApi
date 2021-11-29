package com.example.WeatherApi.httpClient;

import com.example.WeatherApi.model.OpenWeatherWeatherDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherServiceClient {
    @Value("${url}")
    private String url;
    @Value("${apiKey}")
    private String apiKey;
    private static final RestTemplate restTemplate = new RestTemplate();

    public OpenWeatherWeatherDto getWeatherForCity(String city) {
        return restTemplate.getForObject(url, OpenWeatherWeatherDto.class, city, apiKey);
    }
}
