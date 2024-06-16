package com.sena.recuperacion.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Tickets;

@Repository
public interface TicketsRepository extends IBaseRepository<Tickets, Long> {
	
	List<Tickets> findByScheduleId(Long scheduleId);

    @Query("SELECT COUNT(t) FROM Tickets t WHERE t.schedule.id = :scheduleId")
    int countTicketsByScheduleId(@Param("scheduleId") Long scheduleId);

   
}