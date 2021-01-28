package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightDatabase {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightCollection = new HashMap<>();

        flightCollection.put("Warsaw", true);
        flightCollection.put("Vancouver", false);
        flightCollection.put("Berlin", true);
        flightCollection.put("New York", true);
        flightCollection.put("London", true);
        flightCollection.put("Tokyo", false);
        flightCollection.put("Moscow", false);

        if (flightCollection.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight to: " + flight.getArrivalAirport() + " exist");
        } else {
            throw new RouteNotFoundException("Flight doesn't exist!");
        }
    }
}
