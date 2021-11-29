package com.example.WeatherApi.model;

public class Weather {
    private final double temperature;
    private final double humidity;
    private final double windSpeed;

    private Weather(double temperature, double humidity, double windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public static class WeatherBuilder {
        private double temperature;
        private double humidity;
        private double windSpeed;

        public WeatherBuilder setTemperature(double temperature) {
            this.temperature = temperature;
            return this;
        }

        public WeatherBuilder setHumidity(double humidity) {
            this.humidity = humidity;
            return this;
        }

        public WeatherBuilder setWindSpeed(double windSpeed) {
            this.windSpeed = windSpeed;
            return this;
        }

        public Weather createWeather() {
            return new Weather(temperature, humidity, windSpeed);
        }
    }
}
