package com.kodilla.exception.test;

public class AirportSearchRunner {

    public static void main(String[] args) {

        FlightPlan flightPlan = new FlightPlan();
        flightPlan.addFlight(new Flight("Tokyo Haneda Airport","O'Hare International Airport"));
        flightPlan.addFlight(new Flight("London Heathrow Airport", "Charles de Gaulle Airport"));
        flightPlan.addFlight(new Flight("Tokio Haneda", "Amsterdam Airport Schiphol"));
        flightPlan.addFlight(new Flight("Istanbul Airport", "Frankfurt Airport"));

        try {
            flightPlan.findFlight("Istanbul Airport");
        } catch (RouteNotFoundException e) {
            System.out.println("Exception " + e);
        }
    }
}
