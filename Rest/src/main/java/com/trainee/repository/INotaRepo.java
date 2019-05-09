package com.trainee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.entity.Nota;

@Repository("Repositorio")
public interface INotaRepo extends JpaRepository<Nota, Integer> {

  public abstract Nota findByNombre(String nombre);

  public abstract List<Nota> findByTitulo(String titulo);

  public abstract Nota findByNombreAndTitulo(String nombre, String titulo);

  public abstract Nota findByNombreAndId(String nombre, int id);

  public abstract Nota findById(int id);
}
