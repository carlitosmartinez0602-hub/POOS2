package Unidad_4.Practica_5;

import javax.swing.*;
import java.util.ArrayList;

public class MainProductos {
    static void main(String[] args) {
        int el = 0;
        ArrayList<Productos> listaProductos = new ArrayList<>();

        do {

            String input = pDat("|-----Opciones-----|\n" +
                    "\n0.- Salir" +
                    "\n1.- Agregar producto fresco" +
                    "\n2.- Agreagar producto refrigerado" +
                    "\n3.- Agregar producto congelado por aire" +
                    "\n4.- Agregar producto congelado por agua" +
                    "\n5.- Agregar producto congelado por nitrogeno" +
                    "\n6.- Mostrar productos" +
                    "\n7.- Buscar producto por numero de lote");

            if (input == null || input.isBlank()) {
                dInf("No puede quedar este espacio en blanco");
            }else {
                try {
                    el = Integer.parseInt(input);
                }catch (NumberFormatException e ){
                    dInf("Solo números");
                }
            }

            switch (el){
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    int numLotePF  = Integer.parseInt(pDat("Número de lote: "));
                    String paisOrigenPF  = pDat("País de origen: ");
                    String fechaEnvasePF = pDat("Fecha de envase: ");
                    String fechaCadPF = pDat("Fecha de caducidad :");

                    ProductosFrescos prodFre = new ProductosFrescos(fechaCadPF, numLotePF, paisOrigenPF, fechaEnvasePF);
                    listaProductos.add(prodFre);
                    dInf("Producto Fresco agregado correctamente :)");
                    break;
                case 2:
                    int numLoteRef  = Integer.parseInt(pDat("Número de lote: "));
                    String fechaEnvaseRef = pDat("Fecha de envase: ");
                    String fechaCadRef = pDat("Fecha de caducidad :");
                    String paisOrigenRef  = pDat("País de origen: ");
                    double tempSugerRef = Double.parseDouble(pDat("Temperatura Sugerida: "));
                    String fracCode = pDat("Codigo de orgaismo :");
                    ProductosRefrigerados prodRef = new ProductosRefrigerados(fechaCadRef, numLoteRef, fracCode, fechaEnvaseRef,tempSugerRef, paisOrigenRef);
                    listaProductos.add(prodRef);
                    dInf("Producto Refrigerado agregado correctamente :)");
                    break;
                case 3:
                    int numLoteCongAire  = Integer.parseInt(pDat("Número de lote: "));
                    String paisOrigenCongAire  = pDat("País de origen: ");
                    String fechaEnvaseCongAire = pDat("Fecha de envase: ");
                    String fechaCadCongAire = pDat("Fecha de caducidad :");
                    double tempSugerCongAire = Double.parseDouble(pDat("Temperatura sugerida: "));
                    double percentNitroAire = Double.parseDouble(pDat("Porcentaje de nitrogeno: "));
                    double percentOxigenoAire = Double.parseDouble(pDat("Porcentaje de oxigeno: "));
                    double percentCarbonoAire = Double.parseDouble(pDat("Porcentaje de dioxido de carbono: "));
                    double percentVaporAire = Double.parseDouble(pDat("Porcentaje de vapor de agua: "));

                    PCongeladoAire prodCongAire = new PCongeladoAire(fechaCadCongAire, numLoteCongAire, fechaEnvaseCongAire, paisOrigenCongAire, tempSugerCongAire, percentNitroAire, percentOxigenoAire, percentCarbonoAire, percentVaporAire);
                    listaProductos.add(prodCongAire);
                    dInf("Producto Congelado por Aire agregado correctamente :)");
                    break;
                case 4:
                    int numLoteCongAgua  = Integer.parseInt(pDat("Número de lote: "));
                    String paisOrigenCongAgua  = pDat("País de origen: ");
                    String fechaEnvaseCongAgua = pDat("Fecha de envase: ");
                    String fechaCadCongAgua = pDat("Fecha de caducidad :");
                    double tempSugerCongAgua = Double.parseDouble(pDat("Temperatura sugerida: "));
                    double salinidadXLitro = Double.parseDouble(pDat("Salinidad por litro: "));

                    PCongeladoAgua prodCongAgua = new PCongeladoAgua(fechaCadCongAgua, numLoteCongAgua, fechaEnvaseCongAgua, paisOrigenCongAgua, tempSugerCongAgua, salinidadXLitro);
                    listaProductos.add(prodCongAgua);
                    dInf("Producto Congelado por Agua agregado correctamente :)");
                    break;
                case 5:
                    int numLoteCongNitro  = Integer.parseInt(pDat("Número de lote: "));
                    String paisOrigenCongNitro  = pDat("País de origen: ");
                    String fechaEnvaseCongNitro = pDat("Fecha de envase: ");
                    String fechaCadCongNitro = pDat("Fecha de caducidad :");
                    double tempSugerCongNitro = Double.parseDouble(pDat("Temperatura sugerida: "));
                    String metodoCong = pDat("Metodo de congelamiento: ");
                    double tiempoExpo = Double.parseDouble(pDat("Tiempo de exposición: "));
                    PCongeladoNitrogeno prodCongNitro = new PCongeladoNitrogeno(fechaCadCongNitro, numLoteCongNitro, fechaEnvaseCongNitro, paisOrigenCongNitro, tempSugerCongNitro, metodoCong, tiempoExpo);
                    listaProductos.add(prodCongNitro);
                    dInf("Producto Congelado por nitrogeno agregado correctamente :)");
                    break;
                case 6:
                    if (listaProductos.isEmpty()) {
                       dInf("No hay productos registrados");
                    }else{
                        String msg = "|-----Lista de productos-----|\n";
                        for (int i = 0; i < listaProductos.size(); i++) {
                            Productos p = listaProductos.get(i);
                            msg += p.toString();
                        }
                        dInf(msg);
                    }
                    break;
                case 7:
                    String buscarLoteStr = pDat("Ingrese el número de lote a buscar:");
                    int buscarLote = Integer.parseInt(buscarLoteStr);
                    for (int i = 0; i < listaProductos.size(); i++) {
                        Productos p = listaProductos.get(i);
                        if (p.getBatchNumber() == buscarLote) {
                            dInf("|-----Producto encontrado-----|\n\n" + p.toString());
                            break;
                        }
                    }
                    break;
            }
        }while (el!=0);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
