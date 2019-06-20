/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author ISTLOJAV
 */
public class EstaticosyDinamicos {

    public static void main(String[] args) {
        saludar();//para llamar un metodo estatico
        //si quiero llamar a un metodo dinamico debo crear un objeto
        EstaticosyDinamicos objeto = new EstaticosyDinamicos();//creo un objeto
        objeto.despedir();//as se llama a un metodo estatico
    }

    public static void saludar() { //Este es un metodo estatico
        System.out.println("HOLA");

    }

    public void despedir() { //Este es un metodo NO estatico
        System.out.println("CHAO");

    }
}
