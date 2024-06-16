package com.sena.recuperacion.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Countries;

@Repository
public interface CountriesRepository extends IBaseRepository<Countries, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si es necesario.
}