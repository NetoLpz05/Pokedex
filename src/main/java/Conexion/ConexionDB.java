/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/pokedexdb";
    private static final String USER = "root";  // tu usuario de MySQL
    private static final String PASSWORD = "itson";  // tu contraseña (si tienes)

    private static Connection conexion;

    public static Connection getConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Conexión establecida con la base de datos.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("🔒 Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al cerrar la conexión: " + e.getMessage());
        }
    }
}