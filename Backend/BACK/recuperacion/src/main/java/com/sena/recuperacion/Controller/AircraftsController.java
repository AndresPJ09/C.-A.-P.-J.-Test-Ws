package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Aircrafts;
import com.sena.recuperacion.IService.IAircraftsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/aircrafts")
public class AircraftsController extends ABaseController<Aircrafts, IAircraftsService> {

    protected AircraftsController(IAircraftsService service) {
        super(service, "Aircrafts");
    }
}