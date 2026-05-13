package itu.ApiCursoSpringBoot.services;

import itu.ApiCursoSpringBoot.entities.Autor;
import itu.ApiCursoSpringBoot.repositories.AutorRepository;
import itu.ApiCursoSpringBoot.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
