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
        for (Map.Entry<String, Double> average:
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(average.getKey(), average.getValue());
            sumTemperatures += average.getValue();
        }
        double result = sumTemperatures / resultMap.size();
        return result;
    }

    public double calculateMedianTemperature() {

        for (Map.Entry<String, Double> average:
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(average.getKey(), average.getValue());
        }
        List<Double> sortedKeys = new ArrayList<Double>(resultMap.size());
        sortedKeys.addAll(resultMap.values());
        Collections.sort(sortedKeys);

        return sortedKeys.get(2);
    }
}
