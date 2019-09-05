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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class Libro implements Serializable {

    private String nombre;
    private int añoEscrito;
    private String Autor;
    private int diapublicacion;
    private double costo;
    private Autor autor;

    public Libro() {
    }

    public Libro(String nombre, int añoEscrito, String Autor, int diapublicacion, double costo, Autor autor) {
        this.nombre = nombre;
        this.añoEscrito = añoEscrito;
        this.Autor = Autor;
        this.diapublicacion = diapublicacion;
        this.costo = costo;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoEscrito() {
        return añoEscrito;
    }

    public void setAñoEscrito(int añoEscrito) {
        this.añoEscrito = añoEscrito;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getDiapublicacion() {
        return diapublicacion;
    }

    public void setDiapublicacion(int diapublicacion) {
        this.diapublicacion = diapublicacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void escribirObjeto(String direccion, Libro j1) {
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
            Libro j1 = (Libro) auxiliar;//cambio de objeto a persona 
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
                Libro j1 = (Libro) auxiliar;

                auxiliar = lector.readObject();
            }
        } catch (Exception e) {

        }
    }

    public List<Libro> leerPersona(String dir) {

        List<Libro> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro j1 = (Libro) auxiliar;
                lista.add(j1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;

    }

    public int masAntiguo(List<Libro> lista) {
        int masAntiguo = lista.get(0).getDiapublicacion();

        for (Libro libro : lista) {
            if (libro.getDiapublicacion() < masAntiguo) {
                masAntiguo = libro.getDiapublicacion();
                System.out.println(" el libro mas antiguo es " + masAntiguo);
            } else {

            }

        }
        return masAntiguo;
    }

    public int LibroActual(List<Libro> lista) {
 
        int año = lista.get(0).getDiapublicacion();

        for (Libro libro : lista) {
            if (libro.getDiapublicacion() <= 5) {
            
                System.out.println(" el libro esta actualizado");
            } else {
                System.out.println("no esta actualizado");
            }

        }
        return año;
    }

    public static void main(String[] args) {
        Libro m = new Libro();
        Libro s1 = new Libro("viaje a la luna", 2011, "paulo", 2001, 15.50, new Autor("paulo", "Coelho", 45, 8, "Rio de Janeiro"));
        Libro s2 = new Libro("viaje a la luna", 2006, "paulo", 2002, 11.25, new Autor("paulo", "Coelho", 45, 8, "Rio de Janeiro"));
        Libro s3 = new Libro("viaje a la luna", 2008, "paulo", 2008, 15.00, new Autor("paulo", "Coelho", 45, 8, "Rio de Janeiro"));
        Libro s4 = new Libro("viaje a la luna", 2014, "paulo", 2019, 20.00, new Autor("paulo", "Coelho", 45, 8, "Rio de Janeiro"));
        Libro s5 = new Libro("viaje a la luna", 2009, "paulo", 2013, 18.50, new Autor("paulo", "Coelho", 45, 8, "Rio de Janeiro"));
        List<Libro> lista = new ArrayList<>();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);
        int a = lista.size();

        m.escribirObjeto("‪C:\\Users\\ISTLOJAV\\Desktop\\libro.txt", s1);
        m.leerArchivo("‪C:\\Users\\ISTLOJAV\\Desktop\\libro.txt");
        m.leerLista("‪C:\\Users\\ISTLOJAV\\Desktop\\libro.txt");
m.LibroActual(lista);
    }

}
