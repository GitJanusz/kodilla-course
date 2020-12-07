package com.kodilla.exception.test;

public class AirportSearchRunner {

    public static void main(String[] args) {

        FlightPlan flightPlan = new FlightPlan();
        Flight flight1 = new Flight("Tokyo Haneda Airport","O'Hare International Airport");
        Flight flight2 = new Flight("Barcelona–El Prat Airport", "Charles de Gaulle Airport");
        Flight flight3 = new Flight("Katowice Airport", "San Francisco International Airport");
        Flight flight4 = new Flight("Amsterdam Airport Schiphol", "Gdansk Airport");
        Flight flight5 = new Flight("Warsaw Airport", "Krakow Airport");

        try {
            flightPlan.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Exception " + e);
        }
    }
}
