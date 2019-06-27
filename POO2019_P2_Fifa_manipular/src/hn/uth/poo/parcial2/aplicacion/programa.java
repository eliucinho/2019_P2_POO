/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.aplicacion;

import hn.uth.poo.parcial2.objetos.Jugador;

/**
 *
 * @author uth
 */
public class programa {

    public static void main(String[] args) {
        System.out.println("hola mundo");
        int variableEntera = 0;
        Jugador variableJugador
                = new Jugador("X1",
                        "choco",
                        1,
                        80,
                        100,
                        "Delantero",
                        "Madrid");
        
        Jugador variableConstructorNuevo=
                new Jugador("hola", 556);
        
        System.out.println("Nombre: " 
                + variableJugador.getNombre());

    }
}
