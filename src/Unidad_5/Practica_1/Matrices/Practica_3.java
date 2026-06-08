package Unidad_5.Practica_1.Matrices;

import javax.swing.*;
import java.util.Arrays;

public class Practica_3 {
    static void main(String[] args) {
        int tamaño = Integer.parseInt(pDat("Tamaño: "));
        int lista[] = new int[tamaño];
        int lista2[] = new int[tamaño];

        dInf("llenado de la lista: ");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Integer.parseInt(pDat("Datos de la lista: "));
        }
        for (int i = 0; i < tamaño; i++) {
            lista2[i] = (int) Math.pow(lista[i],2);
        }
        for (int x : lista2) {
            dInf("Valores: " + x);
        }
        dInf("Datos al cuadrado: " + Arrays.toString(lista2));
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
