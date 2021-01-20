package com.kodilla.good.patterns.challenges.task5;

import java.util.Set;
import java.util.stream.Collectors;

public class FindFlight {

    public void findFlightsFrom(Set<Flight> flightPlan, String airportName) {
        System.out.println("Lista lotów z " + airportName + ":");
        flightPlan.stream()
                .filter(flight -> flight.getDepartureAirport().equals(airportName))
                .forEach(System.out::println);
    }

    public void findFlightsTo(Set<Flight> flightPlan, String airportName) {
        System.out.println("Lista lotów do " + airportName + ":");
        flightPlan.stream()
                .filter(flight -> flight.getArrivalAirport().equals(airportName))
                .forEach(System.out::println);
    }

    public void findFlightsFromTo(Set<Flight> flightPlan, String airportName1, String airportName2) {
        Set<Flight> departure = flightPlan.stream()
                .filter(flight -> flight.getDepartureAirport().equals(airportName1))
                .collect(Collectors.toSet());

        Set<Flight> arrival = flightPlan.stream()
                .filter(flight -> flight.getArrivalAirport().equals(airportName2))
                .collect(Collectors.toSet());

        for(Flight flight1 : departure) {
            for(Flight flight2 : arrival) {
                if(flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    System.out.println("Lot z " + airportName1 + " do " + airportName2
                            + " z przesiadką w " + flight2.getDepartureAirport() + ":"
                            + "\n" + flight1 + "\n" + flight2);
                }
            }
        }
    }
}
