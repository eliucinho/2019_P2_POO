/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.parcial3.aplicacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uth
 */
public class Procesador {
    private List<String> historial;
    
    public Procesador(){
        historial=new ArrayList<>();
    }
    
    public void agregar(String input,String ouput){
        String historico="i: "+input+
                " ouput: "+ouput;
        
        historial.add(historico);
    }
    
    public String getHistorial(){
        return historial.toString();
    }
    
    public String generarSaludo(String mensaje){
        String respuesta="Hola "+mensaje;
        agregar(mensaje, respuesta);
        return respuesta;
    }
    
    public String bendecirSaludo(String mensaje){
        String respuesta="Bendito sea mijito "+mensaje;
        agregar(mensaje, respuesta);
        return respuesta;
    }
    
    public double calcularCuadrado(String input){
        double inputConvertido=Double.parseDouble(input);
        double resultado=inputConvertido*inputConvertido;
        
        agregar(input, String.valueOf(resultado));
        
        return resultado;
    }
}
