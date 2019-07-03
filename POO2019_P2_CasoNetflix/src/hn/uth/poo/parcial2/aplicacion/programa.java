/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.aplicacion;

import hn.uth.poo.parcial2.objetos.Pelicula;
import hn.uth.poo.parcial2.objetos.ProductoMultiMedia;
import hn.uth.poo.parcial2.objetos.Serie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uth
 */
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula nuevaPelicula=new Pelicula("ToyStory", "Infantil", 2019);        
        nuevaPelicula.promocionar();
        
        Serie nuevaSerie=new Serie("Dark", "Drama", 2019);   
        nuevaSerie.promocionar();
        nuevaSerie.seguir();
        nuevaSerie.agregarVideo("cap1");
        nuevaSerie.agregarVideo("cap2");
        nuevaSerie.agregarVideo("cap3");
        nuevaSerie.agregarVideo("cap4");
        
        nuevaSerie.imprimirCapitulos();
        
        List<ProductoMultiMedia> listaEstrenos
                =new ArrayList<>();
        
        listaEstrenos.add(nuevaSerie);
        listaEstrenos.add(nuevaPelicula);
        
        imprimirEstrenos(listaEstrenos);
    }
    
    public static void imprimirEstrenos(List<ProductoMultiMedia> listaEstrenos){
        System.out.println("");
        System.out.println("Leyendo la lista de estrenos");
        for (ProductoMultiMedia tmp : listaEstrenos) {
            tmp.promocionar();
            tmp.seguir();
        }
    }
}
