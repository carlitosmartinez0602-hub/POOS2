package Unidad_5.PreExamenU5.PreC_1;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrizTablero {
    static void main(String[] args) {
        int f=0, c=0;
        Scanner lr = new Scanner(System.in);
        Random r  = new Random();
        System.out.println("¿Cuántas Filas?: ");
        f = lr.nextInt();
        System.out.println("¿Cuantas Columnas?: ");
        c = lr.nextInt();

        int[][] matrix = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Posición: " + i + " , " + j);
                matrix[i][j] = r.nextInt(90) + 10;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int prom=0;
            for (int j = 0; j < matrix[i].length; j++) {
                prom += matrix[i][j];
            }
            double promfn = (double) prom / matrix[i].length;
            System.out.println("Jugador No. " + i + " " + Arrays.toString(matrix[i]) + " Promedio puntuación por jugador: " + promfn);
        }
        int peorPuntuacion = matrix[0][0];
        int mejorPuntuacion = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < peorPuntuacion) {
                    peorPuntuacion = matrix[i][j];
                }
                if (matrix[i][j] > mejorPuntuacion) {
                    mejorPuntuacion = matrix[i][j];
                }
            }
        }
        System.out.println("Mejor puntuación: " + mejorPuntuacion);
        System.out.println("Peor Puntuación: " + peorPuntuacion);

    }
}
