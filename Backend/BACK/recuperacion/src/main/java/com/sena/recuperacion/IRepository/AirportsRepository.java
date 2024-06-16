package com.sena.recuperacion.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Airports;

@Repository
public interface AirportsRepository extends IBaseRepository<Airports, Long> {
   
}