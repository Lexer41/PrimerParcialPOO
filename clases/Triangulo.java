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
public class Triangulo {
    
    void hacerTriangulo(){
        
        Scanner leer = new Scanner(System.in);
        int base,altura,longitudLados;
        
        System.out.println("      *");
        System.out.println("     ***");
        System.out.println("    *****");
        System.out.println("   *******");
        System.out.println("  *********");
        System.out.println(" ***********");
        System.out.println("*************");
        
        System.out.println("Escribe el valor de la base del triangulo");
        base = leer.nextInt();
        System.out.println("Escribe el valor de la altura del triangulo");
        altura = leer.nextInt();
        System.out.println("Escribe la longitud de sus otros dos lados");
        longitudLados = leer.nextInt();
        
        float area = (float)(base * altura) / 2;
        int perimetro = base + (longitudLados * 2);
        
        System.out.println("El area del triangulo es: " + area + "\n" + "y el perimetro es: " + perimetro);
    }
}