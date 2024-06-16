package com.sena.recuperacion.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Users;

@Repository
public interface UsersRepository extends IBaseRepository<Users, Long> {
    
}
