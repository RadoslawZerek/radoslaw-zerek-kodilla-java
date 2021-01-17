package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverage() {
        double averageTemperature = 0.0;
        for (Map.Entry<String,Double> temperature:temperatures.getTemperatures().entrySet()) {
            averageTemperature += temperature.getValue();
        }
        return averageTemperature/temperatures.getTemperatures().size();
    }

    public Double calculateMedian() {
        Collection<Double> tempsCollection = temperatures.getTemperatures().values();
        List<Double> tempsList = new ArrayList<>(tempsCollection);
        Collections.sort(tempsList);
        /*double*/
        int size = tempsList.size();
        int index = 0;
        index = size / 2;
        if (size % 2 == 0) {
            return (tempsList.get(index - 1) + tempsList.get(index)) / 2;
        } else {
            return tempsList.get(index);
        }
    }
}

