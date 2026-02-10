package Unidad_1;

import javax.swing.*;
import java.util.Arrays;

public class Practica_6 {
    static void main() {
        String tog = JOptionPane.showInputDialog("Escribe lo que quieras: \n");
        if (tog == null || tog.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Texto no válido :(");
        }
        String en[] = tog.split(" ");
        String pc = "", fn=" ";
        for (int i = 0; i < en.length; i++) {
            if (i == 0) {
                pc= en[0].toLowerCase();
                fn = pc;
            }else{
                pc = en[i].toUpperCase();
                fn += " " +pc ;
            }
        }
        System.out.println("Texto original: ");
        System.out.println(tog);
        System.out.println("Texto que pide la práctica: ");
        System.out.println(fn.trim());
        System.out.println("Array: ");
        System.out.println(Arrays.toString(en));
    }
}
