package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightPlan {

    Map<String, Boolean> airport = new HashMap<>();

    public FlightPlan() {
        airport.put("Tokyo Haneda Airport", true);
        airport.put("London Heathrow Airport", true);
        airport.put("Tokio Haneda", true);
        airport.put("Amsterdam Airport Schiphol", true);
        airport.put("Charles de Gaulle Airport", true);
        airport.put("O'Hare International Airport", true);
        airport.put("San Francisco International Airport", false);
        airport.put("McCarran International Airport", false);
        airport.put("Barcelona–El Prat Airport", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (!airport.containsKey(flight.getDepartureAirport())
                && !airport.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Flight not found");
        } else if (!airport.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Change departure airport");
        } else if (!airport.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Change arrival airport");
        } else {
            System.out.println("Flight found!");
        }
    }
}
