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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Jugador {

    private String nombre;
    private String apellido;
    private int edad;
    private int numeroGoles;
    private int añoDebut;
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
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

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void leerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();//permite leer una sola linea
            while (auxiliar != null) {
                Jugador j1 = (Jugador) auxiliar;
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {

        }

    }

    public List<Jugador> leerJugador(String dir) {

        List<Jugador> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador m = (Jugador) auxiliar;
                lista.add(m);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;

    }

    public void escrbirLista(String direccion, List<Jugador> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Jugador jugador : lista) {//para recorrer una lista
                //Persona:clase    //persona:objeto
                //por cada vez que se recorre la lista se crea un objeto de la clase persona
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception j) {
            System.out.println("se produjo un error:" + j);
        }

    }

    public int Masedad(List<Jugador> lista) {
        int edadmax = 33;
        for (Jugador jugador : lista) {
            if (jugador.getEdad() < edadmax) {
                System.out.println("  no es " + jugador.getNombre());
            } else {
                System.out.println(" edad maxima " + jugador.getNombre());
            }

        }
        return edad;
    }

    public int menoredad(List<Jugador> lista) {
        int edadmin = 27;
        for (Jugador jugador : lista) {
            if (jugador.getEdad() > edadmin) {
                System.out.println(" no es joven " + jugador.getNombre());
            } else {
                System.out.println(" es joven " + jugador.getNombre());
            }

        }
        return edad;
    }

    public int masgoles(List<Jugador> lista) {
        int goles = 600;
        for (Jugador jugador : lista) {
            if (jugador.getNumeroGoles() < goles) {
                System.out.println(" no es el que tiene mayor numero de goles " + jugador.getNumeroGoles() + " " + jugador.getNombre());
            } else {
                System.out.println(" tiene el mayor numero de goles " + jugador.getNumeroGoles() + " " + jugador.getNombre());
            }

        }
        return goles;
    }

    public int debut(List<Jugador> lista) {
        int debut = 2005;
        for (Jugador jugador : lista) {
            if (jugador.getAñoDebut() > debut) {
                System.out.println(" debutaron en el año: " + jugador.getNombre() + " en el año: " + jugador.getAñoDebut());
            } else {
                System.out.println(" debuto primero: " + jugador.getNombre() + " en el año: " + jugador.getAñoDebut());
            }

        }
        return debut;
    }

    public static void main(String[] args) {
        Jugador j = new Jugador("cristiano", "ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Tunin"));
        Jugador j2 = new Jugador("lionel", "messi", 31, 600, 2007, new Equipo("barcelona", 30, "barcelona"));
        Jugador j3 = new Jugador("neymar", "jr", 28, 200, 2011, new Equipo("psg", 10, "paris"));
        Jugador j4 = new Jugador("eden", "hazard", 27, 590, 2010, new Equipo("real madrid", 40, ",madrid"));
        List<Jugador> lista = new ArrayList<>();
        lista.add(j);
        lista.add(j2);
        lista.add(j3);
        lista.add(j4);
        int a = lista.size();

        System.out.println(a);
        List<Jugador> c = j.leerJugador("‪C:\\Users\\ISTLOJAV\\Desktop\\ejemplo.txt");
        j.escrbirLista("‪C:\\Users\\ISTLOJAV\\Desktop\\ejemplo.txt", lista);
       j.masgoles(lista);
        j.Masedad(lista);
        j.menoredad(lista);
        j.debut(lista);

    }

}
