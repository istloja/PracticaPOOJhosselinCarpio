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
public class Circulo extends FiguraBidimensional {
    public double CalcularArea(double radio){
        return radio*Math.pow(Math.PI,2);
        
    }
    public double CalcularPerimetro(double perimetro,double radio){
        return radio*(2*Math.PI);
    }
}
