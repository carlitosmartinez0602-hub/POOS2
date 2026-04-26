package Unidad_2.Pre_Examen3U2;

import javax.swing.*;

public class mainCafe {
    static void main() {
        int el = 0, ele = 0;
        try {
            Cafetera caf = new Cafetera();
            do {
                ele = Integer.parseInt(pDat("Opciones: \n" +
                        "0.- Salir\n" +
                        "1.- Cafetera predeterminada\n" +
                        "2.- Cafetera parametros Capacidad Máxima\n" +
                        "3.- Cafetera parametros Capacidad Máxima y Cantidad Actual\n"));
                switch (ele) {
                    case 1:
                        do {
                            el = Integer.parseInt(pDat("Opciones: \n" +
                                    "0.- Volver al menú principal\n" +
                                    "1.- Llenar cafetera\n" +
                                    "2.- Servir taza\n" +
                                    "3.- Vaciar cafetera\n" +
                                    "4.- Agregar café\n" +
                                    "5.- Cantidad en cafetera"));
                            switch (el) {
                                case 0 :
                                    break;
                                case 1:
                                    caf.llenarCafetera();
                                    dInf("¡Cafetera llena!\n" + caf.getCantidadActual() + "\n");
                                    break;
                                case 2:
                                    int cServido = Integer.parseInt(pDat("Cantidad a servir: "));
                                    caf.servirTaza(cServido);
                                    dInf("Se llenaron: " + cServido + " \nQuedan: " + caf.getCantidadActual());
                                    break;
                                case 3:
                                    caf.vaciarCafetera();
                                    dInf("¡Cafetera vaciada!");
                                    break;
                                case 4:
                                    int aAgre = caf.getCantidadActual();
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
                        } while (el != 0);
                        break;
                    case 2:
                        int el2 = 0, max=0;
                        max = Integer.parseInt(pDat("Ingresa la capacidad máxima de la cafetera: "));
                        Cafetera caf2 = new Cafetera(max);
                        do {
                            el2 = Integer.parseInt(pDat("Opciones cafetera 2: \n" +
                                    "0.- Volver al menú principal\n" +
                                    "1.- Llenar cafetera\n" +
                                    "2.- Servir taza\n" +
                                    "3.- Vaciar cafetera\n" +
                                    "4.- Agregar café\n" +
                                    "5.- Cantidad en cafetera"));
                            switch (el2) {
                                case 0 :
                                    break;
                                case 1:
                                    caf2.llenarCafetera();
                                    dInf("¡Cafetera llena!\n" + caf2.getCantidadActual() + "\n");
                                    break;
                                case 2:
                                    int cServido = Integer.parseInt(pDat("Cantidad a servir: "));
                                    caf2.servirTaza(cServido);
                                    dInf("Se llenaron: " + cServido + " \nQuedan: " + caf2.getCantidadActual());
                                    break;
                                case 3:
                                    caf2.vaciarCafetera();
                                    dInf("¡Cafetera vaciada!");
                                    break;
                                case 4:
                                    int aAgre = caf2.getCantidadActual();
                                    int cantAgregada = Integer.parseInt(pDat("Cantidad a agregar: "));
                                    caf2.agregarCafe(cantAgregada);
                                    dInf("¡Cantidad agregada! Se agregaron: " + cantAgregada + " a los: " + aAgre + " ya existentes");
                                    break;
                                case 5:
                                    dInf("Cantidad en la cafetera: " + caf2.getCantidadActual());
                                    break;
                                default:
                                    dInf("¡Opción no válida!");
                                    break;
                            }
                        } while (el2 != 0);
                        break;
                    case 3:
                        int el3 = 0, max2=0, cantac= 0;
                        max2 = Integer.parseInt(pDat("Ingresa la capacidad máxima de la cafetera: "));
                        cantac = Integer.parseInt(pDat("Ingresa la cantidad actual de la cafetera: "));
                        Cafetera caf3 = new Cafetera(max2, cantac);
                        do {
                            el3 = Integer.parseInt(pDat("Opciones cafetera 2: \n" +
                                    "0.- Volver al menú principal\n" +
                                    "1.- Llenar cafetera\n" +
                                    "2.- Servir taza\n" +
                                    "3.- Vaciar cafetera\n" +
                                    "4.- Agregar café\n" +
                                    "5.- Cantidad en cafetera"));
                            switch (el3) {
                                case 0 :
                                    break;
                                case 1:
                                    caf3.llenarCafetera();
                                    dInf("¡Cafetera llena!\n" + caf3.getCantidadActual() + "\n");
                                    break;
                                case 2:
                                    int cServido = Integer.parseInt(pDat("Cantidad a servir: "));
                                    caf3.servirTaza(cServido);
                                    dInf("Se llenaron: " + cServido + " \nQuedan: " + caf3.getCantidadActual());
                                    break;
                                case 3:
                                    caf3.vaciarCafetera();
                                    dInf("¡Cafetera vaciada!");
                                    break;
                                case 4:
                                    int aAgre = caf3.getCantidadActual();
                                    int cantAgregada = Integer.parseInt(pDat("Cantidad a agregar: "));
                                    caf3.agregarCafe(cantAgregada);
                                    dInf("¡Cantidad agregada! Se agregaron: " + cantAgregada + " a los: " + aAgre + " ya existentes");
                                    break;
                                case 5:
                                    dInf("Cantidad en la cafetera: " + caf3.getCantidadActual());
                                    break;
                                default:
                                    dInf("¡Opción no válida!");
                                    break;
                            }
                        } while (el3 != 0);
                        break;
                    default:
                        dInf("Adios");
                        break;
                }
            }while (ele!=0);
        }catch (CafeAgregadoInvalidoException | CafeServidoInvalidoException | CafeNegativoException e) {
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
