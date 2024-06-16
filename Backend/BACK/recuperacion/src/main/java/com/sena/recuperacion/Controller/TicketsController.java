package com.sena.recuperacion.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Tickets;
import com.sena.recuperacion.IService.ITicketsService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/tickets")
public class TicketsController extends ABaseController<Tickets, ITicketsService> {

    protected TicketsController(ITicketsService service) {
        super(service, "Tickets");
        // TODO Auto-generated constructor stub
    }
    
    // Endpoint para obtener todos los tickets por scheduleId
    @GetMapping("/schedule/{scheduleId}")
    public List<Tickets> getTicketsByScheduleId(@PathVariable Long scheduleId) {
        return service.getTicketsByScheduleId(scheduleId);
    }

    // Endpoint para contar los tickets por scheduleId
    @GetMapping("/schedule/{scheduleId}/count")
    public int countTicketsByScheduleId(@PathVariable Long scheduleId) {
        return service.countTicketsByScheduleId(scheduleId);
    }

    // Endpoint para guardar un nuevo ticket
    @PostMapping("/save")
    public Tickets saveTicket(@RequestBody Tickets ticket) throws Exception {
        return service.save(ticket);
    }
    
    
}