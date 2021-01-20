package com.kodilla.good.patterns.challenges.task5;

import java.util.Set;

public class Application {
    public static void main(String[] args) {

        FlightPlan flightPlan = new FlightPlan();
        Set<Flight> flightList = flightPlan.getFlightPlan();
        FindFlight findFlight = new FindFlight();

        findFlight.findFlightsFrom(flightList, "WARSZAWA");
        findFlight.findFlightsTo(flightList, "GDANSK");
        findFlight.findFlightsFromTo(flightList, "GDANSK", "WARSZAWA");
    }
}
