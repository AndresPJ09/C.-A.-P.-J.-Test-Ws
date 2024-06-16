package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Airports;
import com.sena.recuperacion.IService.IAirportsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/airports")
public class AirportsController extends ABaseController<Airports, IAirportsService> {

    protected AirportsController(IAirportsService service) {
        super(service, "Airports");
    }
}