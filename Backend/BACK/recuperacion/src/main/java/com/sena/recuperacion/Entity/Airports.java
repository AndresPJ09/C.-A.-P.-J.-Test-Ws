package com.sena.recuperacion.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "airports")
public class Airports extends ABaseEntity {

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Countries country;

    @Column(name = "iata_code", length = 3, nullable = false)
    private String iataCode;

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
}
