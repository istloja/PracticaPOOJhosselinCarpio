/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia11junio;

/**
 *
 * @author ISTLOJAV
 */
public class Hijo extends Personna{
    Madre madre;
    Padre padre;
    Padre abuelo;
    public Hijo(){
        setNombre("Jhosselin");
        setEdad(18);
    }

    public Madre getMadre() {
        return madre;
    }

    public void setMadre(Madre madre) {
        this.madre = madre;
    }

    public Padre getPadre() {
        return padre;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }

    public Padre getAbuelo() {
        return abuelo;
    }

    public void setAbuelo(Padre abuelo) {
        this.abuelo = abuelo;
    }
    
    
}
