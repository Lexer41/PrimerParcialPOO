/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases5;

/**
 *
 * @author perez
 */
public class validaciones {
    
    public boolean validarNombre(String n){
        
        n = n.replace("de", ""); //Remplasa caracteres
        n = n.replace("los", "");
        n = n.replace("a", "");
        String [] palabras = n.split(" ");
        
        if(palabras.length >= 3){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validarFecha(String f){
        
        boolean r = false;
        int c = 0;
        
        /*int p = f.indexOf("/");
        int p2 = f.indexOf("/", p + 1);*/
        
        String [] n = f.split("/");
        
        if(n.length == 3){
            
            for(int x=0; x<3;x++){
                r = ValidarNumeros(n[x]);
                if(r == true){
                    c++;
                }
            }
            
            if(c == 3){
                return true;
            }else{
                return false;
            }
            
        }else{
            return false;
        }
        
    }
    
    private boolean ValidarNumeros(String d){
        
        try{
            int a = Integer.parseInt(d);
            return true;
        }catch(Exception e){
            return false;
        }
        
    }
}
