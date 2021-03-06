package challenges.Flights;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class FlightBoardImpl implements FlightBoard {
     final Set<Flight> flights = new HashSet<>();

    public void addFlight(final Flight flight) {
        flights.add(flight);
    }

    public Set<Flight> getFlights() {
        return Collections.unmodifiableSet(flights);
    }
}
