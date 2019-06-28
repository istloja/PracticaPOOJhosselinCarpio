/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica27JUNIO;

/**
 *
 * @author ISTLOJAV
 */
public class Triangulo extends FiguraBidimensional {
   public double CalcularArea(double h,double base){
   return A=(base*h)/2;
       
   }
    public double CalcularPerimetro(double lado1,double lado2,double lado3){
        return P= lado1+lado2+lado3;
    }
}
