/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6ej4;

/**
 *
 * @author leo_3
 */
public class ErrorLeo extends Exception{
    private String mensaje;
    
    public ErrorLeo(){}
    
    public ErrorLeo(String msj){
        super(msj);
        this.mensaje = msj;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public void try_catch(){
        
        int dimension = 2;
        try{
            if( dimension <= 2 ){
                throw new ErrorLeo("No hay producto vectorial en dimensiones menores o iguales a 2");
            }
        }
        catch(ErrorLeo e){
            System.out.println("contenido de la variable mensaje: "+e.getMensaje());
            System.out.println("-----------------------");
            System.out.println(e.getMessage());
        }
    }
}
