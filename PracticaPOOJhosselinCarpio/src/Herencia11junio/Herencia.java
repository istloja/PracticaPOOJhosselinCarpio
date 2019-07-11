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
public class Herencia {

    public static void main(String[] args) {
        Hijo hijo = new Hijo();
        Madre madre = new Madre();
        Padre padre = new Padre();
        hijo.setPadre(padre);
        hijo.setMadre(madre);
        madre.setHijo(hijo);
        padre.setEsposa(madre);
        padre.setHijo(hijo);
        System.out.println("nombre del papá de jhosselin:" + hijo.getPadre().getNombre());
        System.out.println("edad de la madre:" + madre.getEdad());
        System.out.println("nombre de la madre:" + hijo.getMadre().getNombre());

    }
}
