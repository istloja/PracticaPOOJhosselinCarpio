/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;


/**
 *
 * @author ISTLOJAV
 */
public class Equipo {

    private String nombre;
    private int numeroTitulo;
    private String ciudad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTitulo() {
        return numeroTitulo;
    }

    public void setNumeroTitulo(int numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Equipo(String nombre, int numeroTitulo, String ciudad) {
        this.nombre = nombre;
        this.numeroTitulo = numeroTitulo;
        this.ciudad = ciudad;
    }

   
   
    
       
    }

