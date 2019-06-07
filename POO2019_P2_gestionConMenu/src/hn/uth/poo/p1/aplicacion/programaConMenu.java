/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.aplicacion;

import hn.uth.poo.p1.controladores.vehiculosControlador;
import hn.uth.poo.p1.objetos.Vehiculo;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author uth
 */
public class programaConMenu {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int  respuesta=-1;
        while (respuesta!=0) {            
            System.out.println("======================");
            System.out.println("====  Rent Car HN  ===");
            System.out.println("======================");
            System.out.println("1.- Ingresar nuevo vehiculo");
            System.out.println("2.- Ver inventario de vehiculo");
            System.out.println("3.- Rentar vehiculo");
            System.out.println("0.- Salir");
            
            System.out.println("¿Que opción quiere utilizar?");
            respuesta=scan.nextInt();
            
            if (respuesta==1) {
                System.out.println("======================");
                System.out.println("==== Ingresando Vehiculo ===");
                System.out.println("============================");
                System.out.println("¿Cual es la placa?");
                String placa=scan.next();
                System.out.println("¿Cual es el color?");
                String color=scan.next();
                System.out.println("¿Cual es el modelo?");
                String modelo=scan.next();
                System.out.println("¿Cual es la marca?");
                String marca=scan.next();
                System.out.println("¿Cual es el año?");
                int anio=scan.nextInt();
                System.out.println("¿Cual es el precio?");
                double precio=scan.nextDouble();
                
                Vehiculo nuevoVehiculo=new Vehiculo(placa, color, marca, modelo, anio, precio);
                
                vehiculosControlador.guardar(nuevoVehiculo);                              
                System.out.println("!Vehiculo ingresado Exitosamente!");
                System.out.println("");
                System.out.println("¿Desea continuar en la app? (1=Si, 0=No)");
                respuesta=scan.nextInt();
            }else if (respuesta==2) {
                Vehiculo[] datos=vehiculosControlador.consultar();
                System.out.println("======================");
                System.out.println("==== Inventario de Vehiculo ===");
                System.out.println("============================");
                for (Vehiculo dato : datos) {
                    if (dato!=null) {
                        System.out.println(dato);                    
                    }
                }
                
                System.out.println("¿Desea continuar en la app? (1=Si, 0=No)");
                respuesta=scan.nextInt();
            }else if (respuesta==3) {
                //Rentas
            }else if (respuesta==0) {
                System.out.println("Gracias por utilizar el SW");
            }else{
                System.out.println("La opcion ingresada no es válida!");                
            }
            
        }
        
    }
}
