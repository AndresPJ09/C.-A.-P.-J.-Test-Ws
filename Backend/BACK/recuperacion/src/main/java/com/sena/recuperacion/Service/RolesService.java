package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Roles;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IRepository.RolesRepository;
import com.sena.recuperacion.IService.IRolesService;

@Service
public class RolesService extends ABaseService<Roles> implements IRolesService {

    @Autowired
    private RolesRepository repository;

    @Override
    protected IBaseRepository<Roles, Long> getRepository() {
        return repository;
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
    
}

