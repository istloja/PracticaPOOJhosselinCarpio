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
public class Reptiles extends Animal{
    private String piel;
    private boolean arrastrar;

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    public boolean isArrastrar() {
        return arrastrar;
    }

    public void setArrastrar(boolean arrastrar) {
        this.arrastrar = arrastrar;
    }

    public Reptiles() {
    }

    public Reptiles(String piel, boolean arrastrar, String nombre, int edad, double peso, double altura, String color) {
        super(nombre, edad, peso, altura, color);
        this.piel = piel;
        this.arrastrar = arrastrar;
    }

    
    }
    
}
