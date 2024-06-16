package com.sena.recuperacion.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Schedules;

@Repository
public interface SchedulesRepository extends IBaseRepository<Schedules, Long> {
  
}