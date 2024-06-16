package com.sena.recuperacion.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Offices;

@Repository
public interface OfficesRepository extends IBaseRepository<Offices, Long> {
    // Aquí puedes agregar métodos de consulta personalizados si es necesario.
}