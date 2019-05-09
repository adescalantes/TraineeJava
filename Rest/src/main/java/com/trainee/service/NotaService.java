package com.trainee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.trainee.converter.Convertidor;
import com.trainee.entity.Nota;
import com.trainee.model.MNota;
import com.trainee.repository.INotaRepo;

@Service("Servicio")
public class NotaService {

  @Autowired
  @Qualifier("Repositorio")
  private INotaRepo repositorio;

  @Autowired
  @Qualifier("Convertidor")
  private Convertidor convertidor;

  public boolean crear(Nota nota) {
    try {
      repositorio.save(nota);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public boolean actualizar(Nota nota) {
    try {
      repositorio.save(nota);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public boolean borrar(String nombre, int id) {
    try {
      Nota nota = repositorio.findByNombreAndId(nombre, id);
      repositorio.delete(nota);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public MNota obtenerId(int id) {
    return new MNota(repositorio.findById(id));
  }

  public List<MNota> obtener() {

    return convertidor.convertirLista(repositorio.findAll());
  }

  public MNota obtenerPorNombreTitulo(String nombre, String titulo) {
    return new MNota(repositorio.findByNombreAndTitulo(nombre, titulo));
  }

  public List<MNota> obtenerTitulo(String titulo) {
    return convertidor.convertirLista(repositorio.findByTitulo(titulo));
  }
}
