package com.sena.recuperacion.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Tickets;

@Repository
public interface TicketsRepository extends IBaseRepository<Tickets, Long> {
   
}