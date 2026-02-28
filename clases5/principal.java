/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases5;

import javax.swing.JOptionPane;

/**
 * Hacer un programa que pida nombre con apellidos
 * y la fecha de nacimiento separado por "/"
 */
public class principal {
    
    private static String nombre="", fecha="";
    
    public static void main(String[] args) {
        
        validaciones val = new validaciones();
        boolean r = false, r2 = false;
        
        do{
        nombre = JOptionPane.showInputDialog("Escribe el nombre con apellidos");
        r = val.validarNombre(nombre);
            System.out.println("Respuesta es " + r);
            
            if(r == false){
                JOptionPane.showMessageDialog(null, "El nombre esta mal escrito, \n vuelve a intentar");
            }
        }while(r == false);
        
        do{
            fecha = JOptionPane.showInputDialog("Escribe la fecha de nacimiento entre /");
            r2 = val.validarFecha(fecha);
            
            if(r2 == false){
                JOptionPane.showMessageDialog(null, "La fecha esta mal escrita, \n vuelve a intentar");
            }
            
        }while(r2 == false);
        System.out.println("Nombre: " + nombre + " y la fecha: " + fecha) ;
    }
}
