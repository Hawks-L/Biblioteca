package com.usta.biblioteca.models.DAO;

import com.usta.biblioteca.entities.AutorEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AutorDAO extends CrudRepository<AutorEntity,Long> {

    @Transactional
    @Modifying
    @Query("UPDATE AutorEntity SET estadoAutor=false WHERE idAutor=?1")
    public void changeState(Long idAutor);

    @Transactional
    @Query("SELECT AU from AutorEntity AU WHERE AU.idAutor")
    public AutorEntity viewDetail(Long idAutor);
}
