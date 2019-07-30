/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial3.aplicacion.objetos;

/**
 *
 * @author uth
 */
public class Candidato {
    private String nombre;
    private int totalVotos;

    public Candidato(String nombre) {
        this.nombre = nombre;
        this.totalVotos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void votar(){
        this.totalVotos++;
    }
    
    public int getTotalVotos(){
        return this.totalVotos;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nombre=" + nombre + ", totalVotos=" + totalVotos + '}';
    }
    
    
}
