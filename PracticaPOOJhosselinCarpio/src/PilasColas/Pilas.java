/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilasColas;

/**
 *
 * @author ISTLOJAV
 */
public class Pilas {

    int elemento;
    Pilas siguiente;

    Pilas(int x) {
        elemento = x;
        siguiente = null;
    }
}

class PilaLista {

    private Pilas cima;

    public PilaLista() {
        cima = null;
    }

    // operaciones
    public boolean pilaVacia() {

        if (cima == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insertar(int elemento) {
        Pilas nuevo;
        nuevo = new Pilas(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public int quitar() {
        if (pilaVacia()) {
            return -1;
        }

        int aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    public void limpiarPila() {
        Pilas t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }

}

