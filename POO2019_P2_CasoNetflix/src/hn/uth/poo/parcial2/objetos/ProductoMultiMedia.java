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
public class ProductoMultiMedia {

    private String nombre;
    private String categoria;
    private int anio;

    public ProductoMultiMedia(String nombre, String categoria, int anio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "ProductoMultiMedia{" + "nombre=" + nombre + ", categoria=" + categoria + ", anio=" + anio + '}';
    }

    public void promocionar() {
        System.out.println("Promocionando " + this.nombre+" "+this.categoria);
    }

    public void seguir() {
        System.out.println("Siguiendo a " + this.nombre);
    }
}
