/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivosSerializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class LeeryEscribir {

    //en los archivos Serializables se guardan objetos
    //para guardar un objeto
    public void escribirObjeto(String direccion, Persona j1) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(j1);
            escritor.close();
        } catch (Exception j) {
            System.out.println("se produjo un error:" + j);
        }

    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Persona j1 = (Persona) auxiliar;//cambio de objeto a persona 
            System.out.println(j1.getNombre());
        } catch (Exception j) {
            System.out.println(j);
        }
    }

    public void leerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();//permite leer una sola linea
            while (auxiliar != null) {
                Persona j1 = (Persona) auxiliar;
                System.out.println(j1.getMascota().getNombre() + "su edad es:" + j1.getMascota().getEdad());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {

        }
    }

    public List<Persona> leerPersona(String dir) {

        List<Persona> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Persona j1 = (Persona) auxiliar;
                lista.add(j1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;

    }

    public void escrbirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) {//para recorrer una lista
                //Persona:clase    //persona:objeto
                //por cada vez que se recorre la lista se crea un objeto de la clase persona
                escritor.writeObject(persona);
            }
            escritor.close();
        } catch (Exception j) {
            System.out.println("se produjo un error:" + j);
        }

    }

    public static void main(String[] args) {
        LeeryEscribir m1 = new LeeryEscribir();
        Persona j2 = new Persona("Ramiro", "Capa", "0959502253", 20, new Mascota("Wilson", 1, 4));
        //m1.escribirObjeto("C:\\Users\\ISTLOJAV\\Desktop/ejemplo.txt", j2);
        m1.leerArchivo("C:\\Users\\ISTLOJAV\\Desktop/ejemplo.txt");
        Persona j = new Persona("Ramiro1", "Capa", "0959502253", 20, new Mascota("Wilson1", 1, 4));
        Persona j1 = new Persona("Ramiro2", "Capa", "0959502253", 20, new Mascota("Wilson2", 1, 4));
        Persona j3 = new Persona("Ramiro3", "Capa", "0959502253", 20, new Mascota("Wilson3", 1, 4));
        Persona j4 = new Persona("Ramiro4", "Capa", "0959502253", 20, new Mascota("Wilson4", 1, 4));
        List<Persona> lista = new ArrayList<>();//Creamos la lista para guardar objetos
//        una vez que creamos la lista ponemos los objetos en ella
//        lista.add(j);
//        lista.add(j1);
//        lista.add(j3);
//        lista.add(j4);
//        System.out.println(lista.size());//obtemgo el tamaño de la lista
//        int a = lista.size();
        // for (Persona persona : lista) {
        // System.out.println(persona.getNombre());
//        }
        //m1.leerLista("C:\\Users\\ISTLOJAV\\Desktop/ejemplo.txt");      
        //m1.escrbirLista("C:\\Users\\ISTLOJAV\\Desktop/ejemplo.txt", lista);
        List<Persona> c = m1.leerPersona("C:\\Users\\ISTLOJAV\\Desktop/ejemplo.txt");
        for (Persona persona : c) {
            System.out.println(persona.getEdad());

        }

    }
}
