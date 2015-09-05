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
public class CondicionTributaria {
    private String estadoTrib;
    private TipoFactura tipFac;

    public CondicionTributaria(String estadoTrib, TipoFactura tipFac) {
        this.estadoTrib = estadoTrib;
        this.tipFac = tipFac;
    }

    public String getEstadoTrib() {
        return estadoTrib;
    }

    public void setEstadoTrib(String estadoTrib) {
        this.estadoTrib = estadoTrib;
    }

    public TipoFactura getTipFac() {
        return tipFac;
    }

    public void setTipFac(TipoFactura tipFac) {
        this.tipFac = tipFac;
    }
    

}
