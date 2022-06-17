/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Revista;
import Servicio.RevistaServicio;
import java.util.List;

/**
 *
 * @author CESAR
 */
public class RevistaControlador {
  private final RevistaServicio revistaServicio = new RevistaServicio();
    public final RevistaServicio departamentoServicio = new RevistaServicio();
    
    public Revista crearRevista(int codigo, String nombre,String editor,String ubicacion,String pais){
        
        
        var nuevoRevista =  new Revista(codigo, nombre, editor, ubicacion, pais);
        return revistaServicio.crearRevista(nuevoRevista);
               
    }
    
    public List<Revista> listarEmpleados(){
        return revistaServicio.listarRevista();
    }
}
