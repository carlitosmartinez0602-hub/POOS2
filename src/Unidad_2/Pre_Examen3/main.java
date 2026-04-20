package Unidad_2.Pre_Examen3;

import javax.swing.*;

public class main {
    static void main(String[] args) {
        int el = 0;
        String pro = pDat("Nombre del producto: ");
        double precioP = Double.parseDouble(pDat("Precio del producto: "));
        int cant = Integer.parseInt(pDat("Cantidad de producto: "));

        Producto prod = new Producto(pro, precioP, cant);
        do {
            try {
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
            } catch (precioInvalidoException | cantidadInvalidaException |stockInsuficienteException e) {
                dInf(e.getMessage());
            }
        }while (el != 0);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
