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
    public void changeState(Long idUsuario);

    @Transactional
    @Query("SELECT us from UsuarioEntity us WHERE us.email=?1")
    public UsuarioEntity findByEmail(String email);
}
