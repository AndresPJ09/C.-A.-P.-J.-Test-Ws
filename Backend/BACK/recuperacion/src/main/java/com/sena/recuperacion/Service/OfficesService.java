package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Offices;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IRepository.OfficesRepository;
import com.sena.recuperacion.IService.IOfficesService;

@Service
public class OfficesService extends ABaseService<Offices> implements IOfficesService {

    @Autowired
    private OfficesRepository repository;

    @Override
    protected IBaseRepository<Offices, Long> getRepository() {
        return repository;
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}