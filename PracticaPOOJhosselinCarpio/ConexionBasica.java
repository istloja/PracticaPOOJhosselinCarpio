/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ISTLOJAV
 */
public class ConexionBasica {
    
    public void leer(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1", usuario, clave);
//localhost para que se conecte a la propia computadora
            //luego el nombre de la base de datos
            System.out.println(conexion.getCatalog());
            Statement j = conexion.createStatement();
            ResultSet resultado = j.executeQuery("select*from persona");//se escriben las consultas
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + resultado.getString ("apellido"));
            }
        } catch (Exception e) {
            System.out.println(" se produjo el error: " + e);
        }
        
    }
    
    public static void main(String[] args) {
        ConexionBasica ob = new ConexionBasica();
        ob.leer("jhosselin", "jossycarpio28");
    }
}
