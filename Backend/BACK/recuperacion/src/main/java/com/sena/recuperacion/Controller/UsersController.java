package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Users;
import com.sena.recuperacion.IService.IUsersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/users")
public class UsersController extends ABaseController<Users, IUsersService> {

    protected UsersController(IUsersService service) {
        super(service, "Users");
    }
}