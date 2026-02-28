/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author perez
 */
public class Cuadrado {
    
    void hacerCuadrado(){
        
        Scanner leer = new Scanner(System.in);
        int lado;
        
        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");
        System.out.println("****************");
        
        System.out.println("Escribe el valor del lado del cuadrado");
        lado = leer.nextInt();
        int area = lado * lado;
        int perimetro = lado + lado + lado + lado;
        System.out.println("El area del cuadrado es: " + area + "\n" + "y el perimetro es: " + perimetro);
        
    }
}
