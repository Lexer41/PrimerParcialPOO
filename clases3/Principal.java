/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases3;

import javax.swing.JOptionPane;

/**
 *
 * @author perez
 */
public class Principal {
    
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        
        String nom="", pre="", cant="",respuesta="",datos;
        
        while(true){
        datos = JOptionPane.showInputDialog("Escribe nombre, precio y cantidad de un prooducto, separados por comas \n" + "por ejemplo: nombre,precio,cantidad");
        boolean res1 = false;
        
        //System.out.println(val.BuscarComas(datos));
        res1 = val.BuscarComas(datos);
        if(res1 == true){
            System.out.println("Si es correcto");
            String [] partir = datos.split(","); //Para partir la cadena de texto donde esta la coma
            
            nom = partir[0];
            pre = partir[1];
            cant = partir[2];
            break;
        }else{
            System.out.println("Error, vuelve a intentarlo");
        }
      }
        System.out.println(nom + "\n" + pre + "\n" + cant);
    }
}