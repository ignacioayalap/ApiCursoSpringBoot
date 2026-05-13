package itu.ApiCursoSpringBoot.controller;

import itu.ApiCursoSpringBoot.entities.Autor;
import itu.ApiCursoSpringBoot.services.AutorService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, Long> {

    public AutorController(AutorService autorService) {
        super(autorService);
    }
}
