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
public class Anfibios extends Animal{
    private boolean branqueas;
    private boolean vertebrados;

    public boolean isBranqueas() {
        return branqueas;
    }

    public void setBranqueas(boolean branqueas) {
        this.branqueas = branqueas;
    }

    public boolean isVertebrados() {
        return vertebrados;
    }

    public void setVertebrados(boolean vertebrados) {
        this.vertebrados = vertebrados;
    }

    public Anfibios() {
    }

    public Anfibios(boolean branqueas, boolean vertebrados, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.branqueas = branqueas;
        this.vertebrados = vertebrados;
    }
    
}
