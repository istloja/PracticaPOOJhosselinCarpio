/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author ISTLOJAV
 */
public class Fechas {

    public static void main(String[] args) {
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");//para pasar de un  string a una fecha
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la fecha en el formato dd/MM/yyy");
        String fecha = entrada.nextLine();
        Date fechanacimiento = null;
        try {
            fechanacimiento = formato.parse(fecha);//pasando del string a fecha
            System.out.println(fechanacimiento);
            // System.out.println(fechanacimiento.before(fechaActual));
        } catch (Exception j) {
            System.out.println(j);
        }
        //permite manejar fechas
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(fechaActual);
        int anioactual = calendario.get(GregorianCalendar.YEAR);
        int mesactual = calendario.get(GregorianCalendar.MONTH) + 1;
        int diactual = calendario.get(GregorianCalendar.DAY_OF_MONTH);
        
        GregorianCalendar calendario1=new GregorianCalendar();
        calendario1.setTime(fechanacimiento);
        int respuesta;
       
        int anioac=calendario1.get(GregorianCalendar.YEAR);
        respuesta=anioactual-anioac;
     
        System.out.println("ud tiene"+respuesta+"años");
        int mesac=calendario1.get(GregorianCalendar.MONTH)+1;
          respuesta=mesactual-mesac;
          
          System.out.println("ud tiene"+respuesta+"meses");
        int diaac=calendario1.get(GregorianCalendar.DAY_OF_MONTH);
        respuesta=(anioactual-anioac)*(365)+(mesactual-mesac)*(365/12);
        System.out.println("ud tiene:"+respuesta+"dias vividos");
        
      
       
    }
   
}
