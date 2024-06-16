package com.sena.recuperacion.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "routes")
public class Routes extends ABaseEntity {

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", nullable = false)
    private Airports departureAirport;

    @ManyToOne
    @JoinColumn(name = "destination_airport_id", nullable = false)
    private Airports destinationAirport;

    @Column(name = "distance", nullable = false)
    private int distance;

    @Column(name = "flight_time", nullable = false)
    private int flightTime;

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airports departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airports getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airports destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }
}
