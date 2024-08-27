package com.usta.biblioteca.models.service;


import com.usta.biblioteca.entities.PrestamoEntity;
import com.usta.biblioteca.models.DAO.PrestamoDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrestamoServiceImplement implements PrestamoService{

    @Autowired
    private PrestamoDAO prestamoDAO;

    @Override
    @Transactional
    public List<PrestamoEntity> findAll() {
        return (List<PrestamoEntity>) prestamoDAO.findAll();
    }

    @Override
    @Transactional
    public void save(PrestamoEntity prestamo) {
        prestamoDAO.save(prestamo);
    }

    @Override
    @Transactional
    public PrestamoEntity findById(Long id) {
        return prestamoDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        prestamoDAO.deleteById(id);
    }

    @Override
    @Transactional
    public PrestamoEntity actualizarPrestamoEntity(PrestamoEntity prestamo) {
        return prestamoDAO.save(prestamo);
    }

}
