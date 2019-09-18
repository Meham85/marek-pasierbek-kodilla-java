package challenges.Flights;

final class FlightSearchRequest {
    Airport airport;
    Airport arriveAirport;
    Airport departureAirport;


    /**private final Airport arriveAirport;
    private final Airport departureAirport; **/

    /** FlightSearchRequest(Airport airport) {
        this.airport = airport;
    } **/
    FlightSearchRequest(  Airport departureAirport , Airport arriveAirport ) {
        this.arriveAirport = arriveAirport;
        this.departureAirport = departureAirport;
     }

    Airport getAirport() {
        return airport;
    }
    Airport getarriveAirport() {
        return arriveAirport;
    }
    Airport getDepartureAirport() {
        return departureAirport;
    }
}
