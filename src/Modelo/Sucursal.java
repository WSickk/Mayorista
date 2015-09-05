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
public class Sucursal {
    private int numSuc;
    private String direccion;

    public Sucursal(int numSuc, String direccion) {
        this.numSuc = numSuc;
        this.direccion = direccion;
    }

    public int getNumSuc() {
        return numSuc;
    }

    public void setNumSuc(int numSuc) {
        this.numSuc = numSuc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
