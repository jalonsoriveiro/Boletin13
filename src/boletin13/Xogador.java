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
public class Xogador extends Seleccion{
    public int id;
    public String nome;
    public String Apellido;
    public int edad;
    public int dorsal;
    public String Demarcacion;

    public Xogador(String pais,int id, String nome, String Apellido, int edad, int dorsal, String Demarcacion) {
       super(pais);
        this.id = id;
        this.nome = nome;
        this.Apellido = Apellido;
        this.edad = edad;
        this.dorsal = dorsal;
        this.Demarcacion = Demarcacion;
    }
 
    public Xogador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return Demarcacion;
    }

    public void setDemarcacion(String Demarcacion) {
        this.Demarcacion = Demarcacion;
    }

    /*public void concentrase(){    
       
        System.out.println("fffff");
    }*/
     public void concentrase(){    
       
        System.out.println("Concentrase o xogadores");
    }
    public void viaxar(){
     
         System.out.println("viaxa os xogadores");
     }
     @Override
    public String toString() {
        return "Xogador{" + "id=" + id + ", nome=" + nome + ", Apellido=" + Apellido + ", edad=" + edad + ", dorsal=" + dorsal + ", Demarcacion=" + Demarcacion + '}';
    }
    
    
}
