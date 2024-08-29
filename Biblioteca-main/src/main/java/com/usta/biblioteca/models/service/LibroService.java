package com.usta.biblioteca.models.service;


import com.usta.biblioteca.entities.LibroEntity;

import java.util.List;

public interface LibroService {

    public List<LibroEntity> findAll();
    public void save(LibroEntity autor);
    public LibroEntity findById(Long id);
    public void deleteById(Long id);
    public LibroEntity actualizarLibroEntity(LibroEntity autor);
    public void changeState(Long id);
    public LibroEntity viewDetail(Long id);
}
