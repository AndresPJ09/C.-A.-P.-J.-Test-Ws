package com.sena.recuperacion.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.recuperacion.Entity.Countries;
import com.sena.recuperacion.IService.ICountriesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/countries")
public class CountriesController extends ABaseController<Countries, ICountriesService> {

    protected CountriesController(ICountriesService service) {
        super(service, "Countries");
    }
}