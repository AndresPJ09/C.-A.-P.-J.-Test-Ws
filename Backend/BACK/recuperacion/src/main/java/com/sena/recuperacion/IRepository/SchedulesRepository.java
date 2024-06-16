package com.sena.recuperacion.IRepository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Schedules;

@Repository
public interface SchedulesRepository extends IBaseRepository<Schedules, Long> {
			
	 @Query(value = "SELECT * FROM schedules s " +
             "WHERE s.route_id IN (" +
             "  SELECT r.id FROM routes r " +
             "  WHERE r.departure_airport_id = :departureAirportId " +
             "  AND r.destination_airport_id = :destinationAirportId " +
             ") " +
             "AND s.date BETWEEN :startDate AND :endDate",
      nativeQuery = true)
List<Schedules> findFlightsByAirportAndDateNative(@Param("departureAirportId") Long departureAirportId,
                                                 @Param("destinationAirportId") Long destinationAirportId,
                                                 @Param("startDate") LocalDateTime startDate,
                                                 @Param("endDate") LocalDateTime endDate);
	 
	   @Query("SELECT s FROM Schedules s WHERE s.id = :scheduleId AND s.confirmed = TRUE")
	    Schedules findConfirmedScheduleById(@Param("scheduleId") Long scheduleId);
}