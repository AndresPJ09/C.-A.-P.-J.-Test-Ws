package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Tickets;
import com.sena.recuperacion.IService.ITicketsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/tickets")
public class TicketsController extends ABaseController<Tickets, ITicketsService> {

    protected TicketsController(ITicketsService service) {
        super(service, "Tickets");
        // TODO Auto-generated constructor stub
    }
}