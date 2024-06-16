package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Countries;
import com.sena.recuperacion.IRepository.CountriesRepository;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IService.ICountriesService;

@Service
public class CountriesServices extends ABaseService<Countries> implements ICountriesService {

    @Autowired
    private CountriesRepository repository;

    @Override
    protected IBaseRepository<Countries, Long> getRepository() {
        return repository;
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
    
}