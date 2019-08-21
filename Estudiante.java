/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberArchivosS;

import ArchivosSerializables.Persona;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private String materia;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String direccion, int edad, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.materia = materia;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void leerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();//permite leer una sola linea
            while (auxiliar != null) {
                Estudiante j1 = (Estudiante) auxiliar;
                System.out.println(j1.getNombre());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {

        }
    }

    public void escrbirLista(String direccion, List<Estudiante> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Estudiante estudiante : lista) {//para recorrer una lista
                //Persona:clase    //persona:objeto
                //por cada vez que se recorre la lista se crea un objeto de la clase persona
                escritor.writeObject(estudiante);
            }
            escritor.close();
        } catch (Exception j) {
            System.out.println("se produjo un error:" + j);
        }

    }

    public static void main(String[] args) {
        Estudiante a = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "ciudadania");
        System.out.println("Nombre y apellido del estudiante:" + a.getNombre() + a.getApellido());
        Estudiante a1 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "fisica");
        Estudiante a2 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "historia");
        Estudiante a3 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "matematica");
        Estudiante a4 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "lenguaje");
        Estudiante a5 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "fisica");
        Estudiante a6 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "historia");
        Estudiante a7 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "matematica");
        Estudiante a8 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "lenguaje");
        Estudiante a9 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "fisica");
        Estudiante a10 = new Estudiante("Jhosselin", "Carpio", "Malacatos", 18, "historia");

        List<Estudiante> lista = new ArrayList<>();
        lista.add(a);
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);
        lista.add(a6);
        lista.add(a7);
        lista.add(a8);
        lista.add(a9);
        lista.add(a10);
        int m = lista.size();
        System.out.println(m);
        for (Estudiante estudiante : lista) {
            System.out.println("Nombre y apellido del estudiante:" + a.getNombre() + a.getApellido());

        }
        a.escrbirLista("C:\\Users\\ISTLOJAV\\Desktop", lista);
    }
}
