/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Roxi
 */
public class Venta {
    private long numVenta;
    private double total;
    private double ivaTotal;
    private double netoGraTotal;
    private Cliente cliente;
    private Vendedor vendedor;
    private String fecha;
    private String direccion;
    static ArrayList<LineaVenta> lineaDeVenta = new ArrayList();
    private CondicionTributaria condTrib;

    public Venta(long numVenta, double total, double ivaTotal, double netoGraTotal, Cliente cliente, Vendedor vendedor, String fecha, String direccion, CondicionTributaria condTrib) {
        this.numVenta = numVenta;
        this.total = total;
        this.ivaTotal = ivaTotal;
        this.netoGraTotal = netoGraTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.direccion = direccion;
        this.condTrib = condTrib;
    }

    public long getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(long numVenta) {
        this.numVenta = numVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getIvaTotal() {
        return ivaTotal;
    }

    public void setIvaTotal(double ivaTotal) {
        this.ivaTotal = ivaTotal;
    }

    public double getNetoGraTotal() {
        return netoGraTotal;
    }

    public void setNetoGraTotal(double netoGraTotal) {
        this.netoGraTotal = netoGraTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static ArrayList<LineaVenta> getLineaDeVenta() {
        return lineaDeVenta;
    }

    public static void setLineaDeVenta(ArrayList<LineaVenta> lineaDeVenta) {
        Venta.lineaDeVenta = lineaDeVenta;
    }

    public CondicionTributaria getCondTrib() {
        return condTrib;
    }

    public void setCondTrib(CondicionTributaria condTrib) {
        this.condTrib = condTrib;
    }

    
}