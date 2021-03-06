package com.kodilla.good.patterns.challenges.flight;

import java.util.Set;

public class App {
    public static void main(String[] args) {
        FlightsList flightsList = new FlightsList();
        Set<Flight> list = flightsList.getFlightSet();
        FlightDeparture flightDeparture = new FlightDeparture();
        FlightArrival flightArrival = new FlightArrival();
        FindConnection findConnection = new FindConnection();

        System.out.println("List of all flights from Warsaw: ");
        System.out.println(flightDeparture.findFlightDeparture(list, "Warsaw"));

        System.out.println("List of all flights to Berlin: ");
        System.out.println(flightArrival.findFlightArrival(list, "Berlin"));

        System.out.println("List of all connecting flights from Berlin to London: ");
        findConnection.findFlightConnection(list, "Berlin", "London");
    }
}
