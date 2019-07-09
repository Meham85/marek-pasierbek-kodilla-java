package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;


public class FlightFinder {


    private static Map<String, Boolean> arrivalsAirports = new HashMap<>();

    {

        arrivalsAirports.put("Radom", true);
        arrivalsAirports.put("Mińsk", true);
        arrivalsAirports.put("Świebodzice", true);
        arrivalsAirports.put("Sanok", false);
        arrivalsAirports.put("Lwów", false);
        arrivalsAirports.put("Moskwa", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (flight == null) {
            throw new IllegalArgumentException();
        }

        String arrival = flight.getArrivalAirport();
        boolean availability = arrivalsAirports.get(arrival);
        if ((!arrivalsAirports.containsKey(arrival)) ||availability == false  ) {
            throw new RouteNotFoundException(flight);
        }
        System.out.println("Lot do " + flight.getArrivalAirport() + " może być obsłuzony");
        return arrivalsAirports.get(arrival);
    }
}