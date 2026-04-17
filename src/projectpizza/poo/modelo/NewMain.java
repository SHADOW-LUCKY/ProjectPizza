/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpizza.poo.modelo;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author nicor
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // We call the static method from our Conexion class
        Connection testConn = Conexion.conectar();

        if (testConn != null) {
            System.out.println("--- PRUEBA DE CONEXIÓN ---");
            System.out.println("Estado: Conectado exitosamente.");
            
            try {
                // Just a little extra info to prove it's working
                System.out.println("Base de Datos: " + testConn.getCatalog());
                
                // Always close the connection when you're done testing!
                testConn.close();
                System.out.println("Estado: Conexión cerrada correctamente.");
                
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        } else {
            System.out.println("--- PRUEBA FALLIDA ---");
            System.out.println("Revisa que el servicio de Postgres esté corriendo.");
        }
    }
    
}
