/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author perez
 */
public class Pragrama7 {
    
    static int n1;
    
    public static void main(String[] args) throws IOException {
        //Scanner para numeros
        //BufferedReader letras
        //JOptionPane letras
        Scanner leer = new Scanner(System.in);
        BufferedReader escribir = new BufferedReader(new InputStreamReader(System.in));
        
        int a = leer.nextInt();
        int b = leer.nextInt();
        float c = leer.nextFloat();
        double e = leer.nextDouble();
        String nombre = escribir.readLine();
        
        System.out.println("Resultado " + a); //Concatenacion o adicion
        
        //double resultado = ((double)a + (double)b + c + (double)e) / 4;
        float resultado = ((float)a + (float)b + c + (float)e) / 4;
        
       //Raiz cuadrada
       double c1 = Math.sqrt(c);
       //Elevar potencia
       double c2 = Math.pow(e, 2);
    }
    
}