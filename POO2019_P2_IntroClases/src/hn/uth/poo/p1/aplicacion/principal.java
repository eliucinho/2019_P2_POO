/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.aplicacion;

import hn.uth.poo.p1.objetos.Vehiculo;
//En caso que hubiesen un monto de clases, basta con poner un asterisco donde va el nombre

/**
 *
 * @author eliucinho
 */
public class principal {
    public static void saludar(String mensaje){
        System.out.println("Hola : "+mensaje);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        saludar("mundo");
        
        String placa="pdp01";
        String color="rojo";
        String marca="tesla";
        String modelo="r1";
        int anio=2018;
        double precio=130000;
        
        //creando un objeto (desde ahora le van a decir instanciando un objeto)
        Vehiculo carroNuevo=
                new Vehiculo(placa
                        ,color
                        ,marca
                        ,modelo
                        ,anio
                        ,precio);
        
        System.out.println(carroNuevo);
        
        Vehiculo carroConConstructorPorDefecto=
                new Vehiculo();
        
        System.out.println(carroConConstructorPorDefecto);
        
        Vehiculo carroConPlaca=
                new Vehiculo(placa);
        
        System.out.println(carroConPlaca);
    }
    
}
