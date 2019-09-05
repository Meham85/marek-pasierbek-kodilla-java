package challenges.Flights;

import java.time.LocalDateTime;

final class Application {
    public static void main(final String[] args) {
        final Airport jfkAirport = new Airport("JFK", "J.F Kennedy Airport");
        final Airport svoAirport = new Airport("SVO", "Russian Szeremietiewo Airport");
        final Airport sydAirport = new Airport("SYD", "Sydney Airport");

        final Flight flightJFKtoSVO1 = new FlightImpl.Builder(1)
                .departureAirport(jfkAirport)
                .arrivalAirport(svoAirport)
                .departureTime(LocalDateTime.of(2019, 9, 12, 12, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 12, 14, 35))
                .build();
        final Flight flightSydToJfk2 = new FlightImpl.Builder(2)
                .departureAirport(sydAirport)
                .arrivalAirport(jfkAirport)
                .departureTime(LocalDateTime.of(2019, 9, 14, 12, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 14, 14, 35))
                .build();
        final Flight flightJfkToSyd3 = new FlightImpl.Builder(3)
                .departureAirport(jfkAirport)
                .arrivalAirport(sydAirport)
                .departureTime(LocalDateTime.of(2019, 9, 27, 23, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 28, 1, 35))
                .build();

        final Flight flightSvoToSyd4 = new FlightImpl.Builder(4)
                .departureAirport(svoAirport)
                .arrivalAirport(sydAirport)
                .departureTime(LocalDateTime.of(2019, 9, 14, 11, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 14, 13, 35))
                .build();
        final Flight flightSydToSvo5 = new FlightImpl.Builder(5)
                .departureAirport(sydAirport)
                .arrivalAirport(svoAirport)
                .departureTime(LocalDateTime.of(2019, 9, 14, 13, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 14, 15, 35))
                .build();
        final Flight flightSvoToJfk6 = new FlightImpl.Builder(6)
                .departureAirport(svoAirport)
                .arrivalAirport(jfkAirport)
                .departureTime(LocalDateTime.of(2019, 9, 14, 17, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 14, 19, 35))
                .build();

        final FlightBoard flightBoard = new FlightBoardImpl();
        flightBoard.addFlight(flightJFKtoSVO1);
        flightBoard.addFlight(flightSydToJfk2);
        flightBoard.addFlight(flightJfkToSyd3);
        flightBoard.addFlight(flightSvoToSyd4);
        flightBoard.addFlight(flightSydToSvo5);
        flightBoard.addFlight(flightSvoToJfk6);

        final FlightSearchService flightSearchService = new FlightSearchServiceImpl(flightBoard);
        System.out.printf("*** Lot z %s ***%n", jfkAirport);
        flightSearchService.findAllFlightsFromCity(new FlightSearchRequest(jfkAirport)).forEach(System.out::println);
        System.out.printf("*** Lot do %s ***%n", svoAirport);
        flightSearchService.findAllFlightsToCity(new FlightSearchRequest(svoAirport)).forEach(System.out::println);
        System.out.printf("*** Lot przez %s ***%n", null);
        flightSearchService.findAllFlightsThroughCity(new FlightSearchRequest(sydAirport)).forEach(System.out::println);
    }
}

