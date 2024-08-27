package com.usta.biblioteca.models.service;



import com.usta.biblioteca.entities.UsuarioEntity;

import java.util.List;

public interface UsuarioService {
    public List<UsuarioEntity> findAll();
    public void save(UsuarioEntity usuario);
    public UsuarioEntity findById(Long id);
    public void deleteById(Long id);
    public UsuarioEntity actualizarUsuarioEntity(UsuarioService usuario);
    public void changeState(Long id);
    public UsuarioEntity viewDetail(String email);

}
