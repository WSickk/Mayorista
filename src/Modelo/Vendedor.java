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
public class Vendedor {
    private int codVen;
    private String nombre;

    public Vendedor(int codVen, String nombre) {
        this.codVen = codVen;
        this.nombre = nombre;
    }

    public int getCodVen() {
        return codVen;
    }

    public void setCodVen(int codVen) {
        this.codVen = codVen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
