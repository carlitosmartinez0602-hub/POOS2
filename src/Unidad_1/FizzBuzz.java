package Unidad_1;

public class FizzBuzz {
    static void main() {
        //Escribe un programa que muestre por consola (con un print) los
        // * números de 1 a 100 (ambos incluidos y con un salto de línea entre
        // * cada impresión), sustituyendo los siguientes:
        // * - Múltiplos de 3 por la palabra "fizz".
        // * - Múltiplos de 5 por la palabra "buzz".
        // * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
        String res="";
        System.out.println("\n|------Fizz Buzz------|\n");
        for (int i = 1; i <=100 ; i++) {
            res = "";
            if (i % 3 == 0) {
                res = "fizz";
            } else if (i % 5 == 0) {
                res= "buzz";
            }else{
                System.out.print(i);
            }
            System.out.print(res + " ");
        }
    }
}
