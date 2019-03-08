/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6.ej3;

/**
 *
 * @author leo_3
 */
public class Poo6Ej3 extends Exception {
    
    public Poo6Ej3(){} 
    
    public Poo6Ej3(String msj){
        super(msj);
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            throw new Poo6Ej3("error");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Finalizo la ejecucion de la aplicacion");
        }
    }
    
}
