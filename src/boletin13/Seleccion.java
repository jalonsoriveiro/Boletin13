/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author Jose
 */
public class Seleccion {

   public String pais;
   Xogador xogador;
    public Seleccion() {
    }

    public Seleccion(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
     public void concentrase(){    
    
     
         System.out.println("Concentrase a seleccion");
    }      
   /*  public void concentraseSuper(Xogador xogador){    
    
      xogador.concentrase();
    }      */
     
     public void viaxar(){
     
         System.out.println("viaxa a selección");
     }
            
            
    @Override
    public String toString() {
        return "Seleccion{" + "pais=" + pais + '}';
    }


}
