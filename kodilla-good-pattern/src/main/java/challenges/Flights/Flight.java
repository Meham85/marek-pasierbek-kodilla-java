package challenges.Flights;

import java.time.LocalDateTime;

interface Flight {
    LocalDateTime getDepartureTime();
    LocalDateTime getArrivalTime();
    Airport getDepartureAirport();
    Airport getArrivalAirport();
}
