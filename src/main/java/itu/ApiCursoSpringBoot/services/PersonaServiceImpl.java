package itu.ApiCursoSpringBoot.services;

import itu.ApiCursoSpringBoot.entities.Persona;
import itu.ApiCursoSpringBoot.repositories.BaseRepository;
import itu.ApiCursoSpringBoot.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            List<Persona> personas = personaRepository.search(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepository.search(filtro,  pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

//
//    private PersonaRepository personaRepository;
//
//    public PersonaService(PersonaRepository personaRepository) {
//        this.personaRepository = personaRepository;
//    }
//
//    @Override
//    @Transactional
//    public List<Persona> findAll() throws Exception {
//        try {
//            List<Persona> entities = personaRepository.findAll();
//            return entities;
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//
//    }
//
//    @Override
//    @Transactional
//    public Persona findById(Integer id) throws Exception {
//        try {
//            Optional<Persona> entityOpcional = personaRepository.findById(id);
//            return entityOpcional.get();
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//
//    }
//
//    @Override
//    @Transactional
//    public Persona save(Persona entity) throws Exception {
//        try {
//            entity = personaRepository.save(entity);
//            return entity;
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//
//    }
//
//    @Override
//    @Transactional
//    public boolean deleteById(Integer id) throws Exception {
//        try {
//            if (personaRepository.existsById(id)) {
//                personaRepository.deleteById(id);
//                return true;
//            } else  {
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//
//    }
//
//    @Override
//    @Transactional
//    public Persona update(Integer id, Persona entity) throws Exception {
//        try {
//            Optional<Persona> entityOpcional = personaRepository.findById(id);
//            Persona persona = entityOpcional.get();
//            persona = personaRepository.save(entity);
//            return persona;
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }
//    }

