/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases3;

/**
 *
 * @author perez
 */
public class Validaciones {
    
    public boolean BuscarComas(String d){
        int p = d.indexOf(",");
        int p2 = d.indexOf(",", p+1); //De la posicion p mas 1 en adelante busque la coma
        
        if(p != -1 && p2 != -1){
            return true;
        }else{
            return false;
        }
    }
}