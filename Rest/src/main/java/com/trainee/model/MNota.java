package com.trainee.model;

import com.trainee.entity.Nota;

public class MNota {

  private int id;
  private String nombre;
  private String titulo;
  private String contenido;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getContenido() {
    return contenido;
  }

  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  /** Metodo constructor para MNota. **/
  public MNota(int id, String nombre, String titulo, String contenido) {
    this.id = id;
    this.nombre = nombre;
    this.titulo = titulo;
    this.contenido = contenido;
  }

  public MNota(Nota nota) {
    this.id = nota.getId();
    this.nombre = nota.getNombre();
    this.titulo = nota.getTitulo();
    this.contenido = nota.getContenido();
  }

}
