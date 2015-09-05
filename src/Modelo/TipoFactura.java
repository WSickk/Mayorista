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
public class TipoFactura {
    private String tipoF;
    private int codigo;
     

    public TipoFactura(String tipoF, int codigo) {
        this.tipoF = tipoF;
        this.codigo = codigo;
        
    }
     
     
     

  
     
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   

    public String getTipoF() {
        return tipoF;
    }

    public void setTipoF(String tipoF) {
        this.tipoF = tipoF;
    }

}
