package com.sena.recuperacion.Dto;

public interface ITicketsDto extends IGenericDto {
	
	Long getId();
    Long getUserId();
    Long getScheduleId();
    Long getCabinTypeId();
    String getFirstName();
    String getLastName();
    String getEmail();
    String getPhone();
    String getPassportNumber();
    Long getPassportCountryId();
    byte[] getPassportPhoto();
    String getBookingReference();
    Boolean getConfirmed();

}
