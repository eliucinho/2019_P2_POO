/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p1.objetos;

/**
 *
 * @author eliucinho
 */
public class Vehiculo {
    //Definiendo sus atributos
    private String placa;
    private String color;
    private String marca;
    private String modelo;
    private int anio;
    private double precio;
    
    //metodo constructor: no tiene void y tampoco tipo
    //un constructor siempr es publico
    //es el primer metodo que se ejecuta cuando se crea un objeto
    //el metodo puede tener codio o no tener
    //el metodo puede recibir parametros o no recibir
    
    //metodo contructor por defecto
    //es publico con el MISMO nombre de la clase
    public Vehiculo(){
        System.out.println("Se ha creado el objeto vehiculo");        
    }
    //el metodo constructor puede recibir los valores de los
    //atributos necesario para inicializar el objeto
    public Vehiculo(String placa){
        this.placa=placa;
    }
    
    //constructor con todos los atributos
    public Vehiculo(String placa, 
            String color,
            String marca,
            String modelo,
            int anio,
            double precio
    ){
        this.placa=placa;
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.precio=precio;
    }
    
    
    
    
}
