/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan Potes
 */
public class Venta {
    private String codigo;
    private String fecha;
    private int unidad;
    private String nombreA;
    private double total;

    public Venta() {
    }

    public Venta(String codigo, String fecha, int unidad, String nombreA, double total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.unidad = unidad;
        this.nombreA = nombreA;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

   

   
  
   
    
    
}
