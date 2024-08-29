package com.usta.biblioteca.models.service;


import com.usta.biblioteca.entities.RolEntity;
import com.usta.biblioteca.models.DAO.RolDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplement implements RolService{

    @Autowired
    private RolDAO rolDAO;

    @Override
    @Transactional
    public List<RolEntity> findAll() {
        return (List<RolEntity>) rolDAO.findAll();
    }

    @Override
    @Transactional
    public void save(RolEntity rol) {
        rolDAO.save(rol);
    }

    @Override
    @Transactional
    public RolEntity findById(Long id) {
        return rolDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        rolDAO.deleteById(id);
    }

    @Override
    @Transactional
    public RolEntity actualizarRolEntity(RolEntity rol) {
        return rolDAO.save(rol);
    }

}
