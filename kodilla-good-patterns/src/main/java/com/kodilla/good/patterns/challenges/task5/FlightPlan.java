package com.kodilla.good.patterns.challenges.task5;

import java.util.HashSet;
import java.util.Set;

public class FlightPlan {

    private Set<Flight> flightPlan = new HashSet<>();

    public FlightPlan() {
        flightPlan.add(new Flight("GDANSK","KRAKOW"));
        flightPlan.add(new Flight("GDANSK", "KATOWICE"));
        flightPlan.add(new Flight("KRAKOW", "GDANSK"));
        flightPlan.add(new Flight("KRAKOW", "WARSZAWA"));
        flightPlan.add(new Flight("KATOWICE", "GDANSK"));
        flightPlan.add(new Flight("KATOWICE", "WARSZAWA"));
        flightPlan.add(new Flight("WARSZAWA", "GDANSK"));
        flightPlan.add(new Flight("WARSZAWA", "KATOWICE"));
    }

    public Set<Flight> getFlightPlan() {
        return new HashSet<>(flightPlan);
    }
}
