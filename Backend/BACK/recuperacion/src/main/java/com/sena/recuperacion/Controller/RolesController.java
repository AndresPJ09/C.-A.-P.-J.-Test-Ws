package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Roles;
import com.sena.recuperacion.IService.IRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/roles")
public class RolesController extends ABaseController<Roles, IRolesService> {

    protected RolesController(IRolesService service) {
        super(service, "Roles");
    }
}