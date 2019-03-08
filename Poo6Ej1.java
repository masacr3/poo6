/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6.ej1;

/**
 *
 * @author leo_3
 */

public class Poo6Ej1 {

    static void print(String msj){
        System.out.println(msj);
    }
    
    
    static void ejecutarBloques(){
       
       print("Intentamos ejecutar el bloque de instrucciones:");
       try{
           bloque1();
           bloque2();
           bloque3();
       }
       catch(NumberFormatException e){
           print("Instrucciones a ejecutar cuando se produce un error");
       }
       finally{
           print("Instrucciones a ejeutar finalmente tanto si se producen errores como si no.");
       }
        
    }
    
    static void bloque1(){
        int a, b, res;
        
        a = 1;
        b = 2;
        res = a + b;
        
        print("Instruccion 1.");
        
    }
    
    static void bloque2() throws NumberFormatException {
        int n = Integer.parseInt("22");
        print("Instruccion 2.");
    }
    
    static void bloque3(){
        print("Instruccion 3. etc");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ejecutarBloques();
    }
    
}
