/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author perez
 */
public class Principal {
    
    private static int numero1;
    private static String numeroAvalidar;
    
    public static void main(String[] args) throws IOException {
        
        Scanner leer = new Scanner(System.in);
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Escribe un numero");
        numeroAvalidar =entrada.readLine();
        //int a = leer.nextInt();
        validar();
        
        
    }
    
    static void validar(){
        int c = 0;
        
        for(int x=0; x<numeroAvalidar.length(); x++){
             System.out.println(numeroAvalidar.codePointAt(x));
             if(numeroAvalidar.codePointAt(x) >= 48 && numeroAvalidar.codePointAt(x) <= 57){
                 //System.out.println("Son numeros");
                 c = c + 1;
             }else{
                 //System.out.println("No son numeros");
             }
        }
        
        if(c == numeroAvalidar.length()){
            System.out.println("Son numeros");
            numero1 = Integer.parseInt(numeroAvalidar);
        }else{
            System.out.println("No son numeros");
        }
       
        System.out.println("El numero fue: " + numero1);
        
    }
    
}