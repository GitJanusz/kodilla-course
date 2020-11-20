package com.kodilla.testing.weather.stub;

import java.util.*;

public class WatherForecast {

    private Temperatures temperatures;
    Map<String, Double> resultMap = new HashMap<>();

    public WatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {

        for (Map.Entry<String, Double> temperature:
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {

        double sumTemperatures = 0;
        for (Map.Entry<String, Double> temperature:
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue());
            sumTemperatures += temperature.getValue();
        }
        double result = sumTemperatures / resultMap.size();
        return result;
    }

    public double calculateMedianTemperature() {

        double median;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue());
        }
        List<Double> sortedValues = new ArrayList<>(resultMap.size());
        sortedValues.addAll(resultMap.values());
        Collections.sort(sortedValues);
        if (sortedValues.size() % 2 == 0) {
            median = (sortedValues.get(sortedValues.size() / 2) + sortedValues.get(sortedValues.size() / 2 - 1)) / 2;
        } else {
            median = sortedValues.get(sortedValues.size() / 2);
        }
        return median;
    }
}
