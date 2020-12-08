package com.kodilla.exception.test;

public class FlightSearchRunner {

    public static void main(String[] args) {

        FlightPlan flightPlan = new FlightPlan();
        Flight flight1 = new Flight("Tokyo Haneda Airport","O'Hare International Airport");
        Flight flight2 = new Flight("Charles de Gaulle Airport", "Barcelona–El Prat Airport");
        Flight flight3 = new Flight("Gdansk Airport", "Krakow Airport");

        try {
            flightPlan.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception " + e);
        }

        try {
            flightPlan.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception " + e);
        }

        try {
            flightPlan.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception " + e);
        }
    }
}
