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
public class Adestrador extends Seleccion{
    int id;
    String nome;
    String Apellido;
    int edad;
    int idFederacion;

    public Adestrador() {
    }

    public Adestrador(String pais,int id, String nome, String Apellido, int edad, int idFederacion) {
        super(pais);
        this.id = id;
        this.nome = nome;
        this.Apellido = Apellido;
        this.edad = edad;
        this.idFederacion = idFederacion;
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

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void concentrase(){    
        System.out.println("Concentrase a seleccion");
    }
    public void viaxar(){
     
         System.out.println("viaxa os xogadores");
     }

    @Override
    public String toString() {
        return "Adestrador{" + "id=" + id + ", nome=" + nome + ", Apellido=" + Apellido + ", edad=" + edad + ", idFederacion=" + idFederacion + '}';
    }

    
}
