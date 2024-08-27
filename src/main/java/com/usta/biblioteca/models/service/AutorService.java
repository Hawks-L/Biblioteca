package com.usta.biblioteca.models.service;

import com.usta.biblioteca.entities.AutorEntity;

import java.util.List;

public interface AutorService {


    public List<AutorEntity> findAll();
    public void save(AutorEntity autor);
    public AutorEntity findById(Long id);
    public void deleteById(Long id);
    public AutorEntity actualizarAutorEntity(AutorEntity autor);
    public void changeState(Long id);
    public AutorEntity viewDetail(Long id);
}
