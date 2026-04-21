package Unidad_2.Pre_Examen3U2;

import javax.swing.*;

public class mainCafe {
    static void main() {
        int el =0;
        try {
            Cafetera caf = new Cafetera();
            do {
                el = Integer.parseInt(pDat("Opciones: \n" +
                        "0.- Salir\n" +
                        "1.- Llenar cafetera\n" +
                        "2.- Servir taza\n" +
                        "3.- Vaciar cafetera\n" +
                        "4.- Agregar café\n" +
                        "5.- Cantidad en cafetera"));
                switch (el){
                    case 0:
                        dInf("¡Adios!");
                        break;
                    case 1:
                        caf.llenarCafetera();
                        dInf("¡Cafetera llena!\n" + caf.getCantidadActual() +"\n");
                        break;
                    case 2:
                        int cServido = Integer.parseInt(pDat("Cantidad a servir: "));
                        caf.servirTaza(cServido);
                        dInf("Se llenaron: " + cServido + " \nQuedan: " +caf.getCantidadActual());
                        break;
                    case 3:
                        caf.vaciarCafetera();
                        dInf("¡Cafetera vaciada!");
                        break;
                    case 4:
                        int aAgre= caf.getCantidadActual();
                        int cantAgregada = Integer.parseInt(pDat("Cantidad a agregar: "));
                        caf.agregarCafe(cantAgregada);
                        dInf("¡Cantidad agregada! Se agregaron: " + cantAgregada + " a los: " + aAgre + " ya existentes");
                        break;
                    case 5:
                        dInf("Cantidad en la cafetera: " + caf.getCantidadActual());
                        break;
                    default:
                        dInf("¡Opción no válida!");
                        break;
                }
            }while (el != 0);
        }catch (CafeAgregadoInvalidoException | CafeServidoInvalidoException e){
                dInf(e.getMessage());
        }


    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
    }
}
