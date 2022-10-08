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
import modelo.Conexion;
import modelo.Usuario;

/**
 *
 * @author Juan Potes
 */
public class ControladorUsuario {

    Conexion conexion = new Conexion();

    public ControladorUsuario() {
    }

    public boolean guardar(String cedula, String nombre, String apellido, String correo, String contrasenia) {
        Usuario usuario = new Usuario(cedula, nombre, apellido, correo, contrasenia);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute("insert into usuario(nombre,apellido,cedula,correo,contrasenia) "
                    + "values('" + usuario.getNombre()+ "','"
                    + usuario.getApellido()+ "','"
                    + usuario.getCedula()+ "','"
                    + usuario.getCorreo()+ "','"
                    + usuario.getContrasenia()+ "')");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public Usuario buscar(String cedula) {
        
        
        Usuario persona = new Usuario();
        conexion.conectar();

        try {
            
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select nombre,apellido,cedula,correo,"
                            + "contrasenia from usuario where "
                            + "cedula='" + cedula + "'"));//consulta        

            if (conexion.getResultadoDB().next()) {
                persona.setNombre(conexion.getResultadoDB().getString("nombre"));
                persona.setApellido(conexion.getResultadoDB().getString("apellido"));
                
                persona.setCedula(conexion.getResultadoDB().getString("cedula"));
                persona.setCorreo(conexion.getResultadoDB().getString("correo"));
                persona.setContrasenia(conexion.getResultadoDB().getString("contrasenia"));
                return persona;
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(ControladorUsuario.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return null;
    }

   public boolean modificar(String cedula, String nombre, String apellido, String correo, String contrasenia) {
        Usuario usuario = new Usuario(cedula, nombre, apellido, correo, contrasenia);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute("update usuario set nombre='" + usuario.getNombre()
                    + "',apellido='" + usuario.getApellido() + "',"
                    + "correo='" + usuario.getCorreo()+ "',"
                    + "contrasenia='" + usuario.getContrasenia()
                    + "' where cedula='" + usuario.getCedula() + "'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public boolean eliminar(String cedula) {

        conexion.conectar();

        try {
            conexion.getSentenciaSQL().execute("delete from usuario where cedula='" + cedula + "'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public List<Usuario> obtenerLista() {
        
        List<Usuario> temp = new ArrayList<>();
        
        conexion.conectar();

        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select nombre,apellido,cedula,correo,"
                            + "contrasenia from usuario"));       

            while (conexion.getResultadoDB().next()) {
                String nombre = conexion.getResultadoDB().getString("nombre");
                String apellido =conexion.getResultadoDB().getString("apellido");
                String cedula = conexion.getResultadoDB().getString("cedula");
                String correo = conexion.getResultadoDB().getString("correo");
                String contrasenia = conexion.getResultadoDB().getString("contrasenia");
                Usuario usuario = new Usuario(cedula, nombre, apellido, correo, contrasenia);
                temp.add(usuario);
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(ControladorUsuario.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temp;
    }

}
