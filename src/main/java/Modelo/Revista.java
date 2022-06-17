/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author CESAR
 */
public class Revista {
   private int codigo;
    private String nombre;
    private String editor;
    private String ubicacion;
    private String pais;

    public Revista(int codigo, String editor, String ubicacion, String pais) {
        this.codigo = codigo;
        this.editor = editor;
        this.ubicacion = ubicacion;
        this.pais = pais;
    }

    public Revista(int codigo, String nombre, String editor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.editor = editor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Revista{" + "codigo=" + codigo + ", nombre=" + nombre +
                ", editor=" + editor + ", ubicacion=" + ubicacion +
                ", pais=" + pais + '}';
    }
    
}
