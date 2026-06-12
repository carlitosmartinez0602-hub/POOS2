package Unidad_5.Practica_1.Matrices;

import javax.swing.*;

public class Practica_4 {
    static void main(String[] args) {
        int lista[] = {1,2,4,5,1,3,5,8};
        int listaM[][]= {
                {1, 3, 7},
                {4, 3, 5},
                {6, 3, 9}
        };
        int listaCubo [][][] = {
                {
                        {2,3,5},
                        {4,6,1},
                        {7,7,4}
                },
                {
                        {2,5,5},
                        {6,4,3},
                        {9,2,2}
                }
        };
        String palabras[] ={"Hola", "Como", "Andas","No", "Talvez", "Mañana"};
        char letras[] = {'a','b','c','d'};
        dInf("Tamaño letras: " + letras.length);

        //Tamaño de una matriz
        int filas= listaM.length;
        int columnas = listaM[0].length;
        dInf("Tamaño matriz: \n" +
                "Filas: " + filas +
                "\nColumnas: " + columnas);

        //Tamaño de un cubo
        int caras = listaCubo.length;
        int filascubo = listaCubo[0].length;
        int columnascubo = listaCubo[0][0].length;

        dInf("Tamaño del cubo: \n" +
                "caras: " + caras +
                "\nFilas: " + filascubo +
                "\nColumnas: " + columnascubo);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
