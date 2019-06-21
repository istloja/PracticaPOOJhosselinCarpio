/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia21junio;

/**
 *
 * @author ISTLOJAV
 */
public class Cliente extends Persona {

    private int nCompras;
    private String tPago;

    public int getnCompras() {
        return nCompras;
    }

    public void setnCompras(int nCompras) {
        this.nCompras = nCompras;
    }

    public String gettPago() {
        return tPago;
    }

    public void settPago(String tPago) {
        this.tPago = tPago;
    }

    public void comprar() {
        System.out.println("la compra fue realizada con exito");
    }

    @Override//significa que estoy sobreescribiendo
    public void saludar() {
        System.out.println("hola soy un cliente");
    }

    public void test() {
        saludar();
        super.saludar();//llama al metodo de la clase padre
    }

    public static void main(String[] args) {
        Cliente objeto = new Cliente();
        objeto.saludar();
        // objeto.comprar();
        objeto.test();
    }

}
