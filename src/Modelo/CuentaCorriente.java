/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Roxi
 */
public class CuentaCorriente {
    private double saldoTotal;
    private double saldoDeudor;
    private double saldoAcreedor;
    private String estadoC;

    public CuentaCorriente(double saldoTotal, double saldoDeudor, double saldoAcreedor, String estadoC) {
        this.saldoTotal = saldoTotal;
        this.saldoDeudor = saldoDeudor;
        this.saldoAcreedor = saldoAcreedor;
        this.estadoC = estadoC;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSaldoDeudor() {
        return saldoDeudor;
    }

    public void setSaldoDeudor(double saldoDeudor) {
        this.saldoDeudor = saldoDeudor;
    }

    public double getSaldoAcreedor() {
        return saldoAcreedor;
    }

    public void setSaldoAcreedor(double saldoAcreedor) {
        this.saldoAcreedor = saldoAcreedor;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }
    

}
