/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese 1 para archivos en documentos, 2 para imagenes,3 para musica, 4 videos o 5 para netbeans project");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                File archivo = new File("C:\\Users\\ISTLOJAV\\Documents");
                String[] arregloarchivos = archivo.list();
                for (int i = 0; i < arregloarchivos.length; i++) {
                    System.out.println(arregloarchivos[i]);
                }
                break;
            case 2:

                File arc = new File("C:\\Users\\ISTLOJAV\\Pictures");
                String[] arregloarc = arc.list();
                for (int i = 0; i < arregloarc.length; i++) {
                    System.out.println(arregloarc[i]);

                }

                break;
            case 3:
                File archiv = new File("C:\\Users\\ISTLOJAV\\Music");
                String[] arregloarchiv = archiv.list();
                for (int i = 0; i < arregloarchiv.length; i++) {
                    System.out.println(arregloarchiv[i]);
                }
                break;
            case 4:
                File ar = new File("C:\\Users\\ISTLOJAV\\Videos");
                String[] arregloar = ar.list();
                for (int i = 0; i < arregloar.length; i++) {
                    System.out.println(arregloar[i]);

                }
                break;
            case 5:
                File a = new File("C:\\Users\\ISTLOJAV\\Documents/NetbeansProjects");
                String[] arregloa = a.list();
                for (int i = 0; i < arregloa.length; i++) {
                    System.out.println(arregloa[i]);

                }
            default:

        }
    }
}
