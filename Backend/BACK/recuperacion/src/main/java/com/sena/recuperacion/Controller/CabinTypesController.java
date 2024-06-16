package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.CabinTypes;
import com.sena.recuperacion.IService.ICabinTypesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/cabin_types")
public class CabinTypesController extends ABaseController<CabinTypes, ICabinTypesService> {

    protected CabinTypesController(ICabinTypesService service) {
        super(service, "CabinTypes");
    }
}