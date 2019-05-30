/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.aplicacion;

import hn.uth.poo.p1.objetos.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uth
 */
public class ejemploListas {
    public static void imprimir(List<Vehiculo> lista){
        for (Vehiculo variableTmp : lista) {
            imprimir(variableTmp);
        }
    }
    
    public static void imprimir(Vehiculo vehiculo){
        System.out.println(vehiculo);
    }
    
    public static Vehiculo buscar(List<Vehiculo> lista, String placa){
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getPlaca().toUpperCase().equals(placa.toUpperCase())) {
                return vehiculo;
            }
        }
        return null;
    }
    
    public static void main(String [] args){
        List<Vehiculo> listaVehiculos=new ArrayList<>();
        
        //Agregando un valor a la lista
        listaVehiculos.add(new Vehiculo("UTH01"));
        
        Vehiculo nuevoVehiculo=new Vehiculo("UTH02");
        listaVehiculos.add(nuevoVehiculo);
        
        listaVehiculos.add(new Vehiculo("UTH03"));       
        
        imprimir(listaVehiculos);
        
        System.out.println("buscar PDX: "+buscar(listaVehiculos, "PDX"));
        System.out.println("buscar UTH02: "+buscar(listaVehiculos, "UTH02"));
        System.out.println("buscar uth03: "+buscar(listaVehiculos, "uth03"));
        
        System.out.println("hola mundo".toUpperCase());
        System.out.println("HOLA MUNDO".toLowerCase());
        
        listaVehiculos.remove(buscar(listaVehiculos, "UTH02"));
        
        Vehiculo variableTmp=buscar(listaVehiculos, "UTH03");
        variableTmp.setColor("Verde");
        
        imprimir(listaVehiculos);
    }
}
