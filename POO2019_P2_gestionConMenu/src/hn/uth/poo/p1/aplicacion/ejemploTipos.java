/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.aplicacion;

import hn.uth.poo.p1.objetos.Vehiculo;

/**
 *
 * @author uth
 */
public class ejemploTipos {
    public static void imprimir(Vehiculo vehiculo){
        System.out.println("Impreso desde Imprimir: "+vehiculo);
    }
    
    public static Vehiculo buscarVehiculo(Vehiculo[] lista,String placa){
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getPlaca().equals(placa)) { //los objetos y String se comparan con equals
                return vehiculo;
            }
        }
        
        return null;
    }
    
    public static boolean isVehiculosIguales(Vehiculo a, Vehiculo b){
        return a.equals(b);
    }
    
    public static void main(String [] args){
        System.out.println("hola mundo");
        Vehiculo [] arregloVehiculo=new Vehiculo[2];
        arregloVehiculo[0]=new Vehiculo("PX01");
        arregloVehiculo[1]=new Vehiculo("PX02");
                
        for (int i = 0; i < arregloVehiculo.length; i++) {                    
            imprimir(arregloVehiculo[i]);
        }
        
        System.out.println("buscar PDX01: "+buscarVehiculo(arregloVehiculo, "PDX01"));
        System.out.println("buscar PX01: "+buscarVehiculo(arregloVehiculo, "PX01"));
        
        Vehiculo a=arregloVehiculo[0];
        Vehiculo b=new Vehiculo("PX01");
        
        if (isVehiculosIguales(a, b)) {
            System.out.println("ambos vehiculos son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
}
