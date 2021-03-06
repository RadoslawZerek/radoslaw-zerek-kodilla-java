package com.kodilla.good.patterns.challenges.flight;

import java.util.HashSet;
import java.util.Set;

public class FlightDeparture {
    Set<Flight> departure = new HashSet<>();
    public Set findFlightDeparture(Set<Flight> flightSet, String airport) {
        flightSet.stream().filter(n -> n.getDeparture().equals(airport)).forEach(departure::add);
        return departure;
    }
    public Set<Flight> getDeparture() {
        return departure;
    }
}
