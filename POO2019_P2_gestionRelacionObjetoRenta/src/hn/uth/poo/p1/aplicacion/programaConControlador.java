/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.aplicacion;

import hn.uth.poo.p1.controladores.vehiculosControlador;
import hn.uth.poo.p1.objetos.Vehiculo;

/**
 *
 * @author eliud
 */
public class programaConControlador {
    public static void imprimir(Vehiculo[] dato){
        System.out.println("======================================");
        System.out.println("============      VEHICULOS ===========");
        System.out.println("======================================");
        for (Vehiculo vehiculo : dato) {
            if (vehiculo!=null) {
                System.out.println(vehiculo);    
            }
        
        }
    }
    
    public static void main(String[] args){
        vehiculosControlador.guardar(new Vehiculo("AA01"));
        vehiculosControlador.guardar(new Vehiculo("AA02"));
        vehiculosControlador.guardar(new Vehiculo("AA03"));
        vehiculosControlador.guardar(new Vehiculo("AA04"));
        vehiculosControlador.guardar(new Vehiculo("AA05"));
        vehiculosControlador.guardar(new Vehiculo("AA06"));
        
        imprimir(vehiculosControlador.consultar());
        imprimir(vehiculosControlador.consultar("AA03"));
        
        Vehiculo vehiculo3=vehiculosControlador.buscar("AA03");
        //como asigno el objeto a esta variable, todo lo que le pase a la variable
        //le pasa al objeto en memoria
        vehiculo3.setColor("Rojo");
        vehiculo3.setModelo("honduras");
        
        imprimir(vehiculosControlador.consultar("AA03"));
        System.out.println("Borrando");
        vehiculosControlador.borrar("AA03");
        
        imprimir(vehiculosControlador.consultar());
    }
}
