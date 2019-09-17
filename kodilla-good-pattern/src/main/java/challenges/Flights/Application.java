package challenges.Flights;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

final class Application {
    public static void main(final String[] args) {
        final Airport jfkAirport = new Airport("JFK", "J.F Kennedy Airport");
        final Airport svoAirport = new Airport("SVO", "Russian Szeremietiewo Airport");
        final Airport sydAirport = new Airport("SYD", "Sydney Airport");
        final Airport warAirport = new Airport("WAR" , "chopin Airport");
        final Airport lonAirport = new Airport("LON" , "London Airport");

        final Flight flightJfkToWar9 = new FlightImpl.Builder(9)
                .departureAirport(jfkAirport)
                .arrivalAirport(warAirport)
                .departureTime(LocalDateTime.of(2019, 9, 19, 1, 5))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 4, 5))
                .build();
        final Flight flightWarToLon10 = new FlightImpl.Builder(10)
                .departureAirport(warAirport)
                .arrivalAirport(lonAirport)
                .departureTime(LocalDateTime.of(2019, 9, 19, 5, 5))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 6, 5))
                .build();
        final Flight flightWarToSyd7 = new FlightImpl.Builder(7)
                .departureAirport(warAirport)
                .arrivalAirport(sydAirport)
                .departureTime(LocalDateTime.of(2019, 9, 19, 17, 23))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 14, 35))
                .build();
        final Flight flightWarToJfk8 = new FlightImpl.Builder(8)
                .departureAirport(warAirport)
                .arrivalAirport(jfkAirport)
                .departureTime(LocalDateTime.of(2019, 9, 19, 17, 23))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 14, 35))
                .build();

        final Flight flightJFKtoSVO1 = new FlightImpl.Builder(1)
                .departureAirport(jfkAirport)
                .arrivalAirport(svoAirport)
                .departureTime(LocalDateTime.of(2019, 9, 19, 12, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 14, 35))
                .build();
        final Flight flightSydToJfk2 = new FlightImpl.Builder(2)
                .departureAirport(sydAirport)
                .arrivalAirport(jfkAirport)
                .departureTime(LocalDateTime.of(2019, 9, 19, 12, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 14, 35))
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
                .departureTime(LocalDateTime.of(2019, 9, 19, 11, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 13, 35))
                .build();
        final Flight flightSydToSvo5 = new FlightImpl.Builder(5)
                .departureAirport(sydAirport)
                .arrivalAirport(svoAirport)
                .departureTime(LocalDateTime.of(2019, 9, 19, 13, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 15, 35))
                .build();
        final Flight flightSvoToJfk6 = new FlightImpl.Builder(6)
                .departureAirport(svoAirport)
                .arrivalAirport(jfkAirport)
                .departureTime(LocalDateTime.of(2019, 9, 19, 17, 25))
                .arrivalTime(LocalDateTime.of(2019, 9, 19, 19, 35))
                .build();

        final FlightBoard flightBoard = new FlightBoardImpl();
        flightBoard.addFlight(flightJFKtoSVO1);
        flightBoard.addFlight(flightSydToJfk2);
        flightBoard.addFlight(flightJfkToSyd3);
        flightBoard.addFlight(flightSvoToSyd4);
        flightBoard.addFlight(flightSydToSvo5);
        flightBoard.addFlight(flightSvoToJfk6);
        flightBoard.addFlight(flightWarToSyd7);
        flightBoard.addFlight(flightWarToJfk8);
        flightBoard.addFlight(flightJfkToWar9);
        flightBoard.addFlight(flightWarToLon10);

        final FlightSearchService flightSearchService = new FlightSearchServiceImpl(flightBoard);
        System.out.printf("*** Lot z %s ***%n", jfkAirport);
        flightSearchService.findAllFlightsFromCity(new FlightSearchRequest(jfkAirport)).forEach(System.out::println);
        System.out.printf("*** Lot do %s ***%n", lonAirport);
        flightSearchService.findAllFlightsToCity(new FlightSearchRequest(lonAirport)).forEach(System.out::println);
        System.out.printf("*** Lot przez %s ***%n", warAirport);
        flightSearchService.findAllFlightsThroughCity(new FlightSearchRequest(warAirport)).forEach(System.out::println);

        System.out.printf("*** Lot z %s ***%n", jfkAirport, " do %s ***%n" , lonAirport);
        flightSearchService.findAllFlightsFromCityToCity(new FlightSearchRequest(jfkAirport, lonAirport)).forEach(System.out::println);

    }
}

