package Unidad_5.ExamenComple;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2 {
    static void main(String[] args) {
        //ejercicio3
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Tamaño de la matriz: ");
        int tmatriz = sc.nextInt();
        int[] matrix = new int[tmatriz];

        //llenao
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = r.nextInt(14) + 1;
        }

        //mostra r + operacioens
        int masgrande= matrix[0];
        int maschico= matrix[0];
        int posmasgrande=-1;
        int posmaschico=-1;
        int mayDiferenciaGen=0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i]>masgrande) {
                masgrande=matrix[i];
                posmasgrande=i;
            }
            if (matrix[i]<maschico) {
                maschico=matrix[i];
                posmaschico=i;
            }
            mayDiferenciaGen=masgrande-maschico;
            System.out.println("Fila No. " + (i+1) + ": " + matrix[i]);
        }
        int mayorDif = 0;

        for (int i = 0; i < matrix.length-1; i++) {
            int dif = Math.abs(matrix[i] - matrix[i+1]);

            if (dif > mayorDif) {
                mayorDif = dif;
            }
        }

        System.out.println("Mayor diferencia seguida: " + mayorDif);

        System.out.println();
        System.out.println("Diferencia entre el mas chico y el mas grande: " + mayDiferenciaGen + " || posiciones: (mas chico | mas grande): " + (posmaschico + 1) + " , " + (posmasgrande + 1));
        System.out.println("Mas chico: " +  maschico);
        System.out.println("Mas grande: " +  masgrande);
    }
}
