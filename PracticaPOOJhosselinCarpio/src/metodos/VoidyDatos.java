/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
//mostrar la diferencia entre los metodos void y los que devuelven datos 
//de tipo objeto o tipos primitivos
public class VoidyDatos {

    //es un metodo de tipo void y los que devuelven datos tipo objeto o tipos primitivos
    public void sumar(int numero1, int numero2) { //recibe dos numeros de tipo entero
        System.out.println("la suma es:" + (numero1 + numero2));//presenta el resultado

    }

    //los metodos que devuelven datos pueden ser de diferentes tipos como
    //int, double, String, char, booleano y tambien pueden ser objetos
    public static void main(String[] args) {
        VoidyDatos objeto = new VoidyDatos();//creamos un objeto
        objeto.sumar(10, 8);//llamamos al metodo sumar y enviamos dos numeros
        objeto.sumar(11, 23);
        int resultado = objeto.sumar1(40, 10); //guardo lo que devuelve el metodo
        System.out.printf("la suma es:" + resultado);
        String cadena = objeto.unirCadenas("hola", "Mundo");
        System.out.println("la cadena unida es:" + cadena);
        boolean variableinicio=objeto.iniciaSesion("admin", "1234");
        System.out.println(variableinicio);
        /////////////////////
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese usuario");
    String usuario=entrada.next();
        System.out.println("ingrese contraseña");
        String password= entrada.next();
        boolean iniciaSesion=objeto.iniciaSesion(usuario, password);
        if(iniciaSesion){
            System.out.println("bienvenido al sistema");
        }else{
            System.out.println("credenciales incorrectas");
        }
        
    }

    public int sumar1(int numero1, int numero2) {
        return numero1 + numero2; //devolvemos el valor
    }

    public String unirCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;

    }

    public boolean iniciaSesion(String usuario, String password) {
        boolean valor = false;
        if (usuario.equals("admin") && password.equals("1234")) {
            valor = true;
        }
        return valor;
    }
}
