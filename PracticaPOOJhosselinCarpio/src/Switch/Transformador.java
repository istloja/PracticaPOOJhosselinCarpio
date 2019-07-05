/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Transformador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa 1 para transformar de km a m" + "ingresa 2 para transfprmar de m a km" + "ingresa 3 para tranformar de milas a m" + "ingresa 4 para transformar de m a millas" + "ingresa 5 pra transformar de pies a metros" + "ingresa 6 para tranformar de m a pies");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                System.out.println("ingrese un valor");
                double kilometros = entrada.nextDouble();
                int metros = 1000;
                double respuestakm;
                respuestakm = (kilometros * metros);
                System.out.println("la respuesta es:"+respuestakm);
                break;
            case 2:
                System.out.println("ingrese el valor");
                double m = entrada.nextDouble();
                int km = 1000;
                double respuestam;
                respuestam = (m / km);
                System.out.println("la respuesta es"+respuestam);
                break;
            case 3:
                System.out.println("ingrese un valor:");
                double millas = entrada.nextDouble();
                double metro = 1609.34;
                double respuestaml;
                respuestaml = millas * metro;
                System.out.println("la rspuesta es"+respuestaml);
                break;
            case 4:
                System.out.println("ingrese el valor");
                double mt = entrada.nextDouble();
                double milla = 1609.34;
                double resultadomt;
                resultadomt = mt / milla;
                System.out.println("la respueta es"+resultadomt);
                break;
            case 5:
                System.out.println("ingrese un valor");
                double pie = entrada.nextDouble();
                double mtr = 3.28084;
                double respuestamtr;
                respuestamtr = pie / mtr;
                System.out.println("la respuesta es"+respuestamtr);
                break;
            case 6:
                System.out.println("ingrese un valor");
                double mtrs = entrada.nextDouble();
                double pies = 3.28084;
                double resultadop;
                resultadop = mtrs * pies;
                System.out.println("la respuesta es"+resultadop);
                break;
            default:

        }

    }

}
