/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juan Potes
 */
public class Conexion {
   
    private String driver = "com.mysql.cj.jdbc.Driver"; //nombre del driver
    private String connectString = "jdbc:mysql://localhost:3306/tiendaTecnologia"; //ubicacion de la base de datos, para mysql esta es por defecto
    private String user = "root"; //usuario de la base de datos
    private String password = "0123456Jp"; //password de la base de datos
    private Connection conexionDB; // variable que permite la conexion
    private Statement sentenciaSQL; //permite la ejecucion de sentencias SQL
    private ResultSet resultadoDB;//almacena el resultado de una consulta
    
    public void conectar() {
       // 1. CREAR CONEXIÓN
        try {
            Class.forName(driver); //se carga el driver en memoria
            conexionDB = DriverManager.getConnection(connectString, user, password);//conexion a la base de datos
        // 2. CREAR EL STATEMENT    
            sentenciaSQL = conexionDB.createStatement();//variable que permite ejecutar las sentencias SQL                                
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
     public void desconectar() {
        try {
            sentenciaSQL.close();//cierra la consulta
            conexionDB.close();//cierra conexion
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
     /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the connectString
     */
    public String getConnectString() {
        return connectString;
    }

    /**
     * @param connectString the connectString to set
     */
    public void setConnectString(String connectString) {
        this.connectString = connectString;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the conexionDB
     */
    public Connection getConexionDB() {
        return conexionDB;
    }

    /**
     * @param conexionDB the conexionDB to set
     */
    public void setConexionDB(Connection conexionDB) {
        this.conexionDB = conexionDB;
    }

    /**
     * @return the sentenciaSQL
     */
    public Statement getSentenciaSQL() {
        return sentenciaSQL;
    }

    /**
     * @param sentenciaSQL the sentenciaSQL to set
     */
    public void setSentenciaSQL(Statement sentenciaSQL) {
        this.sentenciaSQL = sentenciaSQL;
    }

    /**
     * @return the resultadoDB
     */
    public ResultSet getResultadoDB() {
        return resultadoDB;
    }

    /**
     * @param resultadoDB the resultadoDB to set
     */
    public void setResultadoDB(ResultSet resultadoDB) {
        this.resultadoDB = resultadoDB;
    }
}