/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Revista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CESAR
 */
public class RevistaServicio {
  private static final List<Revista> listarevista = new ArrayList<>();

    @Override
    public editor crearRevista(Revista editor) {
        listaRevista.add(editor);
        return editor;
    }

    @Override
    public List<Revista> listarRevista() {
        return listaRevista;
    }
}
