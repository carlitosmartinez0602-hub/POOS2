package Unidad_5.PreExamenU5.PreC_1;

import java.util.Arrays;
import java.util.Random;

public class calajo4 {
    static void main(String[] args) {
        int[] prod = new int[3];
        int[][] vendedores = new int[5][3];
        Random r = new Random();
        //llenar matrices
        for (int i = 0; i < prod.length; i++) {
            prod[i] = r.nextInt(50) + 10;
        }
        for (int i = 0; i < vendedores.length; i++) {
            for (int j = 0; j < vendedores[i].length; j++) {
                vendedores[i][j] = r.nextInt(8) + 2;
            }
        }
        //mostrar matrices + total por vendedor +  total vendedores + mas recaudado + mas vendido
        System.out.println("Productos: ");
        for (int i = 0; i < 1; i++) {
            System.out.println("Producto No. " + (i+1) + ": " + Arrays.toString(prod));
        }
        System.out.println();
        System.out.println("Vendedores: ");
        double sumaTotal = 0;
        double masRecaudo = 0;
        double masvendido = vendedores[0][0];
        double prom=0;
        double promfn=0;
        for (int i = 0; i < vendedores.length; i++) {
            double recaudado = 0;
            for (int j = 0; j < vendedores[i].length; j++) {
                recaudado += vendedores[i][j] * prod[j];
                if (recaudado > masRecaudo){
                    masRecaudo = recaudado;
                }
                if (vendedores[i][j] > masvendido) {
                    masvendido = vendedores[i][j];
                }
                prom += vendedores[i][j];
                promfn = prom / vendedores[i].length;
            }
            sumaTotal += recaudado;
            System.out.println("Vendedor No. " + (i+1) + ": " + Arrays.toString(vendedores[i]) + " ha recaudado: " + recaudado + " Pesos");
        }
        System.out.println("EL que mas recaudo: " +  + masRecaudo);
        System.out.println("El producto más vendido fue: " + masvendido);
        System.out.println("Suma total entre vendedores: "+ sumaTotal);
        System.out.println("Promedio de ventas: " + promfn);

    }
}
