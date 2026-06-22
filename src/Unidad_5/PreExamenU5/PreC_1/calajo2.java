package Unidad_5.PreExamenU5.PreC_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class calajo2 {
    static void main(String[] args) {
        int cantPlat =0;
        Random r = new Random();
        Scanner lr = new Scanner(System.in);

        System.out.println("Cantidad de platillos: ");
        cantPlat = lr.nextInt();

        int[] platillos = new int[cantPlat];
        int[][] meseros = new int[15][cantPlat];

        for (int i = 0; i < cantPlat; i++) {
            platillos[i] = r.nextInt(200) + 1;
        }
        for (int i = 0; i < meseros.length; i++) {
            for (int j = 0; j < meseros[i].length; j++) {
                meseros[i][j] = r.nextInt(15) + 2;
            }
        }

        System.out.println("Platillos: ");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println("Platillo No. " + (i + 1)+ ": " + platillos[i]);
        }
        for (int i = 0; i < meseros.length; i++) {
            System.out.println("Mesero No. " + (i + 1) + ": " + Arrays.toString(meseros[i]));
        }
    }
}
