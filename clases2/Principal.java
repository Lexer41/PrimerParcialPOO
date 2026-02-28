/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hacer un programa que lea nombre, precio y cantidad de n productos, el programa terminara hasta que el usuario lo permita, y se mostrara
 * el total a pagar por cada producto
 */
public class Principal {
    public static void main(String[] args) throws IOException {
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        String nombre = "", precio = "", cantidad = "";
        Validaciones val = new Validaciones();
        String respuesta;
        
      do{
        boolean bandera = true;
            
        while(bandera == true){ //while(bandera)
            System.out.println("Escribe el nombre de un producto");
            nombre = leer.readLine();
            
            if(val.ValidarLetras(nombre)){
                bandera = false;
            }else{
                System.out.println("Error al escribir el nombre, vuelve a intentarlo");
            }
        }
        
        while(bandera == false){
            System.out.println("Escribe el precio del producto");
            precio = leer.readLine();
            
            if(val.ValidarNumerosConDecimales(precio)){
                bandera = true;
            }else{
                System.out.println("Error al escribir el precio, vuelve a intentarlo");
            }
        }
        
        while(bandera == true){
            System.out.println("Escribe la cantidad del producto");
            cantidad = leer.readLine();
            
            if(val.ValidarNumerosEnteros(cantidad)){
                bandera = false;
            }else{
                System.out.println("Error al escribir la cantidad, vuelve a intentarlo");
            }
        }
            System.out.println("El nombre es: " + nombre + "\n" + "el precio es: " + precio + "\n" + "la cantidad es: " + cantidad + "\n" + "y el total es: " + Float.parseFloat(precio) * Integer.parseInt(cantidad));
        
       System.out.println("Deseas otro producto");
       respuesta = leer.readLine();
        
       }while(respuesta.equals("Si") || respuesta.equals("SI") || respuesta.equals("si"));
    }
}