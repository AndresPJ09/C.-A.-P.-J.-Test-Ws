package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Aircrafts;
import com.sena.recuperacion.IRepository.AircraftsRepository;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IService.IAircraftsService;

@Service
public class AircraftsService extends ABaseService<Aircrafts> implements IAircraftsService {

    @Autowired
    private AircraftsRepository repository;

    @Override
    protected IBaseRepository<Aircrafts, Long> getRepository() {
        return repository;
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
    
}
