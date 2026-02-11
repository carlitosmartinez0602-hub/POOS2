package Unidad_1;

public class SerieFibonacci {
    static void main() {
        //Escribe un programa que imprima los 50 primeros números de la sucesión
        // * de Fibonacci empezando en 0.
        // * - La serie Fibonacci se compone por una sucesión de números en
        // *   la que el siguiente siempre es la suma de los dos anteriores.
        // *   0, 1, 1, 2, 3, 5, 8, 13...
        int s=0, numa=0, numb=1;
        System.out.println("\n|------Serie de Fibonacci------|\n");
        for (int i = 0; i <=50 ; i++) {
            System.out.println(numa);
            s = numa+ numb;
            numa = numb;
            numb = s;

        }
        System.out.println(s + " ");
    }
}
