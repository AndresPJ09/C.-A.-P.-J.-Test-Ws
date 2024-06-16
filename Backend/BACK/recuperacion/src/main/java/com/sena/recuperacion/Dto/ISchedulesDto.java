package com.sena.recuperacion.Dto;

import java.time.LocalDate;
import java.time.LocalTime;

public interface ISchedulesDto extends IGenericDto {
	
	    Long getId();
	    LocalDate getDate();
	    LocalTime getTime();
	    Long getAircraftId();
	    Long getRouteId();
	    Double getEconomyPrice();
	    Boolean getConfirmed();
	    String getFlightNumber();
}
