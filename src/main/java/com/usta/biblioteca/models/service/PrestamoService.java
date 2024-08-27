package com.usta.biblioteca.models.service;

import com.usta.biblioteca.entities.PrestamoEntity;

import java.util.List;

public interface PrestamoService {
    public List<PrestamoEntity> findAll();
    public void save(PrestamoEntity prestamo);
    public PrestamoEntity findById(Long id);
    public void deleteById(Long id);
    public PrestamoEntity actualizarPrestamoEntity(PrestamoEntity prestamo);

}
