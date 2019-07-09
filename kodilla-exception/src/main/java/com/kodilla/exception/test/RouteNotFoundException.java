
package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(Flight flight) {
        super(flight + " lot do tego lotniska nie może być obsłużony");
    }
}
