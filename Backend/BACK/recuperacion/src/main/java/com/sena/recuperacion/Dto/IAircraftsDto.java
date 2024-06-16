package com.sena.recuperacion.Dto;

public interface IAircraftsDto extends IGenericDto {
	
	Long getId();
    String getMakeModel();
    Integer getTotalSeats();
    Integer getEconomySeats();
    Integer getBusinessSeats();

}
