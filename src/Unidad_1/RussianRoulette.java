package Unidad_1;
import java.util.Random;
import java.util.Scanner;
public class RussianRoulette {
    static void main() {
        Scanner bala = new Scanner(System.in);
        String shot = "";
        int car = 0;
        Random al = new Random();
        car = al.nextInt(6) + 1;
        int cont=1;
        System.out.println("\n|----------Russian Roulette----------|\n");
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
    }
}