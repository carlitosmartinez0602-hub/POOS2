package Unidad_5.PreExamenU5.PreC_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrizMxN {
    static void main() {
        int f=0, c=0;

        Scanner lr  = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Filas de la matriz: ");
        f = lr.nextInt();
        System.out.println("Columnas de la matriz: ");
        c = lr.nextInt();

        int[][] matrix = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Posición: " + i + " , " + j);
                matrix[i][j] = r.nextInt( 10);
            }
        }

        int masC = matrix[0][0];
        int masG = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < masC) {
                    masC = matrix[i][j];
                }
                if (matrix[i][j] > masG) {
                    masG = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int prom=0;
            for (int j = 0; j < matrix[i].length; j++) {
                prom += matrix[i][j];
            }
            double promFn = (double) prom / matrix[i].length;
            System.out.println(Arrays.toString(matrix[i]) + " Promedio de la fila " + i + ": "+ promFn);
        }
        System.out.println("El más chico es: " + masC);
        System.out.println("El más grande es: " + masG);

    }
}