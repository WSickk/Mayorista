package Modelo;

public class Producto {

    //private LinkedList lp = new LinkedList();
    private TipoProducto tipoProducto;
    private int codProd;
    private float precio;
    private float IVA;
    private String descripcion;

    public Producto() {
    }

        public Producto(int codProd, TipoProducto tipoProducto, float precio, float IVA, String descripcion) {
        this.tipoProducto = tipoProducto;
        this.codProd = codProd;
        this.precio = precio;
        this.IVA = IVA;
        this.descripcion = descripcion;
    }

        public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
