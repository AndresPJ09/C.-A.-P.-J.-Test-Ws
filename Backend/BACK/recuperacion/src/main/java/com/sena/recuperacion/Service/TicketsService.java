package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Tickets;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IRepository.TicketsRepository;
import com.sena.recuperacion.IService.ITicketsService;

@Service
public class TicketsService extends ABaseService<Tickets> implements ITicketsService {

    @Autowired
    private TicketsRepository repository;

    @Override
    protected IBaseRepository<Tickets, Long> getRepository() {
        return repository;
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }

}
