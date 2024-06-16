package com.sena.recuperacion.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.recuperacion.Entity.Roles;

@Repository
public interface RolesRepository extends IBaseRepository<Roles, Long> {
  
}