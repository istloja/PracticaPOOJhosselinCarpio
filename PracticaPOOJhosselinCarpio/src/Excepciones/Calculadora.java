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
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para sumar, 2 para restar, 3 para multiplicar o 4 para dividir");
        try {
            int numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("ingrese un numero");
                    try {
                        int numero1 = entrada.nextInt();

                        System.out.println("ingrese otro numero");
                        int numero2 = entrada.nextInt();
                        int respuesta;
                        respuesta = numero1 + numero2;
                        System.out.println(" la respuesta es: " + respuesta);
                    } catch (Exception j) {
                        System.out.println("se genero el error en" + j);
                        System.out.println("ingrese un numero correcto");
                    }
                    break;
                case 2:
                    System.out.println("ingrese un numero");
                    try {
                        int numero3 = entrada.nextInt();
                        System.out.println("ingrese otro numero");
                        int numero4 = entrada.nextInt();
                        int resp;
                        resp = numero3 - numero4;
                        System.out.println(" la respuesta es: " + resp);
                    } catch (Exception a) {
                        System.out.println("se genero el error" + a);
                        System.out.println("ingrese un numero correcto ");
                    }
                    break;
                case 3:
                    System.out.println("ingrese un numero");
                    try {
                        int numero5 = entrada.nextInt();
                        System.out.println("ingrese otro numero");
                        int numero6 = entrada.nextInt();
                        int rest;
                        rest = numero5 * numero6;
                        System.out.println(" la respues es: " + rest);
                    } catch (Exception r) {
                        System.out.println("se produjo el error" + r);
                        System.out.println("ingrese un numero correcto");
                    }
                    break;
                case 4:
                    System.out.println("ingrese un numero");
                    try {
                        int numero7 = entrada.nextInt();
                        System.out.println("ingrese otro numero");
                        int numero8 = entrada.nextInt();
                        int re;
                        re = numero7 / numero8;
                        System.out.println(" la respuesta es " + re);
                    } catch (Exception m) {
                        System.out.println("se genero el error" + m);
                        System.out.println("ingrese un numero correcto");
                    }
                    break;
                default:

            }
        } catch (Exception b) {
            System.out.println("se genero el error" + b);
            System.out.println("ingrese un numero correcto");
        }

    }
}
