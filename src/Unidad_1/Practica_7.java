package Unidad_1;

import javax.swing.*;

public class Practica_7 {
    static void main() {
        String C = JOptionPane.showInputDialog(null,"Di algo:");
        String SC2 = C.substring(0 ,C.indexOf(" ")) + C.toUpperCase().substring(C.indexOf(" "));
        System.out.println(SC2);
    }
}
