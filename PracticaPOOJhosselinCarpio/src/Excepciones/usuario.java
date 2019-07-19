/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class usuario {

    public static void main(String[] args) {
        int num = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        try {//ponemo el codigo que queremos proteger
            num = entrada.nextInt();

        } catch (Exception j) {//ponemos la excepciona capturar 
            System.out.println("se genero el error" + j);
            System.out.println("ingrese un numero correcto");
        }
        System.out.println("es:" + num);
        try {
            int resultado = num / 0;
            System.out.println(resultado);
        } catch (Exception a) {
            System.out.println("no se puede dividir para cero");
        }
    }
}
