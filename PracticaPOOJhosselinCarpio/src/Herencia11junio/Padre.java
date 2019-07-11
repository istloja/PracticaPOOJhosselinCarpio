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
public class Padre extends Personna{
    Madre esposa;
    Hijo hijo;
    public Padre(){
        setNombre("Edisson");
        setApellido("Carpio");
        setEdad(38);
    }

    public Madre getEsposa() {
        return esposa;
    }

    public void setEsposa(Madre esposa) {
        this.esposa = esposa;
    }

    public Hijo getHijo() {
        return hijo;
    }

    public void setHijo(Hijo hijo) {
        this.hijo = hijo;
    }
}
