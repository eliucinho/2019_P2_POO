/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.objetos;

/**
 *
 * @author uth
 */
public class Renta {

    private int id;
    private double precio;
    private int horas;
    private double gasolina;
    private double seguro;
    private double descuento;
    private Vehiculo vehiculo;
    private boolean finalizado;

    public Renta(int id,
             double precio,
             int horas,
             double gasolina,
             double seguro,
             double descuento,
             Vehiculo vehiculo,
             boolean finalizado) {
        this.id=id;
        this.precio=precio;
        this.horas=horas;
        this.gasolina=gasolina;
        this.seguro=seguro;
        this.descuento=descuento;
        this.vehiculo=vehiculo;
        this.finalizado=finalizado;        
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }
    
    public double getTotal(){
        return (precio*horas)+seguro-descuento;
    }
    
    public boolean isFinalizado(){
        return this.finalizado;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String toString(){
        String objeto="Renta[%s,%s,%s,%s,%s,%s,%s,%s]";
        return String.format(objeto, id,precio,horas,gasolina,seguro,descuento,vehiculo,finalizado);
    }
}
