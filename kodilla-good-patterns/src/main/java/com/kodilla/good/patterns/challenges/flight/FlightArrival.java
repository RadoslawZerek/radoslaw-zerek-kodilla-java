package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightArrival {
    Set<Flight> arrival = new HashSet<>();
    public Set findFlightArrival(Set<Flight> flightSet, String airport) {
        flightSet.stream().filter(n -> n.getArrival().equals(airport)).forEach(arrival::add);
        return arrival;
    }
    public Set<Flight> getArrival() {
        return arrival;
    }
}
