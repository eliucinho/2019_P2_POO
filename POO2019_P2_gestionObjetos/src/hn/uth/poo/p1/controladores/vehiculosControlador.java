/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.controladores;

import hn.uth.poo.p1.objetos.Vehiculo;

/**
 *
 * @author eliud
 */
public class vehiculosControlador {
    private static int contador=0;
    private static Vehiculo[] datos=new Vehiculo[100];
    
    public static void guardar(Vehiculo vehiculo){
        datos[contador]=vehiculo;
        contador++;
    }
    
    public static Vehiculo[] consultar(){
        return datos;
    }
    
    public static Vehiculo[] consultar(String placa){
        Vehiculo[] datosTemporal=new Vehiculo[datos.length];
        int contadorTmp=0;
        for (int i = 0; i < datos.length; i++) {
            Vehiculo tmp=datos[i];
            if (tmp!=null && tmp.getPlaca().equals(placa)) {
                datosTemporal[contadorTmp]=tmp;
                contadorTmp++;
            }
        }
        return datosTemporal;
    }
    
}
