package Unidad_5.PreExamenU5.PreC_1;

import java.util.Arrays;
import java.util.Random;


public class MatrizVenArt {
    static void main(String[] args) {
        int[] articulos = new int[5];
        int[][] vendedores = new int[10][5];
        Random r = new Random();

        //llenado de matirces
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = r.nextInt(200) + 50;
        }
        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < vendedores[i].length; j++) {
               // System.out.println("Posición: " + i + " , " + j);
                vendedores[i][j] = r.nextInt(15) + 1    ;
            }
        }

        //Mostrar matrices
        System.out.println("Articulos: ");
        for (int i = 0; i < articulos.length; i++) {
            System.out.println("Articulo No. "+ i + ": " + articulos[i]);
        }

        System.out.println();
        System.out.println("Vendedores: ");
        for (int i = 0; i < vendedores.length; i++) {
            int suma = 0;
            for (int j = 0; j < vendedores[i].length; j++) {
                suma += vendedores[i][j] * articulos[j];
            }
            System.out.println("Vendedor No. " + i + ": "+ Arrays.toString(vendedores[i]) + " ha recaudado: " + suma);
        }
    }
}
