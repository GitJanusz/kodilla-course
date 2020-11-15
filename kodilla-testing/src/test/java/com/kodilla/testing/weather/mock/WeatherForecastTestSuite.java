package com.kodilla.testing.weather.mock;


import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock; //zastępuje Temperatures temperaturesMock = mock(Temperatures.class); w @Test.

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WatherForecast watherForecast = new WatherForecast(temperaturesMock);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap); //zwracanie wartości kiedy poprosimy o to mocka

        //When
        int quantityOfSensors = watherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }


}
