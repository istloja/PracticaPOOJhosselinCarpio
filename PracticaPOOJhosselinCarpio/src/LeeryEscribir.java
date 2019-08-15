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
        lista.add(j);
        lista.add(j1);
        lista.add(j3);
        lista.add(j4);
        m1.escrbirLista("C:\\Users\\ISTLOJAV\\Desktop/ejemplo.txt", lista);
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
    
    public void escrbirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) {//para una lista
                escritor.writeObject(persona);
            }
            escritor.close();
        } catch (Exception j) {
            System.out.println("se produjo un error:" + j);
        }
        
    }
}
