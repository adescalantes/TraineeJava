package com.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.entity.Nota;
import com.trainee.model.MNota;
import com.trainee.service.NotaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1")
@Api(value = "Nota APIREST", description = "API REST prueba")
public class NotaController {

  @Autowired
  @Qualifier("Servicio")
  NotaService service;

  @ApiOperation(value = "Crea una nota")
  @PostMapping("/nota")
  public boolean agregarNota(@RequestBody Nota nota) {
    return service.crear(nota);
  }

  @ApiOperation(value = "Actualiza una nota")
  @PutMapping("/nota")
  public boolean actualizarNota(@RequestBody Nota nota) {
    return service.actualizar(nota);
  }

  @ApiOperation(value = "Elimina una nota ingresando un id y nombre")
  @DeleteMapping("/nota/{id}/{nombre}")
  public boolean borrarNota(@PathVariable("id") int id, @PathVariable("nombre") String nombre) {
    return service.borrar(nombre, id);
  }

  @ApiOperation(value = "Devuelve todas las notas")
  @GetMapping("/nota")
  public List<MNota> obtenerNotas() {
    return service.obtener();
  }

  @GetMapping("/nota/{id}")
  public MNota obtenerNota(@PathVariable("id") int id) {
    return service.obtenerId(id);
  }
}
