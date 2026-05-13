package itu.ApiCursoSpringBoot.controller;

import itu.ApiCursoSpringBoot.entities.Localidad;
import itu.ApiCursoSpringBoot.services.LocalidadService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, Long> {

    public LocalidadController(LocalidadService localidadService) {
        super(localidadService);
    }
}
