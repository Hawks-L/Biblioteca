package com.usta.biblioteca.models.DAO;

import com.usta.biblioteca.entities.AutorEntity;
import com.usta.biblioteca.entities.LibroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LibroDAO extends CrudRepository<LibroEntity,Long> {

    @Transactional
    @Modifying
    @Query("UPDATE LibroEntity SET estadoLibro = false WHERE idLibro=?1")
    public void changeState(Long idLibro);

    @Transactional
    @Query("SELECT AU from LibroEntity AU WHERE AU.libro")
    public LibroEntity viewDetail(Long idLibro);
}
