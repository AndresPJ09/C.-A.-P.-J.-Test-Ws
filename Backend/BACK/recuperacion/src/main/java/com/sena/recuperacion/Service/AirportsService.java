package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Airports;
import com.sena.recuperacion.IRepository.AirportsRepository;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IService.IAirportsService;

@Service
public class AirportsService extends ABaseService<Airports> implements IAirportsService {

    @Autowired
    private AirportsRepository repository;

    @Override
    protected IBaseRepository<Airports, Long> getRepository() {
        return repository;
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }

}
