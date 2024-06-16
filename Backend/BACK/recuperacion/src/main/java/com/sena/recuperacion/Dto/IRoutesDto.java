package com.sena.recuperacion.Dto;

public interface IRoutesDto extends IGenericDto {
	
	Long getId();
    Long getDepartureAirportId();
    Long getArrivalAirportId();
    Double getDistance();
    String getFlightTime();

}
