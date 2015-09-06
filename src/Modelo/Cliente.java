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
public class Cliente {
    private int cuit;
    private String razSocial;
    private CondicionTributaria condTrib;
    private CuentaCorriente cuentaCo;
    private ArrayList<Sucursal> sucursal = new ArrayList();

    public Cliente() {
    }
    
    public Cliente(int cuit, String razSocial, CondicionTributaria condTrib, CuentaCorriente cuentaCo) {
        this.cuit = cuit;
        this.razSocial = razSocial;
        this.condTrib = condTrib;
        this.cuentaCo = cuentaCo;
    }

    Cliente(int cuit, String razSocial, CondicionTributaria condTrib, CuentaCorriente cuentaCo, ArrayList<Sucursal> sucursal) {
        this.cuit = cuit;
        this.razSocial = razSocial;
        this.condTrib = condTrib;
        this.cuentaCo = cuentaCo;
        this.sucursal = sucursal;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazSocial() {
        return razSocial;
    }

    public void setRazSocial(String razSocial) {
        this.razSocial = razSocial;
    }

    public CondicionTributaria getCondTrib() {
        return condTrib;
    }

    public void setCondTrib(CondicionTributaria condTrib) {
        this.condTrib = condTrib;
    }

    public CuentaCorriente getCuentaCo() {
        return cuentaCo;
    }

    public void setCuentaCo(CuentaCorriente cuentaCo) {
        this.cuentaCo = cuentaCo;
    }

    public ArrayList<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(ArrayList<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }


    
}
