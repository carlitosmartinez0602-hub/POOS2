package Unidad_2.Pre_ExamenP;

import javax.swing.*;

public class MainBiblioteca {
    static void main(String[] args) {
        int el = 0;
        Libro lib = new Libro();
            do {
                String input = pDat("Opciones: \n" +
                        "0.- Salir\n" +
                        "1.- Consutar almacen\n" +
                        "2.- Registrar libro\n" +
                        "3.- Añadir libros\n" +
                        "4.- Prestar Libro\n" +
                        "5.- Regresar libro\n");
                if (input == null || input.isBlank()) {
                    el = 0;
                }else {
                    try {
                        el = Integer.parseInt(input);
                    }catch (NumberFormatException e){
                        dInf("Ingresa un número válido!");
                    }
                }
                switch (el){
                    case 0:
                        dInf("Adios");
                        break;
                    case 1:
                        dInf(lib.toString());
                        break;
                    case 2:
                        String tituloLibro = pDat("Nombre del libro: ");
                        String autorLibro = pDat("Nombre del autor: ");
                        if (autorLibro == null || autorLibro.isBlank() || tituloLibro ==null || tituloLibro.isBlank()) {
                            dInf("No puedes dejar el campo vacío");
                        }else {
                            try {
                                int cantLibros = Integer.parseInt(pDat("Cantidad de libros a registrar"));
                                lib.registrarLibro(tituloLibro,autorLibro,cantLibros);
                                dInf("Libro registrado Exitosamente! \n" + "Titulo: " + lib.getTitulo() +
                                        "\nAutor: " + lib.getAutor() + "\nCantidad de libros: " + lib.getDisponibles());
                            } catch (NumberFormatException e) {
                                dInf("Escribe numeros no letras");
                            }
                        }
                        break;
                    case 3:
                        String añadLibro = pDat("Cantidad de libros a añadir: ");
                        if (añadLibro == null || añadLibro.isBlank()) {
                            dInf("No puedes dejar el campo vacío");
                        }else{
                            try {
                                int añadLibro1 = Integer.parseInt(añadLibro);
                                lib.añadirLibro(añadLibro1);
                                dInf("Cantidad de libros añadida exitosamente: " + "\nNueva cantidad: " + lib.getDisponibles());
                            }catch (CantidadInvalidaException e){
                                dInf(e.getMessage());
                            }catch (NumberFormatException f){
                                dInf("Ingresa numeros no letras");
                            }
                        }
                        break;
                    case 4:
                        String cantPres = pDat("Cantidad de libros a prestar: ");
                        if (cantPres == null || cantPres.isBlank()) {
                            dInf("No puedes dejar el campo vacío");
                        }else{
                            try {
                                int cantPres1 = Integer.parseInt(cantPres);
                                lib.prestarLibro(cantPres1);
                                dInf("Cantidad prestada exitosamente! \n" + "Nueva cantidad: " + lib.getDisponibles());
                            }catch (StockInsuficienteException e){
                                dInf(e.getMessage());
                            }catch (NumberFormatException f){
                                dInf("Ingresa numeros no letras");
                            }
                        }
                        break;
                    case 5:
                        String cantReg = pDat("Cantidad a regresar: ");
                        if (cantReg == null || cantReg.isBlank()) {
                            dInf("No puedes dejar el campo vacío");
                        }else{
                            try {
                                int cantReg1 = Integer.parseInt(cantReg);
                                lib.devolverLibro(cantReg1);
                                dInf("Cantidad regresada exitosamente!\n" + "Nueva cantidad: " + lib.getDisponibles());
                            }catch (CantidadInvalidaException e){
                                dInf(e.getMessage());
                            }catch (NumberFormatException f){
                                dInf("Ingresa numeros no letras");
                            }
                        }
                        break;
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
