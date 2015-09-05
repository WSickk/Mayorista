package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Datos {

    public static LinkedList lc = new LinkedList();
    public static LinkedList lp = new LinkedList();
    public static LinkedList ltp = new LinkedList();
    public static LinkedList lop = new LinkedList();
    public static ArrayList<CondicionTributaria> lct = new ArrayList();
    public static LinkedList lcv = new LinkedList();
    public static LinkedList lcc = new LinkedList();
    public static LinkedList le = new LinkedList();
    public static ArrayList<TipoFactura> ltf = new ArrayList();
    public static ArrayList<Sucursal> ld = new ArrayList();
    public static ArrayList<Sucursal> ld1 = new ArrayList();
    public static ArrayList<Sucursal> ld2 = new ArrayList();
    public static ArrayList<Sucursal> ld3 = new ArrayList();

    public Datos() {
    }

    public void crearCondTrib() {
        CondicionTributaria condTrib1 = new CondicionTributaria("RI", (TipoFactura) ltf.get(0));
        CondicionTributaria condTrib2 = new CondicionTributaria("M", (TipoFactura) ltf.get(1));
        CondicionTributaria condTrib3 = new CondicionTributaria("E", (TipoFactura) ltf.get(1));
        CondicionTributaria condTrib4 = new CondicionTributaria("NR", (TipoFactura) ltf.get(1));

        lct.add(condTrib1);
        lct.add(condTrib2);
        lct.add(condTrib3);
        lct.add(condTrib4);
    }

    public void crearOrignProducto() {
        OrigenProducto origenProducto1 = new OrigenProducto("Liquido");
        OrigenProducto origenProducto2 = new OrigenProducto("Mezcla");
        OrigenProducto origenProducto3 = new OrigenProducto("Unidad");

        lop.add(origenProducto1);
        lop.add(origenProducto2);
        lop.add(origenProducto3);
    }

    public void crearTipoProducto() {
        TipoProducto tipoProducto1 = new TipoProducto("Detergentes", (OrigenProducto) lop.get(0));
        TipoProducto tipoProducto2 = new TipoProducto("Lavandinas", (OrigenProducto) lop.get(0));
        TipoProducto tipoProducto3 = new TipoProducto("Perfumes", (OrigenProducto) lop.get(0));
        TipoProducto tipoProducto4 = new TipoProducto("Mezcla para piso", (OrigenProducto) lop.get(1));
        TipoProducto tipoProducto5 = new TipoProducto("Unidad", (OrigenProducto) lop.get(2));

        ltp.add(tipoProducto1);
        ltp.add(tipoProducto2);
        ltp.add(tipoProducto3);
        ltp.add(tipoProducto4);
        ltp.add(tipoProducto5);
    }

    public void crearTipoFactura() {
        TipoFactura tipoFac1 = new TipoFactura("A", 1);
        TipoFactura tipoFac2 = new TipoFactura("B", 6);

        ltf.add(tipoFac1);
        ltf.add(tipoFac2);
    }

    public void crearDireccion() {

        Sucursal direccion1 = new Sucursal(1,"Uruguay 948");
        Sucursal direccion2 = new Sucursal(2,"Chile 120");
        Sucursal direccion3 = new Sucursal(3,"Bolivia 252");
        Sucursal direccion4 = new Sucursal(4,"Salta 1308");
        Sucursal direccion5 = new Sucursal(5,"San Juan 9");
        Sucursal direccion6 = new Sucursal(6,"Belgrano 1850");
        Sucursal direccion7 = new Sucursal(7,"Alvarez Condarco 778");
        Sucursal direccion8 = new Sucursal(8,"Gral Paz 180");

        ld.add(direccion1);
        ld.add(direccion2);
        ld1.add(direccion3);
        ld2.add(direccion4);
        ld2.add(direccion5);
        ld3.add(direccion6);
        ld3.add(direccion7);
        ld3.add(direccion8);
    }

    public void crearClientes() {
        CuentaCorriente cuenta = new CuentaCorriente(0,0,0,"Habilitado");

        Cliente cliente1 = new Cliente(1,"Tevez Francisco",lct.get(0),cuenta,ld);
        Cliente cliente2 = new Cliente(2,"Mamami Fernando",lct.get(1),cuenta,ld1);
        Cliente cliente3 = new Cliente(3,"Rosana Vilta",lct.get(0),cuenta,ld3);
        lc.add(cliente1);
        lc.add(cliente2);
        lc.add(cliente3);
    }

    public void crearProductos() {

        Producto pro1 = new Producto(0, (TipoProducto) ltp.get(0), (float) 8, (float) 0.21, "Detergente Magistral");
        Producto pro2 = new Producto(1, (TipoProducto) ltp.get(1), (float) 4.50, (float) 0.21, "Lavandina Ayudin");
        Producto pro3 = new Producto(2, (TipoProducto) ltp.get(2), (float) 12, (float) 0.105, "Paco");
        Producto pro4 = new Producto(3, (TipoProducto) ltp.get(3), (float) 5.25, (float) 0.21, "Mezcla para piso tipo A");
        Producto pro5 = new Producto(4, (TipoProducto) ltp.get(4), (float) 20, (float) 0.105, "Escoba");
        lp.add(pro1);
        lp.add(pro2);
        lp.add(pro3);
        lp.add(pro4);
        lp.add(pro5);

    }

}
