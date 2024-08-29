package com.usta.biblioteca.models.service;



import com.usta.biblioteca.entities.LibroEntity;
import com.usta.biblioteca.models.DAO.LibroDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImplement implements LibroService{

    @Autowired
    private LibroDAO libroDAO;

    @Override
    @Transactional
    public List<LibroEntity> findAll() {
        return (List<LibroEntity>) libroDAO.findAll();
    }

    @Override
    @Transactional
    public void save(LibroEntity libro) {
        libroDAO.save(libro);
    }

    @Override
    @Transactional
    public LibroEntity findById(Long id) {
        return libroDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        libroDAO.deleteById(id);
    }

    @Override
    @Transactional
    public LibroEntity actualizarLibroEntity(LibroEntity libro) {
        return libroDAO.save(libro);
    }

    @Override
    @Transactional
    public void changeState(Long id) {

        libroDAO.changeState(id);

    }

    @Override
    @Transactional
    public LibroEntity viewDetail(Long id) {
        return libroDAO.viewDetail(id);
    }
}
