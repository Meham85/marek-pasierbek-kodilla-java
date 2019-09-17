package challenges.Flights;

final class FlightSearchRequest {
    static Airport airport;
   static Airport arriveAirport;
    static Airport departureAirport;


    /**private final Airport arriveAirport;
    private final Airport departureAirport; **/

    FlightSearchRequest(final Airport airport) {
        this.airport = airport;
    }
    FlightSearchRequest(final Airport arriveAirport ,final Airport departureAirport ) {
        this.arriveAirport = arriveAirport;
        this.departureAirport = departureAirport;
     }

    Airport getAirport() {
        return airport;
    }
}
