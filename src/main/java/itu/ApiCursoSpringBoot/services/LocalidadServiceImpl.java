package itu.ApiCursoSpringBoot.services;

import itu.ApiCursoSpringBoot.entities.Localidad;
import itu.ApiCursoSpringBoot.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
