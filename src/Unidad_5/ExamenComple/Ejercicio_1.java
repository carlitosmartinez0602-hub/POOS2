package Unidad_5.ExamenComple;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_1 {
    static void main(String[] args) {
        //ejercicio1
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("tamaño de la matriz: ");
        int tMatriz=0;
        tMatriz= sc.nextInt();
        int[][] matrix = new  int[tMatriz][tMatriz];

        //llenao
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(10) +1;
            }
        }

        //operaciones + mostrar
        int sumaDP = 0;
        int sumaInv = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumaDP += matrix[i][i];
            sumaInv += matrix[i][matrix.length-1-i];

            System.out.println((i+1) + " " + Arrays.toString(matrix[i]));
        }
        System.out.println("suma DP: " + sumaDP);
        System.out.println("suma inv: " + sumaInv);
    }
}
