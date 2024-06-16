package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Schedules;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IRepository.SchedulesRepository;
import com.sena.recuperacion.IService.ISchedulesService;

@Service
public class SchedulesService extends ABaseService<Schedules> implements ISchedulesService {

    @Autowired
    private SchedulesRepository repository;

    @Override
    protected IBaseRepository<Schedules, Long> getRepository() {
        return repository;
    }
        @Override
        public void delete(Long id){
            repository.deleteById(id);
        }
        
    }

