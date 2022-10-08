/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Articulo;
import modelo.Conexion;
import modelo.Venta;

/**
 *
 * @author Juan Potes
 */
public class ControladorVenta {

    Conexion conexion = new Conexion();

    public ControladorVenta() {
    }

    public boolean registrarVenta(String codigo, String fecha, int unidad, String nombreA, double total) {
        Venta venta = new Venta(codigo, fecha, unidad, nombreA,total);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute
        ("insert into venta(codigo, fecha, unidad, nombreA,total) "
                + "values('" + venta.getCodigo() + "','" +
                venta.getFecha()+ "','" +
                venta.getUnidad()+ "','" +
                venta.getNombreA()+ "','" +
                venta.getTotal()+ "')");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public Venta buscar(String codigo) {
        
        
        Venta venta = new Venta();
        conexion.conectar();

        try {
            
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codigo, fecha, unidad, nombreA, "
                            + " total from Venta where "
                            + "codigo='" + codigo + "'"));//consulta        

            if (conexion.getResultadoDB().next()) {
                venta.setCodigo(conexion.getResultadoDB().getString("codigo"));
                venta.setFecha(conexion.getResultadoDB().getString("fecha"));
                venta.setUnidad(conexion.getResultadoDB().getInt("unidad"));
                venta.setNombreA(conexion.getResultadoDB().getString("nombreA"));
                venta.setTotal(conexion.getResultadoDB().getDouble("total"));
                return venta;
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(ControladorVenta.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return null;
    }
    
    public List<Venta> obtenerLista() {
        
        List<Venta> temp = new ArrayList<>();
        
        conexion.conectar();

        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codigo, fecha, unidad, nombreA,"
                            + " total from Venta"));       

            while (conexion.getResultadoDB().next()) {
                String codigo = conexion.getResultadoDB().getString("codigo");
                String fecha =conexion.getResultadoDB().getString("fecha");
                int unidad = conexion.getResultadoDB().getInt("unidad");
                String nombreA = conexion.getResultadoDB().getString("nombreA");
                double total = conexion.getResultadoDB().getDouble("total");
                Venta venta = new Venta(codigo, fecha, unidad, nombreA, total);
                temp.add(venta);
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(ControladorVenta.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temp;
    }
}
