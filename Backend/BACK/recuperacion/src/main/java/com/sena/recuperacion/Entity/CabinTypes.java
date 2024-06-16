package com.sena.recuperacion.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cabin_types")
public class CabinTypes extends ABaseEntity {

    @Column(name = "name", length = 50, nullable = false)
    private String name;
    
    @Column(name = "price_multiplier", nullable = false)
    private double priceMultiplier;

    public double getPriceMultiplier() {
		return priceMultiplier;
	}

	public void setPriceMultiplier(double priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}