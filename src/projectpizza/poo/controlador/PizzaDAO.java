/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpizza.poo.controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import projectpizza.poo.modelo.Pizza;

public class PizzaDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean create(Pizza p) {
        String sql = "INSERT INTO Pizza (nombre_pizza, precio_pizza, desc_pizza) VALUES (?,?,?)";
        try {
            con = Conexion.getConexion(); // Use your connection method
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setString(3, p.getDescripcion());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public List<Pizza> read() {
        List<Pizza> lista = new ArrayList<>();
        String sql = "SELECT * FROM Pizza";
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pizza p = new Pizza();
                p.setId(rs.getInt("pizza_id"));
                p.setNombre(rs.getString("nombre_pizza"));
                p.setPrecio(rs.getDouble("precio_pizza"));
                p.setDescripcion(rs.getString("desc_pizza"));
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }

    public boolean update(Pizza p) {
        String sql = "UPDATE Pizza SET nombre_pizza=?, precio_pizza=?, desc_pizza=? WHERE pizza_id=?";
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setString(3, p.getDescripcion());
            ps.setInt(4, p.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM Pizza WHERE pizza_id=?";
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
