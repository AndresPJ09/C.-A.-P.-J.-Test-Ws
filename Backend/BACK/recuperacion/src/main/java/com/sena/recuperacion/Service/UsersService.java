package com.sena.recuperacion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.recuperacion.Entity.Users;
import com.sena.recuperacion.IRepository.IBaseRepository;
import com.sena.recuperacion.IRepository.UsersRepository;
import com.sena.recuperacion.IService.IUsersService;

@Service
public class UsersService extends ABaseService<Users> implements IUsersService {

    @Autowired
    private UsersRepository repository;

    @Override
    protected IBaseRepository<Users, Long> getRepository() {
        return repository;
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
    
}
