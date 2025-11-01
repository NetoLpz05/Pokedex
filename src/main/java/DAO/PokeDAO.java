package DAO;

import Conexion.ConexionDB;
import Entidades.Pokemon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class PokeDAO {
    public Pokemon MostrarPokeXNombre(String nombre) throws SQLException{
        String sql = "SELECT * FROM Pokemon WHERE Nombre = ?";
        try (Connection con = ConexionDB.getConexion();
            PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return new Pokemon(
                    rs.getString("Nombre"),
                    rs.getString("TipoMain"),
                    rs.getString("TipoSec"),
                    rs.getString("Region"),
                    rs.getString("Descripcion"),
                    rs.getString("Debilidades"),
                    rs.getString("Handicap"),
                    rs.getString("Megaevo")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Pokemon MostrarPokeXTipo(String tipo) throws SQLException{
        String sql = "SELECT * FROM Pokemon WHERE TipoMain = ?";
        try (Connection con = ConexionDB.getConexion();
            PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setString(1, tipo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return new Pokemon(
                    rs.getString("Nombre"),
                    rs.getString("TipoMain"),
                    rs.getString("TipoSec"),
                    rs.getString("Region"),
                    rs.getString("Descripcion"),
                    rs.getString("Debilidades"),
                    rs.getString("Handicap"),
                    rs.getString("Megaevo")
                );
            } 
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Pokemon MostrarPokeXRegion(String region) throws SQLException{
        String sql = "SELECT * FROM Pokemon WHERE Region = ?";
        try (Connection con = ConexionDB.getConexion();
            PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setString(1, region);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return new Pokemon(
                    rs.getString("Nombre"),
                    rs.getString("TipoMain"),
                    rs.getString("TipoSec"),
                    rs.getString("Region"),
                    rs.getString("Descripcion"),
                    rs.getString("Debilidades"),
                    rs.getString("Handicap"),
                    rs.getString("Megaevo")
                );
            } 
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    /*
    * Basicamente aqui se busca si tiene MegaEvolución, Movimiento Z (Único) y Gigantamax (Único)
    * la Teracristalización no aplica porque es global
    */
    public Pokemon MostrarPokeXHandicap(String handicap) throws SQLException{
        String sql = "SELECT * FROM Pokemon WHERE Handicap = ?";
        try (Connection con = ConexionDB.getConexion();
            PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setString(1, handicap);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return new Pokemon(
                    rs.getString("Nombre"),
                    rs.getString("TipoMain"),
                    rs.getString("TipoSec"),
                    rs.getString("Region"),
                    rs.getString("Descripcion"),
                    rs.getString("Debilidades"),
                    rs.getString("Handicap"),
                    rs.getString("Megaevo")
                );
            } 
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
