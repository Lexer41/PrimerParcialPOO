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
public class Programa1 {
    //Atajo a este metodo es psvm + tab
    public static void main(String[] args) {
        //El atajo es sout + tab
        System.out.println("Hola mundo"); //Esta instruccion muestra un mensaje en la consola
        //Instruccion para mostrar mensajesmediante una ventana
        JOptionPane.showMessageDialog(null,"Hola mundo");
    }
}