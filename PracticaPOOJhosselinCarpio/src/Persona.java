
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
public class Persona implements Serializable{

    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private Mascota mascota;

    public Persona() {

    }

    public Persona(String nombre, String apellido, String telefono, int edad, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.mascota = mascota;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public static void main(String[] args) {
        Persona j1 = new Persona("jhosselin", "Carpio", "0995261713", 18, new Mascota("Ban", 6, 4));
        Persona j2 = new Persona("Ramiro", "Capa", "0959502253", 20, new Mascota("Wilson", 1, 4));
        System.out.println("La persona se llama:" + j1.getNombre() + "y su mascota se llama:" + j1.getMascota().getNombre());
    }
}
