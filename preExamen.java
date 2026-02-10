/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author perez
 */

/*
Hacer un programa que pida 5 numeros enteros  positivos, esto quiere decir que no se pueden almacenar numeros negativos.
A continuacion se realizaran las siguientes operaciones 
1.-Se calculara el producto de los primeros tres numeros
2.-Se elevara el cuarto numero a la potencia del 5to
3.-Se calculara el promedio de los ultimos 3 numeros.
Los resultados de cada operacion se mostraran en un solo mensaje mediante un JOptionPane
*/
public class preExamen {
    
    public static void main(String[] args) {
        
        byte num1, num2, num3, num4, num5;
        int resultadoPro;
        double resultadoPot;
        float resultadoProm;
        String resultado;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escribe el primer numero entero");
        num1 = leer.nextByte();
        System.out.println("Escribe el segundo numero entero");
        num2 = leer.nextByte();
        System.out.println("Escribe el tercer numero entero");
        num3 = leer.nextByte();
        System.out.println("Escribe el cuarto numero entero");
        num4 = leer.nextByte();
        System.out.println("Escribe el quinto numero entero");
        num5 = leer.nextByte();
        
        resultadoPro = (num1 * num2 * num3);
        
        resultadoPot = Math.pow(num4, num5);
        
        resultadoProm = (num3 + num4 + num5) / 3;
        
        resultado = "El producto es: " + resultadoPro + "\n" + "La potencia es: " + resultadoPot + "\n" + "El prometio es: " + resultadoProm;
        
        JOptionPane.showMessageDialog(null, resultado);
        
        System.out.println("L");
        
    }
}