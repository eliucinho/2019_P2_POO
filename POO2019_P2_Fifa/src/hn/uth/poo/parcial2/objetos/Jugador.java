/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial2.objetos;

/**
 *
 * @author uth
 */
public class Jugador {
    private String numero;
    private String nombre;
    private int ficha;
    private int energia;
    private int capacidad;
    private String posicion;
    private String equipo;

    public Jugador(String numero, String nombre, int ficha, int energia, int capacidad, String posicion, String equipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.ficha = ficha;
        this.energia = energia;
        this.capacidad = capacidad;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "numero=" + numero + ", nombre=" + nombre + ", ficha=" + ficha + ", energia=" + energia + ", capacidad=" + capacidad + ", posicion=" + posicion + ", equipo=" + equipo + '}';
    }
    
    
}
