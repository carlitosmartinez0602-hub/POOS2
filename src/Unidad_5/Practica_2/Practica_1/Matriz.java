package Unidad_5.Practica_2.Practica_1;

import javax.swing.*;

public class Matriz {
    static void main(String[] args) {
        int m=0,n=0, el=0;
        int matriz[][] = new int[0][];
        String input;
        do {
            input = pDat("|-----Opciones-----|\n" +
                    "0.- Salir" +
                    "\n1.- Establecer tamaño de la matriz" +
                    "\n2.- LLenar matriz" +
                    "\n3.- Imprimir matriz" +
                    "\n4- Promedio" +
                    "\n5.- Valores más pequeños por columna" +
                    "\n6.- Intercambiar valores");
            if (input == null || input.isBlank()) {
                dInf("No puede quedar en blanco");
            }else{
                el = Integer.parseInt(input);
            }
            switch (el){
                case 0:
                    dInf("Adios");
                    break;
                case 1:
                    String inputN = pDat("Tamaño de la matriz en filas: ");
                    String inputM = pDat("Tamaño de la matriz en columnas: ");

                    if (inputM == null || inputM.isBlank()) {
                        dInf("No puede quedar en blanco");
                    }else{
                        m = Integer.parseInt(inputM);
                    }
                    if (inputN == null || inputN.isBlank()) {
                        dInf("No puede quedar en blanco");
                    }else{
                        n = Integer.parseInt(inputN);
                    }
                    dInf("Tamaños establecidos: \n" +
                            "Filas: " + n +
                            "\nColumnas: " + m);
                    break;
                case 2:
                    llenarMatriz(matriz);
                    dInf("Matriz llenada con éxito");
                    break;
                case 3:
                    imprimirMatriz(matriz);
                    break;
                case 4:
                    promedio(matriz);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    dInf("No existe esa opción");
            }
        }while (el != 0);
    }
    public static int[][] llenarMatriz(int[][] ma){
        int fn=0;
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                ma[i][j] = (int) Math.random()*10;
            }
        }
        return ma;
    }

    public static void imprimirMatriz(int ma[][]){
        String fn = "Matriz\n";
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[0].length; j++) {
                fn += ma[i][j];
            }
            dInf(fn);
        }
    }
    public static void imprimirDiagonales(int ma[][]){
        String fn = "Diagonales\n";
        int n = ma.length;
        int m = ma[0].length;
        fn += "Diagonal 1: ";
        for (int i = 0; i < n; i++) {
            if (i < m) {
                fn += ma[i][i] + " ";
            }
        }
        fn += "\nDiagonal 2: ";
        for (int i = 0; i < n; i++) {
            if (i < m) {
                fn += ma[i][m - 1 - i] + " ";
            }
        }
        dInf(fn);
    }
    public static void promedio(int ma[][]){
        String fn = "Promedio por renglón\n";
        int n = ma.length;
        int m = ma[0].length;
        for (int i = 0; i < n; i++) {
            int suma = 0;
            for (int j = 0; j < m; j++) {
                suma += ma[i][j];
            }
            double promedio = (double) suma / m;
            fn += "Renglón " + i + ": " + promedio + "\n";
        }
        dInf(fn);
    }
    public static String pDat(String txt){
        return JOptionPane.showInputDialog(txt);
    }
    public static void dInf(String txt){
        JOptionPane.showMessageDialog(null, txt);
    }
}
