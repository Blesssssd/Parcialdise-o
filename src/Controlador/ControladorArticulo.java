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
import modelo.Usuario;

/**
 *
 * @author Juan Potes
 */
public class ControladorArticulo {

    Conexion conexion = new Conexion();

    public ControladorArticulo() {
    }

    public boolean guardar(String codigo, String nombre, double precio, int cantidad, String descripcion) {
        Articulo articulo = new Articulo(codigo, nombre, precio, cantidad, descripcion);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute("insert into articulo(codigo ,nombre, precio , cantidad, descripcion) "
                    + "values('" + articulo.getCodigo() + "','"
                    + articulo.getNombre() + "','"
                    + articulo.getPrecio() + "','"
                    + articulo.getCantidad() + "','"
                    + articulo.getDescripcion() + "')");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public Articulo buscar(String codigo) {

        Articulo articulo = new Articulo();
        conexion.conectar();

        try {

            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codigo ,nombre, precio , cantidad, descripcion "
                            + "from Articulo where "
                            + "codigo='" + codigo + "'"));//consulta        

            if (conexion.getResultadoDB().next()) {
                articulo.setCodigo(conexion.getResultadoDB().getString("codigo"));
                articulo.setNombre(conexion.getResultadoDB().getString("nombre"));
                articulo.setPrecio(conexion.getResultadoDB().getDouble("precio"));
                articulo.setCantidad(conexion.getResultadoDB().getInt("cantidad"));
                articulo.setDescripcion(conexion.getResultadoDB().getString("descripcion"));
                return articulo;
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorArticulo.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return null;
    }

    public boolean modificar(String codigo, String nombre, double precio, int cantidad, String descripcion) {
        Articulo articulo = new Articulo(codigo, nombre, precio, cantidad, descripcion);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute("update Articulo set nombre='" + articulo.getNombre()
                    + "',precio='" + articulo.getPrecio() + "',"
                    + "cantidad='" + articulo.getCantidad() + "',"
                    + "descripcion='" + articulo.getDescripcion() + "',"
                    + "' where codigo='" + articulo.getCodigo()+ "'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public boolean eliminar(String codigo) {

        conexion.conectar();

        try {
            conexion.getSentenciaSQL().execute("delete from Articulo where codigo='" + codigo + "'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public List<Articulo> obtenerLista() {

        List<Articulo> temp = new ArrayList<>();

        conexion.conectar();

        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codigo ,nombre, precio , cantidad, descripcion"
                            + " from Articulo"));

            while (conexion.getResultadoDB().next()) {
                String codigo = conexion.getResultadoDB().getString("codigo");
                String nombre = conexion.getResultadoDB().getString("nombre");
                double precio = conexion.getResultadoDB().getDouble("precio");
                int cantidad = conexion.getResultadoDB().getInt("cantidad");
                String descripcion = conexion.getResultadoDB().getString("descripcion");
                Articulo articulo = new Articulo(codigo, nombre, precio, cantidad, descripcion);
                temp.add(articulo);
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {
            Logger.getLogger(ControladorArticulo.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temp;
    }

}
