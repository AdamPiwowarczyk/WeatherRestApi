package com.example.WeatherApi.controller;

import com.example.WeatherApi.model.OpenWeatherMainDto;
import com.example.WeatherApi.model.OpenWeatherWindDto;
import com.example.WeatherApi.model.Weather;
import com.example.WeatherApi.model.OpenWeatherWeatherDto;
import com.example.WeatherApi.sercvice.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public ResponseEntity<Weather> getWeather(@PathVariable String city) {
        OpenWeatherWeatherDto openWeatherWeather = weatherService.getWeather(city);

        OpenWeatherMainDto main = openWeatherWeather.getMain();
        OpenWeatherWindDto wind = openWeatherWeather.getWind();
        Weather weather = new Weather.WeatherBuilder()
                .setTemperature(main.getTemp())
                .setHumidity(main.getHumidity())
                .setWindSpeed(wind.getSpeed())
                .createWeather();
        return ResponseEntity.ok(weather);
    }
}
