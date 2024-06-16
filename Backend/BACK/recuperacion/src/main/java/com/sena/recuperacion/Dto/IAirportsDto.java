package com.sena.recuperacion.Dto;

public interface IAirportsDto extends IGenericDto {
	
    Long getId();
    Long getCountryId();
    String getIataCode();
    String getName();


}
