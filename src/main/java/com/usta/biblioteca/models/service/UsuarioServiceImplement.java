package com.usta.biblioteca.models.service;


import com.usta.biblioteca.entities.UsuarioEntity;
import com.usta.biblioteca.models.DAO.UsuarioDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplement implements UsuarioService{
    @Autowired
    private UsuarioDAO usuDAO;

    @Override
    @Transactional
    public List<UsuarioEntity> findAll() {
        return (List<UsuarioEntity>) usuDAO.findAll();
    }

    @Override
    @Transactional
    public void save(UsuarioEntity usuario) {usuDAO.save(usuario);
    }

    @Override
    @Transactional
    public UsuarioEntity findById(Long id) {
        return usuDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        usuDAO.deleteById(id);
    }

    @Override
    @Transactional
    public UsuarioEntity actualizarUsuarioEntity(UsuarioEntity usuario) {
        return usuDAO.save(usuario);
    }

    @Override
    @Transactional
    public void changeState(Long id) {

        usuDAO.changeState(id);

    }

    @Override
    @Transactional
    public UsuarioEntity viewDetail(String email) {
        return usuDAO.viewDetail(email);
    }
}