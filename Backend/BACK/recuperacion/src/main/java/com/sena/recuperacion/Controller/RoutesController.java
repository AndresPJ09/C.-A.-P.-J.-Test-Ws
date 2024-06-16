package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Routes;
import com.sena.recuperacion.IService.IRoutesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/routes")
public class RoutesController extends ABaseController<Routes, IRoutesService> {

    protected RoutesController(IRoutesService service) {
        super(service, "Routes");
    }
}