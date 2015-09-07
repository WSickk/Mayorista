/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Cliente;
import Modelo.Datos;
import Modelo.Producto;
import Vista.VPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.tempuri.LoginService;

/**
 *
 * @author Roxi
 */
public class Controlador {
    //"FCE7CD58-EDB5-449B-8825-2AA8F315CC14"
    static DecimalFormat df = new DecimalFormat("0.00");
    static double total = 0, ivatotal = 0, netogr = 0;
    static String palabra = "";
    
    static LoginService serv = new LoginService();
       
    public static ArrayList<Producto> tempo = new ArrayList();
   
    public static void agregarP(VPrincipal vista) {
        Producto prod = new Producto();
        int codProd = Integer.parseInt(vista.getjTextField2().getText());
        int can = Integer.parseInt(vista.getjTextField3().getText());
       
        for(int i=0; i<Datos.lp.size();i++){
            prod.setCodProd(Datos.lp.get(i).getCodProd());
            if(codProd == Datos.lp.get(i).getCodProd()){
                prod.setDescripcion(Datos.lp.get(i).getDescripcion());
                prod.setTipoProducto(Datos.lp.get(i).getTipoProducto());
                //prod.getTipoProducto().setTipoP(Datos.lp.get(i).getTipoProducto().getTipoP());
                //prod.getTipoProducto().getOrigenProducto().setOrigen(Datos.lp.get(i).getTipoProducto().getOrigenProducto().getOrigen());
                prod.setPrecio(Datos.lp.get(i).getPrecio());
                prod.setIVA(Datos.lp.get(i).getIVA());
                
                tempo.add(prod);
                
                tablaProductos(vista,prod,tempo); 
                break;
            }
        }
    }
    
    private static void tablaProductos(VPrincipal vista, Producto prod, ArrayList<Producto> tempo) {
        
        DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Tipo");
            modelo.addColumn("Origen");
            modelo.addColumn("Precio");
            modelo.addColumn("IVA");
            modelo.addColumn("Cantidad");
            
            for (int i = 0; i < tempo.size(); i++) {
            Object[] fila = new Object[7];
            fila[0] = tempo.get(i).getCodProd();
            fila[1] = tempo.get(i).getDescripcion();
            fila[2] = tempo.get(i).getTipoProducto().getTipoP();
            fila[3] = tempo.get(i).getTipoProducto().getOrigenProducto().getOrigen();
            fila[4] = tempo.get(i).getPrecio();
            fila[5] = tempo.get(i).getIVA();
            fila[6] = vista.getjTextField3().getText();
            modelo.addRow(fila);       
        }
        vista.getjTable1().setModel(modelo);
    }
    
    
    public static void buscar(VPrincipal vista) {
        Cliente cliente = new Cliente();
        Boolean bandera = false;
        int cuit = Integer.parseInt(vista.getjTextField1().getText());
        vista.getjComboBox2().removeAllItems();
        for(int i=0; i<Datos.lc.size();i++){
            bandera = false;
            cliente.setCuit(Datos.lc.get(i).getCuit());
            if(cuit == Datos.lc.get(i).getCuit()){
                bandera=false;
                vista.getjLabel5().setText(Datos.lc.get(i).getRazSocial());
                vista.getjLabel7().setText(Datos.lc.get(i).getCondTrib().getEstadoTrib());
                vista.getjLabel9().setText(Datos.lc.get(i).getCondTrib().getTipFac().getTipoF());           
                for(int k=0; k<Datos.lc.get(i).getSucursal().size();k++){
                    vista.getjComboBox2().addItem(Datos.lc.get(i).getSucursal().get(k).getDireccion());
                }
                break;
            }else{
            bandera = true;
            }
        }
             if(bandera) {
                JOptionPane.showMessageDialog(vista, "Cliente Inexistente","Error",JOptionPane.ERROR_MESSAGE);
                vista.getjTextField1().selectAll();
                vista.getjTextField1().requestFocus();
            }
    }

    public static void finalizarV(VPrincipal aThis) {
        
    }

    public static void eliminarP(VPrincipal aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void autorizar(VPrincipal aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void imprimir(VPrincipal aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void finalizar(VPrincipal aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void boton(VPrincipal aThis) {
        if(aThis.getjComboBox3().getSelectedIndex() == 1){
        aThis.getjButton4().setEnabled(true);
        }
    }    
    
}
