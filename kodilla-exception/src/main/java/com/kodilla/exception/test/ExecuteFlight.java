package com.kodilla.exception.test;



public class ExecuteFlight {
    public static void main(String[] args) {

    FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Radom", "Moskwa"));

        } catch (RouteNotFoundException e) {
            System.out.println("Problem ze wskazanym mistem " + e.getMessage());
        } finally {
            System.out.println("Przeszukiwanie lotów zakończone");
        }

    }
}