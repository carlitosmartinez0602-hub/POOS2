package Unidad_2.Pre_Examen3;

import javax.swing.*;

public class main {
    static void main(String[] args) {
        String pro = pDat("Nombre del producto: ");
        double precioP = Double.parseDouble(pDat("Precio del producto: "));
        int cant = Integer.parseInt(pDat("Cantidad de producto: "));

        validaciones val = new validaciones();
        Producto prod = null;

        try {
            val.validarPrecio((int)precioP);
            val.validarCantidad(cant);

            prod = new Producto(pro, precioP, cant);
            dInf("¡Producto creado exitosamente!");

            int el = 0;
            do {
                el = Integer.parseInt(pDat("Menú: \n" +
                        "0.- Salir \n" +
                        "1.- Agregar Stock \n" +
                        "2.- Vender \n" +
                        "3.- Mostrar Producto \n" +
                        "Seleccione una opción:"));

                switch (el) {
                    case 0:
                        dInf("¡Hasta luego!");
                        break;
                    case 1:
                        int cantAgregar = Integer.parseInt(pDat("Cantidad a agregar: "));
                        prod.agragarStock(cantAgregar);
                        break;
                    case 2:
                        int cantVender = Integer.parseInt(pDat("Cantidad a vender: "));
                        prod.vender(cantVender);
                        break;
                    case 3:
                        dInf(prod.toString());
                        break;
                    default:
                        dInf("¡Opción inválida!");
                        break;
                }
            } while (el != 0);

        } catch (precioInvalidoException | cantidadInvalidaException e) {
            dInf("Error al crear producto: " + e.getMessage());
        } catch (stockInsuficienteException e) {
            dInf("Error en venta: " + e.getMessage());
        }
    }

    public static String pDat(String txt) {
        return JOptionPane.showInputDialog(txt);
    }

    public static void dInf(String txt) {
        JOptionPane.showMessageDialog(null, txt);
    }
}