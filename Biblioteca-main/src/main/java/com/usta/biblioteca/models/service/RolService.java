package com.usta.biblioteca.models.service;

import com.usta.biblioteca.entities.RolEntity;

import java.util.List;

public interface RolService {
    public List<RolEntity> findAll();
    public void save(RolEntity rol);
    public RolEntity findById(Long id);
    public void deleteById(Long id);
    public RolEntity actualizarRolEntity(RolEntity rol);

}
