package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightsList {
    private Set<Flight> flightSet = new HashSet<>();

    public FlightsList() {
        flightSet.add(new Flight("Warsaw", "Berlin"));
        flightSet.add(new Flight("Berlin", "Warsaw"));
        flightSet.add(new Flight("Lodz", "London"));
        flightSet.add(new Flight("London", "Lodz"));
        flightSet.add(new Flight("Warsaw", "Moscow"));
        flightSet.add(new Flight("Moscow", "Warsaw"));
        flightSet.add(new Flight("Gdansk", "Madrid"));
        flightSet.add(new Flight("Madrid", "Gdansk"));
    }
    public Set<Flight> getFlightSet() {
        return new HashSet<>(flightSet);
    }
}
