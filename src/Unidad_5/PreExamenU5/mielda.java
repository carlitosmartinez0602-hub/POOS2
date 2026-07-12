package Unidad_5.PreExamenU5;

import java.util.Arrays;
import java.util.Random;

public class mielda {
    static void main(String[] args) {
        int[] prod = new int[5];
        int[][] vend = new int[4][5];
        Random r = new Random();

        //llenado
        for (int i = 0; i < prod.length; i++) {
            prod[i] = r.nextInt(10) +1;
        }
        for (int i = 0; i < vend.length; i++) {
            for (int j = 0; j < vend[i].length; j++) {
                vend[i][j] = r.nextInt(15) +3;
            }
        }
        System.out.println("|----Productos-----|");
        System.out.println("Producto No. 1: " + prod[0]);
        System.out.println("Producto No. 2: " + prod[1]);
        System.out.println("Producto No. 3: " + prod[2]);
        System.out.println("Producto No. 4: " + prod[3]);
        System.out.println("Producto No. 5: " + prod[4]);
        System.out.println();
        System.out.println("|-----Vendedores-----|");
        int pos =-1;
        int masvendio =0;
        for (int i = 0; i < vend.length; i++) {
            int vendido=0;
            for (int j = 0; j < vend[i].length; j++) {
                vendido += vend[i][j] * prod[j];
                if (vendido > masvendio) {
                    masvendio = vendido;
                    pos = i;
                }
            }
            System.out.println("Vendedor No. " + (i +1)  + Arrays.toString(vend[i]) + " ha vendido: $" + vendido);
        }
        System.out.println("Vendedor que mas vendio: " + (pos + 1) + " con: $" + masvendio);
    }
}
