package com.sena.recuperacion.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "aircrafts")
public class Aircrafts extends ABaseEntity {

    @Column(name = "model", length = 50, nullable = false)
    private String model;

    @Column(name = "total_seats", nullable = false)
    private int totalSeats;

    @Column(name = "economy_seats", nullable = false)
    private int economySeats;

    @Column(name = "business_seats", nullable = false)
    private int businessSeats;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getEconomySeats() {
        return economySeats;
    }

    public void setEconomySeats(int economySeats) {
        this.economySeats = economySeats;
    }

    public int getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }
}