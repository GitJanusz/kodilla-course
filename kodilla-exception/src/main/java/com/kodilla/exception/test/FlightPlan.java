package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightPlan {

    Map<String, Boolean> airport = new HashMap<>();

    public void addFlight(Flight flight) {
        airport.put(flight.getArrivalAirport(), true);
        airport.put(flight.getDepartureAirport(), true);
    }

    public void findFlight(String airportSearch) throws RouteNotFoundException {

        if (!airport.containsKey(airportSearch)) {
            throw new RouteNotFoundException("Airport not found \"" + airportSearch + "\"");
        } else {
            System.out.println("\"" + airportSearch + "\" airport is on the flights plan");
        }
    }
}
