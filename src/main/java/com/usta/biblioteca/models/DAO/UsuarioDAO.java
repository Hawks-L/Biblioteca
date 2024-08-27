package com.usta.biblioteca.models.DAO;



import com.usta.biblioteca.entities.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<UsuarioEntity,Long> {

    @Transactional
    @Modifying
    @Query("UPDATE UsuarioEntity SET estadoUsuario=false WHERE idUsuario=?1")
    public void changeState(long idUsuario);

    @Transactional
    @Query("SELECT AU from UsuarioEntity AU WHERE AU.email=?1")
    public UsuarioEntity viewDetail(long email);
}
