package challenges.Flights;

final class FlightSearchRequest {
    private final Airport airport;

    FlightSearchRequest(final Airport airport) {
        this.airport = airport;
    }

    Airport getAirport() {
        return airport;
    }
}
