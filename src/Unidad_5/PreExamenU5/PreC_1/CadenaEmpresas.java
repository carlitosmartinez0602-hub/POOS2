package Unidad_5.PreExamenU5.PreC_1;

import java.util.Arrays;
import java.util.Random;

public class CadenaEmpresas {
    static void main(String[] args) {
        int[] prods = {250, 300, 27, 117, 1500};
        int[][] ventas = new int[4][5];
        int[][] inveInic = new int[4][5];
        int[][] inveFn = new int[4][5];
        Random r = new Random();
        System.out.println("|-----Productos-----|");
        System.out.println("Producto No. 1: " + prods[0]);
        System.out.println("Producto No. 2: " + prods[1]);
        System.out.println("Producto No. 3: " + prods[2]);
        System.out.println("Producto No. 4: " + prods[3]);
        System.out.println("Producto No. 5: " + prods[4]);
        //llenar inventario inicial
        for (int i = 0; i < inveInic.length; i++) {
            for (int j = 0; j < inveInic[i].length; j++) {
                inveInic[i][j] = r.nextInt(15) + 6;
            }
        }
        System.out.println("|------Inventario inicial-----|");
        for (int i = 0; i < inveInic.length; i++) {
            System.out.println("Super mercado No. " + (i + 1) + ": " + Arrays.toString(inveInic[i]));
        }
        //llenar ventas
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                ventas[i][j] = r.nextInt(9) + 2;
            }
        }
        System.out.println("|-----Ventas-----|");
        int masvendio = 0;
        int pos=-1;
        for (int i = 0; i < ventas.length; i++) {
            int masvendioUni =0;
            int vendido = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                vendido += ventas[i][j] * prods[j];
                masvendioUni += ventas[i][j];
            }
            if ( vendido > masvendio) {
                masvendio = vendido;
                pos = i;
            }
            System.out.println("Super mercado No. " + (i+1) + ": " + Arrays.toString(ventas[i]) + " ha vendido: $" + vendido + " Vendido en unidades: " + masvendioUni);
        }
        System.out.println("Super mercado que más vendió: " + (pos+1) +" con: " + masvendio);
        //Inventario final
        for (int i = 0; i < inveFn.length; i++) {
            for (int j = 0; j < inveFn[i].length; j++) {
                inveFn[i][j] = inveInic[i][j] - ventas[i][j];
                if (inveFn[i][j] < 0) {
                    inveFn[i][j] = 0;
                }
            }
        }
        System.out.println("|------Inventario final-----|");
        for (int i = 0; i < inveFn.length; i++) {
            System.out.println("Super mercado No. " + (i+1) + ": " + Arrays.toString(inveFn[i]));
        }
    }

}
