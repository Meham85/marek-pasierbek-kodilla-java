package challenges.Flights;

import java.util.List;
import java.util.Set;

interface FlightSearchService {
    Set<Flight> findAllFlightsToCity(final FlightSearchRequest flightSearchRequest);
    Set<Flight> findAllFlightsFromCity(final FlightSearchRequest flightSearchRequest);
    Set<Flight> findAllFlightsThroughCity(final FlightSearchRequest flightSearchRequest);
    Set<Flight> findAllFlightsFromCityToCity(final FlightSearchRequest flightSearchRequest);
    List<Flight> findAllFlightsFromCityToCityThroughCity(final FlightSearchRequest flightSearchRequest);
}
