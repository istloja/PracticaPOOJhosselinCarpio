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
public class Ave extends Animal{
    private boolean vuela;
    private int NumHuevos;

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public int getNumHuevos() {
        return NumHuevos;
    }

    public void setNumHuevos(int NumHuevos) {
        this.NumHuevos = NumHuevos;
    }

    public Ave() {
    }

    public Ave(boolean vuela, int NumHuevos, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.vuela = vuela;
        this.NumHuevos = NumHuevos;
    }

    
    


  
}
    
    

