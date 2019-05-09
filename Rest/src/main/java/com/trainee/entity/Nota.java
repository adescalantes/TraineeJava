package com.trainee.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "nota")
@Entity
public class Nota implements Serializable {

  @GeneratedValue
  @Id
  @Column(name = "id_nota")
  private int id;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "titulo")
  private String titulo;

  @Column(name = "contenido")
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

  public Nota() {

  }

  public Nota(int id, String nombre, String titulo, String contenido) {
    this.id = id;
    this.nombre = nombre;
    this.titulo = titulo;
    this.contenido = contenido;
  }
}
