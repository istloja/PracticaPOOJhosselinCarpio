/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosSerializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJAV
 */
public class Mascota implements Serializable{

    private String nombre;
    private int edad;
    private int numeroPatas;

    public Mascota() {

    }

    public Mascota(String nombre, int edad, int numeroPatas) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroPatas = numeroPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
