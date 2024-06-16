package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Routes;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IRepository.RoutesRepository;
import com.sena.recuperacion.IService.IRoutesService;

@Service
public class RoutesService extends ABaseService<Routes> implements IRoutesService {

    @Autowired
    private RoutesRepository repository;

    @Override
    protected IBaseRepository<Routes, Long> getRepository() {
        return repository;
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
    
}

