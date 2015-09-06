/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Datos;
import Vista.VPrincipal;

/**
 *
 * @author Roxi
 */
public class Mayorista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos dat = new Datos();
        dat.crearOrignProducto();
        dat.crearTipoProducto();
        dat.crearDireccion();
        dat.crearTipoFactura();
        dat.crearCondTrib();
        dat.crearClientes();
        dat.crearProductos();
        
        
    VPrincipal vista= new VPrincipal();
    vista.setTitle("Nueva Venta");
    vista.setLocationRelativeTo(null);
    vista.setVisible(true);
    }
    
}
