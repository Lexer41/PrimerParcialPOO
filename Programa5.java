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
public class Programa5 {
    
    public static void main(String[] args) {
        /*
        Operadores aritmeticos
     +  int + int = int
        float + float = float
        double + double = double
        String + String = Concatenacion(Union de las variables)
     -  int - int = int
        float - float = float
        double - double = double
     *  int * int = int
        float * float = float
        double * double = double
     /  int / int = float
        float / float = float
        double / double = double
        Math.sqrt = raiz
        Math.pow = Potencia
        */
        
        Scanner leer = new Scanner(System.in);
        
        double numero;
        double resultado = 0.0;
        System.out.println("Escribe un numero que se elebara al cuadrado");
        numero = leer.nextFloat();
        System.out.println("Escribe la potencia");
        double potencia = leer.nextDouble();
        resultado = Math.pow(numero, potencia);
        System.out.println("Resultado " + resultado);
        
        
    }
}
