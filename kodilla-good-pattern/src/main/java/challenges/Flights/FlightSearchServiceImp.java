package challenges.Flights;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

final class FlightSearchServiceImpl implements FlightSearchService {
    private final FlightBoard flightBoard;

    Set<Flight> wyniki = new HashSet<>();
    List<Flight> wyniki2 = new ArrayList<>();
    ArrayList<Flight> wyniki3 = new ArrayList<>();

    FlightSearchServiceImpl(final FlightBoard flightBoard) {
        this.flightBoard = flightBoard;
    }

    @Override
    public Set<Flight> findAllFlightsToCity(final FlightSearchRequest flightSearchRequest) {
        final Airport arrivalAirport = flightSearchRequest.getAirport();
        return flightBoard.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Flight> findAllFlightsFromCity(final FlightSearchRequest flightSearchRequest) {
        final Airport departureAirport = flightSearchRequest.getAirport();
        return flightBoard.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .collect(Collectors.toSet());
    }
    public Set<Flight> findAllFlightsFromCityToCity(final FlightSearchRequest flightSearchRequest) {
        final Airport arrivalAirport = flightSearchRequest.getarriveAirport();
        System.out.println("lecimy do " + arrivalAirport);
        final Airport departureAirport = flightSearchRequest.getDepartureAirport();
        System.out.println("z  " + departureAirport);
        return flightBoard.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                /** .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now())) **/
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                /** .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now())) **/
                .collect(Collectors.toSet());

    }

    public ArrayList<Flight> findAllFlightsFromCityToCityThroughCity(final FlightSearchRequest flightSearchRequest) {
        final Airport arrivalAirport = flightSearchRequest.getarriveAirport();
        System.out.println("lecimy do " + arrivalAirport);
        final Airport departureAirport = flightSearchRequest.getDepartureAirport();
        System.out.println(" z " + departureAirport);
        wyniki = flightBoard.getFlights();
        for(Flight lot: wyniki) {
            if (lot.getArrivalAirport().equals(flightSearchRequest.getarriveAirport()) || lot.getDepartureAirport().equals(flightSearchRequest.getDepartureAirport())) {
                wyniki2.add(lot);
            }
        }
        int i =0; int j=0;
        for( i=0;  i<wyniki2.size(); i++){
            for( j=0 ;  j<wyniki2.size(); j++) {
                if(wyniki2.get(i).getDepartureAirport().equals(wyniki2.get(j).getArrivalAirport())){
                   wyniki3.add(wyniki2.get(i));
                   wyniki3.add(wyniki2.get(j));
                }
            }


        }
        return wyniki3;

    }



    @Override
    public Set<Flight> findAllFlightsThroughCity(final FlightSearchRequest flightSearchRequest) {
        final Airport airport = flightSearchRequest.getAirport();

        final LocalDateTime minArrivalTime = flightBoard.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .map(Flight::getArrivalTime)
                .min(LocalDateTime::compareTo)
                .orElseGet(LocalDateTime::now);
        final LocalDateTime maxDepartureTime = flightBoard.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .map(Flight::getArrivalTime)
                .max(LocalDateTime::compareTo)
                .orElseGet(LocalDateTime::now);

        final Set<Flight> flightsToCity = flightBoard.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .filter(flight -> flight.getArrivalTime().isBefore(maxDepartureTime))
                .collect(Collectors.toSet());
        final Set<Flight> flightsFromCity = flightBoard.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .filter(flight -> flight.getDepartureTime().isAfter(LocalDateTime.now()))
                .filter(flight -> flight.getDepartureTime().isAfter(minArrivalTime))
                .collect(Collectors.toSet());

        flightsToCity.addAll(flightsFromCity);
        return Collections.unmodifiableSet(flightsToCity);

    }
}
