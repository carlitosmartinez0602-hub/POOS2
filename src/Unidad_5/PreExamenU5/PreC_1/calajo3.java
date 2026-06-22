package Unidad_5.PreExamenU5.PreC_1;

import java.util.Arrays;
import java.util.Random;

public class calajo3 {
    static void main(String[] args) {
        int[] librosP = {250, 300, 100, 520};
        int[][] venderoes = new int[5][4];
        Random r = new Random();

        for (int i = 0; i < venderoes.length; i++) {
            for (int j = 0; j < venderoes[i].length; j++) {
                venderoes[i][j] = r.nextInt(30) + 1;
            }
        }
        System.out.println("Precios de los libros: ");
        System.out.println("Precio de la novela: " + librosP[0]);
        System.out.println("Precio de la poesía: " + librosP[1]);
        System.out.println("Precio del cuento: " + librosP[2]);
        System.out.println("Precio de la fantasía: " + librosP[3]);

        int totalGen=0;
        for (int i = 0; i < venderoes.length; i++) {
            int suma = 0;
            for (int j = 0; j < venderoes[i].length; j++) {
                suma += venderoes[i][j] * librosP[j];
            }
            totalGen += suma;
            System.out.println("Vendedor No. " + (i + 1) + Arrays.toString(venderoes[i]) + "Total vendido: " +suma);
        }
        System.out.println("Total general: " + totalGen);
    }
}
