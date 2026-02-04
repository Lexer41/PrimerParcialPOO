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
public class Programa6 {
    
    //Hacer un programa que lea 4 numeros y que calcule el promedio de ellos
    
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int numeros;
        float promedio;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe el numero 1");
        numeros = leer.nextInt();
        num1 = numeros;
        System.out.println("Escribe el numero 2");
        numeros = leer.nextInt();
        num2 = numeros;
        System.out.println("Escribe el numero 3");
        numeros = leer.nextInt();
        num3 = numeros;
        System.out.println("Escribe el numero 4");
        numeros = leer.nextInt();
        num4 = numeros;
        
        promedio = (float)(num1 + num2 + num3 + num4) / 4;
        System.out.println("El promedio es: " + promedio);
    }
}