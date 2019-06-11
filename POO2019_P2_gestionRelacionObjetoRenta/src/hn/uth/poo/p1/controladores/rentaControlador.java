/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.controladores;

import hn.uth.poo.p1.objetos.Renta;

/**
 *
 * @author eliud
 */
public class rentaControlador {
    private static int contador=0;
    private static Renta[] datos=new Renta[100];
    
    public static void borrar(int id){
        for (int i = 0; i < datos.length; i++) {
            Renta tmp = datos[i];
            if (tmp!=null && tmp.getId()==id) {
                datos[i]=null;
            }
        }
    }
    
    public static void guardar(Renta vehiculo){
        for (int i = 0; i < datos.length; i++) {
            Renta dato = datos[i];
            if (dato==null) {
                datos[i]=vehiculo;
                return;
            }
        }
    }
    
    public static Renta[] consultar(){
        return datos;
    }
    
    public static Renta[] consultar(int id){
        Renta[] datosTemporal=new Renta[datos.length];
        int contadorTmp=0;
        for (int i = 0; i < datos.length; i++) {
            Renta tmp=datos[i];
            if (tmp!=null && tmp.getId()==id) {
                datosTemporal[contadorTmp]=tmp;
                contadorTmp++;
            }
        }
        return datosTemporal;
    }
    
    public static Renta buscar(int id){
        for (int i = 0; i < datos.length; i++) {
            Renta tmp=datos[i];
            if (tmp!=null && tmp.getId()==id) {
                return tmp;
            }
        }
        return null;
    }
    
}
