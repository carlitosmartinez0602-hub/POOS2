package Unidad_5.PreExamenU5.PreExamen_1;

import javax.swing.*;
import java.util.ArrayList;

public class MainFiguras {
    static void main(String[] args) {
        int el = 0;
        ArrayList<Figura> listaFiguras = new ArrayList<>();

        do {
            String input = pDat("|-----Opciones-----|\n" +
                    "0.- Salir" +
                    "\n1.- Calcular área de una circunferencia" +
                    "\n2.- Calcular área de un triangulo" +
                    "\n3.- Calcular área de un rectangulo" +
                    "\n4.- Ver áreas calculadas");
            if (input == null || input.isBlank()) {
                dInf("No puede quedar en blanco");
            }else {
                el = Integer.parseInt(input);
            }
            switch (el){
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String radio = pDat("Radio de la circunferencia: ");
                    double radioD = 0;
                    if (radio == null || radio.isBlank()) {
                        dInf("No puede quedar en blanco");
                    }else  {
                        try {
                            radioD = Double.parseDouble(radio);
                        }catch (NumberFormatException e){
                            dInf("ingresa un número válido");
                        }
                    }
                    Figura cir = new Cirunferencia(radioD, Math.PI);
                    listaFiguras.add(cir);
                    dInf("Área calculada con éxito: " + cir.calcularArea());
                    break;
                case 2:
                    String base = pDat("Base del triangulo: ");
                    String altura = pDat("Altura del triangulo: ");
                    double baseD = 0;
                    double alturaD = 0;
                    if (altura == null || altura.isBlank()) {
                        dInf("No puedes calcular sin altura");
                    }else{
                        try {
                            alturaD = Double.parseDouble(altura);
                        }catch (NumberFormatException e ){
                            dInf("Ingresa un número válido");
                        }
                    }
                    if (base == null || base.isBlank()) {
                        dInf("No puedes calcular sin base");
                    }else{
                        try {
                            baseD = Double.parseDouble(base);
                        }catch (NumberFormatException e){
                            dInf("Ingresa un número válido");
                        }
                    }
                    Figura tri = new Triangulo(baseD, alturaD);
                    listaFiguras.add(tri);
                    dInf("Área calculada con éxito: " + tri.calcularArea());
                    break;
                case 3:
                    String largo = pDat("Largo del triangulo: ");
                    String ancho = pDat("Ancho del triangulo: ");
                    double largoD = 0;
                    double anchoD = 0;
                    if (largo == null || largo.isBlank()) {
                        dInf("No pudes calcular sin longitud: ");
                    }else{
                        try {
                            largoD = Double.parseDouble(largo);
                        }catch (NumberFormatException e){
                            dInf("Ingresa un número válido");
                        }
                    }
                    if (ancho == null || ancho.isBlank()) {
                        dInf("No puedes calcular sin anchura");
                    }else{
                        try {
                            anchoD = Double.parseDouble(ancho);
                        }catch (NumberFormatException e ){
                            dInf("Ingreasa un número válido");
                        }
                        Figura rec = new Rectangulo(largoD, anchoD);
                        listaFiguras.add(rec);
                        dInf("Área calculada con éxito: " + rec.calcularArea());
                    }
                    break;
                case 4:
                    if (listaFiguras.isEmpty()) {
                        dInf("No hay figuras a mostrar");
                    }else{
                        String fn = " ";
                        for (int i = 0; i < listaFiguras.size(); i++) {
                            Figura f = listaFiguras.get(i);
                            fn += f  +  "\n\n";
                        }
                        dInf(fn);
                    }
                    break;
                default:
                    dInf("No existe ésa opción");
                    break;
            }
        }while(el != 0);

    }
    public static String pDat (String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null,txt);
    }
}
