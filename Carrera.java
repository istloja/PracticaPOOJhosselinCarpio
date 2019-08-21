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
public class Carrera {
    private String nomre;
    private int numeroCiclos;
    private double numeroCreditos;

    public Carrera() {
    }

    public Carrera(String nomre, int numeroCiclos, double numeroCreditos) {
        this.nomre = nomre;
        this.numeroCiclos = numeroCiclos;
        this.numeroCreditos = numeroCreditos;
    }
    

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }

    public int getNumeroCiclos() {
        return numeroCiclos;
    }

    public void setNumeroCiclos(int numeroCiclos) {
        this.numeroCiclos = numeroCiclos;
    }

    public double getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(double numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
    
}
