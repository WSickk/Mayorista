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
public class TipoProducto {
    private String tipoP;
    private OrigenProducto origenProducto;

    public TipoProducto(String tipoP, OrigenProducto origenProducto) {
        this.tipoP = tipoP;
        this.origenProducto = origenProducto;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    public OrigenProducto getOrigenProducto() {
        return origenProducto;
    }

    public void setOrigenProducto(OrigenProducto origenProducto) {
        this.origenProducto = origenProducto;
    }
}
