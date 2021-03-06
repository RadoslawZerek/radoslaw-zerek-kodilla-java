package com.kodilla.good.patterns.challenges.flight;

import java.util.Set;
import java.util.stream.Collectors;

public class FindConnection {
    private FlightDeparture flightDeparture = new FlightDeparture();
    private FlightArrival flightArrival = new FlightArrival();

    public void findFlightConnection(Set<Flight> flightSet, String airportDeparture, String airportArrival) {
        Set<Flight> flightsDeparture = flightDeparture.findFlightDeparture(flightSet, airportDeparture);
        Set<Flight> flightsArrival = flightArrival.findFlightArrival(flightSet, airportArrival);

        for (Flight firstFlight : flightsDeparture) {
            for (Flight secondFlight : flightsArrival) {
                if (firstFlight.getArrival().equals(secondFlight.getDeparture())) {
                    System.out.println(firstFlight + "\n" + secondFlight);
                }
            }
        }
    }
}
