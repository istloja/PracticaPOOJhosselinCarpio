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
public class Proveedor extends Persona {

    private String entregarProducto;
    private int sueldo;

    public String getEntregarProducto() {
        return entregarProducto;
    }

    public void setEntregarProducto(String entregarProducto) {
        this.entregarProducto = entregarProducto;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void entregarProducto() {
        System.out.println("producto entregado");
    }

    @Override
    public void saludar() {
        System.out.println("buenos dias");
    }

    public void test() {
        saludar();
        super.saludar();
    }

    public static void main(String[] args) {
        Proveedor objeto = new Proveedor();
        objeto.saludar();
        objeto.test();
    }
}
