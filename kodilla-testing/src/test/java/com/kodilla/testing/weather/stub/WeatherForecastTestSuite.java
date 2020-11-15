package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WatherForecast watherForecast = new WatherForecast(temperatures);

        //When
        int quantityOfSensors = watherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}
