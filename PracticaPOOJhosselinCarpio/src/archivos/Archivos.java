/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;

/**
 *
 * @author ISTLOJAV
 */
public class Archivos {
    public static void main(String[] args) {
        File archivo=new File("C:\\Users\\ISTLOJAV\\Desktop/ejemplo.txt");//creando un objeto de la clase file
        //en las comillas va el nombre y la direccion del archivo
        System.out.println(archivo.exists());
        //para saber si es una carpeta o no
        System.out.println(archivo.isDirectory());
        //para saber si es un arhivo
        System.out.println(archivo.isFile());
        //para saber si un archivo oculto o no
        System.out.println(archivo.isHidden());
        //para saber la ultima fecha de modificacion
        System.out.println(archivo.lastModified());
        archivo.delete();
        
        File carpeta=new File("C:\\Users\\ISTLOJAV\\Desktop");
        //carpeta.list devuelve un arreglo con los archivos de una carpeta 
        String[]arregloarchivos=carpeta.list();
        for (int i = 0; i < arregloarchivos.length; i++) {
            System.out.println(arregloarchivos[i]);
            
        }
                
        
        
    }
}
