/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uth
 */
public class Serie extends ProductoMultiMedia{
    private List<String> listaVideos;
    
    public Serie(String nombre
            , String categoria
            , int anio) {
        super(nombre, categoria, anio);
        this.listaVideos = new ArrayList<>();
    }
    
    public void agregarVideo(String video){
        this.listaVideos.add(video);
    }
    
    public void imprimirCapitulos(){
        System.out.println
        ("Lista de capitulos de "
                +super.getNombre());
        for (String tmp : listaVideos) {
            System.out.println(tmp);
        }
    }
}
