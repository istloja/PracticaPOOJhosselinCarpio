/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica27JUNIO;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Ejecutar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para circulo, 2 para " + "tieangulo y 3 para cuadrado");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                System.out.println("ingrese el radio del circulo:");
                double radio = entrada.nextDouble();
                Circulo objeto = new Circulo();
                double areaCirculo = objeto.CalcularArea(radio);
                double perimetroCirculo = objeto.CalcularPerimetro(radio, radio);
                System.out.println("el area" + areaCirculo + " y el perimetro es:" + perimetroCirculo);
                //en case siempre va un break
                break;
            case 2:
                System.out.println("ingrese la altura del triangulo");
                double h = entrada.nextDouble();
                System.out.println("ingrese la base");
                double base = entrada.nextDouble();
                Triangulo o = new Triangulo();
                double areaTriangulo = o.CalcularArea(h, base);
                System.out.println("el area del triangulo es:" + areaTriangulo);
                System.out.println("ingrese 3lados:");
                double lado1 = entrada.nextDouble();
                double lado2 = entrada.nextDouble();
                double lado3 = entrada.nextDouble();
                System.out.println("ingrese el perimetro");
                double perimetroTriangulo = o.CalcularPerimetro(lado1, lado2, lado3);
                System.out.println("el area" + areaTriangulo + "y el perimetro es:" + perimetroTriangulo);
                break;
            case 3:
                System.out.println("ingrese el lado del cuadrado");
                double lado = entrada.nextInt();
                Cuadrado oj = new Cuadrado();
                double areaCuadrado = oj.calcularArea(lado);
                double perimetroCuadrado = oj.calcularPerimetro(lado);
                System.out.println("el area:" + areaCuadrado + "y el perimetro es:" + perimetroCuadrado);

                break;
            default: //por defecto
                System.out.println("ingrese un valor correcto");
        }
    }
}
