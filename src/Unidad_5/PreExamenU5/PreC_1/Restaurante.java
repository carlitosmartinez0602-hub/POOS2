package Unidad_5.PreExamenU5.PreC_1;


import java.util.Arrays;
import java.util.Random;

public class Restaurante {
    static void main(String[] args) {
        int[] platillos = new int[4];
        int[][] meseros = new int[8][4];
        Random r = new Random();
        //Llenar
        for (int i = 0; i < platillos.length; i++) {
            platillos[i] = r.nextInt(300) + 70;
        }
        for (int i = 0; i < meseros.length; i++) {
            for (int j = 0; j < meseros[i].length; j++) {
                meseros[i][j] = r.nextInt((50) + 1);
            }
        }
        //Mostrar
        for (int i = 0; i < platillos.length; i++) {
            System.out.println("Platillos: " + platillos[i]);
        }
        System.out.println();
        System.out.println("Vendedores: ");
        for (int i = 0; i < meseros.length; i++) {
            int suma=0;
            for (int j = 0; j < meseros[i].length; j++) {
                suma += meseros[i][j] * platillos[j];
            }
            System.out.println("Mesero No. "+ i + Arrays.toString(meseros[i]) + " ha vendido: " + suma);
        }
    }
}
