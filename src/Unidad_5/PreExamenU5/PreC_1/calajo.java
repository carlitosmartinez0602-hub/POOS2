package Unidad_5.PreExamenU5.PreC_1;

import java.util.Arrays;
import java.util.Random;

public class calajo {
    static void main(String[] args) {
        int[] articulos = new int[5];
        int[][] vendedores = new int[10][5];
        Random r = new Random();
        //llenar
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = r.nextInt(300) + 35;
        }
        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < vendedores[i].length; j++) {
                vendedores[i][j] = r.nextInt(21) + 5;
            }
        }
        //Mostrar
        System.out.println("Articulos: ");
        for (int i = 0; i < articulos.length; i++) {
            System.out.println("Articulos No. " + (i+1) + articulos[i]);
        }
        int suma= 0;
        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < vendedores[i].length; j++) {
                suma += vendedores[i][j] * articulos[j];
            }
            System.out.println("Vendedor No. " + (i+1) + " "+ Arrays.toString(vendedores[i]) + " ha recaudado: " + suma);
        }
    }
}
