/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ISTLOJAV
 */
public class Mamifero extends Animal {
    private int TiempoGestacion;
    private boolean pelaje;

    public int getTiempoGestacion() {
        return TiempoGestacion;
    }

    public void setTiempoGestacion(int TiempoGestacion) {
        this.TiempoGestacion = TiempoGestacion;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public Mamifero() {
    }

    public Mamifero(int TiempoGestacion, boolean pelaje, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.TiempoGestacion = TiempoGestacion;
        this.pelaje = pelaje;
    }
    
}
