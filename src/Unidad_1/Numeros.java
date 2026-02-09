package Unidad_1;
import java.util.Scanner;
public class Numeros {
    static void main() {
        Scanner l = new Scanner(System.in);
        int num = 0;
        int ele = 0;
        long fac=1;
        int inv = 0;
        int rest = 0;
        System.out.println("\n |------Números------| \n");

        System.out.println("Ingresa el número a usar: \n");
        num = l.nextInt();
        System.out.println("opcíón a elegir: ");
        System.out.println("1.- Par o Impar");
        System.out.println("2.- Palíndormo");
        System.out.println("3.- Primo");
        System.out.println("4.- Factorial");
        ele = l.nextInt();

        if (ele == 1) {
            System.out.println("\n¿Es par o Impar?");
            if (num % 2 ==0){
                System.out.println("¡El numero: " + num + " es par!");
            }else{
                System.out.println("¡El número " +num + " es impar!");
            }
        }else if(ele == 2){
            System.out.println("\n ¿Es un número palíndromo?");
            int og =num;
            while(num != 0){
                rest = num % 10;
                inv = inv * 10 + rest;
                num /= 10;
            }
            if (og == inv){
                System.out.println("El número " + og + " es palindromo");
            }else{
                System.out.println("el número no es palíndromo");
            }
        }else if(ele ==3){
            System.out.println("\n¿Es un número primo?");
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i ==0){
                    System.out.println("El número " + num + "no es primo");
                }else{
                    System.out.println("El número " + num + " no es primo");
                }
            }
        } else if (ele==4) {
            System.out.println("Factorial de " + num);
            for (int i=1 ; i< num; i++) {
                fac *= i;
            }
            System.out.println("Factorial de " + num + " es: " + fac);
        }
    }
}