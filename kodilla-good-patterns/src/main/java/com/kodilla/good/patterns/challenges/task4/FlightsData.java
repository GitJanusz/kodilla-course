package com.kodilla.good.patterns.challenges.task4;

import java.util.*;

public class FlightsData {

    private List<Flight> flights = new ArrayList<>();

    public FlightsData() {
        flights.add(new Flight("GDANSK","KRAKOW"));
        flights.add(new Flight("GDANSK", "KATOWICE"));
        flights.add(new Flight("GDANSK", "WARSZAWA"));
        flights.add(new Flight("KRAKOW", "GDANSK"));
        flights.add(new Flight("KRAKOW", "WARSZAWA"));
        flights.add(new Flight("KRAKOW", "KATOWICE"));
        flights.add(new Flight("KATOWICE", "GDANSK"));
        flights.add(new Flight("KATOWICE", "WARSZAWA"));
        flights.add(new Flight("KATOWICE", "KRAKOW"));
        flights.add(new Flight("WARSZAWA", "GDANSK"));
        flights.add(new Flight("WARSZAWA", "KATOWICE"));
        flights.add(new Flight("WARSZAWA", "KRAKOW"));
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }
}
