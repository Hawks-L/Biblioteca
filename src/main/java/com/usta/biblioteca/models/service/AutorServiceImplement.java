package com.usta.biblioteca.models.service;

import com.usta.biblioteca.entities.AutorEntity;
import com.usta.biblioteca.models.DAO.AutorDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImplement implements AutorService{
    @Autowired
    private AutorDAO autorDAO;

    @Override
    @Transactional
    public List<AutorEntity> findAll() {
        return (List<AutorEntity>) autorDAO.findAll();
    }

    @Override
    @Transactional
    public void save(AutorEntity autor) {
        autorDAO.save(autor);
    }

    @Override
    @Transactional
    public AutorEntity findById(Long id) {
        return autorDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        autorDAO.deleteById(id);
    }

    @Override
    @Transactional
    public AutorEntity actualizarAutorEntity(AutorEntity autor) {
        return autorDAO.save(autor);
    }

    @Override
    @Transactional
    public void changeState(Long id) {

        autorDAO.changeState(id);

    }

    @Override
    @Transactional
    public AutorEntity viewDetail(Long id) {
        return autorDAO.viewDetail(id);
    }
}
