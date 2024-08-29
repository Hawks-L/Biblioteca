package com.usta.biblioteca.models.DAO;


import com.usta.biblioteca.entities.PrestamoEntity;
import org.springframework.data.repository.CrudRepository;

public interface PrestamoDAO extends CrudRepository<PrestamoEntity,Long> {


}
