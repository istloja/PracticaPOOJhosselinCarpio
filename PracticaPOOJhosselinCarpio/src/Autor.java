/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author ISTLOJAV
 */
public class Autor implements Serializable{

    private String nombre;
    private String apellido;
    private int edad;
    private int librosEscritos;
    private String ubicacion;

    public Autor() {
    }

    public Autor(String nombre, String apellido, int edad, int librosEscritos, String ubicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.librosEscritos = librosEscritos;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getLibrosEscritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(int librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

  
}
