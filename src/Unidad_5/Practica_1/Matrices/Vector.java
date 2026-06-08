package Unidad_5.Practica_1.Matrices;

import javax.swing.*;
import java.util.Arrays;

public class Vector {
    static void main() {
        /*int tamaño = Integer.parseI   nt(pDat("Tamaño: "));
        int lista[] = new int[tamaño];
        int suma =0;

        for (int i = 0; i < lista.length; i++) {
            lista[i]= Integer.parseInt(pDat("Ingresa un número: "));
            suma += lista[i];
        }
        for (int x : lista) {
            dInf("Valor: " + x);
        }
        dInf("Suma: " + suma);*/
        int suma =0;
        int lista1[] = null;
        int lista2[] = null;
        int lista3[] = null;
        int tamaño1= Integer.parseInt(pDat("Tamaño: "));
        lista1 = new int[tamaño1];
        lista2 = new int[tamaño1];
        lista3 = new int[tamaño1];

        dInf("Llenando la lista 1");
        for (int i = 0; i < lista1.length; i++) {
            lista1[i] = Integer.parseInt(pDat("Datos de la lista 1: "));
        }
        dInf("Llenando la lista 2");
        for (int i = 0; i < lista2.length; i++) {
            lista2[i] = Integer.parseInt(pDat("Datos de la lista 2: "));
        }
        dInf("Suma de las listas: ");
        for (int i = 0; i < tamaño1; i++) {
            lista3[i]=lista1[i]+ lista2[i];
        }
        for (int x : lista3) {
            dInf("Resultado: " + x + " - ");
        }
        dInf("Datos sumados: " + Arrays.toString(lista3));
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
