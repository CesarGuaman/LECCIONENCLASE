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
    
    public Revista crear(String [] args){
        var revista = new Revista(Integer.valueOf(args[0]),args[1],args[2],
                Integer.valueOf(args[3]));
        this.revistaServicio.crear(revista);
        return revista;
    }
    
    public List<Revista> listar(){
        return this.revistaServicio.listar();
    }
     
  
}