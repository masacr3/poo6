/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6ej5;

/**
 *
 * @author leo_3
 */
public class Poo6ej5 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        int i = 0;
        String p[] = {"leo","nico","kari"};
        while(i < 6){
            try{
                System.out.println(p[i]);
                i++;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("intentando acceder a más posiciones de los elementos de los que contiene");
                i++;
            }
        }
    }
    
}