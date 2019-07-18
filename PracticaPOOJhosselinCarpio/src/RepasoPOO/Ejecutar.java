/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoPOO;

/**
 *
 * @author ISTLOJAV
 */
public class Ejecutar {

    public static void main(String[] args) {
        Animal objeto = new Animal("jirafa", 10, 2, 15, "amarilla");
        Ave obj = new Ave(false, 3, "gallina", 10, 15, 10.5, "negra");
        Mamifero ob = new Mamifero(5, true, "perro", 15, 10, 8, "cafe");
        System.out.println("animal" + " " + objeto.informacionAnimal() + " " + "Ave" + " " + obj.informacionAnimal() + " " + "mamifero" + " " + ob.informacionAnimal());
        Reptiles obje = new Reptiles("caparazón", false, "tortuga", 100, 10, 3, "cafe");
        Anfibios obb = new Anfibios(true, true, "salamandra", 5, 1, 1, "verde");
        System.out.println(obje.informacionAnimal() + " " + " " + obb.informacionAnimal());
    }
}
