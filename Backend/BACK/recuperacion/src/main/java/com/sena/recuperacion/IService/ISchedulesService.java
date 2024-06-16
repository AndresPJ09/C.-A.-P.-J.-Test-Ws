package com.sena.recuperacion.IService;

import java.time.LocalDateTime;
import java.util.List;

import com.sena.recuperacion.Entity.Schedules;

public interface ISchedulesService extends IBaseService<Schedules> {
	
	 List<Schedules> searchFlights(Long departureAirportId, Long destinationAirportId, LocalDateTime departureDate, boolean flexibleDates);
	    
	    double calculateTicketPrice(Long scheduleId, Long cabinTypeId);
	    
	    boolean checkSeatAvailability(Long scheduleId, int numberOfPassengers, String cabinType);
	   
	}