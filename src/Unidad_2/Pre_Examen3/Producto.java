package Unidad_2.Pre_Examen3;

import javax.swing.*;

public class Producto {
    private validaciones val;
    private String nombre;
    private int stock;
    private double precio;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.val = new validaciones();
    }

    public void agragarStock(int cantidad) throws cantidadInvalidaException{
        val.validarCantidad(cantidad);
        this.stock+=cantidad;
        JOptionPane.showMessageDialog(null, "Stock actualizado: " + this.stock);
    }
    public void vender(int cantidad) throws precioInvalidoException, stockInsuficienteException, cantidadInvalidaException {
        val.validarCantidad(cantidad);
        val.validarPrecio((int)this.precio  );
        val.validarStock(cantidad, this.stock);
        this.stock -= cantidad;
        double total = this.precio * cantidad;
        JOptionPane.showMessageDialog(null, "Total: $" + total + " \nStock restante: " + this.stock);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + "\n" +
                "Precio: " + precio + "\n" +
                "Stock: " + stock;
    }
}
