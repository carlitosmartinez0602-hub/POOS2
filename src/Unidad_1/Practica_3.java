package Unidad_1;
import java.util.Scanner;
public class Practica_3 {
    static void main() {
        Scanner l = new Scanner(System.in);
        String cadena,  cadenaASCII ="";
        int T;
        // Pedir cadena
        System.out.println("Ingresa Texto: \n");
        cadena= l.nextLine();
        T = cadena.length();
        //Ciclo encargado de obtener los valores en ASCII
        for (int i = 0; i < T; i++) {
        cadenaASCII += (int)cadena.charAt(i) + "-";
        }
        System.out.println(cadenaASCII) ;

    }
}
