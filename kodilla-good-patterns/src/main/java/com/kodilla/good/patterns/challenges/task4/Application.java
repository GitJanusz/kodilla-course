package com.kodilla.good.patterns.challenges.task4;

public class Application {

    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        flightSearch.findFlightsTo();
        flightSearch.findFlightsFrom();
        flightSearch.findFlightVia();
    }
}
