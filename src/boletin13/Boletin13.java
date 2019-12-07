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
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Seleccion seleccion = new Seleccion("Spain");
      seleccion.concentrase();
       Xogador jugador1 = new Xogador("Spain",5,"Pepito","Alvarez",22,9,"demarcancion");       
        jugador1.concentrase();
       Adestrador Adestrador1 = new Adestrador("Spain",5,"Pepito","Alvarez",22,10);
        Adestrador1.concentrase();
       Masaxista Masaxista1 = new Masaxista("Spain",6,"Pepito","Alvarez",22,"Ingeniero",1);
        Masaxista1.concentrase();
       System.out.println(jugador1.toString());
       
       
   //  jugador1.getPais();
        System.out.println(jugador1.getPais());
  //   jugador1.concentraseSuper((Xogador) jugador1);
     
     //jugador1.concentraseSuper(jugador1);
     jugador1.getPais();
        
    }
    
}
