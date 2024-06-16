package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Offices;
import com.sena.recuperacion.IService.IOfficesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/offices")
public class OfficesController extends ABaseController<Offices, IOfficesService> {

    protected OfficesController(IOfficesService service) {
        super(service, "Offices");
    }
}
