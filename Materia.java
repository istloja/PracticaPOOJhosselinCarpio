/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeberArchivosS;

/**
 *
 * @author ISTLOJAV
 */
public class Materia {
    private String nombre;
    private double credito;
    private String docente;
    private String carrera;

    public Materia() {
    }

    public Materia(String nombre, double credito, String docente, String carrera) {
        this.nombre = nombre;
        this.credito = credito;
        this.docente = docente;
        this.carrera = carrera;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
