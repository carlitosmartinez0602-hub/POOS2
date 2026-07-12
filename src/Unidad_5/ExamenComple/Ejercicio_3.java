package Unidad_5.ExamenComple;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Ejercicio_3 {
    static void main(String[] args) {
        //ejercicio2
        Scanner sc = new Scanner(System.in);
        System.out.println("tamaño de la matriz: ");
        Random r = new Random();
        int tmatriz=0;
        tmatriz = sc.nextInt();

        int[][] matrix = new int[tmatriz][tmatriz];

        //llenao
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(9) + 1;
            }
        }

        //mostrar mas operaciones
        int sumafn = 0;
        for (int i = 0; i < matrix.length; i++) {
            int suma =0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > 0 && i < matrix.length - 1 && j > 0 && j < matrix[i].length - 1) {
                    sumafn += matrix[i][j];
                }
            }
            sumafn += suma;
            System.out.println((i+1) + " "+ Arrays.toString(matrix[i])  +" " + suma);
        }
        System.out.println("suma final: " + sumafn);
    }
}
