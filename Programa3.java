/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author perez
 */
public class Programa3 {
    private static String nombre; //Cadenas de caracteres
    private static float estatura;
    private static char sexo; //Un solo caracter
    private static int edad;
    
    public static void main(String[] args) {
        //3 formas de leer datos
        nombre = JOptionPane.showInputDialog("Escribe el nombre");
        //casting/Conversion implicita y/o explicita
        estatura = Float.parseFloat(JOptionPane.showInputDialog("Escribe la estaura de la persona"));
        sexo = JOptionPane.showInputDialog("Escribe el sexo de la persona").charAt(0);
        edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la edad de la persona"));
        
        JOptionPane.showMessageDialog(null, " El nombre es: " + nombre + "\n Su estatura es: " + estatura + "\n El sexo es: " + sexo + "\n La edad es: " + edad);
    }
}