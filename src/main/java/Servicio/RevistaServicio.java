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
  private final List<Revista> revistaList = new ArrayList<>();

    @Override
    public Revista crear(Revista revista) {
        this.revistaList.add(revista);
        return revista; 
    }
   
    @Override
    public List<Revista> listar() {
        return this.revistaList; 
    }

    @Override
    public Revista buscarPorCodigo(int codigoRevista) {
        Revista revista=null;
        for(var r:this.revistaList){
            if(codigoRevista==r.getCodigoRevista()){
                revista=r;
                break;
            }
        }
        return revista;
    }
    
 }
    

