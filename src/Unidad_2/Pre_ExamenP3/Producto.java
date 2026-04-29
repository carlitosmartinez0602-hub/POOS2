package Unidad_2.Pre_ExamenP3;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public void rP(String nombrePro, double prec, int stockk){
        this.nombre = nombrePro;
        this.precio = prec;
        this.stock = stockk;
    }
    public int aS(int cantidad){
        return stock += cantidad;
    }
    public int vender(int cantidad){
        return stock -= cantidad;
    }

    @Override
    public String toString() {
        return "Producto: \n" +
                "Nombre de producto: " + nombre+
                "\nPrecio del producto: " + precio+
                "\nStock disponible: " + stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
