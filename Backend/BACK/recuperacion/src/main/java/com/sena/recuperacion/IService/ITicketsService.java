package com.sena.recuperacion.IService;

import java.util.List;

import com.sena.recuperacion.Dto.ITicketsDto;
import com.sena.recuperacion.Entity.Tickets;

public interface ITicketsService extends IBaseService<Tickets>{
	
	List<Tickets> getTicketsByScheduleId(Long scheduleId);

    int countTicketsByScheduleId(Long scheduleId);
    

    Tickets saveTicket(ITicketsDto ticketDto);


}
