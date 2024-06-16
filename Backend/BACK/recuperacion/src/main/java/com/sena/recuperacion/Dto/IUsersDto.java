package com.sena.recuperacion.Dto;

import java.time.LocalDate;

public interface IUsersDto extends IGenericDto {
	
	 Long getId();
	    Long getRoleId();
	    String getEmail();
	    String getPassword();
	    String getFirstName();
	    String getLastName();
	    Long getOfficeId();
	    LocalDate getBirthDate();
	    Boolean getActive();

}
