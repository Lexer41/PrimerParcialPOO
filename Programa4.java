/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 *Descripcion del problema:
 * Hacer un programa que lea una cantidad en pesos
 * y los convierta en dolare, Euros, Libras
 * donde el dolar 18 pesos, el Euro es 1.20 dolares y la libra 1.05 Euros
 */
public class Programa4 {
    //Constantes
    
    static int dolar = 18;
    //Si es un flotante, hay que ponerle f
    static float euro = 1.20f;
    static float libra = 1.05f;
    static int pesos;
    static float resultado = 0.0f;
    
    public static void main(String[] args) {
        
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Escribe una cantidad en pesos");
        pesos = numeros.nextInt();
        resultado = (float)pesos / dolar;
        System.out.println("Los dolares son " + resultado);
        resultado = resultado / euro;
        System.out.println("Los euros son " + resultado);
        resultado = resultado / libra;
        System.out.println("Las libras son " + resultado);
        
    }
}