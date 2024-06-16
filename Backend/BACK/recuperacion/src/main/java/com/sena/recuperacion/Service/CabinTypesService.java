package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.CabinTypes;
import com.sena.recuperacion.IRepository.CabinTypesRepository;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IService.ICabinTypesService;

@Service
public class CabinTypesService extends ABaseService<CabinTypes> implements ICabinTypesService {

    @Autowired
    private CabinTypesRepository repository;

    @Override
    protected IBaseRepository<CabinTypes, Long> getRepository() {
        return repository;
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
    
}

