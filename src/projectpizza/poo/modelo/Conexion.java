/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpizza.poo.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nicor
 */
public class Conexion {
    private static final String URL = "jdbc:postgresql://localhost:5432/dbpizza";
    private static final String USER = "postgres";
    private static final String PASS = "postlucky"; // The one you set during install

    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("¡Conexión exitosa!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
}