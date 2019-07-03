/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.objetos;

/**
 *
 * @author uth
 */
public class Pelicula extends ProductoMultiMedia{
    private String video;
    
    public Pelicula(String nombre, String categoria, int anio) {
        super(nombre, categoria, anio);
    }

    public Pelicula(String video, String nombre, String categoria, int anio) {
        super(nombre, categoria, anio);
        this.video = video;
    }
    
}
