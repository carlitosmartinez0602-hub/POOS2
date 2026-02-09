package Unidad_1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class RussianRoulette {
    static void main() {
        Scanner bala = new Scanner(System.in);
        String shot = "", respuesta = "";
        String[] opVal = {"sí", "si", "Si", "SÍ", "Sí", "sÍ"};
        int car = 0, cont = 1;
        Random al = new Random();
        System.out.println("¿Te gustaría jugar un juego?");
        car = al.nextInt(6) + 1;
        respuesta = bala.next();

        if (Arrays.asList(opVal).contains(respuesta)) {
            System.out.println("Bienvenido a: ");
            System.out.println("\n|----------Russian Roulette----------|\n");
            System.out.println("Jala el gatillo...");
            shot = bala.next();
            for (int i = 1; i <= 6 ; i++) {
                if (i == car) {
                    System.out.println("..................");
                    break;
                }else{
                    System.out.println("| ------------------ |");
                    System.out.println("| Jala el gatillo.   |");
                    System.out.println("| ------------------ |");
                    shot = bala.next();
                    cont++;
                }
            }
        }else {
            System.out.println("Así que no quieres jugar... bien.");
            return;
        }

    }
}