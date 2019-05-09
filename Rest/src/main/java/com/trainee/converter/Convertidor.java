package com.trainee.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.trainee.entity.Nota;
import com.trainee.model.MNota;

@Component("Convertidor")
public class Convertidor {

  public List<MNota> convertirLista(List<Nota> notas) {
    List<MNota> mnotas = new ArrayList<>();

    for (Nota nota : notas) {
      mnotas.add(new MNota(nota));
    }
    return mnotas;
  }
}
