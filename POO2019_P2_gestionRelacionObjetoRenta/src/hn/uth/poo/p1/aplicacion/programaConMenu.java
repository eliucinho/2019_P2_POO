/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.aplicacion;

import hn.uth.poo.p1.controladores.rentaControlador;
import hn.uth.poo.p1.controladores.vehiculosControlador;
import hn.uth.poo.p1.objetos.Renta;
import hn.uth.poo.p1.objetos.Vehiculo;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author uth
 */
public class programaConMenu {

    public static void imprimirVehiculos() {
        Vehiculo[] datos = vehiculosControlador.consultar();
        for (Vehiculo dato : datos) {
            if (dato != null) {
                System.out.println(dato);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int respuesta = -1;
        while (respuesta != 0) {
            System.out.println("======================");
            System.out.println("====  Rent Car HN  ===");
            System.out.println("======================");
            System.out.println("1.- Ingresar nuevo vehiculo");
            System.out.println("2.- Ver inventario de vehiculo");
            System.out.println("3.- Rentar vehiculo");
            System.out.println("0.- Salir");

            System.out.println("¿Que opción quiere utilizar?");
            respuesta = scan.nextInt();

            if (respuesta == 1) {
                System.out.println("======================");
                System.out.println("==== Ingresando Vehiculo ===");
                System.out.println("============================");
                System.out.println("¿Cual es la placa?");
                String placa = scan.next();
                System.out.println("¿Cual es el color?");
                String color = scan.next();
                System.out.println("¿Cual es el modelo?");
                String modelo = scan.next();
                System.out.println("¿Cual es la marca?");
                String marca = scan.next();
                System.out.println("¿Cual es el año?");
                int anio = scan.nextInt();
                System.out.println("¿Cual es el precio?");
                double precio = scan.nextDouble();

                Vehiculo nuevoVehiculo = new Vehiculo(placa, color, marca, modelo, anio, precio);

                vehiculosControlador.guardar(nuevoVehiculo);
                System.out.println("!Vehiculo ingresado Exitosamente!");
                System.out.println("");
                System.out.println("¿Desea continuar en la app? (1=Si, 0=No)");
                respuesta = scan.nextInt();
            } else if (respuesta == 2) {                
                System.out.println("======================");
                System.out.println("==== Inventario de Vehiculo ===");
                System.out.println("============================");
                imprimirVehiculos();

                System.out.println("¿Desea continuar en la app? (1=Si, 0=No)");
                respuesta = scan.nextInt();
            } else if (respuesta == 3) {
                //Rentas
                System.out.println("======================");
                System.out.println("==== Renta de Vehiculo ===");
                System.out.println("============================");
                imprimirVehiculos();
                System.out.println("¿Que vehiculo desea Rentar?, escriba el numero de placa:");       
                
                System.out.println("¿Cual es id?");
                int id=scan.nextInt();                
                System.out.println("¿Cual es el precio?");
                double precio=scan.nextDouble();
                 System.out.println("¿Cuantas horas de alquiler");
                int horas=scan.nextInt();
                System.out.println("¿Cual es el seguro?");
                double seguro=scan.nextDouble();                
                System.out.println("¿Cual es el descuento?");
                double descuento=scan.nextDouble();
                System.out.println("¿cual es la placa del vehiculo?");
                 String placa=scan.next();
                Vehiculo vehiculo=vehiculosControlador.buscar(placa);
                
                Renta nuevaRenta=new Renta(id, precio, horas, descuento, seguro, descuento, vehiculo, false);
                
                rentaControlador.guardar(nuevaRenta);
                System.out.println(nuevaRenta);
                System.out.println("Total: "+nuevaRenta.getTotal());
                System.out.println("============================");
                System.out.println("Rentas Actuales");
                System.out.println("============================");
                Renta[] consultar = rentaControlador.consultar();
                for (Renta renta : consultar) {
                    System.out.println(renta);
                }
            } else if (respuesta == 0) {
                System.out.println("Gracias por utilizar el SW");
            } else {
                System.out.println("La opcion ingresada no es válida!");
            }

        }

    }
}
