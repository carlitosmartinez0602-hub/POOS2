package Unidad_2.Pre_ExamenP3;

import javax.swing.*;

public class MainProd {
    static void main() {
        int el = 0;
        Producto p = new Producto("Dorito", 20, 15);
        do {
            el = Integer.parseInt(pDat("Opciones: \n" +
                    "0.- Salir\n" +
                    "1.- Registar\n" +
                    "2-. Vender\n" +
                    "3.- Agregar Stock\n" +
                    "4.- Mostrar info"));
            switch (el){
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String prod = pDat("Prod a registrar: ");
                    double precioProd = Double.parseDouble(pDat("Precio del producto: "));
                    int stockprod = Integer.parseInt(pDat("stock a agregar: "));
                    p.rP(prod, precioProd, stockprod);
                    dInf("Producto exito");
                    break;
                case 2:
                    int cantVender = Integer.parseInt(pDat("Cant vender: "));
                    p.vender(cantVender);
                    dInf("Cantidad vendida exito");
                    break;
                case 3:
                    int agrStock = Integer.parseInt(pDat("Agregar stock :"));
                    p.aS(agrStock);
                    dInf("Stock exito");
                    break;
                case 4:
                    dInf(p.toString());
                    break;
            }
        }while (el !=0);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
    }
}
