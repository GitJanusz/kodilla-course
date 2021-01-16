package com.kodilla.good.patterns.challenges.task4;

public class FlightSearch {

    private FlightsData flightsData = new FlightsData();

    public void findFlightsTo() {
        System.out.println("Wszystkie loty do Gdańska: ");
        flightsData.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport() == "GDANSK")
                .forEach(System.out::println);
    }

    public void findFlightsFrom() {
        System.out.println("Wszystkie loty z Warszawy: ");
        flightsData.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport() == "WARSZAWA")
                .forEach(System.out::println);
    }

    public void findFlightVia() {
        System.out.println("Lot przez Katowice: ");
        flightsData.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport() == "GDANSK")
                .filter(flight -> flight.getArrivalAirport() == "KRAKOW")
                .forEach(System.out::println);
    }
}
