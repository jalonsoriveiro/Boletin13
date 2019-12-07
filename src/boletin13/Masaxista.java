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
public class Masaxista extends Seleccion{
    int id;
    String nome;
    String Apellido;
    int edad;
    String titulacion;
    int anosExperiencia;

    public Masaxista(int id, String nome, String Apellido, int edad, String titulacion, int anosExperiencia) {
        this.id = id;
        this.nome = nome;
        this.Apellido = Apellido;
        this.edad = edad;
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public Masaxista( String pais,int id, String nome, String Apellido, int edad, String titulacion, int anosExperiencia) {
        super(pais);
        this.id = id;
        this.nome = nome;
        this.Apellido = Apellido;
        this.edad = edad;
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
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

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String getPais() {
        return pais;
    }

    @Override
    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public void concentrase(){    
        System.out.println("Concentrase o masaxista");
    }
    @Override
    public void viaxar(){
     
         System.out.println("viaxa os xogadores");
     }

    @Override
    public String toString() {
        return "Masaxista{" + "id=" + id + ", nome=" + nome + ", Apellido=" + Apellido + ", edad=" + edad + ", titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }


}
