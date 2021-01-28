package com.kodilla.exception.test;

public class FlightApp {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        Flight flight = new Flight("Warsaw", "Mexico City");

        Flight anotherFlight = new Flight("Berlin", "New York");

        try {
            flightDatabase.findFlight(flight);
            flightDatabase.findFlight(anotherFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight doesn't exist");
        }
    }
}
